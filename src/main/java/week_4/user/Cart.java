package week_4.user;

import week_4.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> productList = new ArrayList<>() ;

    public void addProduct(Product product){
        productList.add(product) ;
    }

    public List<Product> getProductList(){
        return productList;
    }
}
