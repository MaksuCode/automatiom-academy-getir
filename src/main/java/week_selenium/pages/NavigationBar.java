package week_selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar extends BasePage {

    By cartIcon = new By.ByCssSelector("ul[id='primary-menu'] li.menu-item a.cart-page-link");

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public void clickCartIcon() {
        driver.findElement(cartIcon).click();
    }

    public boolean isCartButtonDisplayed(){
        return isDisplayed(cartIcon);
    }
}
