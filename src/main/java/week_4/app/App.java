package week_4.app;

import week_4.app.pages.LoginPage;
import week_4.user.User;

import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);
    static LoginPage loginPage;
    static User user = new User();

    public static void main(String[] args) {
        initialize();
    }

    private static void initialize(){
        boolean loop = true;
        loginPage = new LoginPage(sc);
        while (loop){
            try {
                loginPage.startApp();
            }catch (RuntimeException e){
                System.out.println("Closing app...");
                break;
            }
        }
    }

}
