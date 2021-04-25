package RDBMS;

import gen.RestrictedSQLLexer;
import gen.RestrictedSQLParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        boolean run = true;
        CharStream input;
        RestrictedSQLLexer lexer;
        CommonTokenStream tokenStream;
        RestrictedSQLParser parser;
        ParseTree queryTree;
        RestrictedSQLActiveVisitor visitor = new RestrictedSQLActiveVisitor(new Database());
        Scanner inputStream = new Scanner(System.in);
        while (run) {
            System.out.print("Enter Query: ");
            input = CharStreams.fromString(inputStream.nextLine());
            System.out.println();

            lexer = new RestrictedSQLLexer(input);
            tokenStream = new CommonTokenStream(lexer);
            parser = new RestrictedSQLParser(tokenStream);
            queryTree = parser.statement();
      

            String query = queryTree.toStringTree(parser);
            System.out.println(query);

            queryTree.accept(visitor);

        }
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
