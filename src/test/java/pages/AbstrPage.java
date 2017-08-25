package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by tester on 17.08.2017.
 */
public class AbstrPage {

    public AbstrPage(WebDriver driver){
        this.driver = driver;
    }

    // Поля
    protected WebDriver driver;
    //protected WebDriverWait wait;
    protected String pageURL;                           // URL адресс страницы
    protected String pagePreviosURL;                    // предыдущая страница


    // Переход назад по истории посещенных страниц
    public AbstrPage bPrevPageClick() {
        this.driver.navigate().back();
        return new AbstrPage(driver);
    }

    // Стартуем
    public void Start() {
        driver.get(pageURL);
    }

    public String Title() {
        return driver.getTitle();
    }
}
