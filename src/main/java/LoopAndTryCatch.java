import java.util.Scanner;
import java.util.InputMismatchException;



public class LoopAndTryCatch {
    public static void main(String[] args){
       // test1();
        test2();
        
    }
    public static void test1(){
        Scanner reader = new Scanner(System.in);
        try{
            int total = 0;
            while (true){
                System.out.println("Enter an Integer");
                int num = reader.nextInt();
                if(num < 0)
                    break;
                total += num;
            }
            //After loop 
            System.out.println(total);
        }
        catch(InputMismatchException err){
            System.out.println(err);
        }
    }
    
    public static void test2(){
        Scanner reader = new Scanner(System.in);
        int total = 0;
        while(true){
            try{
                System.out.println("Integer?");
                int num = reader.nextInt();
                if(num < 0)
                    break;
                total += num;
                            
                
            }
            catch(InputMismatchException err){
                System.out.println(err); 
                reader.nextLine(); // Get rid of the  input
            }
        }
        System.out.println(total); //AFter while loop     
    }
    
}
//  10<enter>  abc<enter>
