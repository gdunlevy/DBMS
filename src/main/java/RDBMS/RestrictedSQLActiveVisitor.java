package RDBMS;

import gen.RestrictedSQLBaseVisitor;
import gen.RestrictedSQLParser;

import java.util.ArrayList;
import java.util.List;

public class RestrictedSQLActiveVisitor extends RestrictedSQLBaseVisitor {

    private Database database;

    public RestrictedSQLActiveVisitor(Database database) {
        this.database = database;
    }

    @Override
    public Object visitCreateTable(RestrictedSQLParser.CreateTableContext ctx) {
        ArrayList<String> colNames = new ArrayList<>();
        for (RestrictedSQLParser.ColSelContext col : ctx.colSel()) {
            colNames.add(col.getText());
        }
        try {
            String name = ctx.tableSelect().getText();
            database.createTable(ctx.tableSelect().getText(), colNames);
            System.out.println("Table " + name + " was created.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitDropTable(RestrictedSQLParser.DropTableContext ctx) {
        try {
            String name = ctx.tableSelect().getText();
            database.dropTable(ctx.tableSelect().getText());
            System.out.println("Table " + name + " was dropped.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitInsertQuery(RestrictedSQLParser.InsertQueryContext ctx) {
        //INSERT INTO TABLE tableSelect VALUES VALUES '('ID (',' ID)* ')'
        ArrayList<String> InsertValues = new ArrayList<>();
        for (RestrictedSQLParser.ValuesContext val : ctx.values()) {
            InsertValues.add(val.getText());
        }
        try {
            database.insert(ctx.tableSelect().getText(), InsertValues);
            System.out.println("Values " + InsertValues + " were inserted");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeleteQuery(RestrictedSQLParser.DeleteQueryContext ctx) {
        List<RestrictedSQLParser.ConditionContext> conditionContext = ctx.whereCond().condition();
        List<Condition> conditions = new ArrayList<>();
        for (RestrictedSQLParser.ConditionContext context : conditionContext) {
            conditions.add((Condition) this.visitCondition(context));
        }

        database.delete(ctx.tableSelect().getText(), conditions.get(0));
        return visitChildren(ctx);
    }

    @Override
    public Object visitSelectQuery(RestrictedSQLParser.SelectQueryContext ctx) {
        List<RestrictedSQLParser.ConditionContext> conditionContext = ctx.whereCond().condition();
        List<Condition> conditions = new ArrayList<>();
        for (RestrictedSQLParser.ConditionContext context : conditionContext) {
            conditions.add((Condition) this.visitCondition(context));
        }
        ArrayList<String> colNames = new ArrayList<>();
        for (RestrictedSQLParser.ColSelContext col : ctx.colSel()) {
            colNames.add(col.getText());
        }
        System.out.println(database.select(ctx.tableSelect().getText(), conditions.get(0), colNames));

        return super.visitSelectQuery(ctx);
    }

    public Object visitEqual(RestrictedSQLParser.EqualContext ctx) {
        return new Condition(Condition.Operation.EQUAL, ctx.colSel().getText(), ctx.ID().getText());
    }

    @Override
    public Object visitGreater(RestrictedSQLParser.GreaterContext ctx) {
        return new Condition(Condition.Operation.GREATER_THAN, ctx.colSel().getText(), ctx.ID().getText());
    }

    @Override
    public Object visitGteg(RestrictedSQLParser.GtegContext ctx) {
        return new Condition(Condition.Operation.EQ_GREATER_THAN, ctx.colSel().getText(), ctx.ID().getText());
    }

    @Override
    public Object visitLess(RestrictedSQLParser.LessContext ctx) {
        return new Condition(Condition.Operation.LESS_THAN, ctx.colSel().getText(), ctx.ID().getText());
    }

    @Override
    public Object visitLteq(RestrictedSQLParser.LteqContext ctx) {
        return new Condition(Condition.Operation.EQ_LESS_THAN, ctx.colSel().getText(), ctx.ID().getText());
    }
}
