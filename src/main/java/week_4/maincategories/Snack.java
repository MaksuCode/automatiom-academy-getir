package week_4.maincategories;

import week_4.subcategories.ChipsSubCategory;
import week_4.subcategories.ChocolateSubCategory;

public class Snack extends MainCategory{

    ChocolateSubCategory chocolateSubCategory ;
    ChipsSubCategory chipsSubCategory ;

    public Snack() {
        this.name = "Snack" ;
        this.id = 3 ;
        this.chocolateSubCategory = new ChocolateSubCategory() ;
        this.chipsSubCategory = new ChipsSubCategory() ;
    }

    public ChocolateSubCategory chocolateSubCategory() {
        return chocolateSubCategory;
    }

    public ChipsSubCategory chipsSubCategory() {
        return chipsSubCategory;
    }

}
