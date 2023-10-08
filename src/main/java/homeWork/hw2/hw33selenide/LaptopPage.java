package homeWork.hw2.hw33selenide;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LaptopPage {

    public LaptopPage() {
        $(By.className("header-cart"))
                .shouldHave(visible.text("Ноутбуки"));
    }
    public void addToCart() {
        SelenideElement firstProduct = $(By.xpath("(//div[@data-goods-id='353549163']"));
        firstProduct.$(By.xpath("//div[@class='cart-popup']"))
                .click();
    }
}
