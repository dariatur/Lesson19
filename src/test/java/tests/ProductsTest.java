package tests;

import entity.Product;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest{
    //loginPage.openPage()
    //loginPage.login(username, password)
    //productPage.addToCart("entity.Product Name")
    //cartPage.openPage()
    //cartPage.getQuantity("entity.Product Name")
    //cartPage.getPrice("entity.Product Name")
    //Assertions

    @Test(description = "login and check how many products we see")
    public void checkAmountOfProducts(){
        loginPage.openPage(LOGIN_PAGE_URL);
        loginPage.login(USERNAME, PASSWORD);
        Assert.assertEquals(productsPage.getProductsList().size(), 6);
    }

    @Test(description = "add a product to cart and check if it was actually added")
    public void addToCartTest(){
        loginPage.openPage(LOGIN_PAGE_URL);
        loginPage.login(USERNAME, PASSWORD);
        Product product = productsPage.getProductByName(SAUCE_LABS_BIKE_LIGHT);
        product.addToCart();
        cartPage.openPage();
        Assert.assertEquals(cartPage.getQuantity(),1);
        Assert.assertEquals(cartPage.getName(), product.getName());
        Assert.assertEquals(cartPage.getPrice(), product.getPrice());
    }

    @Test
    public void test(){
        loginPage.openPage(LOGIN_PAGE_URL);
        loginPage.login(USERNAME, PASSWORD);
        Product product = productsPage.getProductByName(SAUCE_LABS_BACKPACK);
        product.addToCart();
        Assert.assertEquals(product.getButton().getText(), "Remove");
    }

}
