package homeWork.hw2.hw31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Laptops {
    private WebDriver driver;
    private WebDriverWait wait;

    public Laptops(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void addToBasket() {
        WebElement firstProduct = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-goods-id='353549163']")));
        WebElement addToBasket = firstProduct
                .findElement(By.xpath("//div[@data-goods-id='353549163']//button[contains(@class,'buy-button')])[1]"));
        addToBasket.click();
    }
}
