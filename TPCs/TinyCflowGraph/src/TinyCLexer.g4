lexer grammar TinyCLexer;


IF      : 'if'      ;
ELSE    : 'else'    ;
WHILE   : 'while'   ;
DO      : 'do'      ;
FUNCTION: 'function';
SEMI    : ';'       ;
COMMA   : ','       ;
LCURLY  : '{'       ;
RCURLY  : '}'       ;
LPAREN  : '('       ;
RPAREN  : ')'       ;
ASSIGN  : '='       ;
LT      : '<'       ;
PLUS    : '+'       ;
MINUS   : '-'       ;


STRING
   : [a-z]+
   ;

INT
   : [0-9] +
   ;

WS
   : [ \r\n\t] -> skip
   ;