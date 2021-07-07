grammar Mini_0;
programa: NL* listadecl EOF;

comando
	returns[tipoComando]:
	cmdif
	| cmdwhile
	| cmdasign
	| cmdreturn
	| llamada;

listadecl: decl listadecl | decl;

decl: funcion | glbal;

nl: NL;

glbal: declvar nl;

funcion:
	FUN ID LEFTPAREN params RIGHTPAREN (COLON tipo)? nl listaBloque END nl;

listaBloque: bloque | bloque listaBloque;
bloque: (declvar nl)* listaComando? nl;

listaComando: cmd = comando nl listaComando | cmd = comando;

params: parametro ( COMMA parametro)* | /*vacio*/;

parametro: ID COLON tipo;

tipobase
	returns[tipoDato]: INT | BOOL | CHAR | STRING;

tipo
	returns[tipoDato]: tipobase | LEFTBRACKET RIGHTBRACKET tipo;

var: ID | var LEFTBRACKET exp RIGHTBRACKET;

declvar: ID COLON tipo;

cmdif:
	IF exp nl listaBloque (ELSE IF exp nl listaBloque)* (
		ELSE nl listaBloque
	)? END;
cmdwhile: WHILE exp nl listaBloque LOOP;

cmdasign: var EQUAL exp;

llamada: ID LEFTPAREN listaexp RIGHTPAREN;

listaexp: /*vacio*/ | exp ( COMMA exp)*;

cmdreturn: RETURN exp | RETURN;

op1: PLUS | MINUS;

op2: STAR | DIV;

exprAritmetica: termAritmetico (op1 termAritmetico)*;

termAritmetico: factorAritmetico (op2 factorAritmetico)*;

factorAritmetico:
	LITNUMERAL
	| LITSTRING
	| ID
	| LEFTPAREN exprAritmetica RIGHTPAREN
	| BOOL
	| CHAR
	| LITCHAR;

exprRelacional: termRelacional (OP_BOOL termRelacional)*;

termRelacional: exprAritmetica OP_REL exprAritmetica;

OP_BOOL: AND | OR;

OP_REL: GREATEREQUAL | GREATER | LESS | LESSEQUAL | DIFFERENT;

exp:
	NEW LEFTBRACKET exp RIGHTBRACKET tipo
	| LEFTPAREN exp RIGHTPAREN
	| llamada
	| NOT exp
	| MINUS exp
	| exprAritmetica
	| exprRelacional;

COMMENT: '/*' .*? '*/' -> skip;

LINE_COMMENT: '//' ~[\r\n]* -> skip;

NL: ( '\n')+;
LITNUMERAL: ( [0-9]+ | '0x' [0-9a-fA-F]+);
LITSTRING:
	'"' ('\\' | '\n' | '\t' | '”' | [a-zA-Z] | [0-9])+ '"';
LITCHAR:
	'\'' ('\\' | '\n' | '\t' | '”' | ' ' | [a-zA-Z] | [0-9]) '\'';
TRUE: 'true';
FALSE: 'false';
IF: 'if';
ELSE: 'else';
END: 'end';
WHILE: 'while';
LOOP: 'loop';
FUN: 'fun';
RETURN: 'return';
NEW: 'new';
STRING: 'string';
INT: 'int';
CHAR: 'char';
BOOL: 'bool';
AND: 'and';
OR: 'or';
NOT: 'not';

LESS: '<';
GREATER: '>';
LEFTPAREN: '(';
RIGHTPAREN: ')';
LEFTBRACKET: '[';
RIGHTBRACKET: ']';
LEFTBRACE: '{';
RIGHTBRACE: '}';
PLUS: '+';
MINUS: '-';
STAR: '*';
DIV: '/';
COMMA: ',';
COLON: ':';
GREATEREQUAL: '>=';
LESSEQUAL: '<=';
EQUAL: '=';
DIFFERENT: '<>';
DOT: '.';
ID: ([a-zA-Z_]) ([a-zA-Z_] | [0-9])*;
WS: [ \t\r]+ -> skip;

