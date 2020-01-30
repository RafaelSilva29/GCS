grammar SociedadeAnonima;

@header {
    import java.util.*;
}

@members{
    List<String> listSocios = new ArrayList<>();
}

// Parser
SC     : ';'  ;
COMMA  : ','  ;
LPAREN : '['  ;
RPAREN : ']'  ;
HI     : '-'  ;
SP     : '<->' ;
BAR    : '/'   ;
AND    : '&'   ;
WORD   : [a-zA-Z]+ ;
NUM    : [0-9]+ ;
SEPARATOR : ('\r'? '\n' | ' ' | '\t')+  -> skip ;

// Lexer

empresa : LPAREN sociedadeAnonimas SC socios SC funcionarios SC assembleiaGerais RPAREN
        {
            System.out.println("------------Informação Sócios-----------");
            System.out.println("Número de Sócios: " + $socios.numSocios);
            if($socios.cotaTotal != 100) {
                System.out.println("Cotas erradas...");
                System.out.println("Verificar por favor as cotas...");
            } else {
                System.out.println("Cotas certas !!!");
            }
                System.out.println("------------Informação Ramos------------");
                System.out.println("Total Ramos: " + ($sociedadeAnonimas.totalA + $sociedadeAnonimas.totalI + $sociedadeAnonimas.totalC));
                System.out.println("Total AGRICULTURA: " + $sociedadeAnonimas.totalA);
                System.out.println("Total INDUSTRIA: " + $sociedadeAnonimas.totalI);
                System.out.println("Total COMERCIO: " + $sociedadeAnonimas.totalC);
                System.out.println("----------Informações Adicionais--------");
                if($socios.flagAdmin==1) {
                    System.out.println("Falta adicionar um ADMINISTRADOR aos Sócios...");
                }
                if($funcionarios.flagGere==1) {
                    System.out.println("Falta adicionar um GERENTE aos Funcionários...");
                }
                if($socios.flagAdmin!=1 && $funcionarios.flagGere!=1) {
                    System.out.println("Nada a acrescentar !!!");
                }
        }
        ;

sociedadeAnonimas returns [String noEmp, String ram, int totalA, int totalI, int totalC]
                  : sociedadeAnonima
                  {
                        $noEmp = $sociedadeAnonima.noEmp;
                        $totalA += $sociedadeAnonima.totalA;
                        $totalI += $sociedadeAnonima.totalI;
                        $totalC += $sociedadeAnonima.totalC;
                  }
                  | sociedadeAnonima COMMA sociedadeAnonimas
                  {
                         $totalA += $sociedadeAnonima.totalA + $sociedadeAnonimas.totalA;
                         $totalI += $sociedadeAnonima.totalI + $sociedadeAnonimas.totalI;
                         $totalC += $sociedadeAnonima.totalC + $sociedadeAnonimas.totalC;
                  }
                  ;

sociedadeAnonima returns [String noEmp, String ram, int totalA, int totalI, int totalC]
                 : nomeEmpresa localizacao objetivo
                 {
                        System.out.println("-----------Empresa Individual-----------");
                        System.out.println("Nome Empresa: " + $nomeEmpresa.noEmp);
                        System.out.println("Ramo da empresa: " +  $objetivo.ram);
                        if ($objetivo.ram.equals("AGRICULTURA")) $totalA = 1;
                        if ($objetivo.ram.equals("INDUSTRIA")) $totalI = 1;
                        if ($objetivo.ram.equals("COMERCIO")) $totalC = 1;
                 }
                 ;

nomeEmpresa returns [String noEmp]
            : 'Nome Empresa: ' WORD
            {
               $noEmp = $WORD.text;
            }
            ;

localizacao : cidade HI rua
            ;

cidade : 'Cidade: ' WORD
       ;

rua : 'Rua: ' WORD
    ;

objetivo returns [String ram]
         : 'Objetivo: ' WORD SP ramo
         {
            $ram = $ramo.ram;
         }
         ;

ramo returns [String ram]
     : 'AGRICULTURA'
     {
        $ram = "AGRICULTURA";
     }
     | 'INDUSTRIA'
     {
        $ram = "INDUSTRIA";
     }
     | 'COMERCIO'
     {
        $ram = "COMERCIO";
     }
     ;

socios returns [int numSocios, int cotaTotal, int flagAdmin]
       :
       | socio
       {
             $numSocios += $socio.num;
             $cotaTotal += $socio.val;
             $flagAdmin  = $socio.flagAdmin;
       }
       | socio socios
       {
             $numSocios += $socio.num + $socios.numSocios;
             $cotaTotal += $socio.val + $socios.cotaTotal;
             $flagAdmin  = $socio.flagAdmin;
       }
       ;

socio returns [int num, int val, int flagAdmin]
      : 'Socio: ' nome SP capital SP cota SP papel
      {
            $val = $cota.val;
            $num = 1;
            if(!$papel.pap.equals("ADMINISTRADOR")) $flagAdmin = 1;
      }
      ;

nome returns [String nom]
     : WORD
     {
        $nom = $WORD.text;
     }
     ;

capital : NUM '€'
        ;

cota returns [int val]
     : NUM '%'
     {
        $val = Integer.parseInt($NUM.text);
     }
     ;

papel returns [String pap]
      : 'SOCIO'
      {
            $pap = "SOCIO";
      }
      | 'ADMINISTRADOR'
      {
            $pap = "ADMINISTRADOR";
      }
      ;

funcionarios returns [int flagGere]
             : (funcionario)+
             {
                $flagGere = $funcionario.flagGere;
             }
             ;

funcionario returns [int flagGere]
            : 'Funcionario: ' nome SP numeroMecanografico SP dataNascimento SP contactos SP funcao SP entrada
            {
                if($funcao.func.equals("GERENTE")) $flagGere = 1;
                System.out.println("-------------Funcionário------------");
                System.out.println("Nome: " + $nome.nom);
                System.out.println("ID: " + $numeroMecanografico.id);
                System.out.println("Funcão: " + $funcao.func);
            }
            ;

numeroMecanografico returns [String id]
                    : 'F' NUM
                    {
                        $id = "F" + $NUM.text;
                    }
                    ;

dataNascimento : NUM BAR NUM BAR NUM
               ;

contactos : (contacto)+
          ;

contacto : telemovel AND (email)?
         ;

telemovel : 'Telemovel: ' NUM
          | 'Telefone: ' NUM
          ;

email : 'Email: ' WORD '@' WORD '.com'
      ;

funcao  returns [String func]
       : 'GERENTE'
       {
            $func = "GERENTE";
       }
       | 'PRODUCAO'
       {
            $func = "PRODUCAO";
       }
       | 'ESCRITORIO'
       {
            $func = "ESCRITORIO";
       }
       | 'ARMAZEM'
       {
            $func = "ARMAZEM";
       }
       ;

entrada : NUM BAR NUM BAR NUM
        ;

assembleiaGerais : (assembleiaGeral)+
                 ;

assembleiaGeral : 'AG: ' NUM SP 'Presidente: ' WORD SP 'Socios: ' listaSocios
                {
                    System.out.println("------Informação Assembleia Geral-------");
                    int flag  = 0;
                    int numAG = Integer.parseInt($NUM.text);
                    String pres = $WORD.text;
                    for(String s : listSocios) {
                        if(pres.equals(s)) flag = 1;
                    }
                    if(flag == 0) {
                        System.out.println("Assembleia Geral válida !!!");
                        System.out.println("AG Nº: " + numAG);
                        System.out.println("Presidente: " + pres);
                        for(String s : listSocios) {
                            System.out.println("Membro: " + s);
                        }

                    } else {
                        System.out.println("Assembleia Geral inválida...");
                        System.out.println("Verificar por favor a lista de sócios...");
                    }
                    listSocios = new ArrayList<>();
                }
                ;

listaSocios : WORD ( COMMA listaSocios)*
            {
                listSocios.add($WORD.text);
            }
            ;