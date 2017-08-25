package pages.adminPages.catalogPages.editProductPages.editProductPage;

import org.openqa.selenium.WebDriver;
import pages.adminPages.catalogPages.editProductPages.AbstrEditProductAPage;
import webElements.adminElements.contentElements.catalogСontentElements.addCatalogElements.addNewProductElements.GeneralElements;

public class GeneralAPage extends AbstrEditProductAPage {

    public GeneralAPage(WebDriver driver) {
        super(driver);
    }


    // Добавляем вкладку General
    protected GeneralElements generalElements;

    public GeneralElements generalTab() {
        // Инициализируем элементы, если еще не инициализированны
        if (this.generalElements == null) {
            this.generalElements = new GeneralElements(driver);
        }
        return this.generalElements;
    }

}
