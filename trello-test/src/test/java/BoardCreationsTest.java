import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationsTest extends TestBase{
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        login("narishkaalex@gmail.com", "301184Alex");

    }

    @Test
    public void testCreation() throws InterruptedException {
        clickOnButtononeHeader();
        cteateBoardFromDropDown();
        pause(10000);
        typeBoardName("qa20"+System.currentTimeMillis());
    }

    public void cteateBoardFromDropDown() {
        click(By.cssSelector("[class=_2b-xS2onqCL250]"));
    }
}

