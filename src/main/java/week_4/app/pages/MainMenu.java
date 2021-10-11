package week_4.app.pages;
import week_4.maincategories.Breakfast;
import week_4.maincategories.FruitAndVegetable;
import week_4.maincategories.MainCategory;
import week_4.maincategories.Snack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu extends Page {


    public MainMenu(Scanner scanner) {
        super(scanner);
        mainCategories();
        System.out.println("4 - Search a product");
        System.out.println("5 - Go to cart page");
        System.out.println("6 - Back to Landing Page");
        this.selection = scanner.nextLine();
        navigate();
    }

    @Override
    public Page navigate() {
        Page page = new Page(scanner);
        switch (this.selection){
            case "1":
                page = new SubCategoryPage(scanner, "Breakfast");
                break;
            case "2":
                page = new SubCategoryPage(scanner, "FruitAndVegetable");
                break;
            case "3":
                page = new SubCategoryPage(scanner, "Snack");
                break;
            case "4":
                page = new Search(scanner);
                break;
            case "5":
                page = new CartPage(scanner);
                break;
            case "&":
                page = new LandingPage(scanner);
                break;
        }
        return page;
    }

    private void mainCategories(){
        List<MainCategory> mainCategories = new ArrayList<>();
        mainCategories.add(new Breakfast());
        mainCategories.add(new FruitAndVegetable());
        mainCategories.add(new Snack());

        for (int i = 1 ; i <mainCategories.size() + 1; i++){
            System.out.println(i + " - " + mainCategories.get(i -1).getClass().getSimpleName());
        }

    }

}
