grammar RestrictedSQL;

statement : query
    | tableCommand;

query: 'SELECT' colSel 'FROM' tableSelect 'WHERE' condition
       | 'SELECT' colSel 'FROM' tableSelect;

colSel: colSel colSel
    |'*'
    | ID;

tableCommand: 'ADD' tableSelect
            | 'DROP' tableCommand;

tableSelect: ID;

condition: condition condition
    | ID '=' colSel;


ID : [a-zA-Z0-9]+ ;