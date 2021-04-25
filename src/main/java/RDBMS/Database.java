package RDBMS;

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

    Table getTable(String tableName){
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
    
    public void toExportString(String fileName){
        String outputFilePath = " ";

        File file = new File (fileName);

        BufferedWriter bf = null; 

        try{ 
            bf = new BufferedWrited (new FilerWriter(file,new));
            bf.write(Table.toString());
            bf.newLine();
            bf.write("Table end");
            bf.newLine();
            bf.flush();
        }
        catch(IOException e){
                e.printStackTrace();
            }finally{

                try{
                    //always close the writer
                    bf.close();
                }catch(Exception e){}
            }
    }

    /*
    public void createIndex(String idx){   
    	
    }

    public void dropIndex(String idx){
    	
    }*/

}
