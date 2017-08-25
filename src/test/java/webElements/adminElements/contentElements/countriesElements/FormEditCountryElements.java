package webElements.adminElements.contentElements.countriesElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webElements.AbstrElements;

import java.util.List;


public class FormEditCountryElements extends AbstrElements {

    public FormEditCountryElements(WebDriver driver) {
        super(driver);
    }



    // Xpath FormCountriesElements
    String formCountriesElementsXpath = "//form[@method=\"post\"]";

    // Список ссылок
    String linksWebElementsXpath = formCountriesElementsXpath + "//a[contains(@href, \"http\")]";
    public List<WebElement> linksWebElements(){
        System.out.println("Всего ссылок " + driver.findElements(By.xpath(linksWebElementsXpath)).size());
        return driver.findElements(By.xpath(linksWebElementsXpath));
    }
    public void linksOpenWebElements(int numberOfCountry){
        driver.findElements(By.xpath(linksWebElementsXpath)).get(numberOfCountry).click();
    }

}
