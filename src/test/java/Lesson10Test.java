import com.google.common.io.Files;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.adminPages.AdminPage;
import pages.adminPages.LoginPage;
import pages.adminPages.catalogPages.CatalogAdminPage;
import pages.adminPages.catalogPages.editProductPages.editProductPage.GeneralAPage;

import java.io.File;
import java.io.IOException;

public class Lesson10Test {
    private EventFiringWebDriver driver;
    private WebDriverWait wait;

    public static class MyListener extends AbstractWebDriverEventListener {

        @Override
        public void beforeFindBy(By by, WebElement element, WebDriver driver) {
            //System.out.println("Try to find element: " + by);
        }

        @Override
        public void afterFindBy(By by, WebElement element, WebDriver driver) {
            //System.out.println("Element found: " + by);
        }

        @Override
        public void onException(Throwable throwable, WebDriver driver) {
            System.out.println("ERROR to find element: " + throwable);
            File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File screen = new File("screen-" + System.currentTimeMillis() + ".png");
            try {
                Files.copy(tmp, screen);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(screen);
        }


    }

    @Before
    public void start() {
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new MyListener());
        wait = new WebDriverWait(driver, 10);
    }


    @After
    public void stop() {
        driver.quit();
        driver = null;
    }


    @Test
    public void zadanie17() throws InterruptedException {

        // Переходим на страницу входа в админку
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Start();

        // проверяем на наличие ошибок на сайте
        driver.manage().logs().get("browser").forEach(l -> System.out.println(l));

        // Входим в админку
        AdminPage adminPage = loginPage.avtoLoginCorrect();

        // проверяем на наличие ошибок на сайте
        driver.manage().logs().get("browser").forEach(l -> System.out.println(l));

        // Нажимаем на кнопку Catalog бокового меню
        CatalogAdminPage catalogAdminPage = adminPage.sidebar().bClickCatalog();

        // проверяем на наличие ошибок на сайте
        driver.manage().logs().get("browser").forEach(l -> System.out.println(l));


        // Раскрываем все закрытые папки
        while (catalogAdminPage.products().countOfClosedFolder() > 0) {
            catalogAdminPage.products().bOpenClickClosedFolder(0);
        }

        // Находим количество ссылок на продукцию
        int countOfLinks = catalogAdminPage.products().countOfProduct();

        // Номер текущей проверяемой ссылки
        int numberOfLink = 0;

        while (numberOfLink < countOfLinks) {

            GeneralAPage generalAPage = catalogAdminPage.products().bOpenClickProduct(numberOfLink);

            // проверяем на наличие ошибок на странице
            driver.manage().logs().get("browser").forEach(l -> System.out.println(l));

            // Возвращаемся на предудущую страницу
            generalAPage.bPrevPageClick();
            catalogAdminPage = new CatalogAdminPage(driver);

            // Следующая сссылка
            numberOfLink++;

            // Находим количество ссылок на продукцию
            countOfLinks = catalogAdminPage.products().countOfProduct();
        }

        Thread.sleep(2000);

    }


}
