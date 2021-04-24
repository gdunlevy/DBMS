// Generated from C:/Users/Andrew/DBMS/RDBMS\RestrictedSQL.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link RestrictedSQLParser#colSel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColSel(RestrictedSQLParser.ColSelContext ctx);
	/**
	 * Visit a parse tree produced by {@link RestrictedSQLParser#tableCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableCommand(RestrictedSQLParser.TableCommandContext ctx);
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