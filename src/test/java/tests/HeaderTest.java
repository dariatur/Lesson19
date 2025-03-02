package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTest extends BaseTest{

    @Test(description = "check if we can see Header before login")
    public void isHeaderVisibleBeforeLoginTest(){
        loginPage
                .openPage(LOGIN_PAGE_URL)
                .waitForPageOpened();
        Assert.assertTrue(headerPage.getHeaderElems().isEmpty());
    }

    @Test(description = "check if we can see Header after login")
    public void isHeaderVisibleAfterLoginTest(){
        loginPage
                .openPage(LOGIN_PAGE_URL)
                .waitForPageOpened()
                .login(USERNAME, PASSWORD);
        Assert.assertTrue(headerPage.getHeaderElem().isDisplayed());
    }

    @Test(description = "open cart link from header after login")
    public void openCartTest(){
        loginPage
                .openPage(LOGIN_PAGE_URL)
                .waitForPageOpened()
                .login(USERNAME, PASSWORD)
                .getCartButton().click();
        Assert.assertEquals(headerPage.getDriver().getCurrentUrl(), CART_PAGE_URL);
    }

    @Test(description = "click on menu button and check if menu is open")
    public void clickOnMenuButtonTest(){
        loginPage
                .openPage(LOGIN_PAGE_URL)
                .waitForPageOpened()
                .login(USERNAME, PASSWORD)
                .getMenuButton().click();
        Assert.assertFalse(headerPage.isMenuHidden());
    }
}
