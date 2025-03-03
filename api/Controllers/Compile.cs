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
            var tokenStream = new CommonTokenStream(lexer);
            var parser = new LanguageParser(tokenStream);
            var tree = parser.program();

            var visitor = new CompilerVisitor();
            visitor.Visit(tree);

            return Ok(new { result = visitor.output });
        }

    }
}