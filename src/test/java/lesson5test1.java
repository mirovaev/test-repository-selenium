import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class lesson5test1 {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);

    }

    @Test
    public void zadanie9() throws InterruptedException {

        // Логин
        driver.get("http://mirka.ddns.net/litecart/admin/login.php?redirect_url=%2Flitecart%2Fadmin%2F");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        // Логин

        // Находим необходимую страницу
        // XPath бокового меню
        String menuString = "//div[contains(@id, \"box-apps-menu-wrapper\")]";

        // XPath Countries
        String countriesString = menuString + "//span[text()=\"Countries\"]";

        // Кликаем по Countries
        driver.findElement(By.xpath(countriesString)).click();

        // Находим список webElements списка Стран
        List<WebElement> webElementListCountries = driver.findElements(By.xpath("//tr[@class='row']/td[5]"));

        List<String> countries = new ArrayList<String>();
        // Заполняем список стран
        for(WebElement element: webElementListCountries) {
            countries.add(element.getText());
        }
        // Проверяем страны на расположение в алфавитном порядке
        //Находим размер массива стран
        int countriesSize = countries.size();
        // Элементы в алфавитном порядке?
        Boolean countriesIsOk = true;
        // Номер страны по списку, который расположен не правильно
        int numberIsNotOk = -1;
        for (int i = 0; i < countriesSize - 1; i++) {
            int res = countries.get(i).compareTo(countries.get(i + 1));
            if (res > 0) {
                countriesIsOk = false;
                numberIsNotOk = i;
            }
        }
        assertTrue(countriesIsOk);



    }

    @Test
    public void zadanie9b() {

        // Логин
        driver.get("http://mirka.ddns.net/litecart/admin/login.php?redirect_url=%2Flitecart%2Fadmin%2F");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        // Логин

        // Находим необходимую страницу
        // XPath бокового меню
        String menuString = "//div[contains(@id, \"box-apps-menu-wrapper\")]";


        // XPath Countries
        String countriesString = menuString + "//span[text()=\"Countries\"]";

        // Кликаем по Countries
        driver.findElement(By.xpath(countriesString)).click();



        // Находим список webElements списка Зон
        List<WebElement> webElementListZones = driver.findElements(By.xpath("//tr[@class='row']/td[6]"));

        List<String> stringListZonesXpath = new ArrayList<String>();

        // Создаем список Зон
        int webElementListZonesSize = webElementListZones.size();
        for(int i = 0; i < webElementListZonesSize; i++) {
            // Находим количество Зон у элемента
          //  System.out.println(webElementListZones.get(i).getText());
            int countZones = Integer.parseInt(webElementListZones.get(i).getText());
            if (countZones > 0) {
                String xPath = "(//tr[@class='row']/td[5])[" + (i + 1) + "]/a";
                stringListZonesXpath.add(xPath);
            }
        }

        //перебираем список где зон >0
        for (String str: stringListZonesXpath){
            driver.findElement(By.xpath(str)).click();
            //перебор массива зон внутри страны
            List<WebElement> webElementListCountryZones = driver.findElements(By.xpath("//input[contains(@name, '][name]')]"));

            List<String> stringListCountryZonesXpath = new ArrayList<String>();
            // Заполняем список зон
            for(WebElement element: webElementListCountryZones) {
                stringListCountryZonesXpath.add(element.getText());
            }

            // Проверяем Зоны на расположение в алфавитном порядке
            //Находим размер массива зон
            int zoneSize = webElementListCountryZones.size();
            // Элементы в алфавитном порядке?
            Boolean zoneSizeIsOk = true;
            // Номер Зоны по списку, который расположен не правильно
            int numberIsNotOk = -1;
            for (int i = 0; i < zoneSize - 1; i++) {
                int res = stringListCountryZonesXpath.get(i).compareTo(stringListCountryZonesXpath.get(i + 1));
                if (res > 0) {
                    zoneSizeIsOk = false;
                    numberIsNotOk = i;
                }
            }
            assertTrue(zoneSizeIsOk);

            driver.navigate().back();
        }
    }

    @Test
    public void zadanie9_2() {

        // Логин
        driver.get("http://mirka.ddns.net/litecart/admin/login.php?redirect_url=%2Flitecart%2Fadmin%2F");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        // Логин

        // Находим необходимую страницу
        // XPath бокового меню
        String menuString = "//div[contains(@id, \"box-apps-menu-wrapper\")]";


        // XPath Geo Zones
        String zonesString = menuString + "//span[text()=\"Geo Zones\"]";

        // Кликаем по Geo Zones
        driver.findElement(By.xpath(zonesString)).click();



        // Находим список webElements списка Зон
        List<WebElement> webElementZones = driver.findElements(By.xpath("//tr[@class='row']/td[3]"));

        List<String> stringListZonesXpath = new ArrayList<String>();

        // Создаем список Зон
        int webElementListZonesSize = webElementZones.size();
        for(int i = 0; i < webElementListZonesSize; i++) {
            // Находим количество Зон у элемента
                String xPath = "(//tr[@class='row']/td[3])[" + (i + 1) + "]/a";
                stringListZonesXpath.add(xPath);
        }

        //перебираем список где зон
        for (String str: stringListZonesXpath){
            driver.findElement(By.xpath(str)).click();
            //перебор массива зон внутри страны
            List<WebElement> webElementListCountryZones = driver.findElements(By.xpath("//select[contains(@name,'][zone_code]')]"));

            List<String> stringListCountryZonesXpath = new ArrayList<String>();
            // Заполняем список зон
            for(WebElement element: webElementListCountryZones) {
                stringListCountryZonesXpath.add(element.getText());
            }

            // Проверяем Зоны на расположение в алфавитном порядке
            //Находим размер массива зон
            int zoneSize = webElementListCountryZones.size();
            // Элементы в алфавитном порядке?
            Boolean zoneSizeIsOk = true;
            // Номер Зоны по списку, который расположен не правильно
            int numberIsNotOk = -1;
            for (int i = 0; i < zoneSize - 1; i++) {
                int res = stringListCountryZonesXpath.get(i).compareTo(stringListCountryZonesXpath.get(i + 1));
                if (res > 0) {
                    zoneSizeIsOk = false;
                    numberIsNotOk = i;
                }
            }
            assertTrue(zoneSizeIsOk);

            driver.navigate().back();
        }
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }





}
