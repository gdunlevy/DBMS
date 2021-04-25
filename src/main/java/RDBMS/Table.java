package RDBMS;

import java.util.*;

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

    String getName() {
        return tableName;
    }

    Set<String> primaryKeys(){
        return records.keySet();
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
    }

    void delete(Condition cond)
    {
        Table toDelete = select(cond);
        for(String key : toDelete.primaryKeys()) {
            records.remove(key);
            System.out.println("Record " + key + " removed");
        }
    }

    public Table select(Condition cond, ArrayList<String> colNames) {
        for(String name : colNames){
            if(!columnNames.contains(name)){
                throw new IllegalArgumentException("Column name "+name+" not present in table "+ tableName);
            }
        }
        Table result = new Table("result", colNames);
        ArrayList<String> newRecord;
        for(String key: records.keySet())
        {
            newRecord = new ArrayList<>();
            if(cond.apply(records.get(key).get(cond.getColumnName())))
            {
                for( String col : colNames){
                    newRecord.add(records.get(key).get(col));
                }
                result.insert(newRecord);
            }
        }
        return result;
    }

    public Table select(Condition cond){
        return select(cond,columnNames);
    }
}
