using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;
using Antlr4.Runtime;
using analyzer;
using Antlr4.Runtime.Misc;


namespace api.Controllers
{
    [Route("[controller]")]
    public class Compile : Controller
    {
        private readonly ILogger<Compile> _logger;

        public Compile(ILogger<Compile> logger)
        {
            _logger = logger;
        }

        public class CompileRequest
        {
            [Required]
            public required string Code { get; set; }
        }

        [HttpPost]
        public async Task<IActionResult> Post([FromBody] CompileRequest request)
        {
            if (!ModelState.IsValid)
            {
                return BadRequest(new { error = "Invalid request" });
            }

            _logger.LogInformation("Compiling code: {0}", request.Code);

            var inputStream = new AntlrInputStream(request.Code);
            var lexer = new LanguageLexer(inputStream);

            lexer.RemoveErrorListeners();
            lexer.AddErrorListener(new LexicalErrorListener());

            var tokenStream = new CommonTokenStream(lexer);
            var parser = new LanguageParser(tokenStream);

            parser.RemoveErrorListeners();
            parser.AddErrorListener(new SyntaxErrorListener());

            try 
            {

                var tree = parser.program();

                var visitor = new CompilerVisitor();
                visitor.Visit(tree);

                return Ok(new { result = visitor.output });

            }
            catch (ParseCanceledException ex)
            {
                return BadRequest(new { error = ex.Message });
            }
            catch (SemanticError ex)
            {
                return BadRequest(new { error = ex.Message });
            }
            catch (BreakException)
            {
                return BadRequest(new { error = "break statement outside loop" });
            }
            catch (ContinueException)
            {
                return BadRequest(new { error = "continue statement outside loop" });
            }
            catch (ReturnException)
            {
                return BadRequest(new { error = "return statement outside function" });
            }

        }

    }
}