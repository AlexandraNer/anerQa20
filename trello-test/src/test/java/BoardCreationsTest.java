import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationsTest extends TestBase{
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        if(isUserLoggedIn());
        app.login("narishka@walla.com", "202010Zxc");
    }

    public boolean isUserLoggedIn() {
        return app.isElrmrntPresent2(By.cssSelector("[href='/']"));
    }

    @Test
    public void testCreation() throws InterruptedException {

        int before = app.getPersonalBoardCount();
        app.clickOnButtononeHeader();
        app.cteateBoardFromDropDown();
        app.pause(7000);
        app.typeBoardName("qa20"+System.currentTimeMillis());
        app.pressSubmit();
        app.pause(10000);
        app.returnToHomePage();

        int after= app.getPersonalBoardCount();
        Assert.assertEquals(after,before+1);
    }

}


