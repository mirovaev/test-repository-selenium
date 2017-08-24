import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.adminPages.AdminPage;
import pages.adminPages.LoginPage;
import pages.adminPages.countriesPages.CountriesPage;
import pages.adminPages.countriesPages.EditCountryPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


/**
 * Created by tester on 27.07.2017.
 */
public class Lesson8Test {
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
    public void zadanie14() throws InterruptedException {

        // Переходим на страницу входа в админку
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Start();

        // Входим в админку
        AdminPage adminPage = loginPage.avtoLoginCorrect();
        // Входим в раздел редактирования каталога

        // Нажимаем на кнопку Countries бокового меню
        CountriesPage countriesPage = adminPage.sidebar().bClickCountries();

        // Нажимаем на редактирование первой страны
        EditCountryPage editCountryPage = countriesPage.countries().bClickOpenEditCountries(0);

        // Находим сколько всего ссылок
        int count = editCountryPage.editCountry().linksWebElements().size();

        // Запоминаем идентификаторы уже открытых окон
        Set<String> existingWindows = driver.getWindowHandles();
        // Запоминаем идентификатор текущего окна
        String originalWindow = driver.getWindowHandle();
        System.out.println("Orig " + originalWindow);

        // Перебираем ссылки
        for (int i = 0; i < count; i++) {
            // щелкаем по i ссылке
            editCountryPage.editCountry().linksOpenWebElements(i);

            // Ждем появление нового окна с текущим идентификатором
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));

            // Находим идентификаторы окон
            Set<String> windowHandles = driver.getWindowHandles();
            // Убираем из них все старые
            windowHandles.removeAll(existingWindows);

            // Находим идентификатор нового окна
            String windowHandle = windowHandles.iterator().next();

            System.out.println("New  " + windowHandle);

            // Переходим в найденное окно
            driver.switchTo().window(windowHandle);

            // Закрываем окно
            driver.close();

            // переходим в окно с редактированием страны
            driver.switchTo().window(originalWindow);
        }
    }
}
