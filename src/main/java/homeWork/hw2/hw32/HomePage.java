package homeWork.hw2.hw32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void open() {
        driver.get("https://rozetka.com.ua/");
    }
    public void navigateToLaptopsCategory() {
        WebElement laptopsAndComputers = driver
                .findElement(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]"));
        laptopsAndComputers.click();

        WebElement laptops = driver
                .findElement(By.xpath("//a[@title='Ноутбуки'][1]"));
        laptops.click();
    }
}
