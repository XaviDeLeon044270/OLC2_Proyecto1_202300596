grammar Language;


program: stmt*;

stmt: nonDcl
    | varDcl ';'
;

nonDcl: expressionStmt ';'
    | blockStmt
    | ifStatement 
    | whileStatement
    | forStatement 
    | transferenceStmt
;

blockStmt: '{' stmt* '}' #Block;

ifStatement: 'if' '(' expressionStmt ')' nonDcl ('else' nonDcl)? #IfStmt;

whileStatement: 'while' '(' expressionStmt ')' nonDcl #WhileStmt;

forStatement: 'for' '(' forInit expressionStmt ';' expressionStmt ')' nonDcl #ForStmt;

forInit: (varDcl | expressionStmt) ';' ;

transferenceStmt: 'break' ';' #BreakStmt
    | 'continue' ';' #ContinueStmt
    | 'return' expressionStmt? ';' #ReturnStmt
;

varDcl: 'var' ID ( '=' expressionStmt )? #variableDeclaration;

expressionStmt: 
    '-' expressionStmt                                          # Negate
    | expressionStmt call+                                      # FunctionCall
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

call: '(' args? ')';

args: expressionStmt ( ',' expressionStmt )*;

INTEGER: [0-9]+;
BOOLEAN: 'true' | 'false';
FLOAT: [0-9]+ '.' [0-9]+;
STRING: '"' ~'"'* '"';
ID: [a-zA-Z_][a-zA-Z_0-9]*;

ONELINECOMMENT: '//' ~[\r\n]* -> skip;
MULTILINECOMMENT: '/*' .*? '*/' -> skip;
WHITESPACES: [ \t\r\n]+ -> skip;