package webElements.adminElements.contentElements.catalogСontentElements.addCatalogElements.addNewProductElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webElements.adminElements.contentElements.catalogСontentElements.addCatalogElements.AbstrAddNewProductElements;


public class InformationElements extends AbstrAddNewProductElements {

    public InformationElements(WebDriver driver) {
        super(driver);
    }


    // Поле выбора Manufacturer

    // Поле выбора Supplier


    // Текстовое поле Keywords
    String txtKeywordsXpath = "//td[@id=\"content\"]//input[@name=\"keywords\"]";

    public WebElement txtKeywords(){
        return driver.findElements(By.xpath(txtKeywordsXpath)).get(0);
    }

    // Текстовое поле Short Description
    String txtShortDescriptionXpath = "//td[@id=\"content\"]//input[@name=\"short_description[en]\"]";

    public WebElement txtShortDescription(){
        return driver.findElements(By.xpath(txtShortDescriptionXpath)).get(0);
    }

    // Текстовое поле Description
    String txtDescriptionXpath = "//td[@id=\"content\"]//div[@class=\"trumbowyg-editor\"]";

    public WebElement txtDescription(){
        return driver.findElements(By.xpath(txtDescriptionXpath)).get(0);
    }

    // Текстовое поле Head Title
    String txtHeadTitleXpath = "//td[@id=\"content\"]//input[@name=\"head_title[en]\"]";

    public WebElement txtHeadTitle(){
        return driver.findElements(By.xpath(txtHeadTitleXpath)).get(0);
    }

    // Текстовое поле Meta Description
    String txtMetaDescriptionXpath = "//td[@id=\"content\"]//input[@name=\"meta_description[en]\"]";

    public WebElement txtMetaDescription(){
        return driver.findElements(By.xpath(txtMetaDescriptionXpath)).get(0);
    }




    // Поле выбора Default Category

    // Поле выбора Product Groups

    // Текстовое поле Quantity

    // Поле выбора Quantity Unit

    // Поле выбора Delivery Status

    // Поле выбора Sold Out Status

    // Поле загрузки Upload Images

    // Поле выбора Date Valid From

    // Поле выбора Date Valid To


}
