import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationsTest extends TestBase{
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        login("narishkaalex@gmail.com", "301184Alex");
        //click(By.cssSelector("[class='btn btn-sm btn-link text-white']"));
        //pause(10000);
        // type user name
       // click(By.id("user"));
        //driver.findElement(By.id("user")).clear();
       // driver.findElement(By.id("user")).sendKeys("narishkaalex@gmail.com");
        //pause(10000);

        // type password
        //click(By.id("password"));
       // driver.findElement(By.id("password")).clear();
       // driver.findElement(By.id("password")).sendKeys("301184Alex");

        click(By.id("login"));

    }

    @Test
    public void testCreation() throws InterruptedException {
        clickOnButtononeHeader();
        cteateBoardFromDropDown();
        pause(10000);
        typeBoardName("qa20"+System.currentTimeMillis());
    }

    protected void cteateBoardFromDropDown() {
        click(By.cssSelector("[class=_2b-xS2onqCL250]"));
    }
}

