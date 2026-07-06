/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l2;

/**
 *
 * @author limis
 */
public class TestResultMain {
     public static void main(String[] args){
        System.out.println(TestResult.getP1Weighting());
        TestResult tr1 = new TestResult ("s1", 50, 50);
        TestResult tr2 = new TestResult ("s2", 30, 50);
        // Call instances methods
        System.out.println(tr1.getOverallScore());
        System.out.println(tr2.getOverallScore());
        
        
        //Printing instances
        System.out.println(tr1);
        System.out.println(tr2);
        
        
        // Change the weightings
        TestResult.setWeightings(0.4, 0.6);
        System.out.println(TestResult.getP1Weighting());
    }
}
