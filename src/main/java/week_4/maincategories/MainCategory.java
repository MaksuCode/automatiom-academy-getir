package week_4.maincategories;

import week_4.subcategories.SubCategory;

import java.util.ArrayList;
import java.util.List;

public class MainCategory {

    protected String name ;
    protected List<SubCategory> subCategories = new ArrayList<>();

    public String getName() {
        return name;
    }

    public List<SubCategory> getSubCategories() {
        return subCategories;
    }
}
