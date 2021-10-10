package week_4.subcategories;

import week_4.product.Product;

public class VegetableSubCategory extends SubCategory{

    public VegetableSubCategory() {
        this.name = "Vegetable" ;
        Product tomato = new Product("Tomato" , "Price is per kilo" , 6 ) ;
        Product pepper = new Product("Pepper" , "Price is per kilo" , 13) ;
        Product eggplant = new Product("Eggplant" , "Price is per kilo" , 7 , 6.99) ;
        this.productList.add(tomato) ;
        this.productList.add(pepper) ;
        this.productList.add(eggplant) ;
    }

}
