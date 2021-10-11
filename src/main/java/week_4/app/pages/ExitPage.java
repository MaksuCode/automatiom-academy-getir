package week_4.app.pages;

import java.util.Scanner;

public class ExitPage extends Page{

    public ExitPage(Scanner scanner) {
        super(scanner);
        System.out.println("----------------------");
        System.out.println("     Bye Bye!     ");
        System.out.println("----------------------");
        throw new RuntimeException("END");
    }

}
