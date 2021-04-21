
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
	
	public void parseToken(List<String> terms){
		
		System.out.println(terms);
		for (int i=0; i < terms.size(); i++){ //get token by token
			
			if (terms.get(i).equals("SELECT")|| terms.get(i).equals("FROM")  || terms.get(i).equals("WHERE") ||terms.get(i).equals("AND") ){
				reservedWords(terms.get(i));
			}
			else if(terms.get(i-1).equals("SELECT")){
				//colum name
				System.out.println(terms.get(i));
			}
		}
	
	}
	
	
	public void reservedWords (String input) {
		//System.out.println("Input: " + input);
		if (input.equals("SELECT")){
			System.out.println("SELECT used"); 
			//next will either be a column name(s) or a * 
			//need a method that gets the next input 
     			//call a method that holds the column name or a mehtod for * --> would this method be connected to the B-tree for the column name?
		}
		else if (input.equals("FROM")){
			System.out.println("FROM used"); 
			//next will be a table name 
			//need a method that gets the next input 
     			 //call a method that has table names? --> would this method be connected to the B-tree for the table name?
		} 
		else if (input.equals("WHERE")){
			System.out.println("WHERE used"); 
			//next will be a condition 
			//need a method that gets the next input 
			//call a method for condition? --> with all the math stuff?
		} 
		else if (input.equals("AND")){
			System.out.println("AND used"); 
		} 
		//else if a comma?
		//else invaild?
	
	/****could also just do switch cases***** switch (input)
		if (the token you get is SELECT)
		if (the token you get it FROM)
		if (the token you get is WHERE)
		if (the token you get is AND)
		if (the token is invalid)*/
	
	}
	
	public void columnName(String column){
		
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
