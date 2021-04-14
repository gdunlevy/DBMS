/**
 *
 * Source code  from  Chengmin Zou https://github.com/amz27/Recursive-Descent-Parser
 */

public class Token {

    public enum TokenType {Int, Float, Id, Digit, Letter, Keyword, Operator,Comma,
    Query,IdList,CondList,Cond,Term,Invalid,EOI}

    private TokenType type;
    private String val;
    
    //  Token constructor
    Token (TokenType t, String v) {
        type = t; 
        val = v;
    }

    // return the type of token and value
    TokenType getTokenType() {return type;}
    String getTokenValue() {return val;}

    
    public static String typeToString (TokenType tp) {
        String v = "";
        switch (tp) {
        case Int: v = "Int"; break;
        case Float: v = "Float"; break;
        case Id: v = "Id"; break;
        case Digit: v = "Digit"; break;
        case Letter: v = "Letter"; break;
        case Keyword: v = "Keyword";
        case Operator: v="Operator"; break;
        case Comma: v = "Comma"; break;
        case Query: v = "Query"; break;
        case IdList: v = "IdList"; break;
        case CondList: v = "CondList"; break;
        case Cond: v = "Cond"; break;
        case Term: v = "Term"; break;
        case Invalid: v = "Invalid"; break;
        case EOI: v = "EOI"; break;
        
        }
        return v;
    }
    
}

