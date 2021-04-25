// Generated from C:/Users/Andrew/DBMS/src/main/java/RDBMS\RestrictedSQL.g4 by ANTLR 4.9.1
package gen;
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
	 * Enter a parse tree produced by {@link RestrictedSQLParser#selectQuery}.
	 * @param ctx the parse tree
	 */
	void enterSelectQuery(RestrictedSQLParser.SelectQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestrictedSQLParser#selectQuery}.
	 * @param ctx the parse tree
	 */
	void exitSelectQuery(RestrictedSQLParser.SelectQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestrictedSQLParser#insertQuery}.
	 * @param ctx the parse tree
	 */
	void enterInsertQuery(RestrictedSQLParser.InsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestrictedSQLParser#insertQuery}.
	 * @param ctx the parse tree
	 */
	void exitInsertQuery(RestrictedSQLParser.InsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestrictedSQLParser#deleteQuery}.
	 * @param ctx the parse tree
	 */
	void enterDeleteQuery(RestrictedSQLParser.DeleteQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestrictedSQLParser#deleteQuery}.
	 * @param ctx the parse tree
	 */
	void exitDeleteQuery(RestrictedSQLParser.DeleteQueryContext ctx);
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
	 * Enter a parse tree produced by {@link RestrictedSQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(RestrictedSQLParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestrictedSQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(RestrictedSQLParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestrictedSQLParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(RestrictedSQLParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestrictedSQLParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(RestrictedSQLParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestrictedSQLParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(RestrictedSQLParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestrictedSQLParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(RestrictedSQLParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestrictedSQLParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(RestrictedSQLParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestrictedSQLParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(RestrictedSQLParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link RestrictedSQLParser#whereCond}.
	 * @param ctx the parse tree
	 */
	void enterWhereCond(RestrictedSQLParser.WhereCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestrictedSQLParser#whereCond}.
	 * @param ctx the parse tree
	 */
	void exitWhereCond(RestrictedSQLParser.WhereCondContext ctx);
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
	 * Enter a parse tree produced by {@link RestrictedSQLParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(RestrictedSQLParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RestrictedSQLParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(RestrictedSQLParser.ValuesContext ctx);
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