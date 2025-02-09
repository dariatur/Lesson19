package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HeaderPage extends BasePage{
    public static final By CART_BUTTON = By.xpath("//*[@data-test='shopping-cart-link']");
    public static final By MENU_BUTTON = By.id("react-burger-menu-btn");
    public static final By MENU_ELEM = By.className("bm-menu-wrap");
    public static final By HEADER_ELEM = By.id("header_container");

    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getHeaderElems(){
        return driver.findElements(HEADER_ELEM);
    }

    public WebElement getHeaderElem(){
        return driver.findElement(HEADER_ELEM);
    }

    public WebElement getCartButton(){
        return driver.findElement(CART_BUTTON);
    }

    public WebElement getMenuButton(){
        return driver.findElement(MENU_BUTTON);
    }

    public WebElement getMenuElement(){
        return driver.findElement(MENU_ELEM);
    }

    public WebDriver getDriver(){
        return driver;
    }

}
