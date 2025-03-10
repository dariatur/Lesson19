package pages;

import entity.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProductsPage extends HeaderPage {
    private static final String PRODUCT_ITEM = "";
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public List<Product> getProductsList(){
        List<WebElement> elements = driver.findElements(By.className("inventory_item"));
        List<Product> result = new ArrayList<>();
        for (WebElement element: elements){
            result.add(new Product(element));
        }
        return result;
    }

    public int getProductsListSize(){
        return getProductsList().size();
    }

    public Product getProductByName(String name){
        List<Product> products = getProductsList();
        Product product = null;
        for (Product elem: products){
            if(elem.getName().equals(name)){
                product = elem;
            }
        }
        return product;
    }
}
