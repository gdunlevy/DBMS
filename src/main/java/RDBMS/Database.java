package RDBMS;

import java.io.*;
import java.util.ArrayList;
import java.util.Set;

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
        File file = new File(fileName);

        BufferedWriter bf = null;

        try {
            bf = new BufferedWriter(new FileWriter(file, true));
            for (Table table : tablesList) {
                bf.write(table.toString());
                bf.newLine();
                bf.write("#");
                bf.newLine();
            }
            bf.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                //always close the writer
                if (bf != null) {
                    bf.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

     public void toLoadDatabase(String filename){
        Scanner s = new Scanner(new File(filename));;
	    ArrayList<String> tables = new ArrayList<String>();
        ArrayList<String> columns = new ArrayList<String>();
        ArrayList<String> values = new ArrayList <String>();
        try{
            String message = s.nextLine();
            tables.add(message);
            String msg = s.nextLine();
            columns.add(msg);

            while(s.hasNextLine()) {
                String value = s.nextLine();
                values.add(value);
            }

        }
        catch(IOException e){
                e.printStackTrace();
            }finally{
                try{
                    //always close the writer
                    s.close();
                }catch(Exception e){}
            }  
    }


    /*
    public void createIndex(String idx){   
    	
    }

    public void dropIndex(String idx){
    	
    }*/

}
