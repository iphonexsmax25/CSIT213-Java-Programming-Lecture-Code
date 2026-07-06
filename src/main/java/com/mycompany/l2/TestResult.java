/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l2;

/**
 *
 * @author limis
 */
public class TestResult {
    private String ID;
    private double paper1, paper2;
    private static double p1Weighting = 0.3;
    private static double p2Weighting = 0.7;
    public TestResult(String sID, double score1, double score2){
        ID = sID;
        paper1 = score1;
        paper2 = score2;
    }
    // Get Method for a static variable
    public static double getP1Weighting(){
        return p1Weighting;
    }
    //Set method for static variables 
    public static void setWeightings(double pw1, double pw2){
        if (pw1 + pw2 == 1 ){
            p1Weighting = pw1;
            p2Weighting = pw2;
                
        }
        p1Weighting = pw1;
        p2Weighting = pw2;
                
    }
    
    public double getOverallScore(){
        return paper1 * p1Weighting + paper2 * p2Weighting;
    }
    
    public String getGrade(){
        double finalScore = getOverallScore();
        if (finalScore >= 50){
            return "Pass";
        }
        else{
            return "Fail";
        }
    }
    public String toString() {
        return String.format("Test Result: %s %.1f %.1f %.2f %s", ID, paper1, paper2, getOverallScore(),getGrade());
    }
}

