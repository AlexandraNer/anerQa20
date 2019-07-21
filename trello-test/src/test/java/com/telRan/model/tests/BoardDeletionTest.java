package com.telRan.model.tests;

import org.testng.Assert;
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
        int before= app.getBoard().getPersonalBoardCount();
        app.getBoard().openFirstPrivateBoard();
        app.getBoard().clickOnButtonMore();
        app.getBoard().clickOnButtonCloseBoard();
        app.getSession().pause(5000);
        app.getBoard().closeBoard();
        app.getBoard().clickDeleteBoard();
        app.getBoard().clickOnSumbitDelition();
        app.getSession().pause(5000);
        app.getHedBut().returnToHomePage();
        app.getHedBut().returnToHomePage();

       int after = app.getBoard().getPersonalBoardCount();
        Assert.assertEquals(after,before-1);


        }

   /* public void clickOnBackToMenu() {
        click(By.xpath("//a[@class='board-menu-header-back-button icon-lg icon-back js-pop-widget-view']"));
    }*/

}
