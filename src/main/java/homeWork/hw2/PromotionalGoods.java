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

public class PromotionalGoods {
    WebDriver driver;
    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void testPromotion() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement promotionBlock = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[text()=' Акционные предложения ']")));
        Assert.assertEquals("Проверка, что в блоке Акционные предложения отображается 6 товаров", 6,
                String.valueOf(promotionBlock.findElements(By.xpath("//section[6]/rz-goods-section/ul[@class='main-goods__grid ng-star-inserted']")).size()));

        WebElement price = promotionBlock.findElement(By.xpath("//div[text()='259']"));
        String savedPrice = price.getText();

        WebElement link = promotionBlock
                .findElement(By.xpath("//li[@data-goods-id='71669379']"));
        link.click();

        WebElement pagePrice = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='259']")));
        String productPrice = pagePrice.getText();
        Assert.assertEquals("Цена на продуктовой странице не совпадает с оригинальной", savedPrice, productPrice);

        WebElement backMain = driver
                .findElement(By.xpath("//rz-main-header/header/div/div/a"));
        backMain.click();

        promotionBlock = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[text()=' Акционные предложения ']")));
        Assert.assertEquals("Ожидается, что в блоке Акционные предложения отображается 6 товаров", 6,
                String.valueOf(promotionBlock.findElements(By.xpath("//section[6]/rz-goods-section/ul[@class='main-goods__grid ng-star-inserted']")).size()));

        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals("URL не соответствует главной странице", "https://rozetka.com.ua/", currentURL);
    }
}