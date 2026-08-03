public class LabLesson extends Lesson{
    private double equipFee;
    
    public LabLesson(String name, int hours, double hourlyFee,
            double equipFee){
        super(name, hours, hourlyFee);
        this.equipFee = equipFee;
    }
    @Override 
    public double getFacilityFee(){
        System.out.println("LabLesson.getFacilityFee");
        return getHours() * equipFee;
    }
    
}
/*
Instance variables: name, hours, hourlyFee
One additional instance variable: EquipFee her hours
TachingFee - same calculation
FacilityFee - must include EquipFee * hour
*/