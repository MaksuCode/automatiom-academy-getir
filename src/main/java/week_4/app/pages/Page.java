package week_4.app.pages;

import week_4.user.User;
import week_4.util.PropertyManager;

import java.util.Scanner;

public class Page {

    protected String name;
    protected Scanner scanner;
    protected String selection;
    PropertyManager manager;
    protected User user = new User();

    public Page(Scanner scanner){
        manager = new PropertyManager("/Users/mustafaaksu/Desktop/Java Projects/automatin-academy-getir/src/main/resources/testuser.properties");
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
