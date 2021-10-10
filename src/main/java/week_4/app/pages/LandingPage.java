package week_4.app.pages;

import java.util.Scanner;

public class LandingPage extends Page {

    public LandingPage(Scanner scanner) {
        super(scanner);
        System.out.println("    Welcome to Getir!    ");
        System.out.println("------------------------");
        System.out.println("1 - Main Menu");
        System.out.println("2 - Search");
        System.out.println("3 - Profile");
        System.out.println("4 - Exit");
        System.out.println("-------------------------");
        this.selection = scanner.nextLine();
        direct();
    }

    @Override
    public Page direct(){
        Page page ;
        switch (this.selection){
            case "1" :
                 page = new MainMenu(scanner);
                 break;
            case "2" :
                 page = new Search(scanner);
                 break;
            case "3" :
                page = new Profile(scanner);
                break;
            case "4" :
                page = new ExitPage(scanner);
                break;
            default:
                page = new LandingPage(scanner);
        }
        return page;
    }

}
