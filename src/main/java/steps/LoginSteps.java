package steps;

import constants.IConstants;
import entity.User;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps extends BaseSteps{

    public LoginSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Login and wait for page loaded")
    public LoginSteps loginAndWaitForPageOpened(String username, String password) {
        loginPage.openPage(IConstants.LOGIN_PAGE_URL)
                .waitForPageOpened()
                .login(username, password);
        return this;
    }

    @Step("Login and wait for page loaded")
    public LoginSteps loginAndWaitForPageOpened(User user) {
        loginPage.openPage(IConstants.LOGIN_PAGE_URL)
                .waitForPageOpened()
                .login(user);
        return this;
    }
}
