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

public class Logo {
    WebDriver driver;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    }


    @Test
    public void testLogo() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement basket  = driver.findElement(
                By.xpath("//a[@class='header__logo']"));
        basket.click();
        sleep(5000);
    }
    @Test
    public void testLogo1() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement basket  = driver.findElement(
                By.cssSelector("a.header__logo"));
        basket.click();
        sleep(5000);
    }
    //
}