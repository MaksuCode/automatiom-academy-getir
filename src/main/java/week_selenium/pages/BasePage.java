package week_selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    String URL = "https://training.qastorming.com/";
    WebDriver driver;
    NavigationBar navigationBar;
    Footer footer ;
    WebDriverWait wait;
    By upButton = By.id("tg-scroll-to-top");

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 3);
    }

    public NavigationBar navigationBar(){
        this.navigationBar = new NavigationBar(driver);
        return this.navigationBar;
    }

    public Footer footer() {
        this.footer = new Footer(driver);
        return footer;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public WebElement find(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator);
    }

    public List<WebElement> findAll(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElements(locator);
    }

    public void type(By locator , String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        find(locator).sendKeys(text);
    }

    public void click(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        find(locator).click();
    }

    public void scroll(String y){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + y + ")");
    }

    public boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public void goTop(){
        click(upButton);
    }

}
