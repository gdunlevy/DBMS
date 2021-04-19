
/*
One of the queries: 
rel_ii_1000
1000 tuples: {<1, 1>, <2, 2>, <3, 3>, …, <999, 999>, <1000, 1000>}
*/


public class Parser{
	String input; 
	public Parser (String input){
		input = input; 
		//called in main to get the query to parse
	}	
	
	/*public string parseToken{
		//get token by token
	}*/	
	
	
	/*pubic void reservedWords {
	****could also just do switch cases***** switch (input)
		if (the token you get is SELECT)
		if (the token you get it FROM)
		if (the token you get is WHERE)
		if (the token you get is AND)
		if (the token is invalid)
	
	}*/
	/*pubic void nonreservedWords {
	****could also just do switch cases***** switch (input)
		if (the token you get is SUM)
		if (the token you get it MIN)
		if (the token you get is MAX)
		if (the token you get is AVG)
		if (the token you get is INDEX)
		if (the token you get is any kind of JOIN)
		if (the token is invalid)
	
	}*/
	/*pubic void symbols {
	****could also just do switch cases***** switch (input)
		if (the token you get is ,)
		if (the token you get it ( )
		if (the token you get is ) )
		if (the token you get is = )
		if (the token you get is != )
		if (the token you get is < )
		if (the token you get it <= )
		if (the token you get is > )
		if (the token you get is >= )
		if (the token you get is * )
		if (the token you get is / )
		if (the token you get it + )
		if (the token you get is - )
		if (the token you get is ; )
		if (the token is invalid)
	}*/
	
	
	
		//parse through the query token by token 
			//code to read through each entry and store it (could be done with the grammar)
		//storing the tokens and print them out (if we want)
		//error message if query is written incorrectly 

}

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

public class QueryTest{ 

	public static void main(String args[]) {
        //test the parser 
		//could read in an input or we hard code it?
        
    }
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
