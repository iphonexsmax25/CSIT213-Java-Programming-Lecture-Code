import java.util.ArrayList;
public class AboutArrayList {
    public static void main (String[] args){
        test1();
    }
    
    public static void test1(){
        ArrayList aList = new ArrayList();
        System.out.println(aList.size()); // 0
        aList.add("first item");
        aList.add(123);
        aList.add(12.34);
        aList.add(false);
        System.out.println(aList.size()); // 4
        
        // Use the get method + loop
        for(int i = 0;i < aList.size(); i++){
            
        }
    }
}
