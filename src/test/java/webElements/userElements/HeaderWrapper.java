package webElements.userElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.userPages.*;
import webElements.AbstrElements;

/**
 * Created by tester on 23.08.2017.
 */
public class HeaderWrapper extends AbstrElements{

    public HeaderWrapper(WebDriver driver) {
        super(driver);
    }

    // XPath HeaderWrapper
    protected String headerWrapperXpath = "//div[@id=\"header-wrapper\"]";

    // XPath Количество товаров в Корзине
    protected String сartXpath = headerWrapperXpath + "//span[@class=\"quantity\"]";

    public WebElement webElementCart(){
        return driver.findElements(By.xpath(сartXpath)).get(0);
    }
    // Возвращаем текст  количества товаров в корзине
    public String gettxtCart(){
        return driver.findElements(By.xpath(сartXpath)).get(0).getText();
    }

    // XPath Кнопки перехода в корзину
    protected String bOpenCartXpath = headerWrapperXpath + "//a[text()=\"Checkout »\"]";

    public WebElement bOpenWebElementCartXpath(){
        return driver.findElements(By.xpath(bOpenCartXpath)).get(0);
    }
    // Возвращаем текст  количества товаров в корзине
    public CheckoutPage bClickOpenСheckout(){
        driver.findElements(By.xpath(bOpenCartXpath)).get(0).click();
        return  new CheckoutPage(driver);
    }




}
