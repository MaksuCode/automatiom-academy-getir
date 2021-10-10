package week_4.app.pages;

import java.util.Scanner;

public class LoginPage extends Page{

    private int maxRetry = 3;

    public LoginPage(Scanner scanner) {
        super(scanner);
        System.out.println("-----------------------------");
        System.out.println("Please enter your username : ");
        this.user.setUsername(scanner.nextLine());
        System.out.println("Please enter your password : ");
        this.user.setPassword(scanner.nextLine());
        System.out.println("-----------------------------");
    }

    public Page validateUser(){
        if (this.user.getUsername().equals(validUser.getUsername()) && this.user.getPassword().equals(validUser.getPassword())) {
            return new LandingPage(scanner);
        }else{
            System.out.println("Username or password is not correct! " );
            return new ExitPage(scanner);
        }
    }

}
