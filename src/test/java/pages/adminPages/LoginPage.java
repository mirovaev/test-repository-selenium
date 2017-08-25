package pages.adminPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AbstrPage;

public class LoginPage extends AbstrPage {

    public LoginPage(WebDriver driver) {
        super(driver);
        pageURL = "http://mirka.ddns.net/litecart/admin/login.php?redirect_url=%2Flitecart%2Fadmin%2F";
    }

    // Поле ввода Username
    String txtUsernameXpath = "//input[@name=\"username\"]";
    public WebElement txtUsername(){
        return driver.findElements(By.xpath(txtUsernameXpath)).get(0);
    }
    // Вводим в поле Username логин
    public void txtSendKeysUsername(String login){
        driver.findElements(By.xpath(txtUsernameXpath)).get(0).sendKeys(login);
    }

    // Поле ввода Password
    String txtPasswordXpath = "//input[@name=\"password\"]";
    public WebElement txtPassword(){
        return driver.findElements(By.xpath(txtPasswordXpath)).get(0);
    }
    // Вводим в поле Password пароль
    public void txtSendKeysPassword(String password){
        driver.findElements(By.xpath(txtPasswordXpath)).get(0).sendKeys(password);
    }

    // Кнопка Login
    String bLoginXpath = "//button[@name=\"login\"]";
    public WebElement bLogin(){
        return driver.findElements(By.xpath(bLoginXpath)).get(0);
    }
    // Нажимаем на кнопку Login
    public AdminPage bClickLoginXpath(){
        driver.findElements(By.xpath(bLoginXpath)).get(0).click();
        return new AdminPage(driver);
    }


    // Автоматические методы
    public AdminPage avtoLoginCorrect(){
        txtUsername().sendKeys("admin");
        txtPassword().sendKeys("admin");
        bLogin().click();
        return new AdminPage(driver);
    }

    public LoginPage avtoLoginUnCorrect(){
        txtUsername().sendKeys("admin");
        txtPassword().sendKeys("admin1");
        bLogin().click();
        return this;
    }

}
