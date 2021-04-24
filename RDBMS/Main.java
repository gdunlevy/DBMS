package RDBMS;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;


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
		 ParseTree queryTree = parser.query(); //or use parser.statment();
		 
		 String query = queryTree.toStringTree(parser);
		 System.out.println(query);
		 
		 
		 Database data = new Database();
		 ArrayList<String> columnList = new ArrayList<String>();
		 //columnList.add(column);
		 System.out.println("colum List "+columnList);
		 //data.createTable(table, columnList);
		 
		 
		 
		 
		
	
	 }
} 
