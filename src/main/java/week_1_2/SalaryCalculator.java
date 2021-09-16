package week_1_2;

import java.util.Scanner;

public class SalaryCalculator {

    private double baseSalary ;
    private int totalWorkingHours = 0 ;
    private int workingWeekdayHours = 0 ;
    private int workingWeekendHours = 0 ;
    private double hourlyWage ;
    private int years ;
    static Scanner scanner = new Scanner(System.in) ;

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 1000){
            throw new RuntimeException("Base salary must be greater than 1000 €.") ;
        }
        this.baseSalary = baseSalary;
        this.hourlyWage = this.baseSalary / 40 ;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void calculateTotalWorkingHours() {
        totalWorkingHours +=  this.workingWeekendHours + this.workingWeekdayHours;
    }

    public void setWorkingWeekdayHours(int workingWeekdayHours) {
        if (workingWeekdayHours < 0){
            workingWeekdayHours = 0 ;
        }
        this.workingWeekdayHours = workingWeekdayHours;
    }

    public void setWorkingWeekendHours(int workingWeekendHours) {
        if (workingWeekendHours < 0 ){
            workingWeekendHours = 0 ;
        }
        this.workingWeekendHours = workingWeekendHours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double calculateFinalSalary(){
        double finalSalary = this.baseSalary ;
        double extraMoneyForWeekend = 0 ;
        double extraMoneyForWeekday = 0 ;
        // TODO: 14.09.2021 Fix logic here.
        return 0 ;
    }

    public void setYears(int years) {
        if(years < 0){
            years = 0 ;
        }
        this.years = years;
    }

    public int getYears() {
        return years;
    }

    /*
     Calculates the final base salary after the yearly increase is made.
     */
    public void calculateBaseSalaryAfterYearlyIncrease(){
        double increase;
        // Setting the limit as 5 for years bigger than 5. This makes code much more easy.
        if (years > 5){
            years = 5 ;
        }
        // Basically calculating the increase. This formula would apply to every "year" value.
        increase = baseSalary * years * (0.05) ;
        // Adding increase to baseSalary.
        this.baseSalary += increase ;
    }

    public static void main(String[] args) {

        week_1_2.SalaryCalculator calculator = new week_1_2.SalaryCalculator() ;
        // Requesting user's base salary and setting it to "baseSalary" variable.
        System.out.println("Please enter your base salary : ");
        calculator.setBaseSalary(scanner.nextInt());
        // Requesting user's count of working years and setting it to "years" variable.
        System.out.println("For how many years have you been working for the company : ");
        calculator.setYears(scanner.nextInt());
        // Calling "calculateBaseSalaryAfterYearlyIncrease" method to calculate final base salary.
        calculator.calculateBaseSalaryAfterYearlyIncrease();
        // Printing out the result.
        System.out.println("Your base salary after increase is : " + calculator.getBaseSalary());

    }


}
