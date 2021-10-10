package week_4.app.pages;

import week_4.maincategories.Breakfast;
import week_4.maincategories.FruitAndVegetable;
import week_4.maincategories.Snack;
import week_4.subcategories.SubCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubCategoryPage extends Page{

    String mainCategoryName ;

    public SubCategoryPage(Scanner scanner , String mainCategoryName) {
        super(scanner);
        this.mainCategoryName = mainCategoryName;
        System.out.println(mainCategoryName);
        subCategories(mainCategoryName);
        System.out.println("0 - Back to Main Menu");
        this.selection = scanner.nextLine();
        navigate();
    }

    @Override
    public Page navigate() {
        Page page = new Page(scanner);
        switch (this.selection){
            case "0":
                page = new MainMenu(scanner);
                break;
            case "1" :
                page = new ProductsPage(scanner, "ChocolateSubCategory"); // TODO: 10.10.2021 test
                break;
            case "2" :

                break;
        }
        return page;
    }



//    private ProductsPage directToProductsPage(String mainCategoryName , String index){
//
//
//
//
//    }

    private void subCategories(String mainCategoryName){
        List<SubCategory> subCategories = getSubCategoryForMainCategory(mainCategoryName);
        for (int i = 1 ; i < subCategories.size() + 1 ; i++){
            System.out.println(i + " - " + subCategories.get(i - 1).getName());

        }
    }

    private List<SubCategory> getSubCategoryForMainCategory(String mainCategoryName){
        List<SubCategory> subCategories = new ArrayList<>();
        switch (mainCategoryName){
            case "Breakfast":
                subCategories = new Breakfast().getSubCategories();
                break;
            case "FruitAndVegetable":
                subCategories = new FruitAndVegetable().getSubCategories();
                break;
            case "Snack":
                subCategories = new Snack().getSubCategories();
                break;
        }
        return subCategories;
    }

}
