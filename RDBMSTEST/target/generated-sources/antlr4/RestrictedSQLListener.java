// Generated from RestrictedSQL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RestrictedSQLParser}.
 */
public interface RestrictedSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RestrictedSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RestrictedSQLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestrictedSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RestrictedSQLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestrictedSQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(RestrictedSQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestrictedSQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(RestrictedSQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestrictedSQLParser#indexSel}.
	 * @param ctx the parse tree
	 */
	void enterIndexSel(RestrictedSQLParser.IndexSelContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestrictedSQLParser#indexSel}.
	 * @param ctx the parse tree
	 */
	void exitIndexSel(RestrictedSQLParser.IndexSelContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestrictedSQLParser#colSel}.
	 * @param ctx the parse tree
	 */
	void enterColSel(RestrictedSQLParser.ColSelContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestrictedSQLParser#colSel}.
	 * @param ctx the parse tree
	 */
	void exitColSel(RestrictedSQLParser.ColSelContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestrictedSQLParser#colAtt}.
	 * @param ctx the parse tree
	 */
	void enterColAtt(RestrictedSQLParser.ColAttContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestrictedSQLParser#colAtt}.
	 * @param ctx the parse tree
	 */
	void exitColAtt(RestrictedSQLParser.ColAttContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestrictedSQLParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(RestrictedSQLParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestrictedSQLParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(RestrictedSQLParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestrictedSQLParser#tableCommand}.
	 * @param ctx the parse tree
	 */
	void enterTableCommand(RestrictedSQLParser.TableCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestrictedSQLParser#tableCommand}.
	 * @param ctx the parse tree
	 */
	void exitTableCommand(RestrictedSQLParser.TableCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestrictedSQLParser#tableSelect}.
	 * @param ctx the parse tree
	 */
	void enterTableSelect(RestrictedSQLParser.TableSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestrictedSQLParser#tableSelect}.
	 * @param ctx the parse tree
	 */
	void exitTableSelect(RestrictedSQLParser.TableSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestrictedSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(RestrictedSQLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestrictedSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(RestrictedSQLParser.ConditionContext ctx);
}