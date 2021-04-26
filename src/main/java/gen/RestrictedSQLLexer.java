// Generated from C:/Users/Andrew/DBMS/src/main/java/RDBMS\RestrictedSQL.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RestrictedSQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SELECT=3, FROM=4, WHERE=5, AND=6, OR=7, ADD=8, CREATE=9, 
		INDEX=10, DROP=11, DELETE=12, TABLE=13, UPDATE=14, INSERT=15, BETWEEN=16, 
		INTO=17, ON=18, VALUES=19, LOAD=20, SAVE=21, MAX=22, MIN=23, SUM=24, AVG=25, 
		NULL=26, NOT_NULL=27, PLUS=28, MINUS=29, EQUAL=30, GREATER=31, LESS=32, 
		LTEQ=33, GTEQ=34, LR_BRACKET=35, RR_BRACKET=36, SINGLE_QUOTE_SYMB=37, 
		COMMA=38, SEMI=39, EXCLAMATION=40, INT=41, FLOAT=42, VARCHAR=43, PRIMARY_KEY=44, 
		FORGIEN_KEY=45, WS=46, ID=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "SELECT", "FROM", "WHERE", "AND", "OR", "ADD", "CREATE", 
			"INDEX", "DROP", "DELETE", "TABLE", "UPDATE", "INSERT", "BETWEEN", "INTO", 
			"ON", "VALUES", "LOAD", "SAVE", "MAX", "MIN", "SUM", "AVG", "NULL", "NOT_NULL", 
			"PLUS", "MINUS", "EQUAL", "GREATER", "LESS", "LTEQ", "GTEQ", "LR_BRACKET", 
			"RR_BRACKET", "SINGLE_QUOTE_SYMB", "COMMA", "SEMI", "EXCLAMATION", "INT", 
			"FLOAT", "VARCHAR", "PRIMARY_KEY", "FORGIEN_KEY", "WS", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'!='", "'SELECT'", "'FROM'", "'WHERE'", "'AND'", "'OR'", 
			"'ADD'", "'CREATE'", "'INDEX'", "'DROP'", "'DELETE'", "'TABLE'", "'UPDATE'", 
			"'INSERT'", "'BETWEEN'", "'INTO'", "'ON'", "'VALUES'", "'LOAD'", "'SAVE'", 
			"'MAX'", "'MIN'", "'SUM'", "'AVG'", "'NULL'", "'NOT NULL'", "'+'", "'-'", 
			"'='", "'>'", "'<'", "'<='", "'>='", "'('", "')'", "'''", "','", "';'", 
			"'!'", "'INT'", "'FLOAT'", "'VARCHAR'", "'PRIMARY KEY'", "'FORGIEN KEY'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "SELECT", "FROM", "WHERE", "AND", "OR", "ADD", "CREATE", 
			"INDEX", "DROP", "DELETE", "TABLE", "UPDATE", "INSERT", "BETWEEN", "INTO", 
			"ON", "VALUES", "LOAD", "SAVE", "MAX", "MIN", "SUM", "AVG", "NULL", "NOT_NULL", 
			"PLUS", "MINUS", "EQUAL", "GREATER", "LESS", "LTEQ", "GTEQ", "LR_BRACKET", 
			"RR_BRACKET", "SINGLE_QUOTE_SYMB", "COMMA", "SEMI", "EXCLAMATION", "INT", 
			"FLOAT", "VARCHAR", "PRIMARY_KEY", "FORGIEN_KEY", "WS", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public RestrictedSQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RestrictedSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0141\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3/\6/\u0137\n/\r/\16/\u0138\3/\3/\3\60\6\60\u013e\n\60\r"+
		"\60\16\60\u013f\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\4\5"+
		"\2\13\f\17\17\"\"\5\2\62;C\\c|\2\u0142\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7f\3\2\2\2\tm\3"+
		"\2\2\2\13r\3\2\2\2\rx\3\2\2\2\17|\3\2\2\2\21\177\3\2\2\2\23\u0083\3\2"+
		"\2\2\25\u008a\3\2\2\2\27\u0090\3\2\2\2\31\u0095\3\2\2\2\33\u009c\3\2\2"+
		"\2\35\u00a2\3\2\2\2\37\u00a9\3\2\2\2!\u00b0\3\2\2\2#\u00b8\3\2\2\2%\u00bd"+
		"\3\2\2\2\'\u00c0\3\2\2\2)\u00c7\3\2\2\2+\u00cc\3\2\2\2-\u00d1\3\2\2\2"+
		"/\u00d5\3\2\2\2\61\u00d9\3\2\2\2\63\u00dd\3\2\2\2\65\u00e1\3\2\2\2\67"+
		"\u00e6\3\2\2\29\u00ef\3\2\2\2;\u00f1\3\2\2\2=\u00f3\3\2\2\2?\u00f5\3\2"+
		"\2\2A\u00f7\3\2\2\2C\u00f9\3\2\2\2E\u00fc\3\2\2\2G\u00ff\3\2\2\2I\u0101"+
		"\3\2\2\2K\u0103\3\2\2\2M\u0105\3\2\2\2O\u0107\3\2\2\2Q\u0109\3\2\2\2S"+
		"\u010b\3\2\2\2U\u010f\3\2\2\2W\u0115\3\2\2\2Y\u011d\3\2\2\2[\u0129\3\2"+
		"\2\2]\u0136\3\2\2\2_\u013d\3\2\2\2ab\7,\2\2b\4\3\2\2\2cd\7#\2\2de\7?\2"+
		"\2e\6\3\2\2\2fg\7U\2\2gh\7G\2\2hi\7N\2\2ij\7G\2\2jk\7E\2\2kl\7V\2\2l\b"+
		"\3\2\2\2mn\7H\2\2no\7T\2\2op\7Q\2\2pq\7O\2\2q\n\3\2\2\2rs\7Y\2\2st\7J"+
		"\2\2tu\7G\2\2uv\7T\2\2vw\7G\2\2w\f\3\2\2\2xy\7C\2\2yz\7P\2\2z{\7F\2\2"+
		"{\16\3\2\2\2|}\7Q\2\2}~\7T\2\2~\20\3\2\2\2\177\u0080\7C\2\2\u0080\u0081"+
		"\7F\2\2\u0081\u0082\7F\2\2\u0082\22\3\2\2\2\u0083\u0084\7E\2\2\u0084\u0085"+
		"\7T\2\2\u0085\u0086\7G\2\2\u0086\u0087\7C\2\2\u0087\u0088\7V\2\2\u0088"+
		"\u0089\7G\2\2\u0089\24\3\2\2\2\u008a\u008b\7K\2\2\u008b\u008c\7P\2\2\u008c"+
		"\u008d\7F\2\2\u008d\u008e\7G\2\2\u008e\u008f\7Z\2\2\u008f\26\3\2\2\2\u0090"+
		"\u0091\7F\2\2\u0091\u0092\7T\2\2\u0092\u0093\7Q\2\2\u0093\u0094\7R\2\2"+
		"\u0094\30\3\2\2\2\u0095\u0096\7F\2\2\u0096\u0097\7G\2\2\u0097\u0098\7"+
		"N\2\2\u0098\u0099\7G\2\2\u0099\u009a\7V\2\2\u009a\u009b\7G\2\2\u009b\32"+
		"\3\2\2\2\u009c\u009d\7V\2\2\u009d\u009e\7C\2\2\u009e\u009f\7D\2\2\u009f"+
		"\u00a0\7N\2\2\u00a0\u00a1\7G\2\2\u00a1\34\3\2\2\2\u00a2\u00a3\7W\2\2\u00a3"+
		"\u00a4\7R\2\2\u00a4\u00a5\7F\2\2\u00a5\u00a6\7C\2\2\u00a6\u00a7\7V\2\2"+
		"\u00a7\u00a8\7G\2\2\u00a8\36\3\2\2\2\u00a9\u00aa\7K\2\2\u00aa\u00ab\7"+
		"P\2\2\u00ab\u00ac\7U\2\2\u00ac\u00ad\7G\2\2\u00ad\u00ae\7T\2\2\u00ae\u00af"+
		"\7V\2\2\u00af \3\2\2\2\u00b0\u00b1\7D\2\2\u00b1\u00b2\7G\2\2\u00b2\u00b3"+
		"\7V\2\2\u00b3\u00b4\7Y\2\2\u00b4\u00b5\7G\2\2\u00b5\u00b6\7G\2\2\u00b6"+
		"\u00b7\7P\2\2\u00b7\"\3\2\2\2\u00b8\u00b9\7K\2\2\u00b9\u00ba\7P\2\2\u00ba"+
		"\u00bb\7V\2\2\u00bb\u00bc\7Q\2\2\u00bc$\3\2\2\2\u00bd\u00be\7Q\2\2\u00be"+
		"\u00bf\7P\2\2\u00bf&\3\2\2\2\u00c0\u00c1\7X\2\2\u00c1\u00c2\7C\2\2\u00c2"+
		"\u00c3\7N\2\2\u00c3\u00c4\7W\2\2\u00c4\u00c5\7G\2\2\u00c5\u00c6\7U\2\2"+
		"\u00c6(\3\2\2\2\u00c7\u00c8\7N\2\2\u00c8\u00c9\7Q\2\2\u00c9\u00ca\7C\2"+
		"\2\u00ca\u00cb\7F\2\2\u00cb*\3\2\2\2\u00cc\u00cd\7U\2\2\u00cd\u00ce\7"+
		"C\2\2\u00ce\u00cf\7X\2\2\u00cf\u00d0\7G\2\2\u00d0,\3\2\2\2\u00d1\u00d2"+
		"\7O\2\2\u00d2\u00d3\7C\2\2\u00d3\u00d4\7Z\2\2\u00d4.\3\2\2\2\u00d5\u00d6"+
		"\7O\2\2\u00d6\u00d7\7K\2\2\u00d7\u00d8\7P\2\2\u00d8\60\3\2\2\2\u00d9\u00da"+
		"\7U\2\2\u00da\u00db\7W\2\2\u00db\u00dc\7O\2\2\u00dc\62\3\2\2\2\u00dd\u00de"+
		"\7C\2\2\u00de\u00df\7X\2\2\u00df\u00e0\7I\2\2\u00e0\64\3\2\2\2\u00e1\u00e2"+
		"\7P\2\2\u00e2\u00e3\7W\2\2\u00e3\u00e4\7N\2\2\u00e4\u00e5\7N\2\2\u00e5"+
		"\66\3\2\2\2\u00e6\u00e7\7P\2\2\u00e7\u00e8\7Q\2\2\u00e8\u00e9\7V\2\2\u00e9"+
		"\u00ea\7\"\2\2\u00ea\u00eb\7P\2\2\u00eb\u00ec\7W\2\2\u00ec\u00ed\7N\2"+
		"\2\u00ed\u00ee\7N\2\2\u00ee8\3\2\2\2\u00ef\u00f0\7-\2\2\u00f0:\3\2\2\2"+
		"\u00f1\u00f2\7/\2\2\u00f2<\3\2\2\2\u00f3\u00f4\7?\2\2\u00f4>\3\2\2\2\u00f5"+
		"\u00f6\7@\2\2\u00f6@\3\2\2\2\u00f7\u00f8\7>\2\2\u00f8B\3\2\2\2\u00f9\u00fa"+
		"\7>\2\2\u00fa\u00fb\7?\2\2\u00fbD\3\2\2\2\u00fc\u00fd\7@\2\2\u00fd\u00fe"+
		"\7?\2\2\u00feF\3\2\2\2\u00ff\u0100\7*\2\2\u0100H\3\2\2\2\u0101\u0102\7"+
		"+\2\2\u0102J\3\2\2\2\u0103\u0104\7)\2\2\u0104L\3\2\2\2\u0105\u0106\7."+
		"\2\2\u0106N\3\2\2\2\u0107\u0108\7=\2\2\u0108P\3\2\2\2\u0109\u010a\7#\2"+
		"\2\u010aR\3\2\2\2\u010b\u010c\7K\2\2\u010c\u010d\7P\2\2\u010d\u010e\7"+
		"V\2\2\u010eT\3\2\2\2\u010f\u0110\7H\2\2\u0110\u0111\7N\2\2\u0111\u0112"+
		"\7Q\2\2\u0112\u0113\7C\2\2\u0113\u0114\7V\2\2\u0114V\3\2\2\2\u0115\u0116"+
		"\7X\2\2\u0116\u0117\7C\2\2\u0117\u0118\7T\2\2\u0118\u0119\7E\2\2\u0119"+
		"\u011a\7J\2\2\u011a\u011b\7C\2\2\u011b\u011c\7T\2\2\u011cX\3\2\2\2\u011d"+
		"\u011e\7R\2\2\u011e\u011f\7T\2\2\u011f\u0120\7K\2\2\u0120\u0121\7O\2\2"+
		"\u0121\u0122\7C\2\2\u0122\u0123\7T\2\2\u0123\u0124\7[\2\2\u0124\u0125"+
		"\7\"\2\2\u0125\u0126\7M\2\2\u0126\u0127\7G\2\2\u0127\u0128\7[\2\2\u0128"+
		"Z\3\2\2\2\u0129\u012a\7H\2\2\u012a\u012b\7Q\2\2\u012b\u012c\7T\2\2\u012c"+
		"\u012d\7I\2\2\u012d\u012e\7K\2\2\u012e\u012f\7G\2\2\u012f\u0130\7P\2\2"+
		"\u0130\u0131\7\"\2\2\u0131\u0132\7M\2\2\u0132\u0133\7G\2\2\u0133\u0134"+
		"\7[\2\2\u0134\\\3\2\2\2\u0135\u0137\t\2\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013b\b/\2\2\u013b^\3\2\2\2\u013c\u013e\t\3\2\2\u013d\u013c"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"`\3\2\2\2\5\2\u0138\u013f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}