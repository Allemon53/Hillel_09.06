package amazon;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class AmazonPage {
    private SelenideElement accountList = $(By.xpath("//a[@id='nav-link-accountList']"));
    private SelenideElement emailField = $(By.xpath("//input[@id='ap_email']"));
    private SelenideElement continueButton = $(By.xpath("//input[@id='continue']"));

    public void openAmazon() {
        open("https://www.amazon.com/");
    }

    public void goToAccountList() {
        accountList.click();
    }

    public void enterEmail(String email) {
        emailField.setValue(email);
    }

    public void clickContinue() {
        continueButton.click();
    }
}
