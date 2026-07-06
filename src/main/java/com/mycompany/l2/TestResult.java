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
    public static double getP1Weighting(){
        return p1Weighting;
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
    public String toString(){
        return String.format();
    }
}

