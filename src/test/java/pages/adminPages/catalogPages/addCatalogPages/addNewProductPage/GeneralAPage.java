package pages.adminPages.catalogPages.addCatalogPages.addNewProductPage;

import org.openqa.selenium.WebDriver;
import pages.adminPages.catalogPages.addCatalogPages.AbstrAddNewProductAPage;
import webElements.adminElements.contentElements.catalogСontentElements.addCatalogElements.addNewProductElements.GeneralElements;

/**
 * Created by tester on 17.08.2017.
 */
public class GeneralAPage extends AbstrAddNewProductAPage {

    public GeneralAPage(WebDriver driver) {
        super(driver);
    }


    // Добавляем боковое сабменю
    protected GeneralElements generalElements;

    public GeneralElements generalTab() {
        // Инициализируем элементы, если еще не инициализированны
        if (this.generalElements == null) {
            this.generalElements = new GeneralElements(driver);
        }
        return this.generalElements;
    }

}
