import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeamCreationTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        if(isUserLoggedIn());
        app.login("narishkaalex@gmail.com", "301184Alex");
    }

    public boolean isUserLoggedIn() {
        return app.isElrmrntPresent2(By.cssSelector("[href='/']"));
    }

    @Test
    public void createTeam() throws InterruptedException {
        int before= app.getTeamsCount();

        app.clickOnButtononeHeader();
        app.selectTeamGroup();
        app.typeTeamName("QA-20"+System.currentTimeMillis());
        app.pause(7000);
        app.pressSubmit();
        app.returnToHomePage();

        int after = app.getTeamsCount();
        Assert.assertEquals(after,before+1);

    }

}

