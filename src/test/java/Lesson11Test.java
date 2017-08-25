import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.userPages.CheckoutPage;
import pages.userPages.MainPage;
import pages.userPages.ProductPage;


public class Lesson11Test {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }


    @After
    public void stop() {
        driver.quit();
        driver = null;
    }


    @Test
    public void zadanie19() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);
        // Заходим на главную страницу
        mainPage.Start();

        // Добавляем в корзину 6 рандомных продуктов
        int countProducts = new CatalogLogic(driver).addToCartRandomProduct(6);

        new CatalogLogic(driver).deleteFromCart(2);

        Thread.sleep(5000);
    }
}
