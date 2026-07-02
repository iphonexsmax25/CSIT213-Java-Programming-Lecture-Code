/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l1;

/**
 *
 * @author limis
 */
public class SquareTest {
    public static void main(String[] anynameIsFine){
        //Creating instance of Square
       Square s1 = new Square(10);
       Square s2 = new Square(10);
       Square s3 = new Square(20);
        //new is a keyword 
        System.out.println(s1.getArea()); //Calling Instance Method
        System.out.println(s3.getArea());
        
        System.out.println("Testing");
    }
}
