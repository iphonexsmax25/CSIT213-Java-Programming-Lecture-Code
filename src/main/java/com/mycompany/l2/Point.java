
package com.mycompany.l2;


public class Point {
    private double x, y;
    public Point(){
        x = 1;
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
    
    //p1.getDisance(p3)
     public double getDistance(Point other){
         double xDiff = x - other.x;
         double yDiff = y - other.y;
         return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
     
     public boolean equals(Point other) {
        if (other == null) {
            return false;
        }
        return (x == other.x && y == other.y);
    }
    
    public String toString(){
        return String.format("(%.1f,  %.1f)", x, y);
    }
    
}
