/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package about_interface;

/**
 *
 * @author limis
 */
public class Test {
    public static void main(String[] args) {
       DemoA a =new DemoA();
       a.doWork();
       // what instanceis it 
       DemoI ref = new DemoA();
       ref.doWork();
       
       ref = new DemoB();
       ref.doWork();
       
       // Not applucable to class DemoC
       DemoC c = new DemoC();
       c.doWork();
    // ref = c; // Error
       
       // Calling Method do something
       doSomething(a);
       doSomething(new DemoB());
       // doSomething(c); // Error
    }
    public static void doSomething(DemoI what){
       what.doWork();
    }
    
}
