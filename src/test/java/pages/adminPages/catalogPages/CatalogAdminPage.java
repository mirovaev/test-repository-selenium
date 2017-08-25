package pages.adminPages.catalogPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.adminPages.catalogPages.addCatalogPages.addNewProductPage.GeneralAPage;
import webElements.adminElements.contentElements.catalogСontentElements.ProductsCatalogElements;

import java.util.List;


public class CatalogAdminPage extends AbstrCatalogAdminPage {

    public CatalogAdminPage(WebDriver driver) {
        super(driver);
    }



    // Кнопка добавление новой категрии
    String addNewCategoryXpath = "//td[@id=\"content\"]//a[contains(text(),\"Add New Category\")]";
    public WebElement bAddNewCategory(){
        return driver.findElements(By.xpath(addNewCategoryXpath)).get(0);
    }


    // Кнопка добавление нового товара
    String addNewProductXpath = "//td[@id=\"content\"]//a[contains(text(),\"Add New Product\")]";
    public WebElement bAddNewProduct(){
        return driver.findElements(By.xpath(addNewProductXpath)).get(0);
    }


    public GeneralAPage bClickAddNewProduct(){
        driver.findElements(By.xpath(addNewProductXpath)).get(0).click();
        return new GeneralAPage(driver);
    }


    // Кнопка добавление новой категрии
    String bEnableProductXpath = "//button[@name=\"enable\"]";
    public WebElement bEnableProduct(){
        return driver.findElements(By.xpath(bEnableProductXpath)).get(0);
    }
    public void bClickEnableProduct(){
        driver.findElements(By.xpath(bEnableProductXpath)).get(0).click();
    }



    // Генерируем уникальное имя
    public String uniqueName() {
        // Найдем список продукции
        // Цикл для нахождения уникального названия продукции
        String productNameNew = "";
        for (int i = 0; i < 100; i++){
            boolean isMatches = false;;
            // Цикл на перебор не соответствия созданным продукциями
            List<String> productsNames = products().getProductsTexts();
            for (int j = 0; j < productsNames.size(); j++) {
                // Создаем "уникальное" название товара
                productNameNew = "duck" + i;
                // Сравниваем является ли "уникальным"
                if (productsNames.get(j).compareTo(productNameNew) == 0){
                    // названия совпадают, дальше не ищем
                    isMatches = true;
                    break;
                }
            }
            // если совпадений в предыдущем цикле не найдено, то email уникальный
            if (!isMatches) {
                break;
            }
        }
        return productNameNew;
    }


    // Добавляем таблицу с товарами
    protected ProductsCatalogElements productsCatalogElements;
    public ProductsCatalogElements products() {
        // Инициализируем элементы, если еще не инициализированны
        if (this.productsCatalogElements == null) {
            this.productsCatalogElements = new ProductsCatalogElements(driver);
        }
        return this.productsCatalogElements;
    }








    //FormCountriesElements

}
