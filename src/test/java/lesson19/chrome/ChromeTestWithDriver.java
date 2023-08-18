package lesson19.chrome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeTestWithDriver {
    WebDriver driver;
    @BeforeClass
    public void init(){
        System.setProperty("webdriver.chrome", "src");
    }
    @BeforeTest
    public void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @Test
    public void testOnChrome(){
        driver.get("https://pastebin.com/DCwXiCx7");
    }
    @AfterTest
    public void close(){
        driver.close();
    }

}
