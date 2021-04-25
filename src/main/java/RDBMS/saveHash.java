import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
 
public class WriteHashMapToTextFileExample {
    
    /*** Change the path ***/
    final static String outputFilePath = "datatbase-data.txt";
 
    public static void mapFile(){
        //treemap from table class

        File file = new File(outputFilePath);
        
        BufferedWriter bf = null;;
        
        try{
            
            //create new BufferedWriter for the output file
            bf = new BufferedWriter( new FileWriter(file) );
            //iterate map entries
            for(Map.Entry<String, Map<String,String>> entry : records.entrySet()){
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
    }
    
}  
    
  