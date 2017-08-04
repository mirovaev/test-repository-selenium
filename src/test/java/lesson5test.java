import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class lesson5test {
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

    @Test
    public void zadanie10() {

        driver.get("http://mirka.ddns.net/litecart");


        // Ссылка на новую страницу
        String clickDuckMainXpath = "//div[@id=\"box-campaigns\"]//a";

        // название УТКИ главной страницы
        String nameDuckMainXpath = "//div[@id=\"box-campaigns\"]//div[@class=\"name\"]";

        // Цена обычная главной страницы
        String priceRegularDuckMainXpath = "//div[@id=\"box-campaigns\"]//div[@class=\"price-wrapper\"]/*[@class=\"regular-price\"]";

        // Цена красная главной страницы
        String priceCampaignDuckMainXpath = "//div[@id=\"box-campaigns\"]//div[@class=\"price-wrapper\"]/*[@class=\"campaign-price\"]";

        // название страницы товара
        String nameDuckProductXpath = "//div[@id=\"box-product\"]//h1";

        // Цена обычная страницы товара
        String priceRegularDuckProductXpath = "//div[@id=\"box-product\"]//div[@class=\"price-wrapper\"]/*[@class=\"regular-price\"]";

        // Цена красная страницы товара
        String priceCampaignDuckProductXpath = "//div[@id=\"box-product\"]//div[@class=\"price-wrapper\"]/*[@class=\"campaign-price\"]";

        //находим название товар на главной странице
        WebElement elementNameMain = driver.findElement(By.xpath(nameDuckMainXpath));
        String nameMain = elementNameMain.getText();

        //находим обычную цену товара
        WebElement elementRegularMain = driver.findElement(By.xpath(priceRegularDuckMainXpath));
        String regularMain = elementRegularMain.getText();

        String elementRegularMainColor = elementRegularMain.getCssValue("color");
        System.out.println(elementRegularMainColor);
        //вырезаем значение RGB для R
        //для хром
        String substring0 = elementRegularMainColor.substring(5,elementRegularMainColor.length() - 4);
        //для FireFox
        //String substring0 = elementRegularMainColor.substring(4,elementRegularMainColor.length() - 1);
        String substring0R = substring0.substring(0,substring0.indexOf(","));

        //вырезаем значение RGB для G
        String substring0G = substring0.substring(substring0.indexOf(",")+2,substring0.lastIndexOf(","));

        //вырезаем значение RGB для B
        String substring0B = substring0.substring(substring0.lastIndexOf(",")+2);

        //сравнение цветов для regular
        System.out.println(substring0);
        assertTrue(substring0R.equals(substring0G));
        assertTrue(substring0B.equals(substring0G));

        // находим зачеркнута ли цена обычная
        String elementRegularMainTextDecoration = elementRegularMain.getCssValue("text-decoration");
        assertTrue(elementRegularMainTextDecoration.contains("line-through"));

        //Находим размер обычной цены
        String elementRegularMainTextFontSize = elementRegularMain.getCssValue("font-size");
        elementRegularMainTextFontSize = elementRegularMainTextFontSize.substring(0,elementRegularMainTextFontSize.length() -2);
        double regularMainTextFontSize = Double.parseDouble(elementRegularMainTextFontSize);

        //Работа с Акционной ценой на главной странице
        WebElement elementCampaignMain = driver.findElement(By.xpath(priceCampaignDuckMainXpath));
        String campaignMain = elementCampaignMain.getText();
        String elementCampaignMainColor = elementCampaignMain.getCssValue("color");
        //вырезаем значение RGB для R
        //для хром
        String substring1 = elementCampaignMainColor.substring(5,elementCampaignMainColor.length() - 4);
        //для Firefox
        //String substring1 = elementCampaignMainColor.substring(4,elementCampaignMainColor.length() - 1);

        String substring1R = substring1.substring(0,substring1.indexOf(","));

        //вырезаем значение RGB для G
        String substring1G = substring1.substring(substring1.indexOf(",")+2,substring1.lastIndexOf(","));

        //вырезаем значение RGB для B
        String substring1B = substring1.substring(substring1.lastIndexOf(",")+2);

        //сравнение цветов для regular
        assertTrue(substring1G.equals("0"));
        assertTrue(substring1B.equals("0"));

        // находим жирная ли красная цена
        //для хрома
        String elementCampaignMainTextDecoration = elementCampaignMain.getCssValue("font-weight");
        assertTrue(elementCampaignMainTextDecoration.contains("bold"));
        // для Firefox
        //String elementCampaignMainTextDecoration = elementCampaignMain.getCssValue("font-weight");
        //assertTrue(elementCampaignMainTextDecoration.contains("900"));

        //Находим размер красной цены
        String elementCampaignMainTextFontSize = elementCampaignMain.getCssValue("font-size");
        elementCampaignMainTextFontSize = elementCampaignMainTextFontSize.substring(0,elementCampaignMainTextFontSize.length() -2);
        double campaignMainTextFontSize = Double.parseDouble(elementCampaignMainTextFontSize);

        //сравниваем размеры акционной и обычной цены
        assertTrue(campaignMainTextFontSize > regularMainTextFontSize);


        //Переходим на страницу товара
        driver.findElement(By.xpath(clickDuckMainXpath)).click();

      //находим название товара
        WebElement elementNameProduct = driver.findElement(By.xpath(nameDuckProductXpath));
        String nameProduct = elementNameProduct.getText();
        assertTrue(nameProduct.equals(nameMain));

        //находим обычную цену товара на страницу товара
        WebElement elementRegularProduct = driver.findElement(By.xpath(priceRegularDuckProductXpath));
        String regularProduct = elementRegularProduct.getText();
        assertTrue(regularProduct.equals(regularMain));

        //находим красную цену товара на странице товара
        WebElement elementCampaignProduct = driver.findElement(By.xpath(priceCampaignDuckProductXpath));
        String campaignProduct = elementCampaignProduct.getText();
        assertTrue(campaignProduct.equals(campaignMain));

        //Проверка цветов/зачеркнутости/жирности для страницы продукта
        String elementRegularProductColor = elementRegularProduct.getCssValue("color");
        //вырезаем значение RGB для R
        String substring2 = elementRegularProductColor.substring(5,elementRegularProductColor.length() - 4);
        String substring2R = substring2.substring(0,substring2.indexOf(","));

        //вырезаем значение RGB для G
        String substring2G = substring2.substring(substring2.indexOf(",")+2,substring2.lastIndexOf(","));

        //вырезаем значение RGB для B
        String substring2B = substring2.substring(substring2.lastIndexOf(",")+2);

        //сравнение цветов для regular
        assertTrue(substring2R.equals(substring2G));
        assertTrue(substring2B.equals(substring2G));

        // находим зачеркнута ли цена обычная
        String elementRegularProductTextDecoration = elementRegularProduct.getCssValue("text-decoration");
        assertTrue(elementRegularProductTextDecoration.contains("line-through"));

        //Находим размер обычной цены
        String elementRegularProductTextFontSize = elementRegularProduct.getCssValue("font-size");
        elementRegularProductTextFontSize = elementRegularProductTextFontSize.substring(0,elementRegularProductTextFontSize.length() -2);
        double regularProductTextFontSize = Double.parseDouble(elementRegularProductTextFontSize);

        //Работа с Акционной ценой на странице продукта
        elementCampaignProduct = driver.findElement(By.xpath(priceCampaignDuckProductXpath));
        campaignProduct = elementCampaignProduct.getText();
        String elementCampaignProductColor = elementCampaignProduct.getCssValue("color");
        //вырезаем значение RGB для R
        String substring3 = elementCampaignProductColor.substring(5,elementCampaignProductColor.length() - 4);
        String substring3R = substring1.substring(0,substring3.indexOf(","));

        //вырезаем значение RGB для G
        String substring3G = substring3.substring(substring3.indexOf(",")+2,substring3.lastIndexOf(","));

        //вырезаем значение RGB для B
        String substring3B = substring3.substring(substring3.lastIndexOf(",")+2);

        //сравнение цветов для regular
        assertTrue(substring3G.equals("0"));
        assertTrue(substring3B.equals("0"));

        // находим зачеркнута ли цена обычная
        String elementCampaignProductTextDecoration = elementCampaignProduct.getCssValue("font-weight");
        assertTrue(elementCampaignProductTextDecoration.contains("bold"));

        //Находим размер красной цены
        String elementCampaignProductTextFontSize = elementCampaignProduct.getCssValue("font-size");
        elementCampaignProductTextFontSize = elementCampaignProductTextFontSize.substring(0,elementCampaignProductTextFontSize.length() -2);
        double campaignProductTextFontSize = Double.parseDouble(elementCampaignProductTextFontSize);

        //сравниваем размеры акционной и обычной цены
        assertTrue(campaignProductTextFontSize > regularProductTextFontSize);


    }



    @After
    public void stop() {
        driver.quit();
        driver = null;
    }





}
