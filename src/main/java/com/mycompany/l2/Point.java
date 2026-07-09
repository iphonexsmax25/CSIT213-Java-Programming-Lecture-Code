
package com.mycompany.l2;


public class Point {

    private double x, y;

    public Point() {

    }

    //Constructor
    public Point(double xCoord, double yCoord) {
        x = xCoord;
        y = yCoord;
    }

    public double getDistance() {

        double sumSqq = x * x + y * y;
        return Math.sqrt(sumSqq);
    }

    public double getDistance(Point other) {
        double xDiff = x - other.x;
        double yDiff = y - other.y;
        //x is p1.x
        // other.x is -3.x
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public boolean equals(Point other) {
        if (other == null) {
            return false;
        }
        return (x == other.x && y == other.y);
    }

    public String toString() {
        return String.format("(%.1f,%.1f)", x, y);
    }
}
