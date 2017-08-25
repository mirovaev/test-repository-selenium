package webElements.adminElements.contentElements.catalogСontentElements.addCatalogElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.adminPages.catalogPages.addCatalogPages.addNewProductPage.GeneralAPage;
import pages.adminPages.catalogPages.addCatalogPages.addNewProductPage.InformationAPage;
import pages.adminPages.catalogPages.addCatalogPages.addNewProductPage.PricesAPage;
import webElements.AbstrElements;


public class AbstrAddNewProductElements extends AbstrElements{

    public AbstrAddNewProductElements(WebDriver driver) {
        super(driver);
    }


    // Кнопки перехода по Выладкам

    // Кнопка Вкладка General
    String bOpenTabGeneralXpath = "//td[@id=\"content\"]//a[@href=\"#tab-general\"]";
    public WebElement bOpenTabGeneral(){
        return driver.findElements(By.xpath(bOpenTabGeneralXpath)).get(0);
    }
    // Нажимаем на кнопку General
    public GeneralAPage bClickOpenTabGeneral(){
        driver.findElements(By.xpath(bOpenTabGeneralXpath)).get(0).click();
        return new GeneralAPage(driver);
    }


    // Кнопка Вкладка Information
    String bOpenTabInformationXpath = "//td[@id=\"content\"]//a[@href=\"#tab-information\"]";
    public WebElement bOpenTabInformation(){
        return driver.findElements(By.xpath(bOpenTabInformationXpath)).get(0);
    }
    // Нажимаем на кнопку Information
    public InformationAPage bClickOpenTabInformation(){
        driver.findElements(By.xpath(bOpenTabInformationXpath)).get(0).click();
        return new InformationAPage(driver);
    }


    // Кнопка Вкладка Data
    String bOpenTabDataXpath = "//td[@id=\"content\"]//a[@href=\"#tab-data\"]";
    public WebElement bOpenTabData(){
        return driver.findElements(By.xpath(bOpenTabDataXpath)).get(0);
    }


    // Кнопка Вкладка Prices
    String bOpenTabPricesXpath = "//td[@id=\"content\"]//a[@href=\"#tab-prices\"]";
    public WebElement bOpenTabPrices(){
        return driver.findElements(By.xpath(bOpenTabPricesXpath)).get(0);
    }
    // Нажимаем на кнопку Prices
    public PricesAPage bClickOpenTabPrices(){
        driver.findElements(By.xpath(bOpenTabPricesXpath)).get(0).click();
        return new PricesAPage(driver);
    }

}
