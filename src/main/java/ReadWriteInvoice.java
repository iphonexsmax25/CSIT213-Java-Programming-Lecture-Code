import java.util.*;
import java.io.*;

public class ReadWriteInvoice {
    public static void main (String[] args){
        readInvoice("InvoiceData.txt");
    } 
    public static void writeInvoie(ArrayList<invoice){
        
    }
    public static void readInvoice(String filename){
        ArrayList<Invoice> data = new ArrayList<>();
        Scanner reader = null;
        try{
            reader = new Scanner(new File(filename));
            while (reader.hasNext()){
                String oneLine = reader.nextLine();
                String[] values = oneLine.split(",");
                try{
                    int hours = Integer.parseInt(values[1]);
                    double rate = Double.parseDouble(values[2]);
                    if(hours <= 0 || rate <= 0){
                        // Throw Exception to interuptn this iteration
                        throw new InvoiceDataException("Hours and Rate must be greater than 0");
                        
                    }
                    Invoice newInvoice = new Invoice(values[0], hours, rate);
                    if (data.contains(newInvoice)){
                        throw new InvoiceDataException("Duplicate instance");
                        
                      // OK, add to ArrayList
                      data.add(newInvoice);
                    }
                        
                }
                catch(NumberFormatException | InvoiceDataException err){
                    System.out.printf(" [%s] %s\n",  oneLine, err);
                    
                }
                
            }
            //After while loop
            for(Invoice inv : data){
                System.out.println(inv);
                // Call writeInvoice to save to another life
                writeInvoice(data,  "InvoiceData.txt");
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
