import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeamCreationTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        login("narishkaalex@gmail.com", "301184Alex");
    }

    @Test
    public void createTeam() {
        clickOnButtononeHeader();
        selectTeamGroup();
        typeTeamName("QA-20"+System.currentTimeMillis());
        pressSubmit();

    }

    }

