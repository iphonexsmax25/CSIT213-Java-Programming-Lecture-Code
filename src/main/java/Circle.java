/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author limis
 */
public class Circle {
    private double  radius;
    public Circle (double radius){
        this.radius =radius;
    }
    public double  getRadius(){
        return radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public String toString(){
        return String.format("Circle %.1f %.1f", radius, getArea());
    }
}
