import java.util.*;

class Table {

    private String tableName;
    private ArrayList<String> columnNames;
    private BTree records;

    ///this is probly bad design here leave for now
    private int keyindex;

    /**
     * hold data in btree
     * accessable through Database class methods
     */
    public Table(String name, ArrayList<String> columnNames) {
        this.tableName = name;
        this.columnNames = columnNames;
        this.records = new BTree(); //doesn't like this at all. It wants a btree class or package i think 
        keyindex = 0;
    }

    public String getName() {
        return tableName;
    }


    public void insert(ArrayList<Map<String, Object>> data) {
        /**
         *
         */
        for (Map<String, Object> record : data) {
            if (record.keySet() != null) ; //not sure if this is what you wanted to do
        }
        records.put(++keyindex, data); //changed key to keyindex
    }

    public static void delete(int index) {
        //remove table name from the tree
    }

    public void select() {
    }
}

