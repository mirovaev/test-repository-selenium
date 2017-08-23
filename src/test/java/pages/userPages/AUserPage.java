package pages.userPages;

import org.openqa.selenium.WebDriver;
import pages.AbstrPage;
import webElements.userElements.*;


public class AUserPage extends AbstrPage {

    public AUserPage(WebDriver driver) {
        super(driver);
        pageURL = "";
    }


    // Добавляем Хедер
    protected HeaderWrapper headerWrapper;

    public HeaderWrapper headerWrapper() {
        // Инициализируем элементы, если еще не инициализированны
        if (this.headerWrapper == null) {
            this.headerWrapper = new HeaderWrapper(driver);
        }
        return this.headerWrapper;
    }



}
