package RDBMS;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import gen.*;

public class Main {
	public static void main(String[] args) throws Exception
	 {
		 String inputFile = null;
	
	   	 System.out.print("Enter Query: ");
	   	 ANTLRInputStream input = new ANTLRInputStream( System.in); //need EOF after writing in input

	
		 RestrictedSQLLexer lexer = new RestrictedSQLLexer(input);
		 CommonTokenStream token = new CommonTokenStream(lexer);
		 RestrictedSQLParser parser = new RestrictedSQLParser(token);
		 ParseTree tree = parser.query(); //or use parser.statment();
	
		 // Print the parse tree in Lisp format.
		 System.out.println("\nParse tree (Lisp format):");
		 System.out.println(tree.toStringTree(parser));

		 RestrictedSQLActiveVisitor visitor = new RestrictedSQLActiveVisitor(new Database());
		 tree.accept(visitor);
	
	 }
} 
