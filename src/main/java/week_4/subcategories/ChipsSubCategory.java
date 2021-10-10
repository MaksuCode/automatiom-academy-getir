package week_4.subcategories;

import week_4.product.Product;

public class ChipsSubCategory extends SubCategory {

    public ChipsSubCategory() {
        this.name = "Chips" ;
        Product lays = new Product("Lays" , "Delicious Lays Chips!" , 12 , 9.99) ;
        Product doritos = new Product("Doritos" , "Delicious Doritos Chips!" , 11 , 8.99) ;
        Product ruffles = new Product("Ruffles" , "Crispy" , 8) ;
        this.productList.add(lays) ;
        this.productList.add(doritos) ;
        this.productList.add(ruffles) ;
    }

}
