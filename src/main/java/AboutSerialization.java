import java.util.*;
import java.io.*;



public class AboutSerialization {

    public static void main(String[] args) {
        saveInvoice("invoice_binary.txt");
        readInvoice("invoice_binary.txt");
    }
    public static void readInvoice(String filename){
        try(ObjectInputStream reader =
            new ObjectInputStream(new FileInputStream(filename))){

        @SuppressWarnings("unchecked")
        ArrayList<Invoice> data = (ArrayList<Invoice>) reader.readObject();

        for (Invoice inv : data){
            System.out.println(inv);
        }

    }   catch(ClassNotFoundException | IOException err){
        System.out.println(err);
    }
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
