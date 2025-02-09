package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTest extends BaseTest{

    @Test(description = "check if we can see Header before login")
    public void isHeaderVisibleBeforeLoginTest(){
        headerPage.openPage(LOGIN_PAGE_URL);
        Assert.assertTrue(headerPage.getHeaderElems().isEmpty());
    }

    @Test(description = "check if we can see Header after login")
    public void isHeaderVisibleAfterLoginTest(){
        headerPage.openPage(LOGIN_PAGE_URL);
        loginPage.login(USERNAME, PASSWORD);
        Assert.assertTrue(headerPage.getHeaderElem().isDisplayed());
    }

    @Test(description = "open cart link from header after login")
    public void openCartTest(){
        headerPage.openPage(LOGIN_PAGE_URL);
        loginPage.login(USERNAME, PASSWORD);
        headerPage.getCartButton().click();
        Assert.assertEquals(headerPage.getDriver().getCurrentUrl(), CART_PAGE_URL);
    }

    @Test(description = "click on menu button and check if menu is open")
    public void clickOnMenuButtonTest(){
        headerPage.openPage(LOGIN_PAGE_URL);
        loginPage.login(USERNAME, PASSWORD);
        headerPage.getMenuButton().click();
        String hiddenAttr = headerPage.getMenuElement().getDomAttribute("aria-hidden");
        Assert.assertFalse(Boolean.parseBoolean(hiddenAttr));
    }

}
