import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.userPages.CheckoutPage;
import pages.userPages.MainPage;
import pages.userPages.ProductPage;

public class CatalogLogic {

    public CatalogLogic(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 5);
    }

    WebDriver driver;
    WebDriverWait wait;

    public int addToCartRandomProduct(int number) {

        int countProducts = 0;

        // Добавляем в корзину продукцию
        for (int i = 0; i < number; i++) {

            MainPage mainPage = new MainPage(driver);
            // Запоминаем текущее количество элементов в корзине
            countProducts = Integer.parseInt(mainPage.headerWrapper().gettxtCart());

            // Кликаем по первому попавшемуся элементу и переходим на страницу товара
            ProductPage productPage = mainPage.divMostPopular().bClickWebElemetnsProduct(0);

            // Добавляем продукт в корзину
            productPage.idBoxProduct().bClickAddCartProduct();

            // Смотрим количество товара в корзине
            //while (countProducts != (Integer.parseInt(productPage.headerWrapper().gettxtCart()) - 1)){
            //    Thread.sleep(100);
            //}
            // Ждем пока количество товаров в корзине не измениться
            wait.until(ExpectedConditions.textToBePresentInElement(
                    productPage.headerWrapper().webElementCart(),
                    Integer.toString(countProducts + 1)));

            // Возвращаемся на предыдущую страницу
            productPage.bPrevPageClick();
        }
        return countProducts;
    }


    public void deleteFromCart(int countProductsToLeft){

        // Переходим в корзину
        driver.get("http://mirka.ddns.net/litecart/index.php/en/checkout");

        CheckoutPage checkoutPage = new CheckoutPage(driver);

        // Ждем пока не загрузиться страница корзины
        // Пока не будет видно элемента //span[text()="Customer Service"]
        wait.until(ExpectedConditions.visibilityOf(checkoutPage.cartForm().webElementsCustomerService()));

        // находим сколько товара в корзине
        int countProducts = checkoutPage.cartForm().countProductsInCart();

        // Удаляем из корзины
        while (checkoutPage.cartForm().isAnyProductInCart() && countProducts > countProductsToLeft){

            // Удаляем одину продукцию
            checkoutPage.cartForm().bClickRemoveCartItem();

            countProducts--;
            // Смотрим количество товара в корзине
            //while (countProducts != (checkoutPage.cartForm().countProductsInCart() - 1)){
            //    Thread.sleep(100);
            //}

            // Ждем пока количество товаров в корзине не измениться
            wait.until(ExpectedConditions.numberOfElementsToBe(
                    By.xpath(checkoutPage.cartForm().getWebElementsProductsXpath()),
                    countProducts));

            // находим сколько товара в корзине
            //countProducts = checkoutPage.cartForm().countProductsInCart();
        }
    }

}
