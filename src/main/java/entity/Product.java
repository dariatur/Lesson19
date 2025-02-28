package entity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Product extends BaseEntity {
    private String name;
    private String price;
    private WebElement cartButton;

    public Product(WebElement rootElement) {
        super(rootElement);
        name = rootElement.findElement(By.className("inventory_item_name")).getText();
        price = rootElement.findElement(By.className("inventory_item_price")).getText();
        cartButton = rootElement.findElement(By.className("btn"));
    }

    public String getName(){
        return name;
    }

    public String getPrice(){
        return price;
    }

    public WebElement getButton(){
        return rootElement.findElement(By.className("btn"));
    }

    public String getButtonText(){
        return rootElement.findElement(By.className("btn")).getText();
    }

    public void addToCart(){
        cartButton.click();
    }
}
