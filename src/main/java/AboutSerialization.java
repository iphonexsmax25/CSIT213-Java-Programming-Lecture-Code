import java.util.*;
import java.io.*;



public class AboutSerialization {

    public static void main(String[] args) {
        saveInvoice("invoice_binary.txt");
    }
    public static void saveInvoice(String filename){
        ArrayList<Invoice> data = Invoice.getSample();
        try(ObjectOutputStream writter = 
                new ObjectOutputStream(new FileOutputStream(filename))){
            writter.writeObject(data);
        }
        catch(IOException err){
            System.out.println(err);
        }
    }
}
