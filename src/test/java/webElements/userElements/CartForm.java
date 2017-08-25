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


    //li[@class="shortcut"]

    // XPath элементов в корзине
    protected static String webElementsProductsXpath = "//table[@class=\"dataTable rounded-corners\"]//tr/td[@class=\"item\"]";
    public static String getWebElementsProductsXpath() {
        return webElementsProductsXpath;
    }
    // WebElements продукции в корзине
    public List<WebElement> webElementsProducts(){
        return driver.findElements(By.xpath(webElementsProductsXpath));
    }
    // Возвращаем количество продукции в корзине
    public int countProductsInCart(){
        return driver.findElements(By.xpath(webElementsProductsXpath)).size();
    }


    // XPath элементов в корзине
    protected static String webElementsCustomerServiceXpath = "//span[text()=\"Customer Service\"]";
    public static String getWebElementsCustomerServiceXpath() {
        return webElementsCustomerServiceXpath;
    }
    // WebElements продукции в корзине
    public WebElement webElementsCustomerService(){
        return driver.findElements(By.xpath(webElementsCustomerServiceXpath)).get(0);
    }





}
