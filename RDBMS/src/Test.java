/*
 * Testing
 */

public class Test {

    // Test for output
    public static void main(String args[]) {
        // testing the parser
    	
        Parser parser = new Parser("SELECT C1,C2 FROM T1 WHERE C1=5.23");
        parser.run();
        
    }
}
