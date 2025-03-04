package pages;

import constants.IConstants;
import org.openqa.selenium.WebDriver;

public abstract class BasePage implements IConstants {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public BasePage openPage(String url){
        driver.get(url);
        return this;
    }
}
