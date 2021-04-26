package RDBMS;

import gen.RestrictedSQLBaseVisitor;
import gen.RestrictedSQLParser;

import java.util.ArrayList;

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
        ArrayList<String> InsertValues = new ArrayList<>();
        try {
            for (RestrictedSQLParser.RecordContext record : ctx.record()) {
                InsertValues = new ArrayList<>();
                for (RestrictedSQLParser.ValuesContext val : record.values()) {
                    InsertValues.add(val.getText());
                }
                database.insert(ctx.tableSelect().getText(), InsertValues);
                System.out.println("Values " + InsertValues + " were inserted");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitDeleteQuery(RestrictedSQLParser.DeleteQueryContext ctx) {
        ConditionVistor conditionVistor = new ConditionVistor(database, database.getTable(ctx.tableSelect().getText()));
        Table result = conditionVistor.visitWhereCond(ctx.whereCond());
        database.delete(ctx.tableSelect().getText(), result.primaryKeys());
        return visitChildren(ctx);
    }

    @Override
    public Object visitSelectQuery(RestrictedSQLParser.SelectQueryContext ctx) {
        ConditionVistor conditionVistor = new ConditionVistor(database, database.getTable(ctx.tableSelect().getText()));
        Table result;
        if(ctx.whereCond() != null) {
             result = conditionVistor.visitWhereCond(ctx.whereCond());
        }else{
            result = database.getTable(ctx.tableSelect().getText());
        }
        ArrayList<String> colNames = new ArrayList<>();
        for (RestrictedSQLParser.ColSelContext col : ctx.colSel()) {
            colNames.add(col.getText());
        }
        System.out.println(result.select(colNames));

        return super.visitSelectQuery(ctx);
    }

    @Override
    public Object visitSaveFile(RestrictedSQLParser.SaveFileContext ctx) {
        String filename = ctx.ID().getText();
        database.export(filename);
        return visitChildren(ctx);
    }

    @Override
    public Object visitLoadFile(RestrictedSQLParser.LoadFileContext ctx) {
        String filename = ctx.ID().getText();
        try {
            database.load(filename);
        } catch (Exception e) {
            System.out.println(e);
        }
        return visitChildren(ctx);
    }

}
