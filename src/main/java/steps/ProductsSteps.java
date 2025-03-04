package steps;

import entity.Product;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ProductsPage;

import static constants.IConstants.LOGIN_PAGE_URL;

public class ProductsSteps extends BaseSteps{

    public ProductsSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Login and add product to cart")
    public ProductsSteps loginAndAddProductToCart(String username, String password, Product product) {
        loginPage.openPage(LOGIN_PAGE_URL)
                .login(username, password);
        product.addToCart();
        return this;
    }

    @Step("Login and get amount of products on the page")
    public int loginAndGetAmount(String username, String password){
        loginPage.openPage(LOGIN_PAGE_URL)
                .login(username, password);
        return productsPage.getProductsList().size();
    }
}
