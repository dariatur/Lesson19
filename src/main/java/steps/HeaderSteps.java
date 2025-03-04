package steps;

import constants.IConstants;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class HeaderSteps extends BaseSteps{

    public HeaderSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Login and open cart from header")
    public HeaderSteps loginAndOpenCart(String username, String password){
        loginPage.openPage(IConstants.LOGIN_PAGE_URL)
                .waitForPageOpened()
                .login(username, password);
        headerPage.clickOnCartButton();
        return this;
    }

    @Step("Login and open menu from header")
    public HeaderSteps loginAndOpenMenu(String username, String password){
        loginPage.openPage(IConstants.LOGIN_PAGE_URL)
                    .login(username, password);
        headerPage.getMenuButton().click();
        return this;
    }
}
