package pages.userPages;

import org.openqa.selenium.WebDriver;
import webElements.userElements.*;

// Страница Корзины
public class CheckoutPage extends AUserPage {

    public CheckoutPage(WebDriver driver) {
        super(driver);
        pageURL = "http://mirka.ddns.net/litecart/index.php/en/checkout";
    }

    // Добавляем DivMostPopular
    protected CartForm cartForm;

    public CartForm cartForm() {
        // Инициализируем элементы, если еще не инициализированны
        if (this.cartForm == null) {
            this.cartForm = new CartForm(driver);
        }
        return this.cartForm;
    }





}
