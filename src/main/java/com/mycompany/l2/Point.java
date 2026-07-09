/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l2;

/**
 *
 * @author limis
 */
public class Point {
    private double x, y;
    
    public Point(){
        x = 1;// just an example
        y = 1;
    }
    
    public Point(double xCoord, double yCoord){
        x = xCoord;
        y = yCoord;
    }
    
    public double getDistance(){
        double sumSq = x * x + y * y;
        return Math.sqrt(sumSq);
    }
    
    public double getDistance(Point other){
        double xDiff = x - other.x;
        double yDiff = y - other.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    
    public boolean equals(Object other){
        if(other == null){
            return false;
        }
        if (other instanceof Point == false){
            return false;
        }
        // Casting is needed to cast other to Point
        Point that = (Point) other;
        return(this.x == that.x && y== that.y);
    }
    
    public String toString(){
        return String.format("(%.1f,%.1f_", x, y);
    }
        
}
