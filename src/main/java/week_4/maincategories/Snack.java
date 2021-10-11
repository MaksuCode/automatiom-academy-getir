package week_4.maincategories;

import week_4.subcategories.ChipsSubCategory;
import week_4.subcategories.ChocolateSubCategory;

public class Snack extends MainCategory{

    ChocolateSubCategory chocolateSubCategory ;
    ChipsSubCategory chipsSubCategory ;

    public Snack() {
        this.name = "Snack" ;
        this.chocolateSubCategory = new ChocolateSubCategory() ;
        this.chipsSubCategory = new ChipsSubCategory() ;
        this.subCategories.add(chocolateSubCategory);
        this.subCategories.add(chipsSubCategory);
    }

}
