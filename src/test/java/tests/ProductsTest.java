package tests;

import entity.Product;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProductsTest extends BaseTest{
    //loginPage.openPage()
    //loginPage.login(username, password)
    //productPage.addToCart("entity.Product Name")
    //cartPage.openPage()
    //cartPage.getQuantity("entity.Product Name")
    //cartPage.getPrice("entity.Product Name")
    //Assertions

    @Test(description = "check products count on page")
    public void checkAmountOfProducts(){
        int amount = loginPage
                .openPage(LOGIN_PAGE_URL)
                .waitForPageOpened()
                .login(USERNAME, PASSWORD)
                .getProductsList().size();
        Assert.assertEquals(amount, 6);
    }

    @Test(description = "add a product to cart and check if it was actually added")
    public void addToCartTest(){
        loginPage
                .openPage(LOGIN_PAGE_URL)
                .waitForPageOpened()
                .login(USERNAME, PASSWORD);
        Product product = productsPage.getProductByName(SAUCE_LABS_BIKE_LIGHT);
        product.addToCart();
        headerPage.openCartPage();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(cartPage.getQuantity(), 1);
        softAssert.assertEquals(cartPage.getName(), product.getName());
        softAssert.assertEquals(cartPage.getPrice(), product.getPrice());
        softAssert.assertAll();
    }

    @Test(description = "check if content of button 'add to cart' changes after adding")
    public void checkContentOfAddToCartButton(){
        Product product = loginPage
                .openPage(LOGIN_PAGE_URL)
                .waitForPageOpened()
                .login(USERNAME, PASSWORD)
                .getProductByName(SAUCE_LABS_BACKPACK);
        product.addToCart();
        Assert.assertEquals(product.getButtonText(), "Remove");
    }
}
