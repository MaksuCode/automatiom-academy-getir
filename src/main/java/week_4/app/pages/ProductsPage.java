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
        this.selection = scanner.nextLine();
    }

    @Override
    public Page navigate() {
        return super.navigate();
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
