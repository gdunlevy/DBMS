// Generated from RestrictedSQL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RestrictedSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SELECT=2, FROM=3, WHERE=4, AND=5, OR=6, ADD=7, CREATE=8, INDEX=9, 
		DROP=10, DELETE=11, TABLE=12, UPDATE=13, INSERT=14, BETWEEN=15, INTO=16, 
		ON=17, VALUES=18, MAX=19, MIN=20, SUM=21, AVG=22, NULL=23, NOT_NULL=24, 
		PLUS=25, MINUS=26, EQUAL=27, GREATER=28, LESS=29, LTEQ=30, GTEQ=31, LR_BRACKET=32, 
		RR_BRACKET=33, SINGLE_QUOTE_SYMB=34, COMMA=35, SEMI=36, EXCLAMATION=37, 
		INT=38, FLOAT=39, VARCHAR=40, PRIMARY_KEY=41, FORGIEN_KEY=42, WS=43, ID=44;
	public static final int
		RULE_statement = 0, RULE_query = 1, RULE_indexSel = 2, RULE_colSel = 3, 
		RULE_colAtt = 4, RULE_key = 5, RULE_tableCommand = 6, RULE_tableSelect = 7, 
		RULE_condition = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "query", "indexSel", "colSel", "colAtt", "key", "tableCommand", 
			"tableSelect", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'SELECT'", "'FROM'", "'WHERE'", "'AND'", "'OR'", "'ADD'", 
			"'CREATE'", "'INDEX'", "'DROP'", "'DELETE'", "'TABLE'", "'UPDATE'", "'INSERT'", 
			"'BETWEEN'", "'INTO'", "'ON'", "'VALUES'", "'MAX'", "'MIN'", "'SUM'", 
			"'AVG'", "'NULL'", "'NOT NULL'", "'+'", "'-'", "'='", "'>'", "'<'", "'<='", 
			"'>='", "'('", "')'", "'''", "','", "';'", "'!'", "'INT'", "'FLOAT'", 
			"'VARCHAR'", "'PRIMARY KEY'", "'FORGIEN KEY'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SELECT", "FROM", "WHERE", "AND", "OR", "ADD", "CREATE", 
			"INDEX", "DROP", "DELETE", "TABLE", "UPDATE", "INSERT", "BETWEEN", "INTO", 
			"ON", "VALUES", "MAX", "MIN", "SUM", "AVG", "NULL", "NOT_NULL", "PLUS", 
			"MINUS", "EQUAL", "GREATER", "LESS", "LTEQ", "GTEQ", "LR_BRACKET", "RR_BRACKET", 
			"SINGLE_QUOTE_SYMB", "COMMA", "SEMI", "EXCLAMATION", "INT", "FLOAT", 
			"VARCHAR", "PRIMARY_KEY", "FORGIEN_KEY", "WS", "ID"
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

	@Override
	public String getGrammarFileName() { return "RestrictedSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RestrictedSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TableCommandContext tableCommand() {
			return getRuleContext(TableCommandContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				query();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				tableCommand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(RestrictedSQLParser.SELECT, 0); }
		public List<ColSelContext> colSel() {
			return getRuleContexts(ColSelContext.class);
		}
		public ColSelContext colSel(int i) {
			return getRuleContext(ColSelContext.class,i);
		}
		public TerminalNode FROM() { return getToken(RestrictedSQLParser.FROM, 0); }
		public TableSelectContext tableSelect() {
			return getRuleContext(TableSelectContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(RestrictedSQLParser.WHERE, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(RestrictedSQLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(RestrictedSQLParser.AND, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RestrictedSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RestrictedSQLParser.COMMA, i);
		}
		public TerminalNode BETWEEN() { return getToken(RestrictedSQLParser.BETWEEN, 0); }
		public TerminalNode INSERT() { return getToken(RestrictedSQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(RestrictedSQLParser.INTO, 0); }
		public TerminalNode VALUES() { return getToken(RestrictedSQLParser.VALUES, 0); }
		public TerminalNode LR_BRACKET() { return getToken(RestrictedSQLParser.LR_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(RestrictedSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RestrictedSQLParser.ID, i);
		}
		public TerminalNode RR_BRACKET() { return getToken(RestrictedSQLParser.RR_BRACKET, 0); }
		public TerminalNode DELETE() { return getToken(RestrictedSQLParser.DELETE, 0); }
		public TerminalNode CREATE() { return getToken(RestrictedSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(RestrictedSQLParser.TABLE, 0); }
		public List<ColAttContext> colAtt() {
			return getRuleContexts(ColAttContext.class);
		}
		public ColAttContext colAtt(int i) {
			return getRuleContext(ColAttContext.class,i);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RestrictedSQLParser.SEMI, 0); }
		public TerminalNode DROP() { return getToken(RestrictedSQLParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(RestrictedSQLParser.INDEX, 0); }
		public IndexSelContext indexSel() {
			return getRuleContext(IndexSelContext.class,0);
		}
		public TerminalNode ON() { return getToken(RestrictedSQLParser.ON, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(SELECT);
				setState(23);
				colSel(0);
				setState(24);
				match(FROM);
				setState(25);
				tableSelect();
				setState(26);
				match(WHERE);
				setState(27);
				condition(0);
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(28);
					match(AND);
					setState(29);
					condition(0);
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(SELECT);
				setState(36);
				colSel(0);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(37);
					match(COMMA);
					setState(38);
					colSel(0);
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
				match(FROM);
				setState(45);
				tableSelect();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(SELECT);
				setState(48);
				colSel(0);
				setState(49);
				match(FROM);
				setState(50);
				tableSelect();
				setState(51);
				match(WHERE);
				setState(52);
				colSel(0);
				setState(53);
				match(BETWEEN);
				setState(54);
				condition(0);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(55);
					match(AND);
					setState(56);
					condition(0);
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				match(INSERT);
				setState(63);
				match(INTO);
				setState(64);
				tableSelect();
				setState(65);
				match(VALUES);
				setState(66);
				match(LR_BRACKET);
				setState(67);
				match(ID);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(68);
					match(COMMA);
					setState(69);
					match(ID);
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
				match(RR_BRACKET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				match(DELETE);
				setState(78);
				match(FROM);
				setState(79);
				tableSelect();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				match(DELETE);
				setState(81);
				match(FROM);
				setState(82);
				tableSelect();
				setState(83);
				match(WHERE);
				setState(84);
				condition(0);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(85);
					match(AND);
					setState(86);
					condition(0);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				match(CREATE);
				setState(93);
				match(TABLE);
				setState(94);
				tableSelect();
				setState(95);
				match(LR_BRACKET);
				setState(96);
				colSel(0);
				setState(97);
				colAtt();
				setState(98);
				colAtt();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(99);
					match(COMMA);
					setState(100);
					colSel(0);
					setState(101);
					colAtt();
					setState(102);
					colAtt();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				key();
				setState(110);
				match(RR_BRACKET);
				setState(111);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(113);
				match(DROP);
				setState(114);
				match(TABLE);
				setState(115);
				tableSelect();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(116);
				match(CREATE);
				setState(117);
				match(INDEX);
				setState(118);
				indexSel();
				setState(119);
				match(ON);
				setState(120);
				tableSelect();
				setState(121);
				match(LR_BRACKET);
				setState(122);
				colSel(0);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(123);
					match(COMMA);
					setState(124);
					colSel(0);
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				match(RR_BRACKET);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(132);
				match(DROP);
				setState(133);
				match(INDEX);
				setState(134);
				indexSel();
				setState(135);
				match(ON);
				setState(136);
				tableSelect();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexSelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RestrictedSQLParser.ID, 0); }
		public IndexSelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexSel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterIndexSel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitIndexSel(this);
		}
	}

	public final IndexSelContext indexSel() throws RecognitionException {
		IndexSelContext _localctx = new IndexSelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_indexSel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColSelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RestrictedSQLParser.ID, 0); }
		public List<ColSelContext> colSel() {
			return getRuleContexts(ColSelContext.class);
		}
		public ColSelContext colSel(int i) {
			return getRuleContext(ColSelContext.class,i);
		}
		public ColSelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colSel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterColSel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitColSel(this);
		}
	}

	public final ColSelContext colSel() throws RecognitionException {
		return colSel(0);
	}

	private ColSelContext colSel(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ColSelContext _localctx = new ColSelContext(_ctx, _parentState);
		ColSelContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_colSel, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(143);
				match(T__0);
				}
				break;
			case ID:
				{
				setState(144);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ColSelContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_colSel);
					setState(147);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(148);
					colSel(4);
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ColAttContext extends ParserRuleContext {
		public TerminalNode VARCHAR() { return getToken(RestrictedSQLParser.VARCHAR, 0); }
		public TerminalNode LR_BRACKET() { return getToken(RestrictedSQLParser.LR_BRACKET, 0); }
		public TerminalNode ID() { return getToken(RestrictedSQLParser.ID, 0); }
		public TerminalNode RR_BRACKET() { return getToken(RestrictedSQLParser.RR_BRACKET, 0); }
		public TerminalNode INT() { return getToken(RestrictedSQLParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(RestrictedSQLParser.FLOAT, 0); }
		public TerminalNode NULL() { return getToken(RestrictedSQLParser.NULL, 0); }
		public TerminalNode NOT_NULL() { return getToken(RestrictedSQLParser.NOT_NULL, 0); }
		public ColAttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colAtt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterColAtt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitColAtt(this);
		}
	}

	public final ColAttContext colAtt() throws RecognitionException {
		ColAttContext _localctx = new ColAttContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_colAtt);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(VARCHAR);
				setState(156);
				match(LR_BRACKET);
				setState(157);
				match(ID);
				setState(158);
				match(RR_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				match(NOT_NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode PRIMARY_KEY() { return getToken(RestrictedSQLParser.PRIMARY_KEY, 0); }
		public TerminalNode LR_BRACKET() { return getToken(RestrictedSQLParser.LR_BRACKET, 0); }
		public ColSelContext colSel() {
			return getRuleContext(ColSelContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(RestrictedSQLParser.RR_BRACKET, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_key);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RR_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case PRIMARY_KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(PRIMARY_KEY);
				setState(167);
				match(LR_BRACKET);
				setState(168);
				colSel(0);
				setState(169);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableCommandContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(RestrictedSQLParser.ADD, 0); }
		public TableSelectContext tableSelect() {
			return getRuleContext(TableSelectContext.class,0);
		}
		public TerminalNode DROP() { return getToken(RestrictedSQLParser.DROP, 0); }
		public TableCommandContext tableCommand() {
			return getRuleContext(TableCommandContext.class,0);
		}
		public TableCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterTableCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitTableCommand(this);
		}
	}

	public final TableCommandContext tableCommand() throws RecognitionException {
		TableCommandContext _localctx = new TableCommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableCommand);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(ADD);
				setState(174);
				tableSelect();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(DROP);
				setState(176);
				tableCommand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableSelectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RestrictedSQLParser.ID, 0); }
		public TableSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSelect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterTableSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitTableSelect(this);
		}
	}

	public final TableSelectContext tableSelect() throws RecognitionException {
		TableSelectContext _localctx = new TableSelectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableSelect);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case WHERE:
			case VALUES:
			case LR_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ColSelContext colSel() {
			return getRuleContext(ColSelContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(RestrictedSQLParser.EQUAL, 0); }
		public TerminalNode ID() { return getToken(RestrictedSQLParser.ID, 0); }
		public TerminalNode GREATER() { return getToken(RestrictedSQLParser.GREATER, 0); }
		public TerminalNode GTEQ() { return getToken(RestrictedSQLParser.GTEQ, 0); }
		public TerminalNode LESS() { return getToken(RestrictedSQLParser.LESS, 0); }
		public TerminalNode LTEQ() { return getToken(RestrictedSQLParser.LTEQ, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(184);
				colSel(0);
				setState(185);
				match(EQUAL);
				setState(186);
				match(ID);
				}
				break;
			case 2:
				{
				setState(188);
				colSel(0);
				setState(189);
				match(GREATER);
				setState(190);
				match(ID);
				}
				break;
			case 3:
				{
				setState(192);
				colSel(0);
				setState(193);
				match(GTEQ);
				setState(194);
				match(ID);
				}
				break;
			case 4:
				{
				setState(196);
				colSel(0);
				setState(197);
				match(LESS);
				setState(198);
				match(ID);
				}
				break;
			case 5:
				{
				setState(200);
				colSel(0);
				setState(201);
				match(LTEQ);
				setState(202);
				match(ID);
				}
				break;
			case 6:
				{
				setState(204);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(207);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(208);
					condition(8);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return colSel_sempred((ColSelContext)_localctx, predIndex);
		case 8:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean colSel_sempred(ColSelContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\5\2\27\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3!\n\3\f\3\16\3$\13\3\3"+
		"\3\3\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\7\3k\n\3\f\3\16\3n\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0080\n\3\f\3\16\3\u0083\13\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u008d\n\3\3\4\3\4\3\5\3\5\3\5\5\5\u0094\n"+
		"\5\3\5\3\5\7\5\u0098\n\5\f\5\16\5\u009b\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00a6\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ae\n\7\3\b\3\b"+
		"\3\b\3\b\5\b\u00b4\n\b\3\t\3\t\5\t\u00b8\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d0"+
		"\n\n\3\n\3\n\7\n\u00d4\n\n\f\n\16\n\u00d7\13\n\3\n\2\4\b\22\13\2\4\6\b"+
		"\n\f\16\20\22\2\2\2\u00f0\2\26\3\2\2\2\4\u008c\3\2\2\2\6\u008e\3\2\2\2"+
		"\b\u0093\3\2\2\2\n\u00a5\3\2\2\2\f\u00ad\3\2\2\2\16\u00b3\3\2\2\2\20\u00b7"+
		"\3\2\2\2\22\u00cf\3\2\2\2\24\27\5\4\3\2\25\27\5\16\b\2\26\24\3\2\2\2\26"+
		"\25\3\2\2\2\27\3\3\2\2\2\30\31\7\4\2\2\31\32\5\b\5\2\32\33\7\5\2\2\33"+
		"\34\5\20\t\2\34\35\7\6\2\2\35\"\5\22\n\2\36\37\7\7\2\2\37!\5\22\n\2 \36"+
		"\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\u008d\3\2\2\2$\"\3\2\2\2%&\7"+
		"\4\2\2&+\5\b\5\2\'(\7%\2\2(*\5\b\5\2)\'\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,"+
		"\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\5\2\2/\60\5\20\t\2\60\u008d\3\2\2\2\61"+
		"\62\7\4\2\2\62\63\5\b\5\2\63\64\7\5\2\2\64\65\5\20\t\2\65\66\7\6\2\2\66"+
		"\67\5\b\5\2\678\7\21\2\28=\5\22\n\29:\7\7\2\2:<\5\22\n\2;9\3\2\2\2<?\3"+
		"\2\2\2=;\3\2\2\2=>\3\2\2\2>\u008d\3\2\2\2?=\3\2\2\2@A\7\20\2\2AB\7\22"+
		"\2\2BC\5\20\t\2CD\7\24\2\2DE\7\"\2\2EJ\7.\2\2FG\7%\2\2GI\7.\2\2HF\3\2"+
		"\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7#\2\2N\u008d"+
		"\3\2\2\2OP\7\r\2\2PQ\7\5\2\2Q\u008d\5\20\t\2RS\7\r\2\2ST\7\5\2\2TU\5\20"+
		"\t\2UV\7\6\2\2V[\5\22\n\2WX\7\7\2\2XZ\5\22\n\2YW\3\2\2\2Z]\3\2\2\2[Y\3"+
		"\2\2\2[\\\3\2\2\2\\\u008d\3\2\2\2][\3\2\2\2^_\7\n\2\2_`\7\16\2\2`a\5\20"+
		"\t\2ab\7\"\2\2bc\5\b\5\2cd\5\n\6\2dl\5\n\6\2ef\7%\2\2fg\5\b\5\2gh\5\n"+
		"\6\2hi\5\n\6\2ik\3\2\2\2je\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2"+
		"\2\2nl\3\2\2\2op\5\f\7\2pq\7#\2\2qr\7&\2\2r\u008d\3\2\2\2st\7\f\2\2tu"+
		"\7\16\2\2u\u008d\5\20\t\2vw\7\n\2\2wx\7\13\2\2xy\5\6\4\2yz\7\23\2\2z{"+
		"\5\20\t\2{|\7\"\2\2|\u0081\5\b\5\2}~\7%\2\2~\u0080\5\b\5\2\177}\3\2\2"+
		"\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7#\2\2\u0085\u008d\3\2\2\2\u0086"+
		"\u0087\7\f\2\2\u0087\u0088\7\13\2\2\u0088\u0089\5\6\4\2\u0089\u008a\7"+
		"\23\2\2\u008a\u008b\5\20\t\2\u008b\u008d\3\2\2\2\u008c\30\3\2\2\2\u008c"+
		"%\3\2\2\2\u008c\61\3\2\2\2\u008c@\3\2\2\2\u008cO\3\2\2\2\u008cR\3\2\2"+
		"\2\u008c^\3\2\2\2\u008cs\3\2\2\2\u008cv\3\2\2\2\u008c\u0086\3\2\2\2\u008d"+
		"\5\3\2\2\2\u008e\u008f\7.\2\2\u008f\7\3\2\2\2\u0090\u0091\b\5\1\2\u0091"+
		"\u0094\7\3\2\2\u0092\u0094\7.\2\2\u0093\u0090\3\2\2\2\u0093\u0092\3\2"+
		"\2\2\u0094\u0099\3\2\2\2\u0095\u0096\f\5\2\2\u0096\u0098\5\b\5\6\u0097"+
		"\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\t\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a6\3\2\2\2\u009d\u009e"+
		"\7*\2\2\u009e\u009f\7\"\2\2\u009f\u00a0\7.\2\2\u00a0\u00a6\7#\2\2\u00a1"+
		"\u00a6\7(\2\2\u00a2\u00a6\7)\2\2\u00a3\u00a6\7\31\2\2\u00a4\u00a6\7\32"+
		"\2\2\u00a5\u009c\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5"+
		"\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\13\3\2\2"+
		"\2\u00a7\u00ae\3\2\2\2\u00a8\u00a9\7+\2\2\u00a9\u00aa\7\"\2\2\u00aa\u00ab"+
		"\5\b\5\2\u00ab\u00ac\7#\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad"+
		"\u00a8\3\2\2\2\u00ae\r\3\2\2\2\u00af\u00b0\7\t\2\2\u00b0\u00b4\5\20\t"+
		"\2\u00b1\u00b2\7\f\2\2\u00b2\u00b4\5\16\b\2\u00b3\u00af\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\17\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b8\7.\2\2"+
		"\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\21\3\2\2\2\u00b9\u00ba"+
		"\b\n\1\2\u00ba\u00bb\5\b\5\2\u00bb\u00bc\7\35\2\2\u00bc\u00bd\7.\2\2\u00bd"+
		"\u00d0\3\2\2\2\u00be\u00bf\5\b\5\2\u00bf\u00c0\7\36\2\2\u00c0\u00c1\7"+
		".\2\2\u00c1\u00d0\3\2\2\2\u00c2\u00c3\5\b\5\2\u00c3\u00c4\7!\2\2\u00c4"+
		"\u00c5\7.\2\2\u00c5\u00d0\3\2\2\2\u00c6\u00c7\5\b\5\2\u00c7\u00c8\7\37"+
		"\2\2\u00c8\u00c9\7.\2\2\u00c9\u00d0\3\2\2\2\u00ca\u00cb\5\b\5\2\u00cb"+
		"\u00cc\7 \2\2\u00cc\u00cd\7.\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00d0\7.\2"+
		"\2\u00cf\u00b9\3\2\2\2\u00cf\u00be\3\2\2\2\u00cf\u00c2\3\2\2\2\u00cf\u00c6"+
		"\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d5\3\2\2\2\u00d1"+
		"\u00d2\f\t\2\2\u00d2\u00d4\5\22\n\n\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\23\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\23\26\"+=J[l\u0081\u008c\u0093\u0099\u00a5\u00ad\u00b3"+
		"\u00b7\u00cf\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}