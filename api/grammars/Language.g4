grammar Language;


program: stmt*;

stmt: nonDeclaration
    | variableDeclaration
    | functionDeclaration
    | structDeclaration
;

nonDeclaration: expressionStmt ';'
    | blockStmt
    | ifStatement
    | switchStatement 
    | whileStatement
    | forStatement 
    | transferenceStmt ';'
    | printStmt ';'
;

printStmt: 'fmt.Println' '(' expressionStmt ( ',' expressionStmt )* ')';

blockStmt: '{' stmt* '}';

ifStatement: 'if' '(' expressionStmt ')' nonDeclaration ('else' nonDeclaration)?;

switchStatement: 'switch' expressionStmt '{' switchCase* defaultCase? '}';

switchCase: 'case' expressionStmt ':' stmt*;

defaultCase: 'default' ':' stmt*;

whileStatement: 'for' expressionStmt nonDeclaration;

forStatement: 'for' forInit expressionStmt ';' expressionStmt nonDeclaration;

forInit: variableDeclaration | (expressionStmt ';') ;

transferenceStmt: 'break' #BreakStmt
    | 'continue' #ContinueStmt
    | 'return' expressionStmt? #ReturnStmt
;

variableDeclaration: 'var' ID TYPE ( '=' expressionStmt )? ';'
    | ID ':=' expressionStmt ';'
;

TYPE: 'int' | 'float64' | 'bool' | 'string' | 'rune';

functionDeclaration: 'func' ID '(' params? ')' TYPE? blockStmt;

params: ID ( ',' ID )*;

structDeclaration: 'struct' ID '{' variableDeclaration* '}';

expressionStmt: 
    ( '-' | '!' ) expressionStmt                                # Negate
    | expressionStmt call+                                      # CallExpression
    | expressionStmt ( '*' | '/' | '%') expressionStmt          # MulDivMod
    | expressionStmt ( '+' | '-' ) expressionStmt               # AddSub
    | expressionStmt ( '>' | '<' | '>=' | '<=' ) expressionStmt # GreaterLess
    | expressionStmt ( '==' | '!=' ) expressionStmt             # Equal
    | expressionStmt '&&' expressionStmt                        # And
    | expressionStmt '||' expressionStmt                        # Or
    | expressionStmt '=' expressionStmt                         # Assignment
    | ID ( '+=' | '-=' ) expressionStmt                         # AddSubOperator
    | INTEGER                                                   # Integer
    | BOOLEAN                                                   # Boolean
    | FLOAT                                                     # Float
    | RUNE                                                      # Rune
    | STRING                                                    # String
    | ID                                                        # Identifier
    | ID ID '=' '{' structAtribute* '}'                         # NewStruct
    | (('(' expressionStmt ')') | ('[' expressionStmt ']'))     # Parens
;

call: '(' args? ')'     #FunctionAccess
    | '.' ID            #AtributeAccess
;

args: expressionStmt ( ',' expressionStmt )*;

structAtribute: ID ':' expressionStmt ( ',' )?;

INTEGER: [0-9]+;
BOOLEAN: 'true' | 'false';
FLOAT: [0-9]+ '.' [0-9]+;
STRING: '"' ( '\\' . | ~[\\"\r\n] )* '"';
RUNE: '\'' ( '\\' . | ~[\\"\r\n] ) '\'';
ID: [a-zA-Z_][a-zA-Z_0-9]*;

ONELINECOMMENT: '//' ~[\r\n]* -> skip;
MULTILINECOMMENT: '/*' .*? '*/' -> skip;
WHITESPACES: [ \t\r\n]+ -> skip;