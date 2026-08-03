/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package about_abstarct_class;

/**
 *
 * @author limis
 */
public class ResultTest {
    public static void main(String[] argv){
        test1();
    }
    public static void test1(){
        OralResult r1 = new OralResult("test 1", "c1", 60, 60, 60);
        System.out.println(r1.getFinalScore());
        System.out.println(r1.getGrade());
        System.out.println(r1);
    }
}
