import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardDeletiomTest extends TestBase{
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        login("narishkaalex@gmail.com", "301184Alex");
    }
    @Test
    public void deleteBoard(){
        chooseBoardForDelite();
        openMenuOptions();
        clickOnButtonMore();
        clickOnButtonCloseBoard();
        closeBoard();
        clickDeleteBoard();
        clickOnSumbitButton();

        }

}
