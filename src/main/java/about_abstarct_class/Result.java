
package about_abstarct_class;


public abstract class Result {
    private String test;
    private String candidate;
    public Result(String test, String candidate){
        this.test = test;
        this.candidate = candidate;
    }
    public String getTest(){
        return test;
    }
    public String getCandidate(){
        return candidate;
    }
    public abstract double getFinalScore();
    public String getGrade(){
        double finalScore = getFinalScore();
        if (finalScore >= 50 )
            return "Pass";
        else 
            return "Fail";
    }
    public String toString(){
        String className = this.getClass().getSimpleName();
        return String.format(" %s %s  %s %.1f %sS",className, test, candidate, getFinalScore(), getGrade());
    }
}
