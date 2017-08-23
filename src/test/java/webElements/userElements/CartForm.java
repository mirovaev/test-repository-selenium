package webElements.userElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webElements.AbstrElements;

import java.util.List;


public class CartForm extends AbstrElements{

    public CartForm(WebDriver driver) {
        super(driver);
    }

    // XPath CartForm
    protected String formCartFormXpath = "//form[@name=\"cart_form\"]";

    // XPath кнопки удаления из корзины
    protected String bRemoveCartItemXpath = formCartFormXpath + "//button[@name=\"remove_cart_item\"]";
    // Кнопка удаления продукта из корзины
    public WebElement bRemoveCartItem(){
        return driver.findElements(By.xpath(bRemoveCartItemXpath)).get(0);
    }
    // Кликаем по кнопке удаления из корзины
    public void bClickRemoveCartItem(){
        driver.findElements(By.xpath(bRemoveCartItemXpath)).get(0).click();
    }

    public boolean isAnyProductInCart(){
        return driver.findElements(By.xpath(bRemoveCartItemXpath)).size() > 0;
    }


    // XPath элементов в корзине
    protected String webElementsProductsXpath = "//li[@class=\"shortcut\"]";
    // WebElements продукции в корзине
    public List<WebElement> webElementsProducts(){
        return driver.findElements(By.xpath(webElementsProductsXpath));
    }
    // Возвращаем количество продукции в корзине
    public int countProductsInCart(){
        int count = 0;
        if (driver.findElements(By.xpath(webElementsProductsXpath)).size() > 0 ){
            count = driver.findElements(By.xpath(webElementsProductsXpath)).size();
        } else {
            if (isAnyProductInCart()){
                count = 1;
            } else {
                count = 0;
            }
        }
        return count;
    }


}
