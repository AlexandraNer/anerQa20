import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardDeletionTest extends TestBase{
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
       
        if(!isUserLoggedIn()) {
            login("narishkaalex@gmail.com", "301184Alex");
        }
    }

    private boolean isUserLoggedIn() {
        return isElrmrntPresent(By.xpath("//button[@class='_3bl7HhpXOOyEkB js-open-header-member-menu _2OG55MZw5Ysbaz']"));
    }

    @Test
    public void deletePrivateBoard(){
        openFirstPrivateBoard();//class="icon-lg icon-member
        //openMenuOptions();
        clickOnButtonMore();
        clickOnButtonCloseBoard();
        closeBoard();
        clickDeleteBoard();//.js-delete
        clickOnSumbitDelition();//.js-confirm.full
        returnToHomePage();//


        }
}
