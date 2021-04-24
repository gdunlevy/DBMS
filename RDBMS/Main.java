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
			 tokenList.add(here); // need to be able to extract the ID some how
			 //System.out.println(tokenList);
			 
		 }
		 RestrictedSQLParser parser = new RestrictedSQLParser(tokens);
		 ParseTree queryTree = parser.query(); 
		 
		 String query = queryTree.toStringTree(parser);
		 System.out.println(query);
		 
		 ParseTree tableTree = parser.tableSelect(); // PROBLEM: only printing out 'tableSelect' instead of the ID 
		 String table = tableTree.toStringTree(parser);
		 System.out.println(table);
		 
		 ParseTree colTree = parser.colSel(); 
		 String column = colTree.toStringTree(parser); // PROBLEM: only printing out 'colSel' instead of the ID 
		 System.out.println(column); 
		 
		 
		 Database data = new Database();
		 ArrayList<String> columnList = new ArrayList<String>();
		 columnList.add(column);
		 System.out.println("column List "+columnList);
		 data.createTable(table, columnList);
		
	
	 }
} 


/* THIS WAS THE OUT PUT OF THE MAIN: 
Tokens:
[@0,0:5='SELECT',<2>,1:0]
[@1,7:8='c1',<44>,1:7]
[@2,9:9=',',<35>,1:9]
[@3,11:12='c2',<44>,1:11]
[@4,14:17='FROM',<3>,1:14]
[@5,19:20='t1',<44>,1:19]
[@6,22:21='<EOF>',<-1>,2:0]
(query SELECT (colSel c1) , (colSel c2) FROM (tableSelect t1))
tableSelect
colSel
line 2:0 mismatched input '<EOF>' expecting {'*', ID}
column List [colSel]
Table tableSelect has been added to database.
The columns associated with Table tableSelect are: [colSel]. 
*/
