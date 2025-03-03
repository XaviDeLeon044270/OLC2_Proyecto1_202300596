grammar Language;


program: stmt*;

stmt: expressionStmt ';'
    | dcl ';'
    //| assignment ';' #Assignment
    | printStmt ';'
    //| ifStatement #IfStatement
    //| whileStatement #WhileStatement
    //| forStatement #ForStatement
;



dcl: 'var' ID ( '=' expressionStmt )? #Declaration;

expressionStmt: 
    '-' expressionStmt                              # Negate
    | expressionStmt ( '*' | '/' ) expressionStmt   # MulDiv
    | expressionStmt ( '+' | '-' ) expressionStmt   # AddSub
    | INT                                           # Number
    | ID                                            # Identifier
    | '(' expressionStmt ')'                        # Parens
;

printStmt: 'print(' expressionStmt ')' #Print;

INT: [0-9]+;
ID: [a-zA-Z_][a-zA-Z_0-9]*;
WS: [ \t\r\n]+ -> skip;