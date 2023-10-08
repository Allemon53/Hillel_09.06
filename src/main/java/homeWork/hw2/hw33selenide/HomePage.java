package homeWork.hw2.hw33selenide;


import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public HomePage open() {
        Selenide.open("https://rozetka.com.ua/");
        return this;
    }

    public ComputersPage goToComputersCategory() {
                $(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li"))
                .hover();

                $(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li"))
                .click();
        return new ComputersPage();
    }
}

