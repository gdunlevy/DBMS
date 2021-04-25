// Generated from C:/Users/Andrew/DBMS/src/main/java/RDBMS\RestrictedSQL.g4 by ANTLR 4.9.1
package gen;
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
		RULE_statement = 0, RULE_query = 1, RULE_selectQuery = 2, RULE_insertQuery = 3, 
		RULE_deleteQuery = 4, RULE_tableCommand = 5, RULE_createTable = 6, RULE_dropTable = 7, 
		RULE_createIndex = 8, RULE_dropIndex = 9, RULE_whereCond = 10, RULE_conditionList = 11, 
		RULE_orCond = 12, RULE_andCond = 13, RULE_left = 14, RULE_right = 15, 
		RULE_indexSel = 16, RULE_values = 17, RULE_colSel = 18, RULE_colAtt = 19, 
		RULE_key = 20, RULE_tableSelect = 21, RULE_condition = 22, RULE_equal = 23, 
		RULE_nteq = 24, RULE_greater = 25, RULE_less = 26, RULE_lteq = 27, RULE_gteg = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "query", "selectQuery", "insertQuery", "deleteQuery", "tableCommand", 
			"createTable", "dropTable", "createIndex", "dropIndex", "whereCond", 
			"conditionList", "orCond", "andCond", "left", "right", "indexSel", "values", 
			"colSel", "colAtt", "key", "tableSelect", "condition", "equal", "nteq", 
			"greater", "less", "lteq", "gteg"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'!='", "'SELECT'", "'FROM'", "'WHERE'", "'AND'", "'OR'", 
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
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case DELETE:
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				query();
				}
				break;
			case CREATE:
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
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
		public SelectQueryContext selectQuery() {
			return getRuleContext(SelectQueryContext.class,0);
		}
		public InsertQueryContext insertQuery() {
			return getRuleContext(InsertQueryContext.class,0);
		}
		public DeleteQueryContext deleteQuery() {
			return getRuleContext(DeleteQueryContext.class,0);
		}
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
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				selectQuery();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				insertQuery();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				deleteQuery();
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

	public static class SelectQueryContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(RestrictedSQLParser.SELECT, 0); }
		public List<ColSelContext> colSel() {
			return getRuleContexts(ColSelContext.class);
		}
		public ColSelContext colSel(int i) {
			return getRuleContext(ColSelContext.class,i);
		}
		public TerminalNode FROM() { return getToken(RestrictedSQLParser.FROM, 0); }
		public WhereCondContext whereCond() {
			return getRuleContext(WhereCondContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RestrictedSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RestrictedSQLParser.COMMA, i);
		}
		public TableSelectContext tableSelect() {
			return getRuleContext(TableSelectContext.class,0);
		}
		public SelectQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterSelectQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitSelectQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitSelectQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectQueryContext selectQuery() throws RecognitionException {
		SelectQueryContext _localctx = new SelectQueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(SELECT);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					colSel();
					setState(69);
					match(COMMA);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(76);
			colSel();
			setState(77);
			match(FROM);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(78);
				tableSelect();
				}
			}

			setState(81);
			whereCond();
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

	public static class InsertQueryContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(RestrictedSQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(RestrictedSQLParser.INTO, 0); }
		public TableSelectContext tableSelect() {
			return getRuleContext(TableSelectContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(RestrictedSQLParser.VALUES, 0); }
		public TerminalNode LR_BRACKET() { return getToken(RestrictedSQLParser.LR_BRACKET, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(RestrictedSQLParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RestrictedSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RestrictedSQLParser.COMMA, i);
		}
		public InsertQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertQueryContext insertQuery() throws RecognitionException {
		InsertQueryContext _localctx = new InsertQueryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_insertQuery);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(INSERT);
			setState(84);
			match(INTO);
			setState(85);
			tableSelect();
			setState(86);
			match(VALUES);
			setState(87);
			match(LR_BRACKET);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					values();
					setState(89);
					match(COMMA);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(96);
			values();
			setState(97);
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

	public static class DeleteQueryContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(RestrictedSQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(RestrictedSQLParser.FROM, 0); }
		public TableSelectContext tableSelect() {
			return getRuleContext(TableSelectContext.class,0);
		}
		public WhereCondContext whereCond() {
			return getRuleContext(WhereCondContext.class,0);
		}
		public DeleteQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterDeleteQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitDeleteQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitDeleteQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteQueryContext deleteQuery() throws RecognitionException {
		DeleteQueryContext _localctx = new DeleteQueryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_deleteQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(DELETE);
			setState(100);
			match(FROM);
			setState(101);
			tableSelect();
			setState(102);
			whereCond();
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
		enterRule(_localctx, 10, RULE_tableCommand);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				createTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				dropTable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				createIndex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
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
		public TerminalNode RR_BRACKET() { return getToken(RestrictedSQLParser.RR_BRACKET, 0); }
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
		enterRule(_localctx, 12, RULE_createTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(CREATE);
			setState(111);
			match(TABLE);
			setState(112);
			tableSelect();
			setState(113);
			match(LR_BRACKET);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					colSel();
					setState(115);
					match(COMMA);
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(122);
			colSel();
			setState(123);
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
		enterRule(_localctx, 14, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(DROP);
			setState(126);
			match(TABLE);
			setState(127);
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
		enterRule(_localctx, 16, RULE_createIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(CREATE);
			setState(130);
			match(INDEX);
			setState(131);
			indexSel();
			setState(132);
			match(ON);
			setState(133);
			tableSelect();
			setState(134);
			match(LR_BRACKET);
			setState(135);
			colSel();
			setState(136);
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
		enterRule(_localctx, 18, RULE_dropIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(DROP);
			setState(139);
			match(INDEX);
			setState(140);
			indexSel();
			setState(141);
			match(ON);
			setState(142);
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

	public static class WhereCondContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(RestrictedSQLParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionListContext conditionList() {
			return getRuleContext(ConditionListContext.class,0);
		}
		public WhereCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterWhereCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitWhereCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitWhereCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereCondContext whereCond() throws RecognitionException {
		WhereCondContext _localctx = new WhereCondContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whereCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(WHERE);
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(145);
				condition();
				}
				break;
			case 2:
				{
				setState(146);
				conditionList();
				}
				break;
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

	public static class ConditionListContext extends ParserRuleContext {
		public OrCondContext orCond() {
			return getRuleContext(OrCondContext.class,0);
		}
		public AndCondContext andCond() {
			return getRuleContext(AndCondContext.class,0);
		}
		public ConditionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterConditionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitConditionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitConditionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionListContext conditionList() throws RecognitionException {
		ConditionListContext _localctx = new ConditionListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditionList);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				orCond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				andCond();
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

	public static class OrCondContext extends ParserRuleContext {
		public LeftContext left() {
			return getRuleContext(LeftContext.class,0);
		}
		public TerminalNode OR() { return getToken(RestrictedSQLParser.OR, 0); }
		public RightContext right() {
			return getRuleContext(RightContext.class,0);
		}
		public OrCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterOrCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitOrCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitOrCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrCondContext orCond() throws RecognitionException {
		OrCondContext _localctx = new OrCondContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			left();
			setState(154);
			match(OR);
			setState(155);
			right();
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

	public static class AndCondContext extends ParserRuleContext {
		public LeftContext left() {
			return getRuleContext(LeftContext.class,0);
		}
		public TerminalNode AND() { return getToken(RestrictedSQLParser.AND, 0); }
		public RightContext right() {
			return getRuleContext(RightContext.class,0);
		}
		public AndCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterAndCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitAndCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitAndCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndCondContext andCond() throws RecognitionException {
		AndCondContext _localctx = new AndCondContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_andCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			left();
			setState(158);
			match(AND);
			setState(159);
			right();
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

	public static class LeftContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(RestrictedSQLParser.LR_BRACKET, 0); }
		public ConditionListContext conditionList() {
			return getRuleContext(ConditionListContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(RestrictedSQLParser.RR_BRACKET, 0); }
		public LeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftContext left() throws RecognitionException {
		LeftContext _localctx = new LeftContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_left);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				condition();
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(LR_BRACKET);
				setState(163);
				conditionList();
				setState(164);
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

	public static class RightContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionListContext conditionList() {
			return getRuleContext(ConditionListContext.class,0);
		}
		public RightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightContext right() throws RecognitionException {
		RightContext _localctx = new RightContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_right);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				conditionList();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitIndexSel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexSelContext indexSel() throws RecognitionException {
		IndexSelContext _localctx = new IndexSelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_indexSel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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

	public static class ValuesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RestrictedSQLParser.ID, 0); }
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_values);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
		enterRule(_localctx, 36, RULE_colSel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==ID) ) {
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
		enterRule(_localctx, 38, RULE_colAtt);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(VARCHAR);
				setState(179);
				match(LR_BRACKET);
				setState(180);
				match(ID);
				setState(181);
				match(RR_BRACKET);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(FLOAT);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				match(NULL);
				}
				break;
			case NOT_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
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
		public TerminalNode COMMA() { return getToken(RestrictedSQLParser.COMMA, 0); }
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
		enterRule(_localctx, 40, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(COMMA);
			setState(189);
			match(PRIMARY_KEY);
			setState(190);
			match(LR_BRACKET);
			setState(191);
			colSel();
			setState(192);
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
		enterRule(_localctx, 42, RULE_tableSelect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public NteqContext nteq() {
			return getRuleContext(NteqContext.class,0);
		}
		public GreaterContext greater() {
			return getRuleContext(GreaterContext.class,0);
		}
		public LessContext less() {
			return getRuleContext(LessContext.class,0);
		}
		public LteqContext lteq() {
			return getRuleContext(LteqContext.class,0);
		}
		public GtegContext gteg() {
			return getRuleContext(GtegContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condition);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				equal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				nteq();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				greater();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				less();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				lteq();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				gteg();
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

	public static class EqualContext extends ParserRuleContext {
		public ColSelContext colSel() {
			return getRuleContext(ColSelContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(RestrictedSQLParser.EQUAL, 0); }
		public TerminalNode ID() { return getToken(RestrictedSQLParser.ID, 0); }
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			colSel();
			setState(205);
			match(EQUAL);
			setState(206);
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

	public static class NteqContext extends ParserRuleContext {
		public ColSelContext colSel() {
			return getRuleContext(ColSelContext.class,0);
		}
		public TerminalNode ID() { return getToken(RestrictedSQLParser.ID, 0); }
		public NteqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nteq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterNteq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitNteq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitNteq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NteqContext nteq() throws RecognitionException {
		NteqContext _localctx = new NteqContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_nteq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			colSel();
			setState(209);
			match(T__1);
			setState(210);
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

	public static class GreaterContext extends ParserRuleContext {
		public ColSelContext colSel() {
			return getRuleContext(ColSelContext.class,0);
		}
		public TerminalNode GREATER() { return getToken(RestrictedSQLParser.GREATER, 0); }
		public TerminalNode ID() { return getToken(RestrictedSQLParser.ID, 0); }
		public GreaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitGreater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterContext greater() throws RecognitionException {
		GreaterContext _localctx = new GreaterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_greater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			colSel();
			setState(213);
			match(GREATER);
			setState(214);
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

	public static class LessContext extends ParserRuleContext {
		public ColSelContext colSel() {
			return getRuleContext(ColSelContext.class,0);
		}
		public TerminalNode GTEQ() { return getToken(RestrictedSQLParser.GTEQ, 0); }
		public TerminalNode ID() { return getToken(RestrictedSQLParser.ID, 0); }
		public LessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessContext less() throws RecognitionException {
		LessContext _localctx = new LessContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_less);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			colSel();
			setState(217);
			match(GTEQ);
			setState(218);
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

	public static class LteqContext extends ParserRuleContext {
		public ColSelContext colSel() {
			return getRuleContext(ColSelContext.class,0);
		}
		public TerminalNode LESS() { return getToken(RestrictedSQLParser.LESS, 0); }
		public TerminalNode ID() { return getToken(RestrictedSQLParser.ID, 0); }
		public LteqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lteq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterLteq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitLteq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitLteq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LteqContext lteq() throws RecognitionException {
		LteqContext _localctx = new LteqContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_lteq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			colSel();
			setState(221);
			match(LESS);
			setState(222);
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

	public static class GtegContext extends ParserRuleContext {
		public ColSelContext colSel() {
			return getRuleContext(ColSelContext.class,0);
		}
		public TerminalNode LTEQ() { return getToken(RestrictedSQLParser.LTEQ, 0); }
		public TerminalNode ID() { return getToken(RestrictedSQLParser.ID, 0); }
		public GtegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gteg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterGteg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitGteg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitGteg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GtegContext gteg() throws RecognitionException {
		GtegContext _localctx = new GtegContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_gteg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			colSel();
			setState(225);
			match(LTEQ);
			setState(226);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00e7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\5\2?\n\2\3"+
		"\3\3\3\3\3\5\3D\n\3\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4\3"+
		"\4\5\4R\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5^\n\5\f\5\16\5"+
		"a\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7o\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\bx\n\b\f\b\16\b{\13\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\5\f\u0096\n\f\3\r\3\r\5\r\u009a\n\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00a9\n\20\3\21\3\21"+
		"\5\21\u00ad\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u00bd\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00cd\n\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:\2\3\4\2\3\3//\2\u00e0\2>\3\2\2\2\4C\3\2"+
		"\2\2\6E\3\2\2\2\bU\3\2\2\2\ne\3\2\2\2\fn\3\2\2\2\16p\3\2\2\2\20\177\3"+
		"\2\2\2\22\u0083\3\2\2\2\24\u008c\3\2\2\2\26\u0092\3\2\2\2\30\u0099\3\2"+
		"\2\2\32\u009b\3\2\2\2\34\u009f\3\2\2\2\36\u00a8\3\2\2\2 \u00ac\3\2\2\2"+
		"\"\u00ae\3\2\2\2$\u00b0\3\2\2\2&\u00b2\3\2\2\2(\u00bc\3\2\2\2*\u00be\3"+
		"\2\2\2,\u00c4\3\2\2\2.\u00cc\3\2\2\2\60\u00ce\3\2\2\2\62\u00d2\3\2\2\2"+
		"\64\u00d6\3\2\2\2\66\u00da\3\2\2\28\u00de\3\2\2\2:\u00e2\3\2\2\2<?\5\4"+
		"\3\2=?\5\f\7\2><\3\2\2\2>=\3\2\2\2?\3\3\2\2\2@D\5\6\4\2AD\5\b\5\2BD\5"+
		"\n\6\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\5\3\2\2\2EK\7\5\2\2FG\5&\24\2GH"+
		"\7&\2\2HJ\3\2\2\2IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK"+
		"\3\2\2\2NO\5&\24\2OQ\7\6\2\2PR\5,\27\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2S"+
		"T\5\26\f\2T\7\3\2\2\2UV\7\21\2\2VW\7\23\2\2WX\5,\27\2XY\7\25\2\2Y_\7#"+
		"\2\2Z[\5$\23\2[\\\7&\2\2\\^\3\2\2\2]Z\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3"+
		"\2\2\2`b\3\2\2\2a_\3\2\2\2bc\5$\23\2cd\7$\2\2d\t\3\2\2\2ef\7\16\2\2fg"+
		"\7\6\2\2gh\5,\27\2hi\5\26\f\2i\13\3\2\2\2jo\5\16\b\2ko\5\20\t\2lo\5\22"+
		"\n\2mo\5\24\13\2nj\3\2\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\r\3\2\2\2pq"+
		"\7\13\2\2qr\7\17\2\2rs\5,\27\2sy\7#\2\2tu\5&\24\2uv\7&\2\2vx\3\2\2\2w"+
		"t\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\5&\24\2"+
		"}~\7$\2\2~\17\3\2\2\2\177\u0080\7\r\2\2\u0080\u0081\7\17\2\2\u0081\u0082"+
		"\5,\27\2\u0082\21\3\2\2\2\u0083\u0084\7\13\2\2\u0084\u0085\7\f\2\2\u0085"+
		"\u0086\5\"\22\2\u0086\u0087\7\24\2\2\u0087\u0088\5,\27\2\u0088\u0089\7"+
		"#\2\2\u0089\u008a\5&\24\2\u008a\u008b\7$\2\2\u008b\23\3\2\2\2\u008c\u008d"+
		"\7\r\2\2\u008d\u008e\7\f\2\2\u008e\u008f\5\"\22\2\u008f\u0090\7\24\2\2"+
		"\u0090\u0091\5,\27\2\u0091\25\3\2\2\2\u0092\u0095\7\7\2\2\u0093\u0096"+
		"\5.\30\2\u0094\u0096\5\30\r\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2"+
		"\u0096\27\3\2\2\2\u0097\u009a\5\32\16\2\u0098\u009a\5\34\17\2\u0099\u0097"+
		"\3\2\2\2\u0099\u0098\3\2\2\2\u009a\31\3\2\2\2\u009b\u009c\5\36\20\2\u009c"+
		"\u009d\7\t\2\2\u009d\u009e\5 \21\2\u009e\33\3\2\2\2\u009f\u00a0\5\36\20"+
		"\2\u00a0\u00a1\7\b\2\2\u00a1\u00a2\5 \21\2\u00a2\35\3\2\2\2\u00a3\u00a9"+
		"\5.\30\2\u00a4\u00a5\7#\2\2\u00a5\u00a6\5\30\r\2\u00a6\u00a7\7$\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9\37\3\2\2"+
		"\2\u00aa\u00ad\5.\30\2\u00ab\u00ad\5\30\r\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad!\3\2\2\2\u00ae\u00af\7/\2\2\u00af#\3\2\2\2\u00b0"+
		"\u00b1\7/\2\2\u00b1%\3\2\2\2\u00b2\u00b3\t\2\2\2\u00b3\'\3\2\2\2\u00b4"+
		"\u00b5\7+\2\2\u00b5\u00b6\7#\2\2\u00b6\u00b7\7/\2\2\u00b7\u00bd\7$\2\2"+
		"\u00b8\u00bd\7)\2\2\u00b9\u00bd\7*\2\2\u00ba\u00bd\7\32\2\2\u00bb\u00bd"+
		"\7\33\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2"+
		"\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd)\3\2\2\2\u00be\u00bf\7"+
		"&\2\2\u00bf\u00c0\7,\2\2\u00c0\u00c1\7#\2\2\u00c1\u00c2\5&\24\2\u00c2"+
		"\u00c3\7$\2\2\u00c3+\3\2\2\2\u00c4\u00c5\7/\2\2\u00c5-\3\2\2\2\u00c6\u00cd"+
		"\5\60\31\2\u00c7\u00cd\5\62\32\2\u00c8\u00cd\5\64\33\2\u00c9\u00cd\5\66"+
		"\34\2\u00ca\u00cd\58\35\2\u00cb\u00cd\5:\36\2\u00cc\u00c6\3\2\2\2\u00cc"+
		"\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cb\3\2\2\2\u00cd/\3\2\2\2\u00ce\u00cf\5&\24\2\u00cf\u00d0"+
		"\7\36\2\2\u00d0\u00d1\7/\2\2\u00d1\61\3\2\2\2\u00d2\u00d3\5&\24\2\u00d3"+
		"\u00d4\7\4\2\2\u00d4\u00d5\7/\2\2\u00d5\63\3\2\2\2\u00d6\u00d7\5&\24\2"+
		"\u00d7\u00d8\7\37\2\2\u00d8\u00d9\7/\2\2\u00d9\65\3\2\2\2\u00da\u00db"+
		"\5&\24\2\u00db\u00dc\7\"\2\2\u00dc\u00dd\7/\2\2\u00dd\67\3\2\2\2\u00de"+
		"\u00df\5&\24\2\u00df\u00e0\7 \2\2\u00e0\u00e1\7/\2\2\u00e19\3\2\2\2\u00e2"+
		"\u00e3\5&\24\2\u00e3\u00e4\7!\2\2\u00e4\u00e5\7/\2\2\u00e5;\3\2\2\2\17"+
		">CKQ_ny\u0095\u0099\u00a8\u00ac\u00bc\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}