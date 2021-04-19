import java.util.Scanner;

public class UserInput {

    // Test for output
    public static void main(String args[]) {
        // testing the parser
      
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter query: ");
        String queryInput = myObj.nextLine();
        
          
        Parser parser = new Parser(queryInput);
        
    }
}
