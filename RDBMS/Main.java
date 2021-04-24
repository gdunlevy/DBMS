package RDBMS;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Main {
	public static void main(String[] args) throws Exception
	 {
	
	   	 System.out.print("Enter Query: ");
	   	 ANTLRInputStream input = new ANTLRInputStream( System.in); //control D
	   	 System.out.println();

	
		 RestrictedSQLLexer lexer = new RestrictedSQLLexer(input);
		 CommonTokenStream token = new CommonTokenStream(lexer);
		 RestrictedSQLParser parser = new RestrictedSQLParser(token);
		 ParseTree queryTree = parser.query(); //or use parser.statment();
		 
		 String query = queryTree.toStringTree(parser);
		 System.out.println(query);
		 
		 
		 ParseTree columnTree = parser.colSel();
		 String column = columnTree.toStringTree(parser);
		 System.out.println(column);
		 
		 ParseTree tableTree = parser.tableSelect();
		 String table = tableTree.toStringTree(parser);
		 System.out.println(table);
		 
		 
		 
	
	 }
} 
