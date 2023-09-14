package homeWork.hw2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static java.lang.Thread.sleep;

public class SaveTitle {
    WebDriver driver;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }
    @Test
    public void testRozetkaFilterAndTopSelling() throws InterruptedException, IOException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://rozetka.com.ua/notebooks/c80004/");

        try {
            sleep(5000);
            WebElement laptopsAndComputers = driver.findElement(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]"));
            laptopsAndComputers.click();

            WebElement laptops = driver.findElement(By.xpath("//a[@title='Ноутбуки'][1]"));
            laptops.click();
            sleep(5000);

            Map<String, String> productData = new HashMap<>();

            List<WebElement> productElements = driver.findElements(By.xpath("//a[@class='goods-tile__picture ng-star-inserted']"));
            for (int i = 0; i < 60 && i < productElements.size(); i++) {
                WebElement productElement = productElements.get(i);
                String title = productElement.findElement(By.xpath("//a[@class='goods-tile__heading ng-star-inserted']")).getText();
                String price = productElement.findElement(By.xpath("/div[@class='goods-tile__prices']")).getText();
                productData.put(title, price);
            }

            FileWriter fileWriter = new FileWriter("rozetkaTest.txt");
            for (Map.Entry<String, String> entry : productData.entrySet()) {
                String productInfo = entry.getKey() + " - " + entry.getValue();
                fileWriter.write(productInfo + "\n");
            }
            fileWriter.close();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        } finally {

            driver.quit();
        }
    }
}