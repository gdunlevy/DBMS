grammar RestrictedSQL;

statement : query
    | tableCommand;

query: SELECT colSel FROM tableSelect WHERE condition (AND condition)*
       |SELECT colSel (',' colSel)* FROM tableSelect
       | SELECT colSel FROM tableSelect WHERE colSel BETWEEN condition (AND condition)*
       |INSERT INTO tableSelect VALUES '('values (',' values)* ')'
       |DELETE FROM tableSelect
       |DELETE FROM tableSelect WHERE condition (AND condition)*;

tableCommand: createTable
       | dropTable
       | createIndex
       | dropIndex;

createTable:
	CREATE TABLE tableSelect '('colSel (',' colSel )* ',' key');'; //need to take into consideration the attributes and the NULL/NOT NULL
       //|'CREATE' 'TABLE' tableSelect '('colSel colAtt colAtt (',' colSel colAtt colAtt)* ',' key')'';'

        
dropTable:
      DROP TABLE tableSelect;

createIndex:
        CREATE INDEX indexSel ON tableSelect '('colSel')';
dropIndex:
        DROP INDEX indexSel ON tableSelect;

indexSel: ID;  

values: ID;

colSel: '*'
    | ID;

colAtt:
	|VARCHAR '('ID')'
	|INT
	|FLOAT
	|NULL
	|NOT_NULL;

key:
	| PRIMARY_KEY '(' colSel')';



tableSelect: ID;

condition: colSel '=' ID
    | colSel '>' ID
    | colSel '>=' ID
    | colSel '<' ID
    | colSel '<=' ID
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
DELETE: 'DELETE';
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
