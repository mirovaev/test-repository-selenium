package pages.adminPages.catalogPages.addCatalogPages.addNewProductPage;

import org.openqa.selenium.WebDriver;
import pages.adminPages.catalogPages.addCatalogPages.AbstrAddNewProductAPage;
import webElements.adminElements.contentElements.catalogСontentElements.addCatalogElements.addNewProductElements.PricesElements;

public class PricesAPage extends AbstrAddNewProductAPage {

    public PricesAPage(WebDriver driver) {
        super(driver);
    }


    // Добавляем вкладку Prices
    protected PricesElements pricesElements;

    public PricesElements pricesTab() {
        // Инициализируем элементы, если еще не инициализированны
        if (this.pricesElements == null) {
            this.pricesElements = new PricesElements(driver);
        }
        return this.pricesElements;
    }

}
