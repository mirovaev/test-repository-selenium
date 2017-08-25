package pages.adminPages.catalogPages;

import org.openqa.selenium.WebDriver;
import pages.adminPages.AbstrAdminPage;
import webElements.adminElements.sidebarElements.CatalogSidebarElements;


public class AbstrCatalogAdminPage extends AbstrAdminPage {

    public AbstrCatalogAdminPage(WebDriver driver) {
        super(driver);
    }


    // Добавляем боковое сабменю
    protected CatalogSidebarElements catalogSidebarElements;

    public CatalogSidebarElements catalogSidebar() {
        // Инициализируем элементы, если еще не инициализированны
        if (this.catalogSidebarElements == null) {
            this.catalogSidebarElements = new CatalogSidebarElements(driver);
        }
        return this.catalogSidebarElements;
    }
}
