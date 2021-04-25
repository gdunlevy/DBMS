
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception
	 {
	
	   	 System.out.print("Enter Query: ");
	   	 ANTLRInputStream input = new ANTLRInputStream( System.in); //control D
	   	 System.out.println();

	
		 RestrictedSQLLexer lexer = new RestrictedSQLLexer(input);
		 CommonTokenStream tokens = new CommonTokenStream(lexer);

		 // Print the token stream.
		 System.out.println("Tokens:");
		 tokens.fill();
		 String here = tokens.toString();

		 ArrayList<String> tokenList = new ArrayList<String>();
		 
		 for (Token token : tokens.getTokens())
		 {
			 System.out.println(token.toString());
			 tokenList.add(here);
			 //System.out.println(tokenList);
			 
		 }
		 RestrictedSQLParser parser = new RestrictedSQLParser(tokens);
		 ParseTree queryTree = parser.statement(); //or use parser.statment();
		 
		 String query = queryTree.toStringTree(parser);
		 System.out.println(query);
		 
		 
		 RestrictedSQLActiveVisitor visitor = new RestrictedSQLActiveVisitor(new Database());
		 queryTree.accept(visitor);
		 
		 //visitor.visitCreateTable(null); // what do we need to put in here?
		
	
	 }
} 