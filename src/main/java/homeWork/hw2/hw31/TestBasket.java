package homeWork.hw2.hw31;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestBasket {
    WebDriver driver;
    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void testBasket(){

        HomePage homePage = new HomePage(driver);
        ComputersAndLaptops computersAndLaptops = new ComputersAndLaptops(driver);
        Laptops laptops = new Laptops(driver);
        BasketPage basketPage = new BasketPage(driver);

        homePage.open();

        homePage.goToComputersAndLaptops();

        computersAndLaptops.goToLaptops();

        laptops.addToBasket();

        int itemCountInBasket = basketPage.getItemCountInBasket();
        assertEquals("One item is expected to be added to basket",
                1, itemCountInBasket);

        driver.get("https://rozetka.com.ua/cart/");

        String productNameInBasket = basketPage.getProductNameInBasket();
        assertEquals("Expecting the correct product has been added",
                "Name of added product", productNameInBasket);
    }
}
