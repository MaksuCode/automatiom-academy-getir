package week_4.app.pages;

import week_4.util.PropertyManager;

import java.util.Scanner;

public class CartPage extends Page {

    // TODO: 11.10.2021 Get data from properties file and update it

    PropertyManager manager;

    public CartPage(Scanner scanner) {
        super(scanner);
        manager = new PropertyManager("/Users/mustafaaksu/Desktop/Java Projects/automatin-academy-getir/src/main/resources/cart.properties");
        getProducts();
    }

    public void getProducts(){
        manager.getProperty("");

    }
}
