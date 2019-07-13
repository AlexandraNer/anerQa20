import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationsTest extends TestBase{
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        if(!app.getSession().isUserLoggedIn());
        app.getSession().login("narishka@walla.com", "202010Zxc");
    }

    @Test
    public void testCreation() throws InterruptedException {

        int before = app.getBoard().getPersonalBoardCount();
        app.hedBut.clickOnPlusButtonOnHeader();
        app.getBoard().cteateBoardFromDropDown();
        app.session.pause(7000);
        app.getBoard().typeBoardName("qa20"+System.currentTimeMillis());
        app.getBoard().submitCreateBoard();
        app.session.pause(10000);
        app.hedBut.returnToHomePage();

        int after= app.getBoard().getPersonalBoardCount();
        Assert.assertEquals(after,before+1);
    }

}


