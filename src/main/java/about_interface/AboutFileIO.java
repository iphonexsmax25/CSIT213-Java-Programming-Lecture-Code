package about_interface;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;




public class AboutFileIO {
    public static void main(String[] argv){
        String filename = "invoice.txt";
        Scanner reader = null;
        try{
            reader = new Scanner(new File(filename));
            while(reader.hasNext()){
                String oneLine = reader.nextLine();
                System.out.println(oneLine);
            }
        }
        catch(FileNotFoundException err){
            System.out.println(err);
        }
        finally{
            if (reader != null)
                reader.close();
        }
    }
    
}
