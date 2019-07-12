import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTrelloTest extends TestBase{

    @Test
    public void login() throws InterruptedException {
        //driver.findElement(By.cssSelector("[href='/login']")).click();
        app.getClick();// login
        app.fillLoginForm("narishkaalex@gmail.com", "301184Alex");//fill login form
        app.pause(3000);
        app.confirmLogin();//confirm login
        app.pause(10000);
    }

    // universary method
    public void type(By locator, String text) {
        app.type(locator, text);
    }

    public void cteateBoardFromDropDown() {
        app.cteateBoardFromDropDown();
    }

    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        app.login("narishkaalex@gmail.com", "301184Alex");
    }
}
