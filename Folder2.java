import java.io.File;
import java.io.IOException;

public class Folder2 {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\yash4\\OneDrive\\Desktop\\newFile\\abc.txt");
        try{
            boolean check=f.createNewFile();
            System.out.println(check);
        }
        catch(IOException e){
            System.out.println("invalid");
        }
    }
}
