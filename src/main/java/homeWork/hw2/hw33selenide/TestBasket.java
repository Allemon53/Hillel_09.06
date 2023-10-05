package homeWork.hw2.hw33selenide;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;


public class TestBasket {
    @BeforeTest
    public void before(){
        open("https://rozetka.com.ua/");
    }

    @Test
    public void testAddingProductToCart() {
        HomePage homePage = new HomePage().open();
        ComputersPage computersPage = homePage.goToComputersCategory();
        LaptopPage laptopPage = computersPage.goToLaptopsCategory();

        laptopPage.addToCart();
    }
}
