package RDBMS;

import java.io.*;
import java.util.*;

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

    Table getTable(String tableName) {
        int i = findTable(tableName);
        if (i == -1) {
            throw new IllegalArgumentException("ERROR: Table " + tableName + " does not exists in the database.");
        }
        return tablesList.get(i);
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

    void delete(String tableName, Set<String> primaryKeys) {
        int index = findTable(tableName);
        if (index == -1) {
            throw new IllegalArgumentException("ERROR: Table " + tableName + " does not exists in the database.");
        }
        tablesList.get(index).delete(primaryKeys);

    }

    public void export(String fileName) {
        File file = new File(fileName+".txt");

        BufferedWriter bf = null;

        try {
            bf = new BufferedWriter(new FileWriter(file, true));
            for (Table table : tablesList) {
                bf.write(table.toExportString());
                bf.write("#");
                bf.newLine();
            }
            bf.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                //always close the writer
                System.out.println(" Database saved to " + file.getAbsolutePath());
                if (bf != null) {
                    bf.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void load(String filename) {
        try (Scanner s = new Scanner(new File(filename+".txt"))) {
            while (s.hasNextLine()) {
                loadTable(s);
            }
            System.out.println(" Database Loaded");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //always close the writer
    }

    private void loadTable(Scanner s) {
        String title = s.nextLine();
        ArrayList<String> colNames = new ArrayList<>(Arrays.asList(s.nextLine().split(",")));
        Table table = new Table(title, colNames);
        while (s.hasNextLine()) {
            String line = s.nextLine();
            if (line.equals("#"))
                break;
            table.insert(new ArrayList<>(Arrays.asList(line.split(","))));
        }
        tablesList.add(table);
    }


    /*
    public void createIndex(String idx){   
    	
    }

    public void dropIndex(String idx){
    	
    }*/

}
