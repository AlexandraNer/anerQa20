import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTrelloTest extends TestBase{

    @Test
    public void login() throws InterruptedException {
        //driver.findElement(By.cssSelector("[href='/login']")).click();
        getClick();// login
        fillLoginForm("narishkaalex@gmail.com", "301184Alex");//fill login form
        pause(3000);
        confirmLogin();//confirm login
        pause(10000);
    }

    // universary method
    public void type(By locator, String text) {
        super.type(locator, text);
    }

    public void cteateBoardFromDropDown() {
        super.cteateBoardFromDropDown();
    }

    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        login("narishkaalex@gmail.com", "301184Alex");
    }
}
