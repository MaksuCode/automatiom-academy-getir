package week_4.maincategories;

import week_4.subcategories.DelicatessenSubCategory;
import week_4.subcategories.MilkSubCategory;

public class Breakfast extends MainCategory{

    MilkSubCategory milkSubCategory ;
    DelicatessenSubCategory delicatessenSubCategory ;

    public Breakfast() {
        this.name = "Breakfast" ;
        this.milkSubCategory = new MilkSubCategory() ;
        this.delicatessenSubCategory = new DelicatessenSubCategory() ;
        this.subCategories.add(milkSubCategory);
        this.subCategories.add(delicatessenSubCategory);
    }

}
