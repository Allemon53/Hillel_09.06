package lesson28;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class FirstSelenideTest {

    @BeforeMethod
    public void before(){
        Configuration.timeout = 10000;
        open("https://www.google.com.ua/");

    }

    @Test
    public void selenideTest(){
        $(By.name("q")).setValue("Hillel").pressEnter();
        sleep(5000);
    }
    @Test
    public void secondselenideTest(){
        $(By.xpath("//div[@class='FPdoLc lJ9FBc']//*[@name='btnK']"))
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text("Поиск в Google"),Duration.ofSeconds(5))
                .click();
    }
}
