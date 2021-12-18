package week_selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Footer extends BasePage{

    By contact = By.linkText("Contact");

    public Footer(WebDriver driver) {
        super(driver);
    }

    public boolean isContactVisible(){
        return isDisplayed(contact);
    }
}
