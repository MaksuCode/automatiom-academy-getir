public class SalaryCalculator {

    private double baseSalary ;
    private int totalWorkingHours = 40 ;
    private int extraWorkingWeekDayHours = 0 ;
    private int extraWorkingWeekendHours = 0 ;
    private double hourlyWage ;

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 1000){
            throw new RuntimeException("Base salary must be greater than 1000 €.") ;
        }
        this.baseSalary = baseSalary;
        this.hourlyWage = this.baseSalary / 40 ;
    }

    public int getTotalWorkingHours() {
        return totalWorkingHours;
    }

    public void calculateTotalWorkingHours() {
        totalWorkingHours +=  this.extraWorkingWeekendHours + this.extraWorkingWeekDayHours ;
    }

    public void setTotalWorkingHours(int totalWorkingHours) {
        if (totalWorkingHours <= 0 ){
            totalWorkingHours = 40 ;
        }
        this.totalWorkingHours = totalWorkingHours;
    }

    public void setExtraWorkingWeekDayHours(int extraWorkingWeekDayHours) {
        if (extraWorkingWeekDayHours < 0){
            extraWorkingWeekDayHours = 0 ;
        }
        this.extraWorkingWeekDayHours = extraWorkingWeekDayHours;
    }

    public void setExtraWorkingWeekendHours(int extraWorkingWeekendHours) {
        if (extraWorkingWeekendHours < 0 ){
            extraWorkingWeekendHours = 0 ;
        }
        this.extraWorkingWeekendHours = extraWorkingWeekendHours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double calculateFinalSalary(){
        double finalSalary = 0 ;
        baseSalary = getHourlyWage() * getTotalWorkingHours() ;
        finalSalary = baseSalary + (((extraWorkingWeekDayHours * 1.5) + (extraWorkingWeekendHours * 2)) * getHourlyWage()) ;
        return finalSalary ;
    }
}
