package RDBMS;

import java.util.*;

class Table {

    private String tableName;
    private ArrayList<String> columnNames;
    private TreeMap<String, Map<String, String>> records;

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

    Set<String> primaryKeys() {
        return records.keySet();
    }

    Map<String, String> getRecord(String key) {
        return records.get(key);
    }

    public void insert(ArrayList<String> data) {
        Map<String, String> record = new HashMap<>();
        // assume
        if (records.containsKey(data.get(0))) {
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

    void delete(Set<String> primaryKeys) {
        for (String key : primaryKeys) {
            records.remove(key);
            System.out.println("Record " + key + " removed");
        }
    }

    public Table select(Condition cond, ArrayList<String> colNames) {
        for (String name : colNames) {
            if (!columnNames.contains(name)) {
                throw new IllegalArgumentException("Column name " + name + " not present in table " + tableName);
            }
        }
        Table result = new Table("result", colNames);
        ArrayList<String> newRecord;
        for (String key : records.keySet()) {
            newRecord = new ArrayList<>();
            if (cond.apply(records.get(key).get(cond.getColumnName()))) {
                for (String col : colNames) {
                    newRecord.add(records.get(key).get(col));
                }
                result.insert(newRecord);
            }
        }
        return result;
    }

    Table select(ArrayList<String> colNames) {
        for (String name : colNames) {
            if (!columnNames.contains(name)) {
                throw new IllegalArgumentException("Column name " + name + " not present in table " + tableName);
            }
        }
        Table result = new Table("result", colNames);
        ArrayList<String> newRecord;
        for (String key : records.keySet()) {
            newRecord = new ArrayList<>();
            for (String col : colNames) {
                newRecord.add(records.get(key).get(col));
            }
            result.insert(newRecord);
        }
        return result;
    }

    Table select(Condition cond) {
        return select(cond, columnNames);
    }

    private void insertMap(String key, Map<String, String> record) {
        if (records.containsKey(key)) {
            throw new IllegalArgumentException("Duplicate primary key");
        }
        records.put(key, record);
    }

    Table orCombine(Table other) {
        Table result = new Table(tableName + " or " + other.getName(), columnNames);

        for (String key : other.primaryKeys()) {

            if (!records.containsKey(key)) {
                result.insertMap(key, other.getRecord(key));
            }
        }
        return result;
    }

    Table andCombine(Table other) {
        Table result = new Table(tableName + " and " + other.getName(), columnNames);

        for (String key : other.primaryKeys()) {

            if (records.containsKey(key)) {
                result.insertMap(key, other.getRecord(key));
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(tableName + "\n");
        result.append(columnNames).append("\n");
        for (String key : records.keySet()) {
            for (String columnName : columnNames) {
                result.append(records.get(key).get(columnName)).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }

    Table innerJoin(Table other, JoinCondition condition) {
        ArrayList<String> newColumn = new ArrayList<>();
        columnNames.forEach((name) -> newColumn.add(getName() + "_" + name));
        other.columnNames.forEach((name) -> newColumn.add(other.getName() + "_" + name));
        Table join = new Table(this.tableName + " join " + other.getName(), newColumn);
        ArrayList<String> newRecord;
        for (Map<String, String> record : records.values()) {
            for (Map<String, String> oRecord : other.records.values()) {
                newRecord = new ArrayList<>();
                if (condition.apply(record.get(condition.getLeftColumnName()), oRecord.get(condition.getRightColumnName()))) {
                    newRecord.addAll(record.values());
                    newRecord.addAll(oRecord.values());
                    join.insert(newRecord);
                }
            }

        }


        return join;
    }

}
