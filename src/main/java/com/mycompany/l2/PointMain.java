
package com.mycompany.l2;


public class PointMain {

    public static void main(String[] args) {
        //testPoint();
        comparePoint();
        compareArray();
    }

    public static void testPoint() {
        Point p1 = new Point(10, 20);
        Point p2 = new Point();
        System.out.println(p1);
        System.out.println(p2);
        Point p3 = new Point(20, 50);
        System.out.println(p1.getDistance());
        System.out.println(p1.getDistance(p3));

    }

    public static void compareArray() {
        Point[] a1 = {new Point(1, 1), new Point(2, 2)};
        Point[] a2 = {new Point(1, 1), new Point(2, 2)};
    }

    public static void comparePoint() {
        Point p1 = new Point(10, 10);
        Point p2 = new Point(10, 10);
        Point p3 = p2;
        // Comparing Point instances
        System.out.println(p1 == p2); // False
        System.out.println(p2 == p3); // True

        // But...
        Point dummy = null;
        // ...
        System.out.println(p1.equals(dummy)); // false

        System.out.println(p1.equals(p2)); // true
        System.out.println(p2.equals(p1)); // true
        System.out.println(p2.equals(p3)); // true
    }
}

