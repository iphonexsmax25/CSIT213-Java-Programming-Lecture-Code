/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author limis
 */
public class Lesson {
    private static double FACILITY_FEE = 20;
    private String name;
    private int hours;
    private double hourlyFee;
    
    public Lesson(String name, int hours, double hourlyFee){
        this.name = name;
        this.hours = hours;
        this.hourlyFee = hourlyFee;
    }
    public int getHours(){
        return hours;
    }
    public double getTeachingFee(){
        return hours * hourlyFee;
    }
    public double getFacilityFee(){
        return hours * FACILITY_FEE; 
    }
    public double getTotalFee(){
        System.out.println("Lesson.getTotal");
        return getTeachingFee() + getFacilityFee();
    }
    public String toString(){
        return String.format("%s %d $%.2f ", name, hours, getTotalFee());
    }
}
