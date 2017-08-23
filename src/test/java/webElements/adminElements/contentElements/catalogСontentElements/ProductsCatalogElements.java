package webElements.adminElements.contentElements.catalogСontentElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webElements.AbstrElements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tester on 21.08.2017.
 */
public class ProductsCatalogElements extends AbstrElements {

    public ProductsCatalogElements(WebDriver driver) {
        super(driver);
    }


    // Список товаров

    String txtProductsXpath = "//table[@class=\"dataTable\"]//tr[contains(@class, \"row\")]/td[3]";
    public List<WebElement> txtProducts(){
        return driver.findElements(By.xpath(txtProductsXpath));
    }
    public boolean productIsPresent(String nameOfProduct){
        boolean isOk = false;
        for (WebElement element:driver.findElements(By.xpath(txtProductsXpath))) {
            if(element.getText().equals(nameOfProduct)) {
                isOk = true;
                break;
            }
        }
        return isOk;
    }


    public List<String> getProductsTexts(){
        List<String> stringList = new ArrayList<String>();

        for (WebElement element:driver.findElements(By.xpath(txtProductsXpath))) {
            stringList.add(element.getText());
        }
        return stringList;
    }


    String selectProductXpath = "(//table[@class=\"dataTable\"]//tr[contains(@class, \"row\")]/td[1])";
    public void selectProduct(String nameOfProduct){
        boolean isMatches = false;
        // Находим номер элемента в таблице
        for (int i = 0; i < 100 && !isMatches; i++){
            // Цикл на перебор не соответствия созданным продукциями
            List<String> productsNames = getProductsTexts();
            for (int j = 0; j < productsNames.size(); j++) {
                // Сравниваем является ли одинаковым название
                if (productsNames.get(j).compareTo(nameOfProduct) == 0){
                    // названия совпадают, дальше не ищем
                    isMatches = true;
                    // Нажимаем на кнопку выделить
                    String str = selectProductXpath + "[" + (j + 1) + "]";
                    driver.findElements(By.xpath(str)).get(0).click();
                    break;
                }
            }
        }
    }

}
