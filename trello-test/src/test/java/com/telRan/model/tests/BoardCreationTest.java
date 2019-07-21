package com.telRan.model.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreationTest extends TestBase {

    @Test
    public void testCreation() throws InterruptedException {

        int before = app.getBoard().getPersonalBoardCount();
        app.getHedBut().clickOnPlusButtonOnHeader();
        app.getBoard().cteateBoardFromDropDown();
        app.getSession().pause(7000);
        app.getBoard().typeBoardName("qa20"+System.currentTimeMillis());
        app.getBoard().submitCreateBoard();
        app.getSession().pause(10000);
        app.getHedBut().returnToHomePage();
        app.getHedBut().returnToHomePage();

        int after= app.getBoard().getPersonalBoardCount();
        Assert.assertEquals(after,before+1);
    }

}


