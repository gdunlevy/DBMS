package RDBMS;

import java.util.ArrayList;

public class Database {

    private ArrayList<Table> tablesList = new ArrayList<>();

    /**
     * hold the tables.
     * <p>
     * parsed statements interact with this classes public methods.   RestrictedSQLBaseListener
     */

    private int findTable(String name) {
        for (int i = 0; i < tablesList.size(); i++) {
            if (tablesList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    void createTable(String name, ArrayList<String> columnNames) {
        int index = findTable(name);
        if (index != -1) {
            throw new IllegalArgumentException("ERROR: Table " + name + " already exists in the database.");
        }
        tablesList.add(new Table(name, columnNames));
        System.out.println("Table " + name + " has been added to database.");
        System.out.println("The columns associated with Table " + name + " are: " + columnNames);
    }


    void dropTable(String name) {
        int index = findTable(name);
        if (index == -1) {
            throw new IllegalArgumentException("ERROR: Table " + name + " does not exists in the database.");
        }
        tablesList.remove(index);
        System.out.println("Table " + name + " has been dropped from database.");

    }

    void insert(String tableName, ArrayList<String> data) {
        int index = findTable(tableName);
        if (index == -1) {
            throw new IllegalArgumentException("ERROR: Table " + tableName + " does not exists in the database.");
        }
        tablesList.get(index).insert(data);
    }

    void delete(String tableName, Condition cond) {
        int index = findTable(tableName);
        if (index == -1) {
            throw new IllegalArgumentException("ERROR: Table " + tableName + " does not exists in the database.");
        }
        tablesList.get(index).delete(cond);

    }



    public Table select(String tableName, Condition cond, ArrayList<String> colNames) {
        int index = findTable(tableName);
        if (index == -1) {
            throw new IllegalArgumentException("ERROR: Table " + tableName + " does not exists in the database.");
        }
        return tablesList.get(index).select(cond,colNames);
    }

    /*
    public void createIndex(String idx){   
    	
    }

    public void dropIndex(String idx){
    	
    }*/

}
