package homeWork.hw2.hw31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasketPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasketPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public int getItemCountInBasket() {
        WebElement cartItemCount = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='cart-popup']")));
        return Integer.parseInt(cartItemCount.getText());
    }

    public String getProductNameInBasket() {
        WebElement productIsInBasket = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.name("cart-product__title")));
        return productIsInBasket.getText();
    }
}
