package tests;

import constants.IConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CartPage;
import pages.HeaderPage;
import pages.LoginPage;
import pages.ProductsPage;

import java.util.concurrent.TimeUnit;


public class BaseTest implements IConstants, ITestConstants {
    private WebDriver driver;
    protected LoginPage loginPage;
    protected ProductsPage productsPage;
    protected CartPage cartPage;
    protected HeaderPage headerPage;

    @BeforeMethod
    public void initTest() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        initPages();
    }

    public void initPages(){
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        headerPage = new HeaderPage(driver);
    }

    @AfterMethod
    public void endTest() {
        driver.quit();
    }
}


