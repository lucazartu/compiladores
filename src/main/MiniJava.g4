
grammar MiniJava;

@header {
    package main;
}

goal: mainclass ( classdeclaration )*; 

mainclass: 'class' identifier ABRECHAVES 'public' 'static' 'void' 'main' '(' 'String' '[' ']' 
			identifier ')' ABRECHAVES statement '}' '}';

classdeclaration: 'class' identifier ( EXTENDS identifier )? ABRECHAVES (vardeclaration)* 
					(methoddeclaration)* '}';

vardeclaration: type identifier ';';

methoddeclaration: 'public' type identifier '(' (type identifier (',' type identifier )*)? ')' ABRECHAVES 
				( vardeclaration )* (statement)* 'return' expression ';' '}';

type: INTARRAYTYPE 
	| BOOLEAN 
	| INT 
	| identifier;

statement: ABRECHAVES ( statement )* '}' 
		| IF '(' expression ')' statement 'else' statement 
		| WHILE '(' expression ')' statement 
		| PRINT '(' expression ')' ';' 
		| identifier '=' expression ';' 
		| identifier '[' expression ']' '=' expression ';';


expression: expression ( AND | LESSTHAN | PLUS | MINUS | TIMES ) expression  
		  | expression '[' expression ']' 
		  | expression '.' LENGTH 
		  | expression '.' identifier '(' ( expression ( ',' expression )* )? ')' 
		  | INTEGER_LITERAL 
		  | TRUE    
		  | FALSE   
		  | identifier 
		  | THIS   
		  | 'new' INT '[' expression ']' 
		  | 'new' identifier '(' ')' 
		  | NOT expression 
		  | '(' expression ')'; 


identifier: IDENTIFIER; 

EXTENDS: 'extends';
TRUE: 'true';
FALSE: 'false';
PRINT: 'System.out.println';
AND: '&&';
LESSTHAN: '<';
MINUS: '-';
PLUS: '+';
TIMES: '*';
NOT: '!';
WHILE: 'while';
IF: 'if';
INTARRAYTYPE: ('int'[ ]*'['[ ]*']');
BOOLEAN: 'boolean';
INT: 'int';
ABRECHAVES: '{';
THIS: 'this';
LENGTH: 'length';

INTEGER_LITERAL: [0-9]+;

IDENTIFIER: ([a-zA-Z_0-9]+);

ESPACOS: [ \r\t\n]+ -> skip;

COMENTARIO1LINHA: ('//'(IDENTIFIER | INTEGER_LITERAL | [\\\*\-\+\.,_ <>=;:%\?!@#$%()\[\]\r'"\t])*[\n]) -> skip;

COMETARIONLINHAS: ('/*'(IDENTIFIER | INTEGER_LITERAL | [\\\*\-\+\.,<>_ ;=&:\?!@#$%()\r\[\]'"\t\n])*'*/') -> skip;

