package homeWork.hw2.hw22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class Authorization {
    WebDriver driver;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
    }

    @Test
    public void testAuthorization() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement logo  = driver.findElement(
                By.xpath("//button[@class='header__button ng-star-inserted']"));
        logo.click();
        sleep(5000);
    }

    @Test
    public void testAuthorization1() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement logo  = driver.findElement(
                By.cssSelector("rz-user"));
        logo.click();
        sleep(5000);
    }
}