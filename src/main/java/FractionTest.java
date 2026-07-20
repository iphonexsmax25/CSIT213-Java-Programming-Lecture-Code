public class FractionTest {
    public static void main(String[] argv){
        testFraction();
        testEquals();
        testAddMethod();
        Fraction f1 = new Fraction(1, 10);
        changeIntstance(f1);
        System.out.println(f1); // f1 is modified
        Fraction f2 =   new Fraction(1,10);
        changeReference(f2);
        System.out.println(f2);
        
    }
    public static void changeIntstance(Fraction f){
        f.setNumerator(-1);
    }
    public static void changeReference(Fraction f){
        f = new Fraction(-1, -10);
        
    }
    public static void testAddMethod(){
        Fraction f1 = new Fraction(1,10);
        Fraction f2 = new Fraction(2,10);
        Fraction f3 = new Fraction(3,10);
        //
        Fraction sum1 = f1.add(f2);
        System.out.println(sum1);
        System.out.println(f1.add(f3));
        
        //Check that f1, f2 and f3 remain the same
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        
        
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
