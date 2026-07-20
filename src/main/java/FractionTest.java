public class FractionTest {
    public static void main(String[] argv){
        testFraction();
        testEquals();
        testAddMethod();
    }
    public static void testAddMethod(){
        Fraction f1 = new Fraction(1,10);
        Fraction f2 = new Fraction(2,10);
        Fraction f3 = new Fraction(3,10);
        //
        Fraction sum1 = f1.add(f2);
        System.out.println(sum1);
        System.out.println(f1.add(f3));
        
    }
    public static void testEquals(){
        Fraction f1 = new Fraction(1, 10);
        Fraction f2 = new Fraction(1, 10);
        Fraction f3 = new Fraction(2, 20);
        System.out.println(f1.equals(f2));
        System.out.println(f2.equals(f3));
        System.out.println(f2.equals("Error"));
        
    }
    public static void testFraction(){
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(1, 10);
        Fraction f3 = new Fraction(1, 0);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
