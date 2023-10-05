package homeWork.hw2.hw32;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RozetkaTest {
    private WebDriver driver;
    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void filterAndTopSelling() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.navigateToLaptopsCategory();

        LaptopsPage laptopsPage = new LaptopsPage(driver);
        laptopsPage.applySellerFilter();
        laptopsPage.applyPriceFilter("100000");
    }
}