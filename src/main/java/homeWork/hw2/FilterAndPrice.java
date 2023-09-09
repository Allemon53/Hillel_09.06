package homeWork.hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class FilterAndPrice {
    WebDriver driver;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void testRozetkaFilterAndTopSelling() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://rozetka.com.ua/");
        WebElement laptopsAndComputers = driver.findElement(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]"));
        laptopsAndComputers.click();

        WebElement laptops = driver.findElement(By.xpath("//a[@title='Ноутбуки'][1]"));
        laptops.click();

        WebElement sellerFilter = driver.findElement(By.xpath("//ul[1][@class='checkbox-filter']/li[1]/a[@class='checkbox-filter__link'][@data-id='Rozetka']"));
        sellerFilter.click();

        WebElement priceFilter = driver.findElement(By.xpath("//div[@class='slider-filter__inner']/input[@formcontrolname='max']"));
        priceFilter.clear();
        priceFilter.sendKeys("100000\n");

        WebElement ok = driver.findElement(By.xpath("//div[@class='slider-filter__inner']/button"));
        ok.click();

        WebElement topSellingProduct = driver.findElement(By.xpath("//a[@href='https://rozetka.com.ua/asus-90nb0ty5-m036x0/p379718115/']/img[@class='ng-lazyloaded']"));
        topSellingProduct.click();

        WebElement topSellingLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//rz-label[@class='main-slider__label ng-star-inserted']/span[1]")));

        Assert.assertTrue(topSellingLabel.getText().contains("ТОП ПРОДАЖ"));
    }
}