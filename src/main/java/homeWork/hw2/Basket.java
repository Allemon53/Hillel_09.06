package homeWork.hw2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class Basket {
    WebDriver driver;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testRozetkaBasket() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");

        WebElement laptopsAndComputers = driver
                .findElement(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]"));
        laptopsAndComputers.click();
        sleep(5000);

        WebElement laptops = driver
                .findElement(By.xpath("//a[@title='Ноутбуки'][1]"));
        laptops.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-goods-id='353549163']")));

        WebElement firstProduct = driver
                .findElement(By.xpath("(//div[@data-goods-id='353549163']//button[contains(@class,'buy-button')])[1]"));
        firstProduct.click();

        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart-popup']")));

        WebElement cartItemCount = driver
                .findElement(By.className("counter"));
        Assert.assertEquals(cartItemCount.getText(), "1", "Один товар не был успешно добавлен в корзину.");

        WebElement cartIcon = driver
                .findElement(By.className("header-cart"));
        cartIcon.click();

        WebElement cartProductTitle = driver
                .findElement(By.className("cart-product__title"));
        Assert.assertTrue(cartProductTitle.getText().contains("Название вашего товара"), "Товар в корзине не соответствует ожиданиям.");

        driver.quit();
    }
}