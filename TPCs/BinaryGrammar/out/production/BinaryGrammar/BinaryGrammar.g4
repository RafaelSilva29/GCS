grammar BinaryGrammar;

//Lexer
WS      :   [\t\r\n] -> skip;
ZERO    :   '0';
UM      :   '1';

//Parser
number
    :   b1=bit [0] (b2=bit [$b1.totOut] {$b1.totOut = $b2.totOut;})*
    {
        System.out.println("Valor Decimal: " + $b1.totOut);
    }
    ;

bit [double totIn] returns [double totOut]
    : UM    { $totOut = ($totIn * 2) + 1; }
    | ZERO  { $totOut = $totIn * 2; }
    ;
