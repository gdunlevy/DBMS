grammar RestrictedSQL;

statement : query
    | tableCommand;

query: 'SELECT' colSel 'FROM' tableSelect 'WHERE' condition ('AND' condition)*
       | 'SELECT' colSel (',' colSel)* 'FROM' tableSelect
       | 'SELECT' colSel 'FROM' tableSelect 'WHERE' colSel 'BETWEEN' condition ('AND' condition)*
       | 'INSERT' 'INTO' tableSelect 'VALUES' '('ID (',' ID)* ')';
       
  
colSel: colSel colSel
    |'*'
    | ID;
    
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
INDEX: 'INDEX'; 
CREATE: 'CREATE';
DROP: 'DROP';
UPDATE: 'UPDATE';
INSERT: 'INSERT';
BETWEEN: 'BETWEEN';
INTO: 'INTO';
VALUES: 'VALUES'; 

MAX: 'MAX';
MIN: 'MIN';
SUM: 'SUM';
AVG: 'AVG';
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

WS        : [ \t\n\r]+ -> skip;
ID : [a-zA-Z0-9]+ ;
