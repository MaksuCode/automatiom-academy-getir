package week_4.subcategories;

import week_4.product.Product;

public class DelicatessenSubCategory extends SubCategory{

    public DelicatessenSubCategory() {
        this.name = "Delicatessen" ;
        Product cheddar = new Product("Cheddar" , "100 gr" , 12 , 11.68) ;
        Product cheese = new Product("Cheese" , "Organic cheese" , 13) ;
        Product salami = new Product("Salami" , "Salami desc" , 19 , 16.99) ;
        this.productList.add(cheddar) ;
        this.productList.add(cheese) ;
        this.productList.add(salami) ;
    }

}
