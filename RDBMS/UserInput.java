import java.util.Scanner;

public class UserInput {

    // Test for output
    public static void main(String args[]) {

	Scanner myObj = new Scanner(System.in);
      	System.out.print("Enter Query: ");
      	List<String> terms = new ArrayList<String>(); //probably not the most efficiant way 
      	String s = ""; 


      	//for now it goes out of the while loop when you have a ; at the end .... not sure if there is a better way to make it break....
      	while(!s.equals(";") && myObj.hasNext()){
           	s = myObj.next();
           	//System.out.print(" "+s);
	        terms.add(s);	    
      	}
      	System.out.println();

      	Parser parser = new Parser();
      	for (int i = 0; i < terms.size(); i++){
      		parser.reservedWords(terms.get(i));
      	}
       
      	myObj.close();
        
    }
}
