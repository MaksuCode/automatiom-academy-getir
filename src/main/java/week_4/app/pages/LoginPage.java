package week_4.app.pages;

import java.util.Scanner;

public class LoginPage extends Page{

    private int maxRetry = 3;

    public LoginPage(Scanner scanner) {
        super(scanner);
        System.out.println("Please enter your username : ");
        this.user.setUsername(scanner.nextLine());
        System.out.println("Please enter your password : ");
        this.user.setPassword(scanner.nextLine());
        System.out.println("-----------------------------");
    }

    public Page startApp(){
        if (this.user.getUsername().equals(manager.getProperty("username")) && this.user.getPassword().equals(manager.getProperty("password"))) {
            return new LandingPage(scanner);
        }else{
            System.out.println("Username or password is not correct! " );
            return new ExitPage(scanner);
        }
    }

}
