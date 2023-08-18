package lesson19.testsuit;

import lesson19.MyListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(MyListener.class)
public class FirstClass {
    @Test(groups = {"regression", "unit"})

        public void firstTest(String username, String password) {
            System.out.println("it is first test");
            System.out.println(username);
            System.out.println(password);
        }

        @Test
        public void secondTest() {
            System.out.println("it is second test");
        }
}
