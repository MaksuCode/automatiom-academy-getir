import java.util.Random;

public class Dice {

    public int roll(){
        Random random = new Random()  ;
        return random.nextInt(6) + 1 ;
    }

    public static void main(String[] args) {

        int totalEarning = 0 ;
        int number = 0 ;
        int count = 0 ;
        boolean rollingEnabled = true ;
        Dice dice = new Dice();

        while (rollingEnabled) {
            number = dice.roll() ;
            count += 1 ;
            System.out.println(count + ". roll : " + number);
            if (number == 1 || number == 2){
                rollingEnabled = false ;
                System.out.println("Game is over!");
            }else if (number == 4 || number == 5 || number == 6){
                totalEarning += number ;
                System.out.println("You earned " + number + " $");
            }
            if (totalEarning >= 50) {
                rollingEnabled = false ;
                System.out.println("You have earned the maximum amount of money you can earn!");
            }
        }

        System.out.println("--------------------------------");
        System.out.println("Total earning : " + totalEarning);

    }
}
