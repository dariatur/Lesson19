package tests;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends Preconditions {

    @Test(description = "login with empty username field")
    public void loginWithEmptyUsernameTest(){
        loginPage.openPage(LOGIN_PAGE_URL);
        loginPage.login(userWithEmptyUsername);
        Assert.assertEquals(loginPage.getErrorMessageText(), LoginPage.EMPTY_FIELD_USERNAME_ERROR_TEXT);
    }

    @Test(description = "login with empty password field")
    public void loginWithEmptyPasswordTest(){
        loginPage.openPage(LOGIN_PAGE_URL);
        loginPage.login(userWithEmptyPassword);
        Assert.assertEquals(loginPage.getErrorMessageText(), LoginPage.EMPTY_FIELD_PASSWORD_ERROR_TEXT);
    }

    @Test(description = "login with empty fields")
    public void loginWithEmptyFieldsTest(){
        loginPage.openPage(LOGIN_PAGE_URL);
        loginPage.login(userWithEmptyFields);
        Assert.assertEquals(loginPage.getErrorMessageText(), LoginPage.EMPTY_FIELD_USERNAME_ERROR_TEXT);
    }

    @Test(description = "login with incorrect data")
    public void loginWithIncorrectFieldsTest(){
        loginPage.openPage(LOGIN_PAGE_URL);
        loginPage.login(userWithIncorrectFields);
        Assert.assertEquals(loginPage.getErrorMessageText(), LoginPage.INCORRECT_DATA_IN_FIELDS_ERROR_TEXT);
    }
    @Parameters({"username", "password"})
    @Test(description = "login with correct data")
    public void loginWithCorrectFieldsTest(@Optional(USERNAME) String username,
                                           @Optional(PASSWORD) String password){
        loginPage.openPage(LOGIN_PAGE_URL);
        loginPage.login(username, password);

        Assert.assertEquals(loginPage.getDriver().getCurrentUrl(), PRODUCTS_PAGE_URL);
    }

}
