package steps;

import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.HeaderPage;
import pages.LoginPage;
import pages.ProductsPage;

public class BaseSteps {
    protected LoginPage loginPage;
    protected ProductsPage productsPage;
    protected CartPage cartPage;
    protected HeaderPage headerPage;

    public BaseSteps(WebDriver driver) {
        this.loginPage = new LoginPage(driver);
        this.productsPage = new ProductsPage(driver);
        this.cartPage = new CartPage(driver);
        this.headerPage = new HeaderPage(driver);
    }
}
