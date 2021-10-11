package week_4.app.pages;

import week_4.user.User;

import java.util.Scanner;

public class Page {

    protected String name;
    protected Scanner scanner;
    protected User user = new User();
    protected User validUser = new User("1" ,"1" ,"555666777","test_adres");
    protected String selection;

    public Page(Scanner scanner){
        if (!this.getClass().getSimpleName().equals("Page")){
            System.out.println("      " + this.getClass().getSimpleName() + "     ");
            System.out.println("-----------------------------");
        }
        this.scanner = scanner;
    }

    public Page navigate(){
        return new Page(scanner);
    }

}
