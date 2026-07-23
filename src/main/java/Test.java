/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author limis
 */
public class Test {
    public static void main(String[] args){
        test1();
    }
    
    public static void test1(){
        Circle c1 = new Circle(1);
        System.out.println(c1);
        
        
        //Cylinder 
        Cylinder cy1 = new Cylinder(1,10);
        System.out.println(cy1.getRadius());
        System.out.println(cy1.getArea());
        System.out.println(cy1.getVolume());
        System.out.println(cy1);
    } 
}
