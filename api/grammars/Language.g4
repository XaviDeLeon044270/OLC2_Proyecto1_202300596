grammar Language;


program: stmt*;

stmt: expressionStmt ';'
    | variableDcl ';'
    //| assignment ';' #Assignment
    | printStmt ';'
    //| ifStatement #IfStatement
    //| whileStatement #WhileStatement
    //| forStatement #ForStatement
;



variableDcl: 'var' ID ( '=' expressionStmt )? #variableDeclaration;

expressionStmt: 
    '-' expressionStmt                                          # Negate
    | expressionStmt ( '*' | '/' ) expressionStmt               # MulDiv
    | expressionStmt ( '+' | '-' ) expressionStmt               # AddSub
    | expressionStmt ( '>' | '<' | '>=' | '<=' ) expressionStmt # GreaterLess
    | expressionStmt ( '==' | '!=' ) expressionStmt             # Equal
    | ID '=' expressionStmt                                     # Assignment
    | INTEGER                                                   # Integer
    | BOOLEAN                                                   # Boolean
    | FLOAT                                                     # Float
    | STRING                                                    # String
    | ID                                                        # Identifier
    | '(' expressionStmt ')'                                    # Parens
;

printStmt: 'print(' expressionStmt ')' #Print;

INTEGER: [0-9]+;
BOOLEAN: 'true' | 'false';
FLOAT: [0-9]+ '.' [0-9]+;
STRING: '"' ~'"'* '"';
ID: [a-zA-Z_][a-zA-Z_0-9]*;
WS: [ \t\r\n]+ -> skip;