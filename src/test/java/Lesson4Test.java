import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertTrue;


public class Lesson4Test {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);

    }

    @Test
    public void zadanie7() throws InterruptedException {

        // Логин
        driver.get("http://mirka.ddns.net/litecart/admin/login.php?redirect_url=%2Flitecart%2Fadmin%2F");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        // Логин

        // XPath бокового меню
        String menuString = "//div[contains(@id, \"box-apps-menu-wrapper\")]";

        // XPath для вложенных меню
        String liString = "//ul[contains(@class,\"docs\")]";

        // XPath контента h1
        String contentString = "//td[@id=\"content\"]//h1";

        // Боковое меню
        driver.findElement(By.xpath(menuString));




        // XPath Appearence
        String appearenceString = menuString + "//span[text()=\"Appearence\"]";

        // Кликаем по Appearence
        driver.findElement(By.xpath(appearenceString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Template"));




        // XPath Template
        String templateLiString = menuString + liString + "//span[text()=\"Template\"]";

        // Кликаем по Template
        driver.findElement(By.xpath(templateLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Template"));




        // XPath Logotype
        String logotypeLiString = menuString + liString + "//span[text()=\"Logotype\"]";

        // Кликаем по Logotype
        driver.findElement(By.xpath(logotypeLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Logotype"));




        // XPath Catalog
        String catalogString = menuString + "//span[text()=\"Catalog\"]";

        // Кликаем по Catalog
        driver.findElement(By.xpath(catalogString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Catalog"));




        // XPath Catalog
        String catalogLiString = menuString + liString + "//span[text()=\"Catalog\"]";

        // Кликаем по Catalog
        driver.findElement(By.xpath(catalogLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Catalog"));



        // XPath Product Groups
        String productGroupsLiString = menuString + liString + "//span[text()=\"Product Groups\"]";

        // Кликаем по Product Groups
        driver.findElement(By.xpath(productGroupsLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Product Groups"));




        // XPath Option Groups
        String optionGroupsLiString = menuString + liString + "//span[text()=\"Option Groups\"]";

        // Кликаем по Option Groups
        driver.findElement(By.xpath(optionGroupsLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Option Groups"));




        // XPath Manufacturers
        String manufacturersLiString = menuString + liString + "//span[text()=\"Manufacturers\"]";

        // Кликаем по Manufacturers
        driver.findElement(By.xpath(manufacturersLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Manufacturers"));






        // XPath Suppliers
        String suppliersLiString = menuString + liString + "//span[text()=\"Suppliers\"]";

        // Кликаем по Suppliers
        driver.findElement(By.xpath(suppliersLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Suppliers"));





        // XPath Delivery Statuses
        String deliveryStatusesLiString = menuString + liString + "//span[text()=\"Delivery Statuses\"]";

        // Кликаем по Delivery Statuses
        driver.findElement(By.xpath(deliveryStatusesLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Delivery Statuses"));






        // XPath Sold Out Statuses
        String soldOutStatusesLiString = menuString + liString + "//span[text()=\"Sold Out Statuses\"]";

        // Кликаем по Sold Out Statuses
        driver.findElement(By.xpath(soldOutStatusesLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Sold Out Statuses"));






        // XPath Quantity Units
        String quantityUnitsLiString = menuString + liString + "//span[text()=\"Quantity Units\"]";

        // Кликаем по Quantity Units
        driver.findElement(By.xpath(quantityUnitsLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Quantity Units"));





        // XPath CSV Import/Export
        String cSVImportExportLiString = menuString + liString + "//span[text()=\"CSV Import/Export\"]";

        // Кликаем по CSV Import/Export
        driver.findElement(By.xpath(cSVImportExportLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("CSV Import/Export"));





        // XPath Countries
        String countriesString = menuString + "//span[text()=\"Countries\"]";

        // Кликаем по Countries
        driver.findElement(By.xpath(countriesString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Countries"));





        // XPath Currencies
        String currenciesString = menuString + "//span[text()=\"Currencies\"]";

        // Кликаем по Currencies
        driver.findElement(By.xpath(currenciesString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Currencies"));





        // XPath Customers
        String customersString = menuString + "//span[text()=\"Customers\"]";

        // Кликаем по Customers
        driver.findElement(By.xpath(customersString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Customers"));




        // XPath Customers
        String customersLiString = menuString + liString + "//span[text()=\"Customers\"]";

        // Кликаем по Customers
        driver.findElement(By.xpath(customersLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Customers"));





        // XPath CSV Import/Export
        String cSVImportExportLiString1 = menuString + liString + "//span[text()=\"CSV Import/Export\"]";

        // Кликаем по CSV Import/Export
        driver.findElement(By.xpath(cSVImportExportLiString1)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("CSV Import/Export"));




        // XPath Newsletter
        String newsletterLiString = menuString + liString + "//span[text()=\"Newsletter\"]";

        // Кликаем по Newsletter
        driver.findElement(By.xpath(newsletterLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Newsletter"));






        // XPath Geo Zones
        String geoZonesString = menuString + "//span[text()=\"Geo Zones\"]";

        // Кликаем по Geo Zones
        driver.findElement(By.xpath(geoZonesString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Geo Zones"));




        // XPath Languages
        String languagesString = menuString + "//span[text()=\"Languages\"]";

        // Кликаем по Languages
        driver.findElement(By.xpath(languagesString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Languages"));





        // XPath Languages
        String languagesLiString = menuString + liString + "//span[text()=\"Languages\"]";

        // Кликаем по Languages
        driver.findElement(By.xpath(languagesLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Languages"));





        // XPath Storage Encoding
        String storageEncodingLiString = menuString + liString + "//span[text()=\"Storage Encoding\"]";

        // Кликаем по Storage Encoding
        driver.findElement(By.xpath(storageEncodingLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Storage Encoding"));





        // XPath Modules
        String modulesString = menuString + "//span[text()=\"Modules\"]";

        // Кликаем по Modules
        driver.findElement(By.xpath(modulesString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Modules"));






        // XPath Background Jobs
        String backgroundJobsLiString = menuString + liString + "//span[text()=\"Background Jobs\"]";

        // Кликаем по Background Jobs
        driver.findElement(By.xpath(backgroundJobsLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Job Modules"));






        // XPath Customer
        String customerLiString = menuString + liString + "//span[text()=\"Customer\"]";

        // Кликаем по Customer
        driver.findElement(By.xpath(customerLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Customer Modules"));





        // XPath Shipping
        String shippingLiString = menuString + liString + "//span[text()=\"Shipping\"]";

        // Кликаем по Shipping
        driver.findElement(By.xpath(shippingLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Shipping Modules"));





        // XPath Payment
        String paymentLiString = menuString + liString + "//span[text()=\"Payment\"]";

        // Кликаем по Payment
        driver.findElement(By.xpath(paymentLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Payment Modules"));






        // XPath Order Total
        String orderTotalLiString = menuString + liString + "//span[text()=\"Order Total\"]";

        // Кликаем по Order Total
        driver.findElement(By.xpath(orderTotalLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Order Total Modules"));






        // XPath Order Success
        String orderSuccessLiString = menuString + liString + "//span[text()=\"Order Success\"]";

        // Кликаем по Order Success
        driver.findElement(By.xpath(orderSuccessLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Order Success Modules"));






        // XPath Order Action
        String orderActionLiString = menuString + liString + "//span[text()=\"Order Action\"]";

        // Кликаем по Order Action
        driver.findElement(By.xpath(orderActionLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Order Action Modules"));





        // XPath Orders
        String ordersString = menuString + "//span[text()=\"Orders\"]";

        // Кликаем по Orders
        driver.findElement(By.xpath(ordersString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Orders"));





        // XPath Orders
        String ordersLiString = menuString + liString + "//span[text()=\"Orders\"]";

        // Кликаем по Orders
        driver.findElement(By.xpath(ordersLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Orders"));






        // XPath Order Statuses
        String orderStatusesLiString = menuString + liString + "//span[text()=\"Order Statuses\"]";

        // Кликаем по Order Statuses
        driver.findElement(By.xpath(orderStatusesLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Order Statuses"));





        // XPath Pages
        String pagesString = menuString + "//span[text()=\"Pages\"]";

        // Кликаем по Pages
        driver.findElement(By.xpath(pagesString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Pages"));




        // XPath Reports
        String reportsString = menuString + "//span[text()=\"Reports\"]";

        // Кликаем по Reports
        driver.findElement(By.xpath(reportsString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Monthly Sales"));






        // XPath Monthly Sales
        String monthlySalesLiString = menuString + liString + "//span[text()=\"Monthly Sales\"]";

        // Кликаем по Monthly Sales
        driver.findElement(By.xpath(monthlySalesLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Monthly Sales"));





        // XPath Most Sold Products
        String mostSoldProductsLiString = menuString + liString + "//span[text()=\"Most Sold Products\"]";

        // Кликаем по Most Sold Products
        driver.findElement(By.xpath(mostSoldProductsLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Most Sold Products"));





        // XPath Most Shopping Customers
        String mostShoppingCustomersLiString = menuString + liString + "//span[text()=\"Most Shopping Customers\"]";

        // Кликаем по Most Shopping Customers
        driver.findElement(By.xpath(mostShoppingCustomersLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Most Shopping Customers"));





        // XPath Settings
        String SettingsString = menuString + "//span[text()=\"Settings\"]";

        // Кликаем по Settings
        driver.findElement(By.xpath(SettingsString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Settings"));







        // XPath Store Info
        String storeInfoLiString = menuString + liString + "//span[text()=\"Store Info\"]";

        // Кликаем по Store Info
        driver.findElement(By.xpath(storeInfoLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Settings"));




        // XPath Defaults
        String defaultsLiString = menuString + liString + "//span[text()=\"Defaults\"]";

        // Кликаем по Defaults
        driver.findElement(By.xpath(defaultsLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Settings"));





        // XPath General
        String generalLiString = menuString + liString + "//span[text()=\"General\"]";

        // Кликаем по General
        driver.findElement(By.xpath(defaultsLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Settings"));







        // XPath Listings
        String listingsLiString = menuString + liString + "//span[text()=\"Listings\"]";

        // Кликаем по Listings
        driver.findElement(By.xpath(listingsLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Settings"));






        // XPath Images
        String imagesLiString = menuString + liString + "//span[text()=\"Images\"]";

        // Кликаем по Images
        driver.findElement(By.xpath(imagesLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Settings"));






        // XPath Checkout
        String checkoutLiString = menuString + liString + "//span[text()=\"Checkout\"]";

        // Кликаем по Checkout
        driver.findElement(By.xpath(checkoutLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Settings"));






        // XPath Advanced
        String advancedLiString = menuString + liString + "//span[text()=\"Advanced\"]";

        // Кликаем по Advanced
        driver.findElement(By.xpath(advancedLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Settings"));






        // XPath Security
        String securityLiString = menuString + liString + "//span[text()=\"Security\"]";

        // Кликаем по Security
        driver.findElement(By.xpath(securityLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Settings"));




        // XPath Slides
        String slidesString = menuString + "//span[text()=\"Slides\"]";

        // Кликаем по Slides
        driver.findElement(By.xpath(slidesString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Slides"));





        // XPath Tax
        String taxString = menuString + "//span[text()=\"Tax\"]";

        // Кликаем по Tax
        driver.findElement(By.xpath(taxString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Tax Classes"));




        // XPath Tax Classes
        String taxClassesLiString = menuString + liString + "//span[text()=\"Tax Classes\"]";

        // Кликаем по Tax Classes
        driver.findElement(By.xpath(taxClassesLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Tax Classes"));




        // XPath Tax Rates
        String taxRatesLiString = menuString + liString + "//span[text()=\"Tax Rates\"]";

        // Кликаем по Tax Rates
        driver.findElement(By.xpath(taxRatesLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Tax Rates"));





        // XPath Translations
        String translationsString = menuString + "//span[text()=\"Translations\"]";

        // Кликаем по Translations
        driver.findElement(By.xpath(translationsString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Search Translations"));






        // XPath Translations
        String translationsLiString = menuString + liString + "//span[text()=\"Search Translations\"]";

        // Кликаем по Translations
        driver.findElement(By.xpath(translationsLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Search Translations"));



        // XPath Scan Files
        String scanFilesLiString = menuString + liString + "//span[text()=\"Scan Files\"]";

        // Кликаем по Scan Files
        driver.findElement(By.xpath(scanFilesLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Scan Files For Translations"));






        // XPath CSV Import/Export
        String cSVImportExportLiString2 = menuString + liString + "//span[text()=\"CSV Import/Export\"]";

        // Кликаем по CSV Import/Export
        driver.findElement(By.xpath(cSVImportExportLiString2)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("CSV Import/Export"));





        // XPath Users
        String usersString2 = menuString + "//span[text()=\"Users\"]";

        // Кликаем по Users
        driver.findElement(By.xpath(usersString2)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("Users"));




        // XPath vQmods
        String vQmodsString = menuString + "//span[text()=\"vQmods\"]";

        // Кликаем по vQmods
        driver.findElement(By.xpath(vQmodsString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("vQmods"));




        // XPath vQmods
        String vQmodsLiString = menuString + liString + "//span[text()=\"vQmods\"]";

        // Кликаем по vQmods
        driver.findElement(By.xpath(vQmodsLiString)).click();

        // проверяем текст заголовка h1
        assertTrue(driver.findElement(By.xpath(contentString)).getText().contains("vQmods"));








    }

    @Test
    public void zadanie8() throws InterruptedException {

        driver.get("http://mirka.ddns.net/litecart");

        // XPath продукта
        String productString = "//li[contains(@class, \"product\")]";

        // XPath стикеров
        String stickerString = ".//div[contains(@class, \"sticker\")]";

        System.out.println("Начало теста **************************** ");


        List<WebElement> webElementList = driver.findElements(By.xpath(productString));

        System.out.println("Найдено: " + webElementList.size() + " товаров.");
        int i = 0;
        for (WebElement element : webElementList) {
            List<WebElement> elementList = element.findElements(By.xpath(stickerString));
            i++;
            System.out.println("Найдено: " + elementList.size() + " стикер(а)(ов) у " + i + " товара.");
            assertTrue(elementList.size() == 1);
        }

    }


    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}
