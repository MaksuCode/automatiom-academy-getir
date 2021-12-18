package week_4.app.pages;

import week_4.product.Product;
import week_4.subcategories.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductsPage extends Page{

    String subCategoryName;

    public ProductsPage(Scanner scanner , String subCategoryName) {
        super(scanner);
        this.subCategoryName = subCategoryName;
        products();
        System.out.println("0 - Back to Sub Category");
        System.out.println("9 - Go to cart page");
        this.selection = scanner.nextLine();
        navigate();
    }

    @Override
    public Page navigate() {
        Page page = new Page(scanner);
        switch (this.selection){
            case "0":
                if (this.subCategoryName.equals("ChipsSubCategory") || this.subCategoryName.equals("ChocolateSubCategory")){
                    page = new SubCategoryPage(scanner, "Snack");
                }else if (this.subCategoryName.equals("DelicatessenSubCategory") || this.subCategoryName.equals("MilkSubCategory")){
                    page = new SubCategoryPage(scanner, "Breakfast");
                }else {
                    page = new SubCategoryPage(scanner, "FruitAndVegetable");
                }
                break;

            case "":

                break;
            case "9":
                page = new CartPage_1(scanner);
                break;

        }
        return page;
    }

    private void products(){
        List<Product> products = new ArrayList<>();
        switch (this.subCategoryName){
            case "ChipsSubCategory":
                products = new ChipsSubCategory().getProductList();
                break;
            case "ChocolateSubCategory":
                products = new ChocolateSubCategory().getProductList();
                break;
            case "DelicatessenSubCategory":
                products = new DelicatessenSubCategory().getProductList();
                break;
            case "FruitSubCategory":
                products = new FruitSubCategory().getProductList();
                break;
            case "MilkSubCategory":
                products = new MilkSubCategory().getProductList();
                break;
            case "VegetableSubCategory":
                products = new VegetableSubCategory().getProductList();
                break;
        }
        int i = 1;
        for (Product product : products){
            System.out.println(i + " - " + product.getName() + " - " + product.getPrice() + " - " + product.getReducedPrice()
            + " - " + product.getDescription());
            i++;
        }
    }

}
