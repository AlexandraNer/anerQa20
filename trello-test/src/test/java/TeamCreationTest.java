import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeamCreationTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        if(app.getSession().isUserLoggedIn());
        app.getSession().login("narishka@walla.com", "202010Zxc");
    }

   /* public boolean isUserLoggedIn() {
        return app.isElrmrntPresent2(By.cssSelector("[href='/']"));
    }*/

    @Test
    public void createTeam() throws InterruptedException {
        int before= app.teams.getTeamsCount();

        app.hedBut.clickOnPlusButtonOnHeader();
        app.teams.selectTeamGroup();
        app.teams.typeTeamName("QA-20"+System.currentTimeMillis());
        app.session.pause(7000);
        app.teams.submitCreateTeam();
        app.hedBut.returnToHomePage();

        int after = app.teams.getTeamsCount();
        Assert.assertEquals(after,before+1);

    }

}

