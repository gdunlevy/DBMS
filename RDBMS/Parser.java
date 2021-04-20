
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
	
	
	public void reservedWords (String input) {
		//System.out.println("Input: " + input);
		if (input.equals("SELECT")){
			System.out.println("SELECT used"); 
			//next will either be a column name(s) or a * 
      //call a method that holds the column name/ comma/ *
		}
		else if (input.equals("FROM")){
			System.out.println("FROM used"); 
			//next will be a table name 
      //call a method that has table names?
		} 
		else if (input.equals("WHERE")){
			System.out.println("WHERE used"); 
			//next will be a condition 
			//call a method for condition?
		} 
	
	/****could also just do switch cases***** switch (input)
		if (the token you get is SELECT)
		if (the token you get it FROM)
		if (the token you get is WHERE)
		if (the token you get is AND)
		if (the token is invalid)*/
	
	}
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
	/*pubic void operators {
	****could also just do switch cases***** switch (input)
		if (the token you get is ,) //comma and * might need to go somewhere else 
		if (the token you get is * )
		if (the token you get it ( )
		if (the token you get is ) )
		if (the token you get is = )
		if (the token you get is != )
		if (the token you get is < )
		if (the token you get it <= )
		if (the token you get is > )
		if (the token you get is >= )
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
