package webElements.userElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.userPages.ProductPage;
import webElements.AbstrElements;

import java.util.List;


public class DivMostPopular extends AbstrElements{

    public DivMostPopular(WebDriver driver) {
        super(driver);
    }

    // XPath DivMostPopular
    protected String divMostPopularXpath = "//div[@id=\"box-most-popular\"]";

    public WebElement webElementDivMostPopular(){
        return driver.findElements(By.xpath(divMostPopularXpath)).get(0);
    }
    // Возвращаем список WebElement (продукции)
    public List<WebElement> getWebElemetnsProduct(){
        return driver.findElements(By.xpath(divMostPopularXpath));
    }


    // XPath i-го продукта
    protected String bWebElemetnsProductXpath = divMostPopularXpath + "//li[contains(@class,\"product column\")]";
    // Возвращаем webElement по i элементу найденной продукции
    public WebElement webElemetnsProduct(int i){
        return driver.findElements(By.xpath(bWebElemetnsProductXpath)).get(i);
    }
    // Кликаем по i элементу найденной продукции
    public ProductPage bClickWebElemetnsProduct(int i){
        driver.findElements(By.xpath(bWebElemetnsProductXpath)).get(i).click();
        return new ProductPage(driver);
    }
}
