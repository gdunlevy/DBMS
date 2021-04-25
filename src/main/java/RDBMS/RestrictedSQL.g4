grammar RestrictedSQL;

statement : query
    | tableCommand;

query: selectQuery
       |insertQuery
       |deleteQuery;

selectQuery:
    SELECT (colSel ',')* colSel  FROM tableSelect ? whereCond;
    // we can add between later
insertQuery:
    INSERT INTO tableSelect VALUES '('(values ',')* values ')';

deleteQuery:
     DELETE FROM tableSelect whereCond;

tableCommand: createTable
       | dropTable
       | createIndex
       | dropIndex;

createTable:
	CREATE TABLE tableSelect '('(colSel ',')* colSel  ')'; //need to take into consideration the attributes and the NULL/NOT NULL
       //|'CREATE' 'TABLE' tableSelect '('colSel colAtt colAtt (',' colSel colAtt colAtt)* ',' key')'';'

        
dropTable:
      DROP TABLE tableSelect;

createIndex:
        CREATE INDEX indexSel ON tableSelect '('colSel')';
dropIndex:
        DROP INDEX indexSel ON tableSelect;

whereCond:
    WHERE (condition | conditionList);

conditionList:
     orCond
   | andCond;

orCond:
    condition 'OR' (condition | conditionList) ;

andCond:
    condition 'AND' (condition | conditionList);
indexSel: ID;  

values: ID;

colSel: '*'
    | ID;

colAtt:
	VARCHAR '('ID')'
	|INT
	|FLOAT
	|NULL
	|NOT_NULL;

key:
	 ',' PRIMARY_KEY '(' colSel')';



tableSelect: ID;

condition: equal
           |  nteq
          | greater
          | less
          | lteq
          | gteg;

equal: colSel '=' ID;
nteq: colSel '!=' ID;
greater: colSel '>' ID;
less: colSel '>=' ID;
lteq: colSel '<' ID;
gteg:  colSel '<=' ID;

    


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
