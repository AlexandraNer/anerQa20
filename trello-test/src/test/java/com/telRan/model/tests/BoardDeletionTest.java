package com.telRan.model.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardDeletionTest extends TestBase {


    @Test
    public void deletePrivateBoard() throws InterruptedException {
        int before= app.getBoard().getPersonalBoardCount();
        app.getBoard().pause(3000);
        app.getBoard().openFirstPrivateBoard();
        app.getBoard().clickOnButtonMore();
        app.getBoard().clickOnButtonCloseBoard();
        app.getSession().pause(5000);
        app.getBoard().closeBoard();
        app.getBoard().clickDeleteBoard();
        app.getBoard().clickOnSumbitDelition();
        app.getSession().pause(5000);
        app.getBoard().returnToHomePage();
        app.getBoard().returnToHomePage();

       int after = app.getBoard().getPersonalBoardCount();
        Assert.assertEquals(after,before-1);


        }

}
