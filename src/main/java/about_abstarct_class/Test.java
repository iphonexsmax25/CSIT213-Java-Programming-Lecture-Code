package about_abstarct_class;


public class Test {
    public static void main(String[] args){
        test1();
        test2();
    }
    public static void test2(){
        
        DemoSub s = new DemoSub(10);
        System.out.println(s.getValue());
        System.out.println(s);
        
    }
    public static void test1(){
        // DemoBase a = new DemoBase(10); //Error
    }
}
