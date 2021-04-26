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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, SELECT=6, FROM=7, WHERE=8, AND=9, 
		OR=10, ADD=11, CREATE=12, INDEX=13, DROP=14, DELETE=15, TABLE=16, UPDATE=17, 
		INSERT=18, BETWEEN=19, INTO=20, ON=21, VALUES=22, LOAD=23, SAVE=24, MAX=25, 
		MIN=26, SUM=27, AVG=28, NULL=29, NOT_NULL=30, PLUS=31, MINUS=32, EQUAL=33, 
		GREATER=34, LESS=35, LTEQ=36, GTEQ=37, LR_BRACKET=38, RR_BRACKET=39, SINGLE_QUOTE_SYMB=40, 
		COMMA=41, SEMI=42, EXCLAMATION=43, INT=44, FLOAT=45, VARCHAR=46, PRIMARY_KEY=47, 
		FORGIEN_KEY=48, WS=49, ID=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "SELECT", "FROM", "WHERE", "AND", 
			"OR", "ADD", "CREATE", "INDEX", "DROP", "DELETE", "TABLE", "UPDATE", 
			"INSERT", "BETWEEN", "INTO", "ON", "VALUES", "LOAD", "SAVE", "MAX", "MIN", 
			"SUM", "AVG", "NULL", "NOT_NULL", "PLUS", "MINUS", "EQUAL", "GREATER", 
			"LESS", "LTEQ", "GTEQ", "LR_BRACKET", "RR_BRACKET", "SINGLE_QUOTE_SYMB", 
			"COMMA", "SEMI", "EXCLAMATION", "INT", "FLOAT", "VARCHAR", "PRIMARY_KEY", 
			"FORGIEN_KEY", "WS", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'INNERJOIN'", "'{'", "'}'", "'*'", "'!='", "'SELECT'", "'FROM'", 
			"'WHERE'", "'AND'", "'OR'", "'ADD'", "'CREATE'", "'INDEX'", "'DROP'", 
			"'DELETE'", "'TABLE'", "'UPDATE'", "'INSERT'", "'BETWEEN'", "'INTO'", 
			"'ON'", "'VALUES'", "'LOAD'", "'SAVE'", "'MAX'", "'MIN'", "'SUM'", "'AVG'", 
			"'NULL'", "'NOT NULL'", "'+'", "'-'", "'='", "'>'", "'<'", "'<='", "'>='", 
			"'('", "')'", "'''", "','", "';'", "'!'", "'INT'", "'FLOAT'", "'VARCHAR'", 
			"'PRIMARY KEY'", "'FORGIEN KEY'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "SELECT", "FROM", "WHERE", "AND", 
			"OR", "ADD", "CREATE", "INDEX", "DROP", "DELETE", "TABLE", "UPDATE", 
			"INSERT", "BETWEEN", "INTO", "ON", "VALUES", "LOAD", "SAVE", "MAX", "MIN", 
			"SUM", "AVG", "NULL", "NOT_NULL", "PLUS", "MINUS", "EQUAL", "GREATER", 
			"LESS", "LTEQ", "GTEQ", "LR_BRACKET", "RR_BRACKET", "SINGLE_QUOTE_SYMB", 
			"COMMA", "SEMI", "EXCLAMATION", "INT", "FLOAT", "VARCHAR", "PRIMARY_KEY", 
			"FORGIEN_KEY", "WS", "ID"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0155\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&"+
		"\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3"+
		".\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\62\6\62\u014b\n\62\r\62\16\62\u014c\3\62\3\62\3\63\6\63\u0152"+
		"\n\63\r\63\16\63\u0153\2\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64\3\2\4\5\2\13\f\17\17\"\"\5\2\62;C\\c|\2\u0156\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\3g\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13w\3\2\2"+
		"\2\rz\3\2\2\2\17\u0081\3\2\2\2\21\u0086\3\2\2\2\23\u008c\3\2\2\2\25\u0090"+
		"\3\2\2\2\27\u0093\3\2\2\2\31\u0097\3\2\2\2\33\u009e\3\2\2\2\35\u00a4\3"+
		"\2\2\2\37\u00a9\3\2\2\2!\u00b0\3\2\2\2#\u00b6\3\2\2\2%\u00bd\3\2\2\2\'"+
		"\u00c4\3\2\2\2)\u00cc\3\2\2\2+\u00d1\3\2\2\2-\u00d4\3\2\2\2/\u00db\3\2"+
		"\2\2\61\u00e0\3\2\2\2\63\u00e5\3\2\2\2\65\u00e9\3\2\2\2\67\u00ed\3\2\2"+
		"\29\u00f1\3\2\2\2;\u00f5\3\2\2\2=\u00fa\3\2\2\2?\u0103\3\2\2\2A\u0105"+
		"\3\2\2\2C\u0107\3\2\2\2E\u0109\3\2\2\2G\u010b\3\2\2\2I\u010d\3\2\2\2K"+
		"\u0110\3\2\2\2M\u0113\3\2\2\2O\u0115\3\2\2\2Q\u0117\3\2\2\2S\u0119\3\2"+
		"\2\2U\u011b\3\2\2\2W\u011d\3\2\2\2Y\u011f\3\2\2\2[\u0123\3\2\2\2]\u0129"+
		"\3\2\2\2_\u0131\3\2\2\2a\u013d\3\2\2\2c\u014a\3\2\2\2e\u0151\3\2\2\2g"+
		"h\7K\2\2hi\7P\2\2ij\7P\2\2jk\7G\2\2kl\7T\2\2lm\7L\2\2mn\7Q\2\2no\7K\2"+
		"\2op\7P\2\2p\4\3\2\2\2qr\7}\2\2r\6\3\2\2\2st\7\177\2\2t\b\3\2\2\2uv\7"+
		",\2\2v\n\3\2\2\2wx\7#\2\2xy\7?\2\2y\f\3\2\2\2z{\7U\2\2{|\7G\2\2|}\7N\2"+
		"\2}~\7G\2\2~\177\7E\2\2\177\u0080\7V\2\2\u0080\16\3\2\2\2\u0081\u0082"+
		"\7H\2\2\u0082\u0083\7T\2\2\u0083\u0084\7Q\2\2\u0084\u0085\7O\2\2\u0085"+
		"\20\3\2\2\2\u0086\u0087\7Y\2\2\u0087\u0088\7J\2\2\u0088\u0089\7G\2\2\u0089"+
		"\u008a\7T\2\2\u008a\u008b\7G\2\2\u008b\22\3\2\2\2\u008c\u008d\7C\2\2\u008d"+
		"\u008e\7P\2\2\u008e\u008f\7F\2\2\u008f\24\3\2\2\2\u0090\u0091\7Q\2\2\u0091"+
		"\u0092\7T\2\2\u0092\26\3\2\2\2\u0093\u0094\7C\2\2\u0094\u0095\7F\2\2\u0095"+
		"\u0096\7F\2\2\u0096\30\3\2\2\2\u0097\u0098\7E\2\2\u0098\u0099\7T\2\2\u0099"+
		"\u009a\7G\2\2\u009a\u009b\7C\2\2\u009b\u009c\7V\2\2\u009c\u009d\7G\2\2"+
		"\u009d\32\3\2\2\2\u009e\u009f\7K\2\2\u009f\u00a0\7P\2\2\u00a0\u00a1\7"+
		"F\2\2\u00a1\u00a2\7G\2\2\u00a2\u00a3\7Z\2\2\u00a3\34\3\2\2\2\u00a4\u00a5"+
		"\7F\2\2\u00a5\u00a6\7T\2\2\u00a6\u00a7\7Q\2\2\u00a7\u00a8\7R\2\2\u00a8"+
		"\36\3\2\2\2\u00a9\u00aa\7F\2\2\u00aa\u00ab\7G\2\2\u00ab\u00ac\7N\2\2\u00ac"+
		"\u00ad\7G\2\2\u00ad\u00ae\7V\2\2\u00ae\u00af\7G\2\2\u00af \3\2\2\2\u00b0"+
		"\u00b1\7V\2\2\u00b1\u00b2\7C\2\2\u00b2\u00b3\7D\2\2\u00b3\u00b4\7N\2\2"+
		"\u00b4\u00b5\7G\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\7W\2\2\u00b7\u00b8\7R"+
		"\2\2\u00b8\u00b9\7F\2\2\u00b9\u00ba\7C\2\2\u00ba\u00bb\7V\2\2\u00bb\u00bc"+
		"\7G\2\2\u00bc$\3\2\2\2\u00bd\u00be\7K\2\2\u00be\u00bf\7P\2\2\u00bf\u00c0"+
		"\7U\2\2\u00c0\u00c1\7G\2\2\u00c1\u00c2\7T\2\2\u00c2\u00c3\7V\2\2\u00c3"+
		"&\3\2\2\2\u00c4\u00c5\7D\2\2\u00c5\u00c6\7G\2\2\u00c6\u00c7\7V\2\2\u00c7"+
		"\u00c8\7Y\2\2\u00c8\u00c9\7G\2\2\u00c9\u00ca\7G\2\2\u00ca\u00cb\7P\2\2"+
		"\u00cb(\3\2\2\2\u00cc\u00cd\7K\2\2\u00cd\u00ce\7P\2\2\u00ce\u00cf\7V\2"+
		"\2\u00cf\u00d0\7Q\2\2\u00d0*\3\2\2\2\u00d1\u00d2\7Q\2\2\u00d2\u00d3\7"+
		"P\2\2\u00d3,\3\2\2\2\u00d4\u00d5\7X\2\2\u00d5\u00d6\7C\2\2\u00d6\u00d7"+
		"\7N\2\2\u00d7\u00d8\7W\2\2\u00d8\u00d9\7G\2\2\u00d9\u00da\7U\2\2\u00da"+
		".\3\2\2\2\u00db\u00dc\7N\2\2\u00dc\u00dd\7Q\2\2\u00dd\u00de\7C\2\2\u00de"+
		"\u00df\7F\2\2\u00df\60\3\2\2\2\u00e0\u00e1\7U\2\2\u00e1\u00e2\7C\2\2\u00e2"+
		"\u00e3\7X\2\2\u00e3\u00e4\7G\2\2\u00e4\62\3\2\2\2\u00e5\u00e6\7O\2\2\u00e6"+
		"\u00e7\7C\2\2\u00e7\u00e8\7Z\2\2\u00e8\64\3\2\2\2\u00e9\u00ea\7O\2\2\u00ea"+
		"\u00eb\7K\2\2\u00eb\u00ec\7P\2\2\u00ec\66\3\2\2\2\u00ed\u00ee\7U\2\2\u00ee"+
		"\u00ef\7W\2\2\u00ef\u00f0\7O\2\2\u00f08\3\2\2\2\u00f1\u00f2\7C\2\2\u00f2"+
		"\u00f3\7X\2\2\u00f3\u00f4\7I\2\2\u00f4:\3\2\2\2\u00f5\u00f6\7P\2\2\u00f6"+
		"\u00f7\7W\2\2\u00f7\u00f8\7N\2\2\u00f8\u00f9\7N\2\2\u00f9<\3\2\2\2\u00fa"+
		"\u00fb\7P\2\2\u00fb\u00fc\7Q\2\2\u00fc\u00fd\7V\2\2\u00fd\u00fe\7\"\2"+
		"\2\u00fe\u00ff\7P\2\2\u00ff\u0100\7W\2\2\u0100\u0101\7N\2\2\u0101\u0102"+
		"\7N\2\2\u0102>\3\2\2\2\u0103\u0104\7-\2\2\u0104@\3\2\2\2\u0105\u0106\7"+
		"/\2\2\u0106B\3\2\2\2\u0107\u0108\7?\2\2\u0108D\3\2\2\2\u0109\u010a\7@"+
		"\2\2\u010aF\3\2\2\2\u010b\u010c\7>\2\2\u010cH\3\2\2\2\u010d\u010e\7>\2"+
		"\2\u010e\u010f\7?\2\2\u010fJ\3\2\2\2\u0110\u0111\7@\2\2\u0111\u0112\7"+
		"?\2\2\u0112L\3\2\2\2\u0113\u0114\7*\2\2\u0114N\3\2\2\2\u0115\u0116\7+"+
		"\2\2\u0116P\3\2\2\2\u0117\u0118\7)\2\2\u0118R\3\2\2\2\u0119\u011a\7.\2"+
		"\2\u011aT\3\2\2\2\u011b\u011c\7=\2\2\u011cV\3\2\2\2\u011d\u011e\7#\2\2"+
		"\u011eX\3\2\2\2\u011f\u0120\7K\2\2\u0120\u0121\7P\2\2\u0121\u0122\7V\2"+
		"\2\u0122Z\3\2\2\2\u0123\u0124\7H\2\2\u0124\u0125\7N\2\2\u0125\u0126\7"+
		"Q\2\2\u0126\u0127\7C\2\2\u0127\u0128\7V\2\2\u0128\\\3\2\2\2\u0129\u012a"+
		"\7X\2\2\u012a\u012b\7C\2\2\u012b\u012c\7T\2\2\u012c\u012d\7E\2\2\u012d"+
		"\u012e\7J\2\2\u012e\u012f\7C\2\2\u012f\u0130\7T\2\2\u0130^\3\2\2\2\u0131"+
		"\u0132\7R\2\2\u0132\u0133\7T\2\2\u0133\u0134\7K\2\2\u0134\u0135\7O\2\2"+
		"\u0135\u0136\7C\2\2\u0136\u0137\7T\2\2\u0137\u0138\7[\2\2\u0138\u0139"+
		"\7\"\2\2\u0139\u013a\7M\2\2\u013a\u013b\7G\2\2\u013b\u013c\7[\2\2\u013c"+
		"`\3\2\2\2\u013d\u013e\7H\2\2\u013e\u013f\7Q\2\2\u013f\u0140\7T\2\2\u0140"+
		"\u0141\7I\2\2\u0141\u0142\7K\2\2\u0142\u0143\7G\2\2\u0143\u0144\7P\2\2"+
		"\u0144\u0145\7\"\2\2\u0145\u0146\7M\2\2\u0146\u0147\7G\2\2\u0147\u0148"+
		"\7[\2\2\u0148b\3\2\2\2\u0149\u014b\t\2\2\2\u014a\u0149\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\b\62\2\2\u014fd\3\2\2\2\u0150\u0152\t\3\2\2\u0151\u0150\3\2\2\2"+
		"\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154f\3"+
		"\2\2\2\5\2\u014c\u0153\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}