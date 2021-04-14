/**
 *
 * Source code  from  Chengmin Zou https://github.com/amz27/Recursive-Descent-Parser
 */

public class Lexer {

    private static final String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String digits = "0123456789";
    String stmt = "";
    int index = 0;
    char ch;

    // Lexer constructor
    public Lexer(String input) {
        this.stmt = input;
        this.index = 0;
        this.ch = nextChar();
    }
    
    // Reads in characters for new tokens and returns tokens to be parsed
    public Token nextToken() {
        do {
            if (Character.isLetter(ch)) {
                String id = concat(letters + digits);
                
                //MAYBE PUT CREATE TABLE AND CREATE INDEX HERE????
                
                if (id.equals("SELECT") || id.equals("FROM") || id.equals("WHERE") || id.equals("AND")) {
                    return new Token(Token.TokenType.Keyword, id);
                } else {
                    return new Token(Token.TokenType.Id, id);
                }
            } else if (Character.isDigit(ch)) {
                String num = concat(digits);
                if (ch != '.') {
                    return new Token(Token.TokenType.Int, num);
                }
                num += ch;
                ch = nextChar();
                if (Character.isDigit(ch)) {
                    num += concat(digits);
                    return new Token(Token.TokenType.Float, num);
                } else {
                    return new Token(Token.TokenType.Invalid, num);
                }
            } else {
                switch (ch) {
                    case ' ':
                        ch = nextChar();
                        break;
                    case ',':
                        char comma = ch;
                        ch = nextChar();
                        return new Token(Token.TokenType.Comma, Character.toString(comma));
                    case '=':
                        char temp = ch;
                        ch = nextChar();
                        return new Token(Token.TokenType.Operator, Character.toString(temp));
                    case '<':
                        char temp1 = ch;
                        ch = nextChar();
                        return new Token(Token.TokenType.Operator, Character.toString(temp1));
                    case '>':
                        char temp2 = ch;
                        ch = nextChar();
                        return new Token(Token.TokenType.Operator, Character.toString(temp2));
                    case '$':
                        return new Token(Token.TokenType.EOI, "EndOfInput");
                    default:
                        ch = nextChar();
                        error("Invalid token type");
                        return new Token(Token.TokenType.Invalid, Character.toString(ch));
                }
            }
        } while (true);
    }

    //Reads and returns next character
    private char nextChar() {
        ch = stmt.charAt(index);
        index += 1;
        return ch;
    }

     // Reads and concatenates characters into a string 
    private String concat(String set) {
        StringBuffer r = new StringBuffer("");
        do {
            r.append(ch);
            ch = nextChar();
        } while (set.indexOf(ch) >= 0);
        return r.toString();
    }

    // Output error message.
    public void error(String msg) {
        System.err.println("\nError: location " + index + " " + msg);
        System.exit(1);
    }
}