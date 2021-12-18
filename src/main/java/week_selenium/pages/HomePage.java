package week_selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    By shopNowButton = new By.ByCssSelector("a.elementor-button");

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get(URL);
    }

    public void clickShopNowButton(int i) {
        findAll(shopNowButton).get(i).click();
    }
}
