package pages.userPages;


import org.openqa.selenium.WebDriver;
import webElements.userElements.*;


public class MainPage extends AUserPage {

    public MainPage(WebDriver driver) {
        super(driver);
        pageURL = "http://mirka.ddns.net/litecart/index.php/en/";
    }

    // Добавляем DivMostPopular
    protected DivMostPopular divMostPopular;

    public DivMostPopular divMostPopular() {
        // Инициализируем элементы, если еще не инициализированны
        if (this.divMostPopular == null) {
            this.divMostPopular = new DivMostPopular(driver);
        }
        return this.divMostPopular;
    }



}
