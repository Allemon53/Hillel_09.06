package amazontest;

import amazon.AmazonPage;
import org.testng.annotations.Test;

public class AmazonTest {
    @Test
    public void testAmazon() {
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.openAmazon();
        amazonPage.goToAccountList();
        amazonPage.enterEmail("+380685386870");
        amazonPage.clickContinue();
    }
}
