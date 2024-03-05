grammar DotUml;

options {
  language=Java;
  k=1;
 }

@header {
import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;
}

@members {
// variables globales et methodes utiles a placer ici
}

@rulecatch {
catch (RecognitionException e) {reportError (e) ; throw e ; }
}

// Grammaire //

unite: 'ClassDiagram' {PtGen.pt(0);}
    header
    '{' (object | associations)* '}'
    EOF {PtGen.pt(1000);}
    ;

header: '[' (ident|'='|('label' '=' '"' ident '"' {PtGen.pt(1);} ))* ']';


object: (interfaceStruct|classStruct|enumStruct|alignStruct) ;

interfaceStruct: 'interface' ident {PtGen.pt(10);} '{' (varfunc)* '}' {PtGen.pt(14);} ;
classStruct:     (('abstract' 'class' ident {PtGen.pt(11);})
                 | 'class' ident {PtGen.pt(12);})
                 '{' (varfunc)* '}' {PtGen.pt(14);} ;
enumStruct:      'enumeration' ident {PtGen.pt(13);} '{' (ident)* '}' {PtGen.pt(14);} ;
alignStruct:     'align' '{' (ident)* '}' ;

varfunc: visibility ident {PtGen.pt(24);} ( function )? (':' ident {PtGen.pt(23);})? {PtGen.pt(30);};
function: '(' ( ident {PtGen.pt(25);}':' ident {PtGen.pt(26);} (',' ident{PtGen.pt(25);} ':' ident {PtGen.pt(27);})* )? ')';

visibility: ('private' {PtGen.pt(20);} | 'public' {PtGen.pt(21);} | 'protected' {PtGen.pt(22);}) ;


associations: ident {PtGen.pt(44);} (card1)? relation (card2)? ident {PtGen.pt(45);} ('with' ident {PtGen.pt(54);})? (':' ident)? (';')? {PtGen.pt(60);} ;

card1: '"' ('*'  {PtGen.pt(50);} | nbentier {PtGen.pt(51);} ('..' ('*' {PtGen.pt(50);} | nbentier {PtGen.pt(51);}) )? ) '"' ;
card2: '"' ('*'  {PtGen.pt(52);} | nbentier {PtGen.pt(53);} ('..' ('*' {PtGen.pt(52);} | nbentier {PtGen.pt(53);}) )? ) '"' ;
relation:  ('<')? ('x' {PtGen.pt(46);} )? '-' ('r' {PtGen.pt(40);}| 'c' {PtGen.pt(41);}| 'g' {PtGen.pt(42);}| 'a'{PtGen.pt(43);})? '-' ('x' {PtGen.pt(47);})? ('>')? ;

// Partie Lexicale //

nbentier  :   INT { PtGen.valEnt = Integer.parseInt($INT.text);};
ident : ID  { PtGen.ident = $ID.text; } ;

// Prtie purement lexicale //

INT :   '0'..'9'+ ;
ID  :   ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z')* ;
WS  :   (' '|'\t' | '\n' |'\r')+ {skip();} ;