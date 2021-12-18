package week_selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopPage extends BasePage{

    By addToCartButton = new By.ByCssSelector("li.zakra-article a.button");
    By addedToCartMessage = new By.ByCssSelector("a.added_to_cart");

    public ShopPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCart(int i) {
        findAll(addToCartButton).get(i).click();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addedToCartMessage));
    }

}
