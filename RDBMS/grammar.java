
public class Grammar{ 

	/*check the token, what is it? 
		- SELECT, FROM, WHERE, AND ... etc
		- is it a colum name?
		- is it a table name?
		- is it math symbol?
		- is it a string?
		- is it a *?
		- is it a comma?
		- a math term?

		<KEYWORD> <*>|<name>|<name><,><name><,>..... <KEYWORD> <name>|<name><,>.... <KEYWORD> <name> <operator> <term>
		SELECT c1, c2 FROM t1 WHERE c1 = 5000
		SELECT * FROM t2 WHERE c1= 600 AND c2 = 3000


	public enum token {} 
	//maybe make them into strings so it is simpler to parse?


 	num = '0123456789'
	letter = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNPOQRSTUVWXYZ'

	
	nextToken(){
	if it the token is a mysql word (ex SELECT)
	 	switch cases
		return token
		
	else if the token is just a word (maybe a column name or table name) ---->might be too vague 
		return token

	else if the token is an operator or a symbol or a space (ex >=)
	 	switch cases 
	 	return token

	else if the token is a num
	 	float 
	 	int
	 	return token
	 }
	*/

}



/*


TOKEN :  Reserved words 
{
    ADD: "add"
|   ALTER: "alter"
|   AND: "and"
|   ASC: "asc"
|   BETWEEN: "between"
|   COLUMN: "column"
|   CREATE: "create"
|   DESCRIBE: "describe"
|   DROP: "drop"
|   ERROR: "error"
|   FROM: "from"
|   GROUP: "group"
|   INNER: "inner"
|   INSERT: "insert"
|   INTERSECT: "intersect"
|   INTO: "into"
|   IS: "is"
|   JOIN: "join"
|   LEFT: "left"
|   MERGE: "merge"
|   OUT: "out"
|   OUTER: "outer"
|   PRIMARY: "primary"
|   SELECT: "select"
|   TABLE: "table"
|   TO: "to"
|   UNION: "union"
|   UPDATE: "update"
|   VALUE: "value"
|   WHERE: "where"
|   INT: "int"
}


TOKEN : NonReserved words 
{

|   KEY: "key"
|   SUM: "sum"
|   AVG: "avg"
|   MIN: "min"
|   MAX: "max"
|   INDEX: "index"
|   COLUMNS: "columns"
|   DATABASE: "database"
|   RENAME: "rename"
}

TOKEN :
{
	COMMA: ","
|	PERIOD: "."
|	LPAREN: "("
|	RPAREN: ")"
|   LBRACE: "{"
|   RBRACE: "}"
|   LSBRACE: "["
|   RSBRACE: "]"
|	EQ: "="
|	NE2: "!="
|	LT: "<"
|	LE: "<="
|	GT: ">"
|	GE: ">="
|	STAR: "*"
|	SLASH: "/"
|	PLUS: "+"
|	MINUS: "-"
|   QMARK: "?"
|   SEMICOLON: ";"
|   COLON: ":"
}

*/
