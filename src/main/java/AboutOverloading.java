public class AboutOverloading {
    public static void main (String[] args){
        test(1.234);
        test(100);
    }
    public static void test(double value){
        System.out.println("test(double) " + value);
    }
    
}
