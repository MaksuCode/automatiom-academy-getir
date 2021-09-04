import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in) ;

    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();

        System.out.println("Enter your base salary : ");
        calculator.setBaseSalary(scanner.nextInt());

        System.out.println("Did you work extra hours ? (Y/N) : ");
        String  yesOrNo = scanner.next() ;

        if (yesOrNo.equalsIgnoreCase("Y")){
            System.out.println("How many extra hours did you work in weekdays ? : ");
            calculator.setExtraWorkingWeekDayHours(scanner.nextInt());
            System.out.println("How many extra hours did you work in weekends ? : ");
            calculator.setExtraWorkingWeekendHours(scanner.nextInt());
        }else if (yesOrNo.equalsIgnoreCase("N")){
            System.out.println("Did you work below 40 hours ? (Y/N) : ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Y")){
                System.out.println("How many hours did you work ? : ");
                calculator.setTotalWorkingHours(scanner.nextInt());
            }
        }

        scanner.close();

        calculator.calculateTotalWorkingHours();
        System.out.println("You worked " + calculator.getTotalWorkingHours() + " hours and earned " + calculator.calculateFinalSalary() + " €");

    }

}
