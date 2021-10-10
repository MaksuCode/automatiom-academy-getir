package week_4.app;

import week_4.app.pages.LoginPage;

import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);
    static LoginPage loginPage;

    public static void main(String[] args) {
        initialize();
    }

    private static void initialize(){
        boolean loop = true;
        loginPage = new LoginPage(sc);
        while (loop){
            loginPage.validateUser();
        }
    }

}
