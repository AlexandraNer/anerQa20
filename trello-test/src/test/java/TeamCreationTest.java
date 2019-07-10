import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeamCreationTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        if(isUserLoggedIn());
        login("narishkaalex@gmail.com", "301184Alex");
    }

    public boolean isUserLoggedIn() {
        return isElrmrntPresent2(By.cssSelector("[href='/']"));
    }

    @Test
    public void createTeam() throws InterruptedException {
        int before= getTeamsCount();

        clickOnButtononeHeader();
        selectTeamGroup();
        typeTeamName("QA-20"+System.currentTimeMillis());
        pause(7000);
        pressSubmit();
        returnToHomePage();

        int after = getTeamsCount();
        Assert.assertEquals(after,before+1);

    }

}

