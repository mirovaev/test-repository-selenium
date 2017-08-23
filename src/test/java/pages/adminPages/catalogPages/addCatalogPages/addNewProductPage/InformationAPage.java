package pages.adminPages.catalogPages.addCatalogPages.addNewProductPage;

import org.openqa.selenium.WebDriver;
import pages.adminPages.catalogPages.addCatalogPages.AbstrAddNewProductAPage;
import webElements.adminElements.contentElements.catalogСontentElements.addCatalogElements.addNewProductElements.InformationElements;

/**
 * Created by tester on 17.08.2017.
 */
public class InformationAPage extends AbstrAddNewProductAPage {

    public InformationAPage(WebDriver driver) {
        super(driver);
    }


    // Добавляем боковое сабменю
    protected InformationElements informationElements;

    public InformationElements informationTab() {
        // Инициализируем элементы, если еще не инициализированны
        if (this.informationElements == null) {
            this.informationElements = new InformationElements(driver);
        }
        return this.informationElements;
    }

}
