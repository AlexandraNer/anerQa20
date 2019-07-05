import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchTrelloTest extends TestBase{

    @Test
    public void ligin() throws InterruptedException {
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

    protected void cteateBoardFromDropDown() {
        click(By.cssSelector("[class=_2b-xS2onqCL250]"));
    }
}
