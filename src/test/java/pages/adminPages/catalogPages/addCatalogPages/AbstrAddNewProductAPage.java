package pages.adminPages.catalogPages.addCatalogPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.adminPages.catalogPages.AbstrCatalogAdminPage;
import pages.adminPages.catalogPages.CatalogAdminPage;


public class AbstrAddNewProductAPage extends AbstrCatalogAdminPage {

    public AbstrAddNewProductAPage(WebDriver driver) {
        super(driver);
    }

    // Кнопка Save
    String bSaveXpath = "//td[@id=\"content\"]//button[@name=\"save\"]";
    public WebElement bSave(){
        return driver.findElements(By.xpath(bSaveXpath)).get(0);
    }
    // Нажимаем на кнопку Save
    public CatalogAdminPage bClickSave(){
        driver.findElements(By.xpath(bSaveXpath)).get(0).click();
        return new CatalogAdminPage(driver);
    }


    // Кнопка Cancel
    String bCancelXpath = "//td[@id=\"content\"]//button[@name=\"cancel\"]";
    public WebElement bCancel(){
        return driver.findElements(By.xpath(bCancelXpath)).get(0);
    }
    // Нажимаем на кнопку Cancel
    public CatalogAdminPage bClickCancel(){
        driver.findElements(By.xpath(bCancelXpath)).get(0).click();
        return new CatalogAdminPage(driver);
    }


    // Кнопка Delete
    String bDeleteXpath = "//td[@id=\"content\"]//button[@name=\"delete\"]";
    public WebElement bDelete(){
        return driver.findElements(By.xpath(bDeleteXpath)).get(0);
    }
    // Нажимаем на кнопку Delete
    public CatalogAdminPage bClickDelete(){
        driver.findElements(By.xpath(bDeleteXpath)).get(0).click();
        return new CatalogAdminPage(driver);
    }



}
