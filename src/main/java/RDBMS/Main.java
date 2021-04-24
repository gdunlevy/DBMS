package RDBMS;

import gen.RestrictedSQLLexer;
import gen.RestrictedSQLParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Main {
    public static void main(String[] args) throws Exception {

        System.out.print("Enter Query: ");
        ANTLRInputStream input = new ANTLRInputStream(System.in); //control D
        System.out.println();


        RestrictedSQLLexer lexer = new RestrictedSQLLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        RestrictedSQLParser parser = new RestrictedSQLParser(tokenStream);
        ParseTree queryTree = parser.statement();
        //CommonTokenStream tokens = new CommonTokenStream(lexer);

        /**
        // Print the token stream.
        System.out.println("Tokens:");
        tokens.fill();
        String here = tokens.toString();

        ArrayList<String> tokenList = new ArrayList<String>();

        for (Token token : tokens.getTokens()) {
            System.out.println(token.toString());
            tokenList.add(here); // need to be able to extract the ID some how
            //System.out.println(tokenList);

        }

        parser = new RestrictedSQLParser(tokens);
        queryTree = parser.query();
        */
        String query = queryTree.toStringTree(parser);
        System.out.println(query);


        RestrictedSQLActiveVisitor visitor = new RestrictedSQLActiveVisitor(new Database());
        queryTree.accept(visitor);
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
