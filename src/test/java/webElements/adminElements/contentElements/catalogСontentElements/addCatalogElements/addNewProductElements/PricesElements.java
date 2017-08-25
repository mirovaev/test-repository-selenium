package webElements.adminElements.contentElements.catalogСontentElements.addCatalogElements.addNewProductElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webElements.adminElements.contentElements.catalogСontentElements.addCatalogElements.AbstrAddNewProductElements;


public class PricesElements extends AbstrAddNewProductElements {

    public PricesElements(WebDriver driver) {
        super(driver);
    }


    // Текстовое поле Purchase Price
    String txtPurchasePriceXpath = "//td[@id=\"content\"]//input[@name=\"purchase_price\"]";
    public WebElement txtPurchasePrice(){
        return driver.findElements(By.xpath(txtPurchasePriceXpath)).get(0);
    }


    // Поле выбора Purchase Price Type
    String txtShortDescriptionTypeXpath = "//td[@id=\"content\"]//select[@name=\"purchase_price_currency_code\"]";
    public WebElement txtShortDescriptionType(){
        return driver.findElements(By.xpath(txtShortDescriptionTypeXpath)).get(0);
    }


    // Поле выбора Tax Class
    String txtTaxClassXpath = "//td[@id=\"content\"]//select[@name=\"tax_class_id\"]";
    public WebElement txtTaxClass(){
        return driver.findElements(By.xpath(txtTaxClassXpath)).get(0);
    }


    // Текстовое поле Price USD
    String txtPriceUSDXpath = "//td[@id=\"content\"]//input[@name=\"prices[USD]\"]";
    public WebElement txtPriceUSD(){
        return driver.findElements(By.xpath(txtPriceUSDXpath)).get(0);
    }


    // Текстовое поле Price EUR
    String txtPriceEURXpath = "//td[@id=\"content\"]//input[@name=\"prices[EUR]\"]";
    public WebElement txtPriceEUR(){
        return driver.findElements(By.xpath(txtPriceEURXpath)).get(0);
    }


    // Текстовое поле Price Incl. Tax
    String txtPriceInclTaxUSDXpath = "//td[@id=\"content\"]//input[@name=\"gross_prices[USD]\"]";
    public WebElement txtPriceInclTaxUSD(){
        return driver.findElements(By.xpath(txtPriceInclTaxUSDXpath)).get(0);
    }


    // Текстовое поле Price Incl. Tax
    String txtPriceInclTaxEURXpath = "//td[@id=\"content\"]//input[@name=\"gross_prices[EUR]\"]";
    public WebElement txtPriceInclTaxEUR(){
        return driver.findElements(By.xpath(txtPriceInclTaxEURXpath)).get(0);
    }


}
