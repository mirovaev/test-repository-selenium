package webElements.adminElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.adminPages.catalogPages.CatalogAdminPage;
import webElements.AbstrElements;
import org.openqa.selenium.WebDriver;

/**
 * Created by tester on 21.08.2017.
 */
public class SidebarElements extends AbstrElements{

    public SidebarElements (WebDriver driver) {
        super(driver);
    }




    // XPath бокового меню
    String menuString = "//div[contains(@id, \"box-apps-menu-wrapper\")]";

    // XPath Appearence
    protected String bCatalogXpath = menuString + "//span[text()=\"Catalog\"]";

    public WebElement bCatalog(){
        return driver.findElements(By.xpath(bCatalogXpath)).get(0);
    }
    // Нажимаем на кнопку General
    public CatalogAdminPage bClickCatalog(){
        driver.findElements(By.xpath(bCatalogXpath)).get(0).click();
        return new CatalogAdminPage(driver);
    }


}
