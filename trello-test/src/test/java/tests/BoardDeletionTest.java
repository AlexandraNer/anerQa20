package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardDeletionTest extends TestBase {
//    @BeforeMethod
//    public void ensurePreconditions() throws InterruptedException {
//
//        if(!app.getSession().isUserLoggedIn()) {
//            app.getSession().login("narishka@walla.com", "202010Zxc");
//        }
//    }

    @Test
    public void deletePrivateBoard() throws InterruptedException {
        //int before= app.getBoard().getPersonalBoardCount();
        app.getBoard().openFirstPrivateBoard();
       // clickOnBackToMenu();
        app.getBoard().clickOnButtonMore();//span[@class='icon-sm icon-overflow-menu-horizontal board-menu-navigation-item-link-icon']
        app.getBoard().clickOnButtonCloseBoard();//board-menu-navigation-item-link js-close-board
        app.getSession().pause(5000);
        app.getBoard().closeBoard();//input[@class='js-confirm full negate']
        app.getBoard().clickDeleteBoard();//a[@class='quiet js-delete']
        app.getBoard().clickOnSumbitDelition();//input[@class='js-confirm full negate']
        app.getSession().pause(5000);
        app.getHedBut().returnToHomePage();//span[@class='_2O4TvNuF7v0hxu GAI2GE8czAVHCQ _2CENIFUGJiOGXv _3Equ0AwjtQdiIh']

//       int after = app.getBoard().getPersonalBoardCount();
//        Assert.assertEquals(after,before-1);


        }

   /* public void clickOnBackToMenu() {
        click(By.xpath("//a[@class='board-menu-header-back-button icon-lg icon-back js-pop-widget-view']"));
    }*/

}
