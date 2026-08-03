/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author limis
 */
public class Test {
    public static void main(String[] args){
//        test1();
//        test2();
        test3();
    }
    public static void test1() {
        Lesson l1 = new Lesson("name1", 3, 100);
        System.out.println(l1);
    }
    public static void test2() {
        Lesson l1 = new Lesson("name1", 3, 100);
        LabLesson lab1 = new LabLesson("name2", 3, 100, 50);
        System.out.println(l1);
        System.out.println(lab1);
    }
    public static void test3() {
        LabLesson lab1 = new LabLesson("name1", 3, 100, 50);
        System.out.println(lab1.getTotalFee());
        // Another example
        Lesson l1 = new LabLesson("name2", 3, 100, 50);
        System.out.println(l1.getTotalFee());
    }
}
