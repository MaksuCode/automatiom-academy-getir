package week_4.subcategories;

import week_4.product.Product;

public class MilkSubCategory extends SubCategory{

    public MilkSubCategory() {
        this.name = "Milk" ;
        Product fullFat = new Product("Full-fat" , "Full-fat milk" , 5.68 ) ;
        Product lowFat = new Product("Low-fat" , "Low fat milk" , 5) ;
        Product lactoFree = new Product("Lacto-free" , "Lacto-free milk" , 7 , 6.99) ;
        this.productList.add(fullFat) ;
        this.productList.add(lowFat) ;
        this.productList.add(lactoFree) ;
    }

}
