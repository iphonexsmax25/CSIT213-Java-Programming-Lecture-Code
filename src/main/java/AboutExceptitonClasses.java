import java.util.Scanner;
import java.util.InputMismatchException;


public class AboutExceptitonClasses {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        try {
            System.out.println("Enter an integer");
            int size = reader.nextInt(); 
            int[] sample = new int[size];
            sample[10] = 10;
            System.out.println("Enter another Integer");
            int divisor = reader.nextInt();
            System.out.println(sample[10]/ divisor);
        }
        catch(ArithmeticException err){
            System.out.println(err);
        }
        catch(ArrayIndexOutOfBoundsException err){
            System.out.println(err);
        }
        catch(NegativeArraySizeException err){
            System.out.println(err);
        }
        catch(InputMismatchException err){
            System.out.println(err);
        
        }
        
        System.out.println("End of Main");
        
    }
    
}
