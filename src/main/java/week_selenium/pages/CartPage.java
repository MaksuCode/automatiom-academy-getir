package week_selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage{

    By productList = new By.ByCssSelector("tr.woocommerce-cart-form__cart-item");
    By quantity = new By.ByCssSelector("input.input-text[type='number']");
    By subTotal = new By.ByCssSelector("td.product-subtotal bdi");
    By updateCartButton = new By.ByCssSelector("button[name='update_cart']");
    By updatedCartMessage = new By.ByCssSelector("div.woocommerce-message");
    By removeProductButton = new By.ByCssSelector("td.product-remove a");
    By emptyCartMessage = new By.ByCssSelector("p.cart-empty");
    By proceedToCheckoutButton = new By.ByCssSelector("div.wc-proceed-to-checkout");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public int getProductCount() {
        return findAll(productList).size();
    }

    public void updateProductCount(String productCount) {
        WebElement element = find(quantity);
        element.click();
        element.clear();
        type(quantity , productCount);
        click(updateCartButton);
        wait.until(ExpectedConditions.visibilityOfElementLocated(updatedCartMessage));
    }

    public String getTotalPrice() {
        return find(subTotal).getText();
    }

    public void deleteProduct(int i) {
        findAll(removeProductButton).get(i).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(emptyCartMessage));
    }

    public String getMessage() {
        return find(emptyCartMessage).getText();
    }

    public void proceedToCheckout(){
        click(proceedToCheckoutButton);
    }
}
