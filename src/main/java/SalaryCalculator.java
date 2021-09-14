import java.util.Scanner;

public class SalaryCalculator {

    private double baseSalary ;
    private int totalWorkingHours = 0 ;
    private int workingWeekdayHours = 0 ;
    private int workingWeekendHours = 0 ;
    private double hourlyWage ;
    static Scanner scanner = new Scanner(System.in) ;

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 1000){
            throw new RuntimeException("Base salary must be greater than 1000 €.") ;
        }
        this.baseSalary = baseSalary;
        this.hourlyWage = this.baseSalary / 40 ;
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


    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();

        System.out.println("Enter your base salary : ");
        calculator.setBaseSalary(scanner.nextInt());

        System.out.println("How many hours did you work on weekdays ? : ");
        calculator.setWorkingWeekdayHours(scanner.nextInt());

        System.out.println("How many hours did you work on weekends ? : ");
        calculator.setWorkingWeekendHours(scanner.nextInt());

        calculator.calculateTotalWorkingHours();

        System.out.println(calculator.calculateFinalSalary());




    }

    // TODO: 9.09.2021 hafta için 30 saat hafta sonu 20 saat çalıştığı case
    // TODO: 9.09.2021 Ayrıca control tablosuna göre test yaz.

}
