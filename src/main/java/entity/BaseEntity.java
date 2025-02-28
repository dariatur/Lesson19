package entity;

import org.openqa.selenium.WebElement;

public abstract class BaseEntity {
    protected WebElement rootElement;

    public BaseEntity(WebElement rootElement){
        this.rootElement = rootElement;
    }
}
