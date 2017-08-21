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


public class Lesson6Test {
    private WebDriver driver;
    private WebDriverWait wait;

    private String fileName = "resources\\accaunts.txt";

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);

    }

    @Test
    public void zadanie11() throws InterruptedException {

        // Читаем пользователей, которые уже зарегистрированны
        List<Accaunt> accauntList = readAccaunts();

        // регистрация нового пользователя
        Accaunt accaunt = createAccaunt(accauntList);

        // Выход с учетной записи
        logOutCustomer();

        // вход в учетную запись
        logInCustomer(accaunt);

        // Выход с учетной записи
        logOutCustomer();
    }

       @After
    public void stop() {
        driver.quit();
        driver = null;
    }


    public void logInCustomer(Accaunt accaunt){

        driver.get("http://mirka.ddns.net/litecart/");

        // Ввод Email Address
        String emailXpath = "//input[@name=\"email\"]";
        driver.findElements(By.xpath(emailXpath)).get(0).sendKeys(accaunt.email);

        // Ввод Password
        String passwordXpath = "//input[@name=\"password\"]";
        driver.findElements(By.xpath(passwordXpath)).get(0).sendKeys(accaunt.password);

        // Нажатие на кнопку Login
        String loginXpath = "//button[@name=\"login\"]";
        driver.findElements(By.xpath(loginXpath)).get(0).click();

    }


    public void logOutCustomer() throws InterruptedException {
        // Нажатие на кнопку Logout
        String logOutXpath = "//a[text()=\"Logout\"]";
        driver.findElements(By.xpath(logOutXpath)).get(0).click();
    }


    public Accaunt createAccaunt (List<Accaunt> accauntList) throws InterruptedException {



        String emailNew = "";
        int number = -1;

        // Цикл на создание уникального email аккаунта
        for (int i = 0; i < 100; i++){
            boolean isMatches = false;;
            // Цикл на перебор не соответствия созданным аккаунтам
            for (int j = 0; j < accauntList.size(); j++) {
                // Создаем "уникальный" email
                emailNew = "user" + i + "@email.com";
                // Сравниваем является ли "уникальным"
                if (accauntList.get(j).email.compareTo(emailNew) == 0){
                    // email совпадают, дальше не ищем
                    isMatches = true;
                    break;
                }
                else {
                    number = i;
                }
            }
            // если совпадений в предыдущем цикле не найдено, то email уникальный
            if (!isMatches) {
                break;
            }
        }

        // Вход на страницу создания акаунта
        driver.get("http://mirka.ddns.net/litecart/index.php/en/create_account");

        // Создание аккаунта
        Accaunt accaunt = new Accaunt();

        // Добавляем данные по Company
        driver.findElements(By.xpath(Accaunt.сompanyXpath)).get(0).sendKeys("New ACME Corp.");
        accaunt.company = "New ACME Corp.";

        // Добавляем данные по First Name
        driver.findElements(By.xpath(Accaunt.firstNameXpath)).get(0).sendKeys("Dark" + number);
        accaunt.firstName = "Dark" + number;

        // Добавляем данные по Last Name
        driver.findElements(By.xpath(Accaunt.lastNameXpath)).get(0).sendKeys("Vader" + number);
        accaunt.lastName = "Vader" + number;

        // Добавляем данные по Address 1
        driver.findElements(By.xpath(Accaunt.address1Xpath)).get(0).sendKeys("Tatooine");
        accaunt.address1 = "Tatooine";

        // Добавляем данные по Address 2
        driver.findElements(By.xpath(Accaunt.address2Xpath)).get(0).sendKeys("Star");
        accaunt.address2 = "Star";

        // Добавляем данные по City
        driver.findElements(By.xpath(Accaunt.cityXpath)).get(0).sendKeys("Republic");
        accaunt.city = "Republic";

        // Добавляем данные по Postcode
        driver.findElements(By.xpath(Accaunt.postcodeXpath)).get(0).sendKeys("54321");
        accaunt.postcode = "54321";


        // Добавляем данные по Country
        // Кликаем, что бы раскрылся список стран
        driver.findElements(By.xpath(Accaunt.countryXpath)).get(0).click();
        //driver.findElements(By.xpath(Accaunt.countryXpath)).get(0).sendKeys("United States");
        // Добавляем данные по Country
        driver.findElements(By.xpath(Accaunt.unitedStatesXpath)).get(0).click();
        accaunt.country = "United States";


        Thread.sleep(1000);

        // Добавляем данные по Zone
        // Ждем пока зона будет доступна
        wait.until(driver->driver.findElements(By.xpath(Accaunt.zoneActiveXpath)));
        // Кликаем, что бы раскрылся список Зон
        driver.findElements(By.xpath(Accaunt.zoneXpath)).get(0).click();
        // Добавляем данные по Zone
        driver.findElements(By.xpath(Accaunt.alaskaXpath)).get(0).click();
        accaunt.zone = "Alaska";


        // Добавляем данные по Email
        driver.findElements(By.xpath(Accaunt.emailXpath)).get(0).sendKeys(emailNew);
        accaunt.email = emailNew;

        // Добавляем данные по Phone
        driver.findElements(By.xpath(Accaunt.phoneXpath)).get(0).sendKeys("1-555-123-4567");
        accaunt.phone = "1-555-123-4567";

        // Добавляем данные по Subscribe
        driver.findElements(By.xpath(Accaunt.subscribeXpath)).get(0).click();
        accaunt.subscribe = false;

        // Добавляем данные по Desired Password
        driver.findElements(By.xpath(Accaunt.desiredPasswordXpath)).get(0).sendKeys(emailNew);

        // Добавляем данные по Confirm Password
        driver.findElements(By.xpath(Accaunt.confirmPasswordXpath)).get(0).sendKeys(emailNew);
        accaunt.password = emailNew;

        // Нажимаем на регистрацию bCreateAccountXpath
        driver.findElements(By.xpath(Accaunt.bCreateAccountXpath)).get(0).click();

        // Добавляем в список
        accauntList.add(accaunt);

        return accaunt;



    }

    public List<Accaunt> readAccaunts() {
        // логинимся в админку
        // Логин
        driver.get("http://mirka.ddns.net/litecart/admin/login.php?redirect_url=%2Flitecart%2Fadmin%2F");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        // Логин

        // Переходим на вкладку Customers
        // XPath бокового меню
        String menuXpath = "//div[contains(@id, \"box-apps-menu-wrapper\")]";

        // XPath Customers
        String customersMainXpath = menuXpath + "//span[text()=\"Customers\"]";

        // Кликаем по ссылке Customers
        driver.findElements(By.xpath(customersMainXpath)).get(0).click();

        // Находим список заказчиков
        List<WebElement> webElementList = driver.findElements(By.xpath("//form[@name=\"customers_form\"]//tr[@class=\"row\"]/td[5]"));

        List<Accaunt> accauntList = new ArrayList<Accaunt>();

        // Перебираем всех заказчиков
        for (int i = 0; i < webElementList.size(); i++) {
            // Клакаем, что бы прочитать информацию
            webElementList.get(i).click();

            // Создаем аккаунт, в который записываем данные с формы
            Accaunt accaunt = new Accaunt();
            // Читаем данные аккаунта

            // Читаем email пользователя (Login)
            String email = driver.findElements(By.xpath(Accaunt.emailXpath)).get(0).getAttribute("value");
            accaunt.email = email;

            // Реализовать для других элементов


            // Записываем получившийся аккаунт в список
            accauntList.add(accaunt);

            // Возвращаемся на предудущую страницу
            driver.navigate().back();

            // Подгружаем список заново
            webElementList = driver.findElements(By.xpath("//form[@name=\"customers_form\"]//tr[@class=\"row\"]/td[5]"));
        }
        // Возвращаем список аккаунтов
        return accauntList;

    }


}
