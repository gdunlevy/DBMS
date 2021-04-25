package RDBMS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Table {

    private String tableName;
    private ArrayList<String> columnNames;
    private TreeMap<String, Map<String,String>> records;

    /**
     * hold data in btree
     * accessable through Database class methods
     */
    public Table(String name, ArrayList<String> columnNames) {
        this.tableName = name;
        this.columnNames = columnNames;
        this.records = new TreeMap<>();
    }

    public String getName() {
        return tableName;
    }


    public void insert(ArrayList<String> data)
    {
        Map<String, String> record = new HashMap<>();
        // assume
        if (records.containsKey(data.get(0))){
            throw new IllegalArgumentException("Duplicate primary key");
        }
        if (columnNames.size() != data.size()) {
            throw new IllegalArgumentException("Data does not amount of columns");
        }
        for (int i = 0; i < columnNames.size(); i++) {
            record.put(columnNames.get(i), data.get(i));
        }
        records.put(data.get(0), record); //changed key to keyindex
        System.out.println("Record entered");
    }

    public void delete(String primaryKey)
    {
        if(!records.containsKey(primaryKey)){
            throw new IllegalArgumentException("Absent primary key");
        }
        records.remove(primaryKey);
        System.out.println("Record removed");
    }

    public void select() {
    }
}
