
package about_interface;



public class FracCompare implements ICompare {
    public boolean compare(Object obj1, Object obj2){
        Fraction f1 = (Fraction)obj1;
        Fraction f2 = (Fraction)obj2;
        if (f1.getRatio() > f2.getRatio())
            return true;
        else
            return false;
    }
}
