import org.junit.jupiter.api.Test;
import week_selenium.pages.CartPage;
import week_selenium.pages.HomePage;
import week_selenium.pages.ShopPage;

import static org.junit.jupiter.api.Assertions.*;

public class Test_A extends BaseTest{

    @Test
    public void scenario_1(){

        HomePage homePage = new HomePage(driver);
        assertEquals("Home - Sample Shop", homePage.getTitle(),"Not on home page!");

        homePage.clickShopNowButton(0);
        ShopPage shopPage = new ShopPage(driver);
        assertEquals("Shop - Sample Shop", shopPage.getTitle(),"Not on shop page!");

        shopPage.clickAddToCart(0);
        homePage.navigationBar().clickCartIcon();
        CartPage cartPage = new CartPage(driver);
        assertEquals("Cart - Sample Shop", cartPage.getTitle() , "Not on cart page!");
        assertEquals(1, cartPage.getProductCount(), "Product is not added to cart!");

        cartPage.updateProductCount("3");
        assertEquals("₺ 1.800,00", cartPage.getTotalPrice(), "Price is not increased!");

        cartPage.deleteProduct(0);
        assertEquals("Your cart is currently empty." , cartPage.getMessage(), "Message is not correct!");

    }

    @Test
    public void scenario_2(){

        HomePage homePage = new HomePage(driver);
        assertEquals("Home - Sample Shop", homePage.getTitle(),"Not on home page!");

        homePage.scroll("7000");
        assertTrue(homePage.footer().isContactVisible() , "Contact is not visible!");

        homePage.goTop();
        assertTrue(homePage.navigationBar().isCartButtonDisplayed(),"Not on top of the page!");

    }

}
