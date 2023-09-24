package homeWork.hw2.hw31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ComputersAndLaptops {
    private WebDriver driver;
    private WebDriverWait wait;

    public ComputersAndLaptops(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void goToLaptops() {
        WebElement laptops = wait
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Ноутбуки'][1]")));
        laptops.click();
    }
}
