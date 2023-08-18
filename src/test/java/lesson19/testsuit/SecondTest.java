package lesson19.testsuit;

import org.testng.annotations.Test;

public class SecondTest {
    @Test(groups = {"regression"})
    public void thirdTest() {
        System.out.println("it is third test");
    }
}
