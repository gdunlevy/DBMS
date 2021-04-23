grammar RestrictedSQL;

statement : query
    | tableCommand;

query: 'SELECT' colSel 'FROM' tableSelect 'WHERE' condition
       | 'SELECT' colSel 'FROM' tableSelect;
       | 'SELECT' colSel 'FROM' tableSelect 'WHERE' condition 'AND' condition;

colSel: colSel colSel
    |'*'
    | ID;

tableCommand: 'ADD' tableSelect
            | 'DROP' tableCommand;

tableSelect: ID;

condition: condition condition
    | ID '=' colSel;
    | ID '+' ID;
    | ID '-' ID;
    | ID '>' ID;
    | ID '>=' ID;
    | ID '<' ID;
    | ID '<=' ID;


ID : [a-zA-Z0-9]+ ;
