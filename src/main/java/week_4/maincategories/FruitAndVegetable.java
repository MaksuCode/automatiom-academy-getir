package week_4.maincategories;

import week_4.subcategories.FruitSubCategory;
import week_4.subcategories.VegetableSubCategory;

public class FruitAndVegetable extends MainCategory{

    FruitSubCategory fruitSubCategory;
    VegetableSubCategory vegetableSubCategory;

    public FruitAndVegetable() {
        this.name = "Fruits and Vegetables" ;
        this.fruitSubCategory = new FruitSubCategory() ;
        this.vegetableSubCategory = new VegetableSubCategory() ;
        this.subCategories.add(fruitSubCategory);
        this.subCategories.add(vegetableSubCategory);
    }

}
