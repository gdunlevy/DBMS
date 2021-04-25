package RDBMS;

import gen.RestrictedSQLBaseVisitor;
import gen.RestrictedSQLParser;

public class ConditionVistor extends RestrictedSQLBaseVisitor {

    Database database;
    Table mainTable;

    ConditionVistor(Database database, Table mainTable) {
        this.database = database;
        this.mainTable = mainTable;
    }

    @Override
    public Table visitWhereCond(RestrictedSQLParser.WhereCondContext ctx) {
        return (Table) visitChildren(ctx);
    }

    @Override
    public Table visitConditionList(RestrictedSQLParser.ConditionListContext ctx) {
        return (Table) visitChildren(ctx);
    }

    @Override
    public Object visitOrCond(RestrictedSQLParser.OrCondContext ctx) {
        Table left = (Table) visitLeft(ctx.left());
        Table right = (Table) visitRight(ctx.right());
        return left.orCombine(right);
    }

    @Override
    public Object visitAndCond(RestrictedSQLParser.AndCondContext ctx) {
        Table left = (Table) visitLeft(ctx.left());
        Table right = (Table) visitRight(ctx.right());
        return left.andCombine(right);
    }

    @Override
    public Table visitCondition(RestrictedSQLParser.ConditionContext ctx) {
        return (Table) visitChildren(ctx);
    }

    @Override
    public Table visitEqual(RestrictedSQLParser.EqualContext ctx) {
        return mainTable.select(new Condition(Condition.Operation.EQUAL, ctx.colSel().getText(), ctx.ID().getText()));
    }

    @Override
    public Table visitNteq(RestrictedSQLParser.NteqContext ctx) {
        return mainTable.select(new Condition(Condition.Operation.NOT_EQUAL, ctx.colSel().getText(), ctx.ID().getText()));
    }

    @Override
    public Table visitGreater(RestrictedSQLParser.GreaterContext ctx) {
        return mainTable.select(new Condition(Condition.Operation.GREATER_THAN, ctx.colSel().getText(), ctx.ID().getText()));
    }

    @Override
    public Table visitGteg(RestrictedSQLParser.GtegContext ctx) {
        return mainTable.select(new Condition(Condition.Operation.EQ_GREATER_THAN, ctx.colSel().getText(), ctx.ID().getText()));
    }

    @Override
    public Table visitLess(RestrictedSQLParser.LessContext ctx) {
        return mainTable.select(new Condition(Condition.Operation.LESS_THAN, ctx.colSel().getText(), ctx.ID().getText()));
    }

    @Override
    public Table visitLteq(RestrictedSQLParser.LteqContext ctx) {
        return mainTable.select(new Condition(Condition.Operation.EQ_LESS_THAN, ctx.colSel().getText(), ctx.ID().getText()));
    }

}
