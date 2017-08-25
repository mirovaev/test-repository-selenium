package pages.adminPages.countriesPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.adminPages.catalogPages.AbstrCatalogAdminPage;
import webElements.adminElements.contentElements.countriesElements.FormEditCountryElements;

import java.util.List;

public class EditCountryPage extends AbstrCatalogAdminPage {

    public EditCountryPage(WebDriver driver) {
        super(driver);
    }



    // Заголовок страницы редактирования страны
    String txtCaptionXpath = "//h1[text()=\" Edit Country\"]";
    public WebElement txtWebElementCaption(){
        return driver.findElements(By.xpath(txtCaptionXpath)).get(0);
    }
    public String txtCaption(){
        return driver.findElements(By.xpath(txtCaptionXpath)).get(0).getText();
    }

    public boolean isLoadPage(){
        System.out.println(driver.findElements(By.xpath(txtCaptionXpath)).get(0).getText());
        return driver.findElements(By.xpath(txtCaptionXpath)).get(0).getText().contains("Edit Country");
    }


    // Добавляем форму редактирования страны
    protected FormEditCountryElements formEditCountryElements;
    public FormEditCountryElements editCountry() {
        // Инициализируем элементы, если еще не инициализированны
        if (this.formEditCountryElements == null) {
            this.formEditCountryElements = new FormEditCountryElements(driver);
        }
        return this.formEditCountryElements;
    }






}
