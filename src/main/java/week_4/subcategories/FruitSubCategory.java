package week_4.subcategories;

import week_4.product.Product;

public class FruitSubCategory extends SubCategory{

    public FruitSubCategory() {
        this.name = "Fruit" ;
        Product apple = new Product("Apple" , "Price is per kilo" , 6 ) ;
        Product pear = new Product("Pear" , "Price is per kilo" , 13) ;
        Product grape = new Product("Grape" , "Price is per kilo" , 7 , 6.99) ;
        this.productList.add(apple) ;
        this.productList.add(pear) ;
        this.productList.add(grape) ;
    }

}
