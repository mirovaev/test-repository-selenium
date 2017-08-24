package webElements.adminElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.adminPages.catalogPages.CatalogAdminPage;
import pages.adminPages.countriesPages.CountriesPage;
import webElements.AbstrElements;
import org.openqa.selenium.WebDriver;


public class SidebarElements extends AbstrElements{

    public SidebarElements (WebDriver driver) {
        super(driver);
    }




    // XPath бокового меню
    String menuString = "//div[contains(@id, \"box-apps-menu-wrapper\")]";

    // XPath Catalog
    protected String bCatalogXpath = menuString + "//span[text()=\"Catalog\"]";

    public WebElement bCatalog(){
        return driver.findElements(By.xpath(bCatalogXpath)).get(0);
    }
    // Нажимаем на кнопку General
    public CatalogAdminPage bClickCatalog(){
        driver.findElements(By.xpath(bCatalogXpath)).get(0).click();
        return new CatalogAdminPage(driver);
    }




    // XPath Countries
    protected String bCountriesXpath = menuString + "//span[text()=\"Countries\"]";

    public WebElement bCountries(){
        return driver.findElements(By.xpath(bCountriesXpath)).get(0);
    }
    // Нажимаем на кнопку General
    public CountriesPage bClickCountries(){
        driver.findElements(By.xpath(bCountriesXpath)).get(0).click();
        return new CountriesPage(driver);
    }

}
