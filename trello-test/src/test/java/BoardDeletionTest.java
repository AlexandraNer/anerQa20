import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardDeletionTest extends TestBase{
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
       
        if(!isUserLoggedIn()) {
            login("narishka@walla.com", "202010Zxc");
        }
    }

    private boolean isUserLoggedIn() {
        return isElrmrntPresent(By.xpath("//button[@class='_3bl7HhpXOOyEkB js-open-header-member-menu _2OG55MZw5Ysbaz']"));
    }

    @Test
    public void deletePrivateBoard() throws InterruptedException {
        int before= getPersonalBoardCount();
        openFirstPrivateBoard();
       // clickOnBackToMenu();
        clickOnButtonMore();//span[@class='icon-sm icon-overflow-menu-horizontal board-menu-navigation-item-link-icon']
        clickOnButtonCloseBoard();//board-menu-navigation-item-link js-close-board
        pause(5000);
        closeBoard();//input[@class='js-confirm full negate']
        clickDeleteBoard();//a[@class='quiet js-delete']
        clickOnSumbitDelition();//input[@class='js-confirm full negate']
        pause(5000);
        returnToHomePage();//span[@class='_2O4TvNuF7v0hxu GAI2GE8czAVHCQ _2CENIFUGJiOGXv _3Equ0AwjtQdiIh']

       int after = getPersonalBoardCount();
        Assert.assertEquals(after,before-1);


        }

   /* public void clickOnBackToMenu() {
        click(By.xpath("//a[@class='board-menu-header-back-button icon-lg icon-back js-pop-widget-view']"));
    }*/

}
