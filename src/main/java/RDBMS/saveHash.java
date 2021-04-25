import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
 
public class WriteHashMapToTextFileExample {
    
    /*** Change the path ***/
    final static String outputFilePath = "datatbase-data.txt";
 
    public void mapFile(TreeMap<String, Map<String,String>> databaseTree){
        //treemap from table class
     
        File file = new File(outputFilePath);
        BufferedWriter bf = null;;
        
        try{
            
            //create new BufferedWriter for the output file
            bf = new BufferedWriter( new FileWriter(file, true) );
            //iterate map entries
            for(Map.Entry<String, Map<String,String>> entry : databaseTree.entrySet()){
                //put key and value separated by a colon
                bf.write( entry.getKey() + ":" + entry.getValue() );
                //new line
                bf.newLine();
            }
            
            bf.flush();
 
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                //always close the writer
                bf.close();
            }catch(Exception e){}
        }
    }//end mapfile
 
    public static void readMapFile(){
      File file = new File(" "); //chose path
      Scanner sc = new Scanner(file);
  
      while (sc.hasNextLine()){
         System.out.println(sc.nextLine());
      }//end while
       
   }//end read
    
} //end class 
    
  
