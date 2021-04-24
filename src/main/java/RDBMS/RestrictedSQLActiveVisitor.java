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

}