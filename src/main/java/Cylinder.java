/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author limis
 */
public class Cylinder extends Circle{
    private double height;
    
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    
    @Override
    public double getArea(){
        double topBottom = 2 * super.getArea();
        double body = height * getCircumference();
        return topBottom + body;
    }
    public double getVolume(){
        return height * getArea();
    }
    
    @Override
    public String toString(){
        return String.format("Cylinder %.1f %.1f %.1f", height, getArea(), getVolume());
    }
    
}
