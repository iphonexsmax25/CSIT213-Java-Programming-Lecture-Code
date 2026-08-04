package about_interface;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;




public class AboutFileIO {
    public static void main(String[] argv){
        ArrayList<Invoice> data = new ArrayList<>();
        String filename = "invoice.txt";
        Scanner reader = null;
        try{
            reader = new Scanner(new File(filename));
            while(reader.hasNext()){
                String oneLine = reader.nextLine();
                String[] values = oneLine.split(",");
                // Conversion
                int hours = Integer.parseInt(values[1]);
                double rate  = Double.parseDouble(values[2]);
                // Create instance and add to ArrayList
                data.add(new Invoice(values[0], hours, rate));
            }
            //After while loop
            for(Invoice inv :data)
                System.out.println(inv);
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
