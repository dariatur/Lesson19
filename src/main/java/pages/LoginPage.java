package pages;

import entity.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//*[@data-test='username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//*[@data-test='password']")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@data-test='error']")
    private WebElement errorMessage;

    public static final String EMPTY_FIELD_USERNAME_ERROR_TEXT = "Epic sadface: Username is required";
    public static final String EMPTY_FIELD_PASSWORD_ERROR_TEXT = "Epic sadface: Password is required";
    public static final String INCORRECT_DATA_IN_FIELDS_ERROR_TEXT = "Epic sadface: Username and password do not match any user in this service";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPage openPage(String url){
        driver.get(url);
        return this;
    }

    public ProductsPage login(User user) {
        usernameInput.sendKeys(user.getUsername());
        passwordInput.sendKeys(user.getPassword());
        loginButton.click();
        return new ProductsPage(driver);
    }

    public ProductsPage login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        return new ProductsPage(driver);
    }

    public String getErrorMessageText() {
        return errorMessage.getText();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public LoginPage waitForPageOpened() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        return this;
    }
}
