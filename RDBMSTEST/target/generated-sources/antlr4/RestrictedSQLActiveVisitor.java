import java.util.ArrayList;

public class RestrictedSQLActiveVisitor extends RestrictedSQLBaseVisitor {

    private Database database;

    public RestrictedSQLActiveVisitor(Database database){
        this.database = database;
    }

    public Object visitCreateTable(RestrictedSQLParser.CreateTableContext ctx) {
        ArrayList<String> colNames = new ArrayList<>();
        for (RestrictedSQLParser.ColSelContext col : ctx.colSel()) {
            colNames.add(col.getText());
            
        }
        try {
            database.createTable(ctx.tableSelect().getText(), colNames);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    public Object visitDropTable(RestrictedSQLParser.DropTableContext ctx){
        try{
        database.dropTable(ctx.tableSelect().getText());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

}