package homeWork.hw2.hw33selenide;


import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class ComputersPage {

    public LaptopPage goToLaptopsCategory() {

        $(By.xpath("//a[@title='Ноутбуки'][1]")).click();
        return new LaptopPage();
    }
}
