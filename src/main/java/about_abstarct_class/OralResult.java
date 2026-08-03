/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package about_abstarct_class;

/**
 *
 * @author limis
 */
public class OralResult extends Result {
    private double score1, score2, score3;
    public OralResult(String test, String candidate,
            double score1, double score2, double score3){
        super(test, candidate);
        this.score1  = score1;
        this.score2  = score2;
        this.score3  = score3;
    }
    public double getFinalScore(){
        return (score1 + score2 + score3) / 3;
    }
}
