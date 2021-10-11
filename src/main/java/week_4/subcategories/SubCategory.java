package week_4.subcategories;

import week_4.product.Product;

import java.util.ArrayList;
import java.util.List;

public class SubCategory {

    protected String name ;
    protected List<Product> productList = new ArrayList<>() ;

    public String getName() {
        return name;
    }

    public List<Product> getProductList() {
        return productList;
    }

}
