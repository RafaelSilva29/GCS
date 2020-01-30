/*
BSD License
Copyright (c) 2013, Tom Everett
All rights reserved.
Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:
1. Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright
   notice, this list of conditions and the following disclaimer in the
   documentation and/or other materials provided with the distribution.
3. Neither the name of Tom Everett nor the names of its contributors
   may be used to endorse or promote products derived from this software
   without specific prior written permission.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

parser grammar TinyCParser;

/*
    http://www.iro.umontreal.ca/~felipe/IFT2030-Automne2002/Complements/tinyc.c
*//*
 *  <program> ::= <statement>
 *  <statement> ::= "if" <paren_expr> <statement> |
 *                  "if" <paren_expr> <statement> "else" <statement> |
 *                  "while" <paren_expr> <statement> |
 *                  "do" <statement> "while" <paren_expr> ";" |
 *                  "{" { <statement> } "}" |
 *                  <expr> ";" |
 *                  ";"
 *  <paren_expr> ::= "(" <expr> ")"
 *  <expr> ::= <test> | <id> "=" <expr>
 *  <test> ::= <sum> | <sum> "<" <sum>
 *  <sum> ::= <term> | <sum> "+" <term> | <sum> "-" <term>
 *  <term> ::= <id> | <int> | <paren_expr>
 *  <id> ::= "a" | "b" | "c" | "d" | ... | "z"
 *  <int> ::= <an_unsigned_decimal_integer>
*/

options {
    tokenVocab=TinyCLexer;

}

program
   : declaration+
   ;

declaration
    : functionDecl
    | assignment SEMI
    ;

assignment
    : id ASSIGN expr
    ;

functionDecl
    : FUNCTION STRING LPAREN params? RPAREN LCURLY body RCURLY
    ;

params
    : STRING (COMMA STRING)*
    ;

body
    : statement *
    ;

statement
   : IF paren_expr statement                    #IfStmt
   | IF paren_expr statement ELSE statement     #IfElseStmt
   | WHILE paren_expr statement                 #WhileStmt
   | DO statement WHILE paren_expr SEMI         #DoWhileStmt
   | LCURLY statement* RCURLY                   #BracedStmt
   | assignment SEMI                            #AssignStmt
   | expr SEMI                                  #ExprStmt
   | SEMI                                       #EmptyStmt
   ;


functionCall
    : STRING LPAREN args? RPAREN
    ;

args
    : expr (COMMA expr)*
    ;

paren_expr
   : LPAREN expr RPAREN
   ;

expr
   : test
   | functionCall
   ;

test
   : sum                #SumTest
   | sum LT sum         #SumLtTest
   ;

sum
   : term               #SumTerm
   | sum PLUS term      #SumPlusTerm
   | sum MINUS term     #SumMinusTerm
   ;

term
   : id                 #Ids
   | integer            #Int
   | paren_expr         #ParanExpr
   ;

id
   : STRING
   ;

integer
   : INT
   ;


