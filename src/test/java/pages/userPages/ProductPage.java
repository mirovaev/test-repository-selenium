package pages.userPages;

import org.openqa.selenium.WebDriver;
import webElements.userElements.*;


public class ProductPage extends AUserPage {

    public ProductPage(WebDriver driver) {
        super(driver);
        pageURL = "http://mirka.ddns.net/litecart/index.php/en/";
    }

    // Добавляем DivMostPopular
    protected IdBoxProduct idBoxProduct;

    public IdBoxProduct idBoxProduct() {
        // Инициализируем элементы, если еще не инициализированны
        if (this.idBoxProduct == null) {
            this.idBoxProduct = new IdBoxProduct(driver);
        }
        return this.idBoxProduct;
    }



}
