package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test
    public void loginWithEmptyUsernameTest(){
        loginPage.openPage(LOGIN_PAGE_URL);
        loginPage.login("",PASSWORD);
        Assert.assertEquals(loginPage.getErrorMessageText(), LoginPage.EMPTY_FIELD_USERNAME_ERROR_TEXT);
    }

    @Test
    public void loginWithEmptyPasswordTest(){
        loginPage.openPage(LOGIN_PAGE_URL);
        loginPage.login(USERNAME, "");
        Assert.assertEquals(loginPage.getErrorMessageText(), LoginPage.EMPTY_FIELD_PASSWORD_ERROR_TEXT);
    }

    @Test
    public void loginWithEmptyFieldsTest(){
        loginPage.openPage(LOGIN_PAGE_URL);
        loginPage.login("","");
        Assert.assertEquals(loginPage.getErrorMessageText(), LoginPage.EMPTY_FIELD_USERNAME_ERROR_TEXT);
    }

    @Test
    public void loginWithIncorrectFieldsTest(){
        loginPage.openPage(LOGIN_PAGE_URL);
        loginPage.login("adladakl","ajsala");
        Assert.assertEquals(loginPage.getErrorMessageText(), LoginPage.INCORRECT_DATA_IN_FIELDS_ERROR_TEXT);
    }

}
