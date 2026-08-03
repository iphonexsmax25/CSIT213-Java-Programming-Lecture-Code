package about_abstarct_class;


public class WrittenResult extends Result {
    private static double P1_WEIGHT = 0.4;
    private static double P2_WEIGHT = 0.6;
    private double score1, score2;
    
    public WrittenResult(String test, String candidate,  
            double score1, double score2){
        super(test, candidate);
        this.score1 = score1;
        this.score2 = score2;
        
    }
    @Override public double getFinalScore(){
        return(score1 * P1_WEIGHT + score2 * P2_WEIGHT );
    }
    
}
/*
There are 2 papers
Paper weighting is 40%
Paper 2 weighting is 60%
*/