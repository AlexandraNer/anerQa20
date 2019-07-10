import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationsTest extends TestBase{
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        if(isUserLoggedIn());
        login("narishkaalex@gmail.com", "301184Alex");
    }

    public boolean isUserLoggedIn() {
        return isElrmrntPresent2(By.cssSelector("[href='/']"));
    }

    @Test
    public void testCreation() throws InterruptedException {

        int before = getPersonalBoardCount();
        clickOnButtononeHeader();
        cteateBoardFromDropDown();
        pause(7000);
        typeBoardName("qa20"+System.currentTimeMillis());
        pressSubmit();
        pause(10000);
        returnToHomePage();

        int after= getPersonalBoardCount();
        Assert.assertEquals(after,before+1);
    }

}


