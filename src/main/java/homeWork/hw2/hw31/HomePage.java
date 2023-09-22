package homeWork.hw2.hw31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open() {
        driver.get("https://rozetka.com.ua/");
    }

    public void goToComputersAndLaptops() {
        WebElement computersAndLaptops = wait
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]")));
        computersAndLaptops
                .click();
    }
}
