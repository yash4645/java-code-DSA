import java.io.File;
import java.io.*;
public class Folder{
    public static void main(String[] args) {
        
        // File F2 = new File("C:\\Users\\yash4\\OneDrive\\Yash\\Yash1234.txt");
        // F1.mkdir();
        try{
            File F1 = new File("C:\\Users\\yash4\\OneDrive\\Yash\\Yash123");
          boolean check= F1.createNewFile();
          System.out.println(check);
          File [] a= F1.listFiles();
          
          for(File s:a){
            if(s.isFile()){
                // System.out.println(s.getName());
                String str=s.getName();
                int dot=str.lastIndexOf(".");
                String abc=str.substring(dot+1);
                if(abc.equals("txt"))
                System.out.println(s.getName());  
            }
            if(s.isDirectory())
            System.out.println(s.getName());
          }
        }
        catch(IOException e){
            System.out.println("file is already exist");
   }
   catch(NullPointerException e){
    System.out.println("empty elements");
   }
        // F1.delete(); 
    }
}
