import java.util.Scanner;

public class UserInput {

    // Test for output
    public static void main(String args[]) {
        // testing the parser
      
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter query: ");
        String queryInput = myObj.nextLine();
        
        //either we parse word by word here or do it else where
        //could maybe put them in a list or an array and give that to the parse class?
        
          
        Parser parser = new Parser(queryInput);
        
    }
}

/*
Scanner myObj = new Scanner(System.in);
      System.out.print("enter stomething: ");
      List<String> terms = new ArrayList<String>();
      String s = ""; 

      while(!s.equals("$") && myObj.hasNext()){
      //while (myObj.hasNext()) {
            s = myObj.next();
            System.out.print(" "+s);
	         terms.add(s);	    
   
      }
      System.out.println();
      System.out.println(terms);
      myObj.close();
*/
