// Generated from C:/Users/Andrew/DBMS/src/main/java/RDBMS\RestrictedSQL.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RestrictedSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RestrictedSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(RestrictedSQLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(RestrictedSQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#selectQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectQuery(RestrictedSQLParser.SelectQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#insertQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertQuery(RestrictedSQLParser.InsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#deleteQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteQuery(RestrictedSQLParser.DeleteQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#tableCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableCommand(RestrictedSQLParser.TableCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(RestrictedSQLParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(RestrictedSQLParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#createIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(RestrictedSQLParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#dropIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndex(RestrictedSQLParser.DropIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#whereCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereCond(RestrictedSQLParser.WhereCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#indexSel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexSel(RestrictedSQLParser.IndexSelContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(RestrictedSQLParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#colSel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColSel(RestrictedSQLParser.ColSelContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#colAtt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColAtt(RestrictedSQLParser.ColAttContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(RestrictedSQLParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#tableSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSelect(RestrictedSQLParser.TableSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(RestrictedSQLParser.ConditionContext ctx);
}