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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, SELECT=6, FROM=7, WHERE=8, AND=9, 
		OR=10, ADD=11, CREATE=12, INDEX=13, DROP=14, DELETE=15, TABLE=16, UPDATE=17, 
		INSERT=18, BETWEEN=19, INTO=20, ON=21, VALUES=22, LOAD=23, SAVE=24, MAX=25, 
		MIN=26, SUM=27, AVG=28, NULL=29, NOT_NULL=30, PLUS=31, MINUS=32, EQUAL=33, 
		GREATER=34, LESS=35, LTEQ=36, GTEQ=37, LR_BRACKET=38, RR_BRACKET=39, SINGLE_QUOTE_SYMB=40, 
		COMMA=41, SEMI=42, EXCLAMATION=43, INT=44, FLOAT=45, VARCHAR=46, PRIMARY_KEY=47, 
		FORGIEN_KEY=48, WS=49, ID=50;
	public static final int
		RULE_statement = 0, RULE_query = 1, RULE_selectQuery = 2, RULE_innerJoin = 3, 
		RULE_insertQuery = 4, RULE_record = 5, RULE_deleteQuery = 6, RULE_loadFile = 7, 
		RULE_saveFile = 8, RULE_tableCommand = 9, RULE_createTable = 10, RULE_dropTable = 11, 
		RULE_createIndex = 12, RULE_dropIndex = 13, RULE_whereCond = 14, RULE_conditionList = 15, 
		RULE_orCond = 16, RULE_andCond = 17, RULE_left = 18, RULE_right = 19, 
		RULE_indexSel = 20, RULE_values = 21, RULE_colSel = 22, RULE_colAtt = 23, 
		RULE_key = 24, RULE_tableSelect = 25, RULE_condition = 26, RULE_equal = 27, 
		RULE_nteq = 28, RULE_greater = 29, RULE_less = 30, RULE_lteq = 31, RULE_gteg = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "query", "selectQuery", "innerJoin", "insertQuery", "record", 
			"deleteQuery", "loadFile", "saveFile", "tableCommand", "createTable", 
			"dropTable", "createIndex", "dropIndex", "whereCond", "conditionList", 
			"orCond", "andCond", "left", "right", "indexSel", "values", "colSel", 
			"colAtt", "key", "tableSelect", "condition", "equal", "nteq", "greater", 
			"less", "lteq", "gteg"
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
		public LoadFileContext loadFile() {
			return getRuleContext(LoadFileContext.class,0);
		}
		public SaveFileContext saveFile() {
			return getRuleContext(SaveFileContext.class,0);
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
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case DELETE:
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				query();
				}
				break;
			case CREATE:
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				tableCommand();
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				loadFile();
				}
				break;
			case SAVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				saveFile();
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
		public InnerJoinContext innerJoin() {
			return getRuleContext(InnerJoinContext.class,0);
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				selectQuery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				innerJoin();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				insertQuery();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				deleteQuery();
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

	public static class SelectQueryContext extends ParserRuleContext {
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
		public List<TerminalNode> COMMA() { return getTokens(RestrictedSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RestrictedSQLParser.COMMA, i);
		}
		public WhereCondContext whereCond() {
			return getRuleContext(WhereCondContext.class,0);
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
			setState(78);
			match(SELECT);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					colSel();
					setState(80);
					match(COMMA);
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(87);
			colSel();
			setState(88);
			match(FROM);
			setState(89);
			tableSelect();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(90);
				whereCond();
				}
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

	public static class InnerJoinContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(RestrictedSQLParser.SELECT, 0); }
		public List<ColSelContext> colSel() {
			return getRuleContexts(ColSelContext.class);
		}
		public ColSelContext colSel(int i) {
			return getRuleContext(ColSelContext.class,i);
		}
		public List<TableSelectContext> tableSelect() {
			return getRuleContexts(TableSelectContext.class);
		}
		public TableSelectContext tableSelect(int i) {
			return getRuleContext(TableSelectContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RestrictedSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RestrictedSQLParser.COMMA, i);
		}
		public WhereCondContext whereCond() {
			return getRuleContext(WhereCondContext.class,0);
		}
		public InnerJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerJoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterInnerJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitInnerJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitInnerJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerJoinContext innerJoin() throws RecognitionException {
		InnerJoinContext _localctx = new InnerJoinContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_innerJoin);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(SELECT);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					colSel();
					setState(95);
					match(COMMA);
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(102);
			colSel();
			setState(103);
			match(T__0);
			setState(104);
			tableSelect();
			setState(105);
			match(COMMA);
			setState(106);
			tableSelect();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(107);
				whereCond();
				}
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

	public static class InsertQueryContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(RestrictedSQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(RestrictedSQLParser.INTO, 0); }
		public TableSelectContext tableSelect() {
			return getRuleContext(TableSelectContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(RestrictedSQLParser.VALUES, 0); }
		public List<RecordContext> record() {
			return getRuleContexts(RecordContext.class);
		}
		public RecordContext record(int i) {
			return getRuleContext(RecordContext.class,i);
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
		enterRule(_localctx, 8, RULE_insertQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(INSERT);
			setState(111);
			match(INTO);
			setState(112);
			tableSelect();
			setState(113);
			match(VALUES);
			setState(114);
			match(T__1);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				record();
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LR_BRACKET );
			setState(120);
			match(T__2);
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

	public static class RecordContext extends ParserRuleContext {
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
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitRecord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitRecord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordContext record() throws RecognitionException {
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_record);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(LR_BRACKET);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					values();
					setState(124);
					match(COMMA);
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(131);
			values();
			setState(132);
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
		enterRule(_localctx, 12, RULE_deleteQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(DELETE);
			setState(135);
			match(FROM);
			setState(136);
			tableSelect();
			setState(137);
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

	public static class LoadFileContext extends ParserRuleContext {
		public TerminalNode LOAD() { return getToken(RestrictedSQLParser.LOAD, 0); }
		public TerminalNode ID() { return getToken(RestrictedSQLParser.ID, 0); }
		public LoadFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loadFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterLoadFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitLoadFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitLoadFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoadFileContext loadFile() throws RecognitionException {
		LoadFileContext _localctx = new LoadFileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loadFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(LOAD);
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

	public static class SaveFileContext extends ParserRuleContext {
		public TerminalNode SAVE() { return getToken(RestrictedSQLParser.SAVE, 0); }
		public TerminalNode ID() { return getToken(RestrictedSQLParser.ID, 0); }
		public SaveFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saveFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).enterSaveFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RestrictedSQLListener ) ((RestrictedSQLListener)listener).exitSaveFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RestrictedSQLVisitor ) return ((RestrictedSQLVisitor<? extends T>)visitor).visitSaveFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaveFileContext saveFile() throws RecognitionException {
		SaveFileContext _localctx = new SaveFileContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_saveFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(SAVE);
			setState(143);
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
		enterRule(_localctx, 18, RULE_tableCommand);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				createTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				dropTable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				createIndex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
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
		enterRule(_localctx, 20, RULE_createTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(CREATE);
			setState(152);
			match(TABLE);
			setState(153);
			tableSelect();
			setState(154);
			match(LR_BRACKET);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(155);
					colSel();
					setState(156);
					match(COMMA);
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(163);
			colSel();
			setState(164);
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
		enterRule(_localctx, 22, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(DROP);
			setState(167);
			match(TABLE);
			setState(168);
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
		enterRule(_localctx, 24, RULE_createIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(CREATE);
			setState(171);
			match(INDEX);
			setState(172);
			indexSel();
			setState(173);
			match(ON);
			setState(174);
			tableSelect();
			setState(175);
			match(LR_BRACKET);
			setState(176);
			colSel();
			setState(177);
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
		enterRule(_localctx, 26, RULE_dropIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(DROP);
			setState(180);
			match(INDEX);
			setState(181);
			indexSel();
			setState(182);
			match(ON);
			setState(183);
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
		enterRule(_localctx, 28, RULE_whereCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(WHERE);
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(186);
				condition();
				}
				break;
			case 2:
				{
				setState(187);
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
		enterRule(_localctx, 30, RULE_conditionList);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				orCond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
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
		enterRule(_localctx, 32, RULE_orCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			left();
			setState(195);
			match(OR);
			setState(196);
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
		enterRule(_localctx, 34, RULE_andCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			left();
			setState(199);
			match(AND);
			setState(200);
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
		enterRule(_localctx, 36, RULE_left);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				condition();
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(LR_BRACKET);
				setState(204);
				conditionList();
				setState(205);
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
		enterRule(_localctx, 38, RULE_right);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
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
		enterRule(_localctx, 40, RULE_indexSel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
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
		enterRule(_localctx, 42, RULE_values);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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
		enterRule(_localctx, 44, RULE_colSel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==ID) ) {
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
		enterRule(_localctx, 46, RULE_colAtt);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(VARCHAR);
				setState(220);
				match(LR_BRACKET);
				setState(221);
				match(ID);
				setState(222);
				match(RR_BRACKET);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(FLOAT);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(NULL);
				}
				break;
			case NOT_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
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
		enterRule(_localctx, 48, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(COMMA);
			setState(230);
			match(PRIMARY_KEY);
			setState(231);
			match(LR_BRACKET);
			setState(232);
			colSel();
			setState(233);
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
		enterRule(_localctx, 50, RULE_tableSelect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
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
		enterRule(_localctx, 52, RULE_condition);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				equal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				nteq();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				greater();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				less();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				lteq();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
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
		enterRule(_localctx, 54, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			colSel();
			setState(246);
			match(EQUAL);
			setState(247);
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
		enterRule(_localctx, 56, RULE_nteq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			colSel();
			setState(250);
			match(T__4);
			setState(251);
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
		enterRule(_localctx, 58, RULE_greater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			colSel();
			setState(254);
			match(GREATER);
			setState(255);
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
		enterRule(_localctx, 60, RULE_less);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			colSel();
			setState(258);
			match(GTEQ);
			setState(259);
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
		enterRule(_localctx, 62, RULE_lteq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			colSel();
			setState(262);
			match(LESS);
			setState(263);
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
		enterRule(_localctx, 64, RULE_gteg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			colSel();
			setState(266);
			match(LTEQ);
			setState(267);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0110\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\5\2I\n\2\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3\4"+
		"\3\4\3\4\7\4U\n\4\f\4\16\4X\13\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\5\3\5\3\5"+
		"\3\5\7\5d\n\5\f\5\16\5g\13\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5o\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\6\6w\n\6\r\6\16\6x\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u0081"+
		"\n\7\f\7\16\7\u0084\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0098\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u00a1\n\f\f\f\16\f\u00a4\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\5\20\u00bf\n\20\3\21\3\21\5\21\u00c3\n\21\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00d2\n\24"+
		"\3\25\3\25\5\25\u00d6\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u00e6\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00f6\n\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@B\2\3\4\2\6\6\64\64\2\u010b\2H\3\2\2\2\4N\3\2\2\2"+
		"\6P\3\2\2\2\b_\3\2\2\2\np\3\2\2\2\f|\3\2\2\2\16\u0088\3\2\2\2\20\u008d"+
		"\3\2\2\2\22\u0090\3\2\2\2\24\u0097\3\2\2\2\26\u0099\3\2\2\2\30\u00a8\3"+
		"\2\2\2\32\u00ac\3\2\2\2\34\u00b5\3\2\2\2\36\u00bb\3\2\2\2 \u00c2\3\2\2"+
		"\2\"\u00c4\3\2\2\2$\u00c8\3\2\2\2&\u00d1\3\2\2\2(\u00d5\3\2\2\2*\u00d7"+
		"\3\2\2\2,\u00d9\3\2\2\2.\u00db\3\2\2\2\60\u00e5\3\2\2\2\62\u00e7\3\2\2"+
		"\2\64\u00ed\3\2\2\2\66\u00f5\3\2\2\28\u00f7\3\2\2\2:\u00fb\3\2\2\2<\u00ff"+
		"\3\2\2\2>\u0103\3\2\2\2@\u0107\3\2\2\2B\u010b\3\2\2\2DI\5\4\3\2EI\5\24"+
		"\13\2FI\5\20\t\2GI\5\22\n\2HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\3"+
		"\3\2\2\2JO\5\6\4\2KO\5\b\5\2LO\5\n\6\2MO\5\16\b\2NJ\3\2\2\2NK\3\2\2\2"+
		"NL\3\2\2\2NM\3\2\2\2O\5\3\2\2\2PV\7\b\2\2QR\5.\30\2RS\7+\2\2SU\3\2\2\2"+
		"TQ\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\5.\30\2"+
		"Z[\7\t\2\2[]\5\64\33\2\\^\5\36\20\2]\\\3\2\2\2]^\3\2\2\2^\7\3\2\2\2_e"+
		"\7\b\2\2`a\5.\30\2ab\7+\2\2bd\3\2\2\2c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef"+
		"\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\5.\30\2ij\7\3\2\2jk\5\64\33\2kl\7+\2\2"+
		"ln\5\64\33\2mo\5\36\20\2nm\3\2\2\2no\3\2\2\2o\t\3\2\2\2pq\7\24\2\2qr\7"+
		"\26\2\2rs\5\64\33\2st\7\30\2\2tv\7\4\2\2uw\5\f\7\2vu\3\2\2\2wx\3\2\2\2"+
		"xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\5\2\2{\13\3\2\2\2|\u0082\7(\2\2}~\5"+
		",\27\2~\177\7+\2\2\177\u0081\3\2\2\2\u0080}\3\2\2\2\u0081\u0084\3\2\2"+
		"\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0085\u0086\5,\27\2\u0086\u0087\7)\2\2\u0087\r\3\2\2\2\u0088"+
		"\u0089\7\21\2\2\u0089\u008a\7\t\2\2\u008a\u008b\5\64\33\2\u008b\u008c"+
		"\5\36\20\2\u008c\17\3\2\2\2\u008d\u008e\7\31\2\2\u008e\u008f\7\64\2\2"+
		"\u008f\21\3\2\2\2\u0090\u0091\7\32\2\2\u0091\u0092\7\64\2\2\u0092\23\3"+
		"\2\2\2\u0093\u0098\5\26\f\2\u0094\u0098\5\30\r\2\u0095\u0098\5\32\16\2"+
		"\u0096\u0098\5\34\17\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0096\3\2\2\2\u0098\25\3\2\2\2\u0099\u009a\7\16\2\2\u009a"+
		"\u009b\7\22\2\2\u009b\u009c\5\64\33\2\u009c\u00a2\7(\2\2\u009d\u009e\5"+
		".\30\2\u009e\u009f\7+\2\2\u009f\u00a1\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\5.\30\2\u00a6\u00a7\7)\2\2\u00a7"+
		"\27\3\2\2\2\u00a8\u00a9\7\20\2\2\u00a9\u00aa\7\22\2\2\u00aa\u00ab\5\64"+
		"\33\2\u00ab\31\3\2\2\2\u00ac\u00ad\7\16\2\2\u00ad\u00ae\7\17\2\2\u00ae"+
		"\u00af\5*\26\2\u00af\u00b0\7\27\2\2\u00b0\u00b1\5\64\33\2\u00b1\u00b2"+
		"\7(\2\2\u00b2\u00b3\5.\30\2\u00b3\u00b4\7)\2\2\u00b4\33\3\2\2\2\u00b5"+
		"\u00b6\7\20\2\2\u00b6\u00b7\7\17\2\2\u00b7\u00b8\5*\26\2\u00b8\u00b9\7"+
		"\27\2\2\u00b9\u00ba\5\64\33\2\u00ba\35\3\2\2\2\u00bb\u00be\7\n\2\2\u00bc"+
		"\u00bf\5\66\34\2\u00bd\u00bf\5 \21\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3"+
		"\2\2\2\u00bf\37\3\2\2\2\u00c0\u00c3\5\"\22\2\u00c1\u00c3\5$\23\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3!\3\2\2\2\u00c4\u00c5\5&\24\2"+
		"\u00c5\u00c6\7\f\2\2\u00c6\u00c7\5(\25\2\u00c7#\3\2\2\2\u00c8\u00c9\5"+
		"&\24\2\u00c9\u00ca\7\13\2\2\u00ca\u00cb\5(\25\2\u00cb%\3\2\2\2\u00cc\u00d2"+
		"\5\66\34\2\u00cd\u00ce\7(\2\2\u00ce\u00cf\5 \21\2\u00cf\u00d0\7)\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2\'\3\2\2\2"+
		"\u00d3\u00d6\5\66\34\2\u00d4\u00d6\5 \21\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4"+
		"\3\2\2\2\u00d6)\3\2\2\2\u00d7\u00d8\7\64\2\2\u00d8+\3\2\2\2\u00d9\u00da"+
		"\7\64\2\2\u00da-\3\2\2\2\u00db\u00dc\t\2\2\2\u00dc/\3\2\2\2\u00dd\u00de"+
		"\7\60\2\2\u00de\u00df\7(\2\2\u00df\u00e0\7\64\2\2\u00e0\u00e6\7)\2\2\u00e1"+
		"\u00e6\7.\2\2\u00e2\u00e6\7/\2\2\u00e3\u00e6\7\37\2\2\u00e4\u00e6\7 \2"+
		"\2\u00e5\u00dd\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\61\3\2\2\2\u00e7\u00e8\7+\2\2\u00e8"+
		"\u00e9\7\61\2\2\u00e9\u00ea\7(\2\2\u00ea\u00eb\5.\30\2\u00eb\u00ec\7)"+
		"\2\2\u00ec\63\3\2\2\2\u00ed\u00ee\7\64\2\2\u00ee\65\3\2\2\2\u00ef\u00f6"+
		"\58\35\2\u00f0\u00f6\5:\36\2\u00f1\u00f6\5<\37\2\u00f2\u00f6\5> \2\u00f3"+
		"\u00f6\5@!\2\u00f4\u00f6\5B\"\2\u00f5\u00ef\3\2\2\2\u00f5\u00f0\3\2\2"+
		"\2\u00f5\u00f1\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4"+
		"\3\2\2\2\u00f6\67\3\2\2\2\u00f7\u00f8\5.\30\2\u00f8\u00f9\7#\2\2\u00f9"+
		"\u00fa\7\64\2\2\u00fa9\3\2\2\2\u00fb\u00fc\5.\30\2\u00fc\u00fd\7\7\2\2"+
		"\u00fd\u00fe\7\64\2\2\u00fe;\3\2\2\2\u00ff\u0100\5.\30\2\u0100\u0101\7"+
		"$\2\2\u0101\u0102\7\64\2\2\u0102=\3\2\2\2\u0103\u0104\5.\30\2\u0104\u0105"+
		"\7\'\2\2\u0105\u0106\7\64\2\2\u0106?\3\2\2\2\u0107\u0108\5.\30\2\u0108"+
		"\u0109\7%\2\2\u0109\u010a\7\64\2\2\u010aA\3\2\2\2\u010b\u010c\5.\30\2"+
		"\u010c\u010d\7&\2\2\u010d\u010e\7\64\2\2\u010eC\3\2\2\2\22HNV]enx\u0082"+
		"\u0097\u00a2\u00be\u00c2\u00d1\u00d5\u00e5\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}