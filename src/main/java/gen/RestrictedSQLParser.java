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
		RULE_createIndex = 8, RULE_dropIndex = 9, RULE_whereCond = 10, RULE_indexSel = 11, 
		RULE_values = 12, RULE_colSel = 13, RULE_colAtt = 14, RULE_key = 15, RULE_tableSelect = 16, 
		RULE_condition = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "query", "selectQuery", "insertQuery", "deleteQuery", "tableCommand", 
			"createTable", "dropTable", "createIndex", "dropIndex", "whereCond", 
			"indexSel", "values", "colSel", "colAtt", "key", "tableSelect", "condition"
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
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case DELETE:
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				query();
				}
				break;
			case CREATE:
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
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
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				selectQuery();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				insertQuery();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(SELECT);
			setState(46);
			colSel();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(47);
				match(COMMA);
				setState(48);
				colSel();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(FROM);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(55);
				tableSelect();
				}
			}

			setState(58);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(INSERT);
			setState(61);
			match(INTO);
			setState(62);
			tableSelect();
			setState(63);
			match(VALUES);
			setState(64);
			match(LR_BRACKET);
			setState(65);
			values();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(66);
				match(COMMA);
				setState(67);
				values();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
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
		public WhereCondContext whereCond() {
			return getRuleContext(WhereCondContext.class,0);
		}
		public TableSelectContext tableSelect() {
			return getRuleContext(TableSelectContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(DELETE);
			setState(76);
			match(FROM);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(77);
				tableSelect();
				}
			}

			setState(80);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				createTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				dropTable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				createIndex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
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
		public List<TerminalNode> COMMA() { return getTokens(RestrictedSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RestrictedSQLParser.COMMA, i);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
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
			setState(88);
			match(CREATE);
			setState(89);
			match(TABLE);
			setState(90);
			tableSelect();
			setState(91);
			match(LR_BRACKET);
			setState(92);
			colSel();
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					match(COMMA);
					setState(94);
					colSel();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(100);
			match(COMMA);
			setState(101);
			key();
			setState(102);
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
		enterRule(_localctx, 14, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(DROP);
			setState(105);
			match(TABLE);
			setState(106);
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
			setState(108);
			match(CREATE);
			setState(109);
			match(INDEX);
			setState(110);
			indexSel();
			setState(111);
			match(ON);
			setState(112);
			tableSelect();
			setState(113);
			match(LR_BRACKET);
			setState(114);
			colSel();
			setState(115);
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
			setState(117);
			match(DROP);
			setState(118);
			match(INDEX);
			setState(119);
			indexSel();
			setState(120);
			match(ON);
			setState(121);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(WHERE);
			setState(124);
			condition();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(125);
				match(AND);
				setState(126);
				condition();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		enterRule(_localctx, 22, RULE_indexSel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
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
		enterRule(_localctx, 24, RULE_values);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
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
		enterRule(_localctx, 26, RULE_colSel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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
		enterRule(_localctx, 28, RULE_colAtt);
		try {
			setState(147);
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
				setState(139);
				match(VARCHAR);
				setState(140);
				match(LR_BRACKET);
				setState(141);
				match(ID);
				setState(142);
				match(RR_BRACKET);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(FLOAT);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				match(NULL);
				}
				break;
			case NOT_NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
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
		enterRule(_localctx, 30, RULE_key);
		try {
			setState(155);
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
				setState(150);
				match(PRIMARY_KEY);
				setState(151);
				match(LR_BRACKET);
				setState(152);
				colSel();
				setState(153);
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
		enterRule(_localctx, 32, RULE_tableSelect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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
		enterRule(_localctx, 34, RULE_condition);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				colSel();
				setState(160);
				match(EQUAL);
				setState(161);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				colSel();
				setState(164);
				match(GREATER);
				setState(165);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				colSel();
				setState(168);
				match(GTEQ);
				setState(169);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				colSel();
				setState(172);
				match(LESS);
				setState(173);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				colSel();
				setState(176);
				match(LTEQ);
				setState(177);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\5\2)\n\2\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\7\4\64"+
		"\n\4\f\4\16\4\67\13\4\3\4\3\4\5\4;\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\5\3\5\3\6\3\6\3\6\5\6Q\n\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bb\n\b\f\b\16"+
		"\be\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u0082\n\f\f\f"+
		"\16\f\u0085\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0096\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u009e\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b7\n\23"+
		"\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3\4\2\4\4//"+
		"\2\u00bd\2(\3\2\2\2\4-\3\2\2\2\6/\3\2\2\2\b>\3\2\2\2\nM\3\2\2\2\fX\3\2"+
		"\2\2\16Z\3\2\2\2\20j\3\2\2\2\22n\3\2\2\2\24w\3\2\2\2\26}\3\2\2\2\30\u0086"+
		"\3\2\2\2\32\u0088\3\2\2\2\34\u008a\3\2\2\2\36\u0095\3\2\2\2 \u009d\3\2"+
		"\2\2\"\u009f\3\2\2\2$\u00b6\3\2\2\2&)\5\4\3\2\')\5\f\7\2(&\3\2\2\2(\'"+
		"\3\2\2\2)\3\3\2\2\2*.\5\6\4\2+.\5\b\5\2,.\5\n\6\2-*\3\2\2\2-+\3\2\2\2"+
		"-,\3\2\2\2.\5\3\2\2\2/\60\7\5\2\2\60\65\5\34\17\2\61\62\7&\2\2\62\64\5"+
		"\34\17\2\63\61\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3"+
		"\2\2\2\67\65\3\2\2\28:\7\6\2\29;\5\"\22\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2"+
		"\2<=\5\26\f\2=\7\3\2\2\2>?\7\21\2\2?@\7\23\2\2@A\5\"\22\2AB\7\25\2\2B"+
		"C\7#\2\2CH\5\32\16\2DE\7&\2\2EG\5\32\16\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2"+
		"\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7$\2\2L\t\3\2\2\2MN\7\16\2\2NP\7\6"+
		"\2\2OQ\5\"\22\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\5\26\f\2S\13\3\2\2\2T"+
		"Y\5\16\b\2UY\5\20\t\2VY\5\22\n\2WY\5\24\13\2XT\3\2\2\2XU\3\2\2\2XV\3\2"+
		"\2\2XW\3\2\2\2Y\r\3\2\2\2Z[\7\13\2\2[\\\7\17\2\2\\]\5\"\22\2]^\7#\2\2"+
		"^c\5\34\17\2_`\7&\2\2`b\5\34\17\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2"+
		"\2\2df\3\2\2\2ec\3\2\2\2fg\7&\2\2gh\5 \21\2hi\7\3\2\2i\17\3\2\2\2jk\7"+
		"\r\2\2kl\7\17\2\2lm\5\"\22\2m\21\3\2\2\2no\7\13\2\2op\7\f\2\2pq\5\30\r"+
		"\2qr\7\24\2\2rs\5\"\22\2st\7#\2\2tu\5\34\17\2uv\7$\2\2v\23\3\2\2\2wx\7"+
		"\r\2\2xy\7\f\2\2yz\5\30\r\2z{\7\24\2\2{|\5\"\22\2|\25\3\2\2\2}~\7\7\2"+
		"\2~\u0083\5$\23\2\177\u0080\7\b\2\2\u0080\u0082\5$\23\2\u0081\177\3\2"+
		"\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\27\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7/\2\2\u0087\31\3\2\2\2\u0088"+
		"\u0089\7/\2\2\u0089\33\3\2\2\2\u008a\u008b\t\2\2\2\u008b\35\3\2\2\2\u008c"+
		"\u0096\3\2\2\2\u008d\u008e\7+\2\2\u008e\u008f\7#\2\2\u008f\u0090\7/\2"+
		"\2\u0090\u0096\7$\2\2\u0091\u0096\7)\2\2\u0092\u0096\7*\2\2\u0093\u0096"+
		"\7\32\2\2\u0094\u0096\7\33\2\2\u0095\u008c\3\2\2\2\u0095\u008d\3\2\2\2"+
		"\u0095\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094"+
		"\3\2\2\2\u0096\37\3\2\2\2\u0097\u009e\3\2\2\2\u0098\u0099\7,\2\2\u0099"+
		"\u009a\7#\2\2\u009a\u009b\5\34\17\2\u009b\u009c\7$\2\2\u009c\u009e\3\2"+
		"\2\2\u009d\u0097\3\2\2\2\u009d\u0098\3\2\2\2\u009e!\3\2\2\2\u009f\u00a0"+
		"\7/\2\2\u00a0#\3\2\2\2\u00a1\u00a2\5\34\17\2\u00a2\u00a3\7\36\2\2\u00a3"+
		"\u00a4\7/\2\2\u00a4\u00b7\3\2\2\2\u00a5\u00a6\5\34\17\2\u00a6\u00a7\7"+
		"\37\2\2\u00a7\u00a8\7/\2\2\u00a8\u00b7\3\2\2\2\u00a9\u00aa\5\34\17\2\u00aa"+
		"\u00ab\7\"\2\2\u00ab\u00ac\7/\2\2\u00ac\u00b7\3\2\2\2\u00ad\u00ae\5\34"+
		"\17\2\u00ae\u00af\7 \2\2\u00af\u00b0\7/\2\2\u00b0\u00b7\3\2\2\2\u00b1"+
		"\u00b2\5\34\17\2\u00b2\u00b3\7!\2\2\u00b3\u00b4\7/\2\2\u00b4\u00b7\3\2"+
		"\2\2\u00b5\u00b7\7/\2\2\u00b6\u00a1\3\2\2\2\u00b6\u00a5\3\2\2\2\u00b6"+
		"\u00a9\3\2\2\2\u00b6\u00ad\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b5\3\2"+
		"\2\2\u00b7%\3\2\2\2\16(-\65:HPXc\u0083\u0095\u009d\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}