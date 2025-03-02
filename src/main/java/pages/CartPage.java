package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class CartPage extends HeaderPage {
    public static final By QUANTITY = By.className("cart_quantity");
    public static final By PRODUCT_NAME= By.className("inventory_item_name");
    public static final By PRODUCT_PRICE= By.className("inventory_item_price");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public CartPage openCartPage(String url){
        log.info("Open cart page url {}", url);
        driver.get(url);
        return this;
    }

    public int getQuantity(){
        int productQuantity = Integer.parseInt(driver.findElement(QUANTITY).getText());
        log.info("Get product quantity: {}", productQuantity);
        return productQuantity;
    }

    public String getName(){
        String productName = driver.findElement(PRODUCT_NAME).getText();
        log.info("Get product name: {}", productName);
        return productName;
    }

    public String getPrice(){
        String productPrice = driver.findElement(PRODUCT_PRICE).getText();
        log.info("Get product price: {}", productPrice);
        return productPrice;
    }
}
