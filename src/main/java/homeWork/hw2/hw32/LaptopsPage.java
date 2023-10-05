package homeWork.hw2.hw32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class LaptopsPage {
    private WebDriver driver;
    public LaptopsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void applySellerFilter() {

        WebElement sellerFilter = driver
                .findElement(By.xpath("//a[@data-id='Rozetka']"));
        sellerFilter.click();
    }

    public void applyPriceFilter(String price) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement priceFilter = driver
                .findElement(By.xpath("//input[@formcontrolname='max']"));
        priceFilter.clear();
        priceFilter.sendKeys("100000\n");

        WebElement ok = driver
                .findElement(By.xpath("//div[@class='slider-filter__inner']/button"));
        ok.click();

        WebElement topSellingProduct = driver.findElement(By.xpath("//a[@href='https://rozetka.com.ua/asus-90nb0ty5-m036x0/p379718115/']/img"));
        topSellingProduct
                .click();

        WebElement topSellingLabel = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//rz-label[@class='main-slider__label ng-star-inserted']/span[1]")));

        Assert.assertTrue(topSellingLabel.getText().contains("ТОП ПРОДАЖ"));
    }
}
