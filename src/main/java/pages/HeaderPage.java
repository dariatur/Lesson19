package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage extends BasePage{
    public static final By CART_BUTTON = By.xpath("//*[@data-test='shopping-cart-link']");
    public static final By MENU_BUTTON = By.id("react-burger-menu-btn");

    public HeaderPage(WebDriver driver) {
        super(driver);
    }
}
