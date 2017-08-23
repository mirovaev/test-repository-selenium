package webElements.userElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webElements.AbstrElements;


public class IdBoxProduct extends AbstrElements{

    public IdBoxProduct(WebDriver driver) {
        super(driver);
    }

    // XPath IdBoxProduct
    protected String IdBoxProductXpath = "//div[@id=\"box-product\"]";

    // XPath кнопки добавления в корзину
    protected String bAddCartProductXpath = IdBoxProductXpath + "//button[@name=\"add_cart_product\"]";
    // Кнопка добавления продукта в корзину
    public WebElement bAddCartProduct(){
        return driver.findElements(By.xpath(bAddCartProductXpath)).get(0);
    }
    // Кликаем по кнопке добавить в корзину
    public void bClickAddCartProduct(){

        driver.findElements(By.xpath(bAddCartProductXpath)).get(0).click();
    }


}
