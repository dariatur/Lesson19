package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public static final By USERNAME_INPUT = By.xpath("//*[@data-test='username']");
    public static final By PASSWORD_INPUT = By.xpath("//*[@data-test='password']");
    public static final By LOGIN_BUTTON = By.id("login-button");
    public static final By ERROR_MESSAGE = By.xpath("//*[@data-test='error']");
    public static final String EMPTY_FIELD_USERNAME_ERROR_TEXT = "Epic sadface: Username is required";
    public static final String EMPTY_FIELD_PASSWORD_ERROR_TEXT = "Epic sadface: Password is required";
    public static final String INCORRECT_DATA_IN_FIELDS_ERROR_TEXT = "Epic sadface: Username and password do not match any user in this service";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }

    public String getErrorMessageText() {
        return driver.findElement(ERROR_MESSAGE).getText();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
