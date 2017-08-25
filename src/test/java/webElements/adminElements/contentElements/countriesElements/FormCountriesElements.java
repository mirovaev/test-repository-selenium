package webElements.adminElements.contentElements.countriesElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.adminPages.countriesPages.EditCountryPage;
import webElements.AbstrElements;
import java.util.List;


public class FormCountriesElements extends AbstrElements {

    public FormCountriesElements(WebDriver driver) {
        super(driver);
    }



    // Xpath FormCountriesElements
    String formCountriesElementsXpath = "//form[@name=\"countries_form\"]";

    // Список кнопок для редактирования стран
    String bOpenEditCountriesXpath = formCountriesElementsXpath + "//tr[position()!=1]//td[@style=\"text-align: right;\"]";
    public List<WebElement> bOpenEditCountries(){
        return driver.findElements(By.xpath(bOpenEditCountriesXpath));
    }
    public EditCountryPage bClickOpenEditCountries(int numberOfCountry){
        driver.findElements(By.xpath(bOpenEditCountriesXpath)).get(numberOfCountry).click();
        return new EditCountryPage(driver);
    }

}
