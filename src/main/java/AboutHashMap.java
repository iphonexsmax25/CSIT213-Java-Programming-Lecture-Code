import java.util.HashMap;
import java.util.ArrayList;

public class AboutHashMap {
    public static void main (String[] args){
        test1();
        test2();
        test3();
        
    }
    public static void test3(){
        HashMap<String, ArrayList<Product>> productByCat = new HashMap<>();
        ArrayList<Product> sample = getSample();
        for (Product p : sample){
            String category = p.getCategoary();
            if (productByCat.containsKey(category)){
                ArrayList<Product> currentList = productByCat.get(category);
                currentList.add(p);
            } else{
                // New  entry
                ArrayList<Product> newList = new ArrayList<>();
                newList.add(p);
                productByCat.put(category, newList);
            }
        }
        //Access the Product instances in the HashMap
        for(String category : productByCat.keySet()){
            System.out.println(category);
            ArrayList<Product> prods = productByCat.get(category);
            for (Product p : prods){
                System.out.println(p);
            }
        }
        
    }
    public static void test2(){
        HashMap<String, Product> products = new HashMap<>();
        for (Product p :getSample()){
            products.put(p.getCode(), p);
        }
        //Get all the keys
        for (String pCode : products.keySet()){
            System.out.println(pCode);
        }
        for ( Product p : products.values()){
            System.out.println(p);
            
        }
        // USe the key (String) to get the value (Product Instance)
        for (String pCode : products.keySet()){
            Product prod = products.get(pCode);
            System.out.println(pCode + " " + prod);
        }
        
    }
    public static ArrayList<Product> getSample(){
        ArrayList<Product> sample = new ArrayList<>();
        sample.add(new Product ("p1" , "name 1", "cat 1", 10));
        sample.add(new Product ("p2" , "name 2", "cat 2", 10));
        sample.add(new Product ("p3" , "name 3", "cat 3", 10));
        sample.add(new Product ("p4" , "name 4", "cat 1", 10));
        sample.add(new Product ("p5" , "name 5", "cat 2", 10));
        sample.add(new Product ("p6" , "name 6", "cat 3", 10));
        sample.add(new Product ("p7" , "name 7", "cat 4", 10));
        return sample;
        
    }
    public static void test1(){
        HashMap<String, Integer> enrolment = new HashMap<>();
        enrolment.put("CSIT121", 280);
        enrolment.put("CSIT128", 150);
        enrolment.put("CSIT213", 250);
        enrolment.put("CSIT121", 300); // replace original value
        // Accessing HashMap
        for(String modCode : enrolment.keySet()){
            System.out.println(modCode);
        }
        for(int classSize : enrolment.values()){
            System.out.println(classSize);
        }
        // USe th key to get the value
        for(String modCode : enrolment.keySet()){
            System.out.println(modCode + " " + enrolment.get(modCode));
        }
    }
    
}