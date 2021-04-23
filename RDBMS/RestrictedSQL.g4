grammar RestrictedSQL;

statement : query
    | tableCommand;

query: 'SELECT' colSel 'FROM' tableSelect 'WHERE' condition ('AND' condition)*
       |'SELECT' colSel (',' colSel)* 'FROM' tableSelect
       |'SELECT' colSel 'FROM' tableSelect 'WHERE' colSel 'BETWEEN' condition ('AND' condition)*
       |'INSERT' 'INTO' tableSelect 'VALUES' '('ID (',' ID)* ')'
       |'CREATE' 'TABLE' tableSelect '('colSel colAtt colAtt (',' colSel colAtt colAtt)* key')'';'
       |'DROP' 'TABLE' tableSelect
       |'CREATE' 'INDEX' indexSel 'ON' tableSelect '('colSel (',' colSel)* ')'
       |'DROP' 'INDEX' indexSel 'ON' tableSelect;
       
indexSel: ID;  

colSel: colSel colSel
    |'*'
    | ID;

colAtt:
	|'VARCHAR' '('ID')'
	|'INT'
	|'FLOAT'
	|'NULL'
	|'NOT NULL';

key:
	| 'PRIMARY KEY' '(' colSel')';

tableCommand: 'ADD' tableSelect
            | 'DROP' tableCommand;

tableSelect: ID;

condition: condition condition
    | ID '=' colSel
    | ID '>' colSel
    | ID '>=' colSel
    | ID '<' colSel
    | ID '<=' colSel
    | ID;

    


SELECT: 'SELECT';
FROM: 'FROM';
WHERE: 'WHERE';
AND: 'AND';
OR: 'OR';
ADD: 'ADD';
CREATE: 'CREATE';
INDEX: 'INDEX'; 
DROP: 'DROP';
TABLE: 'TABLE';
UPDATE: 'UPDATE';
INSERT: 'INSERT';
BETWEEN: 'BETWEEN';
INTO: 'INTO';
ON: 'ON';
VALUES: 'VALUES'; 

MAX: 'MAX';
MIN: 'MIN';
SUM: 'SUM';
AVG: 'AVG';
NULL: 'NULL';
NOT_NULL: 'NOT NULL';
PLUS: '+';
MINUS: '-';
EQUAL:  '=';
GREATER: '>';
LESS: '<';
LTEQ: '<=';
GTEQ: '>=';
LR_BRACKET: '(';
RR_BRACKET:  ')';
SINGLE_QUOTE_SYMB: '\''; 
COMMA: ',';
SEMI: ';';
EXCLAMATION: '!';


INT: 'INT';
FLOAT: 'FLOAT';
VARCHAR: 'VARCHAR';
PRIMARY_KEY: 'PRIMARY KEY';
FORGIEN_KEY: 'FORGIEN KEY';

WS        : [ \t\n\r]+ -> skip;
ID : [a-zA-Z0-9]+ ;


