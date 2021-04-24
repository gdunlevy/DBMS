// Generated from C:/Users/Andrew/DBMS/RDBMS\RestrictedSQL.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RestrictedSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SELECT=3, FROM=4, WHERE=5, AND=6, OR=7, ADD=8, CREATE=9, 
		INDEX=10, DROP=11, DELETE=12, TABLE=13, UPDATE=14, INSERT=15, BETWEEN=16, 
		INTO=17, ON=18, VALUES=19, MAX=20, MIN=21, SUM=22, AVG=23, NULL=24, NOT_NULL=25, 
		PLUS=26, MINUS=27, EQUAL=28, GREATER=29, LESS=30, LTEQ=31, GTEQ=32, LR_BRACKET=33, 
		RR_BRACKET=34, SINGLE_QUOTE_SYMB=35, COMMA=36, SEMI=37, EXCLAMATION=38, 
		INT=39, FLOAT=40, VARCHAR=41, PRIMARY_KEY=42, FORGIEN_KEY=43, WS=44, ID=45;
	public static final int
		RULE_statement = 0, RULE_query = 1, RULE_tableCommand = 2, RULE_createTable = 3, 
		RULE_dropTable = 4, RULE_createIndex = 5, RULE_dropIndex = 6, RULE_indexSel = 7, 
		RULE_colSel = 8, RULE_colAtt = 9, RULE_key = 10, RULE_tableSelect = 11, 
		RULE_condition = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "query", "tableCommand", "createTable", "dropTable", "createIndex", 
			"dropIndex", "indexSel", "colSel", "colAtt", "key", "tableSelect", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "');'", "'*'", "'SELECT'", "'FROM'", "'WHERE'", "'AND'", "'OR'", 
			"'ADD'", "'CREATE'", "'INDEX'", "'DROP'", "'DELETE'", "'TABLE'", "'UPDATE'", 
			"'INSERT'", "'BETWEEN'", "'INTO'", "'ON'", "'VALUES'", "'MAX'", "'MIN'", 
			"'SUM'", "'AVG'", "'NULL'", "'NOT NULL'", "'+'", "'-'", "'='", "'>'", 
			"'<'", "'<='", "'>='", "'('", "')'", "'''", "','", "';'", "'!'", "'INT'", 
			"'FLOAT'", "'VARCHAR'", "'PRIMARY KEY'", "'FORGIEN KEY'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "SELECT", "FROM", "WHERE", "AND", "OR", "ADD", "CREATE", 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case DELETE:
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				query();
				}
				break;
			case CREATE:
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		int _la;
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(SELECT);
				setState(31);
				colSel();
				setState(32);
				match(FROM);
				setState(33);
				tableSelect();
				setState(34);
				match(WHERE);
				setState(35);
				condition();
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(36);
					match(AND);
					setState(37);
					condition();
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(SELECT);
				setState(44);
				colSel();
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(45);
					match(COMMA);
					setState(46);
					colSel();
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(52);
				match(FROM);
				setState(53);
				tableSelect();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(SELECT);
				setState(56);
				colSel();
				setState(57);
				match(FROM);
				setState(58);
				tableSelect();
				setState(59);
				match(WHERE);
				setState(60);
				colSel();
				setState(61);
				match(BETWEEN);
				setState(62);
				condition();
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(63);
					match(AND);
					setState(64);
					condition();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(INSERT);
				setState(71);
				match(INTO);
				setState(72);
				tableSelect();
				setState(73);
				match(VALUES);
				setState(74);
				match(LR_BRACKET);
				setState(75);
				match(ID);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(76);
					match(COMMA);
					setState(77);
					match(ID);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(RR_BRACKET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				match(DELETE);
				setState(86);
				match(FROM);
				setState(87);
				tableSelect();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				match(DELETE);
				setState(89);
				match(FROM);
				setState(90);
				tableSelect();
				setState(91);
				match(WHERE);
				setState(92);
				condition();
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(93);
					match(AND);
					setState(94);
					condition();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class TableCommandContext extends ParserRuleContext {
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public DropIndexContext dropIndex() {
			return getRuleContext(DropIndexContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitTableCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableCommandContext tableCommand() throws RecognitionException {
		TableCommandContext _localctx = new TableCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tableCommand);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				createTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				dropTable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				createIndex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				dropIndex();
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

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(RestrictedSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(RestrictedSQLParser.TABLE, 0); }
		public TableSelectContext tableSelect() {
			return getRuleContext(TableSelectContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(RestrictedSQLParser.LR_BRACKET, 0); }
		public List<ColSelContext> colSel() {
			return getRuleContexts(ColSelContext.class);
		}
		public ColSelContext colSel(int i) {
			return getRuleContext(ColSelContext.class,i);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RestrictedSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RestrictedSQLParser.COMMA, i);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(CREATE);
			setState(109);
			match(TABLE);
			setState(110);
			tableSelect();
			setState(111);
			match(LR_BRACKET);
			setState(112);
			colSel();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(113);
				match(COMMA);
				setState(114);
				colSel();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			key();
			setState(121);
			match(T__0);
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

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(RestrictedSQLParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(RestrictedSQLParser.TABLE, 0); }
		public TableSelectContext tableSelect() {
			return getRuleContext(TableSelectContext.class,0);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(DROP);
			setState(124);
			match(TABLE);
			setState(125);
			tableSelect();
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

	public static class CreateIndexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(RestrictedSQLParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(RestrictedSQLParser.INDEX, 0); }
		public IndexSelContext indexSel() {
			return getRuleContext(IndexSelContext.class,0);
		}
		public TerminalNode ON() { return getToken(RestrictedSQLParser.ON, 0); }
		public TableSelectContext tableSelect() {
			return getRuleContext(TableSelectContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(RestrictedSQLParser.LR_BRACKET, 0); }
		public ColSelContext colSel() {
			return getRuleContext(ColSelContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(RestrictedSQLParser.RR_BRACKET, 0); }
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterCreateIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitCreateIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitCreateIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_createIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(CREATE);
			setState(128);
			match(INDEX);
			setState(129);
			indexSel();
			setState(130);
			match(ON);
			setState(131);
			tableSelect();
			setState(132);
			match(LR_BRACKET);
			setState(133);
			colSel();
			setState(134);
			match(RR_BRACKET);
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

	public static class DropIndexContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(RestrictedSQLParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(RestrictedSQLParser.INDEX, 0); }
		public IndexSelContext indexSel() {
			return getRuleContext(IndexSelContext.class,0);
		}
		public TerminalNode ON() { return getToken(RestrictedSQLParser.ON, 0); }
		public TableSelectContext tableSelect() {
			return getRuleContext(TableSelectContext.class,0);
		}
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterDropIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitDropIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitDropIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dropIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(DROP);
			setState(137);
			match(INDEX);
			setState(138);
			indexSel();
			setState(139);
			match(ON);
			setState(140);
			tableSelect();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitIndexSel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexSelContext indexSel() throws RecognitionException {
		IndexSelContext _localctx = new IndexSelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_indexSel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitColSel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColSelContext colSel() throws RecognitionException {
		ColSelContext _localctx = new ColSelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_colSel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitColAtt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColAttContext colAtt() throws RecognitionException {
		ColAttContext _localctx = new ColAttContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_colAtt);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(VARCHAR);
				setState(148);
				match(LR_BRACKET);
				setState(149);
				match(ID);
				setState(150);
				match(RR_BRACKET);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(FLOAT);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				match(NULL);
				}
				break;
			case NOT_NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				match(NOT_NULL);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_key);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case PRIMARY_KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(PRIMARY_KEY);
				setState(159);
				match(LR_BRACKET);
				setState(160);
				colSel();
				setState(161);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitTableSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSelectContext tableSelect() throws RecognitionException {
		TableSelectContext _localctx = new TableSelectContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tableSelect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				colSel();
				setState(168);
				match(EQUAL);
				setState(169);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				colSel();
				setState(172);
				match(GREATER);
				setState(173);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				colSel();
				setState(176);
				match(GTEQ);
				setState(177);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				colSel();
				setState(180);
				match(LESS);
				setState(181);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				colSel();
				setState(184);
				match(LTEQ);
				setState(185);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				match(ID);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\5\2\37\n\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\3\3\3\7\3\62\n\3\f\3\16\3"+
		"\65\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3D\n\3"+
		"\f\3\16\3G\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3Q\n\3\f\3\16\3T\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3b\n\3\f\3\16\3e"+
		"\13\3\5\3g\n\3\3\4\3\4\3\4\3\4\5\4m\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5v\n\5\f\5\16\5y\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009e\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00a6\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00bf"+
		"\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\4\2\4\4//\2\u00cd"+
		"\2\36\3\2\2\2\4f\3\2\2\2\6l\3\2\2\2\bn\3\2\2\2\n}\3\2\2\2\f\u0081\3\2"+
		"\2\2\16\u008a\3\2\2\2\20\u0090\3\2\2\2\22\u0092\3\2\2\2\24\u009d\3\2\2"+
		"\2\26\u00a5\3\2\2\2\30\u00a7\3\2\2\2\32\u00be\3\2\2\2\34\37\5\4\3\2\35"+
		"\37\5\6\4\2\36\34\3\2\2\2\36\35\3\2\2\2\37\3\3\2\2\2 !\7\5\2\2!\"\5\22"+
		"\n\2\"#\7\6\2\2#$\5\30\r\2$%\7\7\2\2%*\5\32\16\2&\'\7\b\2\2\')\5\32\16"+
		"\2(&\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+g\3\2\2\2,*\3\2\2\2-.\7\5\2"+
		"\2.\63\5\22\n\2/\60\7&\2\2\60\62\5\22\n\2\61/\3\2\2\2\62\65\3\2\2\2\63"+
		"\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\6\2\2\67"+
		"8\5\30\r\28g\3\2\2\29:\7\5\2\2:;\5\22\n\2;<\7\6\2\2<=\5\30\r\2=>\7\7\2"+
		"\2>?\5\22\n\2?@\7\22\2\2@E\5\32\16\2AB\7\b\2\2BD\5\32\16\2CA\3\2\2\2D"+
		"G\3\2\2\2EC\3\2\2\2EF\3\2\2\2Fg\3\2\2\2GE\3\2\2\2HI\7\21\2\2IJ\7\23\2"+
		"\2JK\5\30\r\2KL\7\25\2\2LM\7#\2\2MR\7/\2\2NO\7&\2\2OQ\7/\2\2PN\3\2\2\2"+
		"QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7$\2\2Vg\3\2\2\2"+
		"WX\7\16\2\2XY\7\6\2\2Yg\5\30\r\2Z[\7\16\2\2[\\\7\6\2\2\\]\5\30\r\2]^\7"+
		"\7\2\2^c\5\32\16\2_`\7\b\2\2`b\5\32\16\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2"+
		"cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2f \3\2\2\2f-\3\2\2\2f9\3\2\2\2fH\3\2\2\2"+
		"fW\3\2\2\2fZ\3\2\2\2g\5\3\2\2\2hm\5\b\5\2im\5\n\6\2jm\5\f\7\2km\5\16\b"+
		"\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\7\3\2\2\2no\7\13\2\2op\7\17"+
		"\2\2pq\5\30\r\2qr\7#\2\2rw\5\22\n\2st\7&\2\2tv\5\22\n\2us\3\2\2\2vy\3"+
		"\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\5\26\f\2{|\7\3\2\2|\t"+
		"\3\2\2\2}~\7\r\2\2~\177\7\17\2\2\177\u0080\5\30\r\2\u0080\13\3\2\2\2\u0081"+
		"\u0082\7\13\2\2\u0082\u0083\7\f\2\2\u0083\u0084\5\20\t\2\u0084\u0085\7"+
		"\24\2\2\u0085\u0086\5\30\r\2\u0086\u0087\7#\2\2\u0087\u0088\5\22\n\2\u0088"+
		"\u0089\7$\2\2\u0089\r\3\2\2\2\u008a\u008b\7\r\2\2\u008b\u008c\7\f\2\2"+
		"\u008c\u008d\5\20\t\2\u008d\u008e\7\24\2\2\u008e\u008f\5\30\r\2\u008f"+
		"\17\3\2\2\2\u0090\u0091\7/\2\2\u0091\21\3\2\2\2\u0092\u0093\t\2\2\2\u0093"+
		"\23\3\2\2\2\u0094\u009e\3\2\2\2\u0095\u0096\7+\2\2\u0096\u0097\7#\2\2"+
		"\u0097\u0098\7/\2\2\u0098\u009e\7$\2\2\u0099\u009e\7)\2\2\u009a\u009e"+
		"\7*\2\2\u009b\u009e\7\32\2\2\u009c\u009e\7\33\2\2\u009d\u0094\3\2\2\2"+
		"\u009d\u0095\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009c\3\2\2\2\u009e\25\3\2\2\2\u009f\u00a6\3\2\2\2\u00a0"+
		"\u00a1\7,\2\2\u00a1\u00a2\7#\2\2\u00a2\u00a3\5\22\n\2\u00a3\u00a4\7$\2"+
		"\2\u00a4\u00a6\3\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a6\27"+
		"\3\2\2\2\u00a7\u00a8\7/\2\2\u00a8\31\3\2\2\2\u00a9\u00aa\5\22\n\2\u00aa"+
		"\u00ab\7\36\2\2\u00ab\u00ac\7/\2\2\u00ac\u00bf\3\2\2\2\u00ad\u00ae\5\22"+
		"\n\2\u00ae\u00af\7\37\2\2\u00af\u00b0\7/\2\2\u00b0\u00bf\3\2\2\2\u00b1"+
		"\u00b2\5\22\n\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\7/\2\2\u00b4\u00bf\3\2"+
		"\2\2\u00b5\u00b6\5\22\n\2\u00b6\u00b7\7 \2\2\u00b7\u00b8\7/\2\2\u00b8"+
		"\u00bf\3\2\2\2\u00b9\u00ba\5\22\n\2\u00ba\u00bb\7!\2\2\u00bb\u00bc\7/"+
		"\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bf\7/\2\2\u00be\u00a9\3\2\2\2\u00be"+
		"\u00ad\3\2\2\2\u00be\u00b1\3\2\2\2\u00be\u00b5\3\2\2\2\u00be\u00b9\3\2"+
		"\2\2\u00be\u00bd\3\2\2\2\u00bf\33\3\2\2\2\16\36*\63ERcflw\u009d\u00a5"+
		"\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}