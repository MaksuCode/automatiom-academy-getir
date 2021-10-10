package week_4.subcategories;

import week_4.product.Product;

public class ChocolateSubCategory extends SubCategory{

    public ChocolateSubCategory() {
        this.name = "Chocolate" ;
        Product tadelle = new Product("Tadelle" , "Tadelle desc" , 4 , 3.68) ;
        Product albeni = new Product("Albeni" , "Albeni desc" , 3) ;
        Product metro = new Product("Metro" , "Metro desc" , 3.5 , 2.99) ;
        this.productList.add(tadelle) ;
        this.productList.add(albeni) ;
        this.productList.add(metro) ;
    }

}
