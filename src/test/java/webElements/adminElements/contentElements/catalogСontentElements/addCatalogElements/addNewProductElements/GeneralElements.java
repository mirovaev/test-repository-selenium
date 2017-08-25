package webElements.adminElements.contentElements.catalogСontentElements.addCatalogElements.addNewProductElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webElements.adminElements.contentElements.catalogСontentElements.addCatalogElements.AbstrAddNewProductElements;


public class GeneralElements extends AbstrAddNewProductElements {

    public GeneralElements(WebDriver driver) {
        super(driver);
    }


    // Радиокнопки Status


    // Текстовое поле Name
    String txtNameXpath = "//td[@id=\"content\"]//input[@name=\"name[en]\"]";
    public WebElement txtName(){
        //WebDriverWait wait = new WebDriverWait(driver, 5);
        //return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(txtNameXpath)));
        return driver.findElements(By.xpath(txtNameXpath)).get(0);
    }
    public void txtSendKeysName(String str){
        driver.findElements(By.xpath(txtNameXpath)).get(0).sendKeys(str);
    }

    // Текстовое поле Code
    String txtCodeXpath = "//td[@id=\"content\"]//input[@name=\"code\"]";
    public WebElement txtCode(){
        return driver.findElements(By.xpath(txtCodeXpath)).get(0);
    }
    public void txtSendKeysCode(String str){
        driver.findElements(By.xpath(txtCodeXpath)).get(0).sendKeys(str);
    }

    // Поле выбора Categories


    // Поле выбора Default Category


    // Поле выбора Product Groups


    // Текстовое поле Quantity
    String txtQuantityXpath = "//td[@id=\"content\"]//input[@name=\"quantity\"]";
    public WebElement txtQuantity(){
        return driver.findElements(By.xpath(txtQuantityXpath)).get(0);
    }


    // Поле выбора Quantity Unit


    // Поле выбора Delivery Status

    // Поле выбора Sold Out Status


    // Поле загрузки Upload Images
    String txtUploadImagesXpath = "//td[@id=\"content\"]//input[@name=\"new_images[]\"]";
    public WebElement txtUploadImages(){
        return driver.findElements(By.xpath(txtUploadImagesXpath)).get(0);
    }


    // Поле выбора Date Valid From


    // Поле выбора Date Valid To


}
