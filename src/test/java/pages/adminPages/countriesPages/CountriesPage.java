package pages.adminPages.countriesPages;

import org.openqa.selenium.WebDriver;
import pages.adminPages.catalogPages.AbstrCatalogAdminPage;
import webElements.adminElements.contentElements.countriesElements.FormCountriesElements;


public class CountriesPage extends AbstrCatalogAdminPage {

    public CountriesPage(WebDriver driver) {
        super(driver);
    }


    // Добавляем таблицу со странами
    protected FormCountriesElements formCountriesElements;
    public FormCountriesElements countries() {
        // Инициализируем элементы, если еще не инициализированны
        if (this.formCountriesElements == null) {
            this.formCountriesElements = new FormCountriesElements(driver);
        }
        return this.formCountriesElements;
    }
}
