import java.util.*;
import java.io.*;

public class ReadWriteInvoice {
    public static void main (String[] args){
        readInvoice("InvoiceData.txt");
    } 
    public static void readInvoice(String filename){
        ArrayList<Invoice> data = new ArrayList<>();
        Scanner reader = null;
        try{
            reader = new Scanner(new File(filename));
            while (reader.hasNext()){
                String oneLine = reader.nextLine();
                System.out.println(oneLine);
            }
        }
        catch(FileNotFoundException err){
            System.out.println(err);
        }
        finally{
            if(reader != null)
                reader.close();
        }
    }
    
}
