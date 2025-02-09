package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends HeaderPage{
    public static final By QUANTITY = By.className("cart_quantity");
    public static final By PRODUCT_NAME= By.className("inventory_item_name");
    public static final By PRODUCT_PRICE= By.className("inventory_item_price");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void openPage(){
        driver.findElement(CART_BUTTON).click();
    }

    public Integer getQuantity(){
        return Integer.parseInt(driver.findElement(QUANTITY).getText());
    }

    public String getName(){
        return driver.findElement(PRODUCT_NAME).getText();
    }

    public String getPrice(){
        return driver.findElement(PRODUCT_PRICE).getText();
    }
}
