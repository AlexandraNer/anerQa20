package com.telRan.model.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;

public class BoardCreationTest extends TestBase {

    @Test
    public void testCreation() throws InterruptedException {

      int before = app.getBoard().getPersonalBoardCount();


        app.getBoard().clickOnPlusButtonOnHeader();
      app.getBoard().pause(3000);
        app.getBoard().cteateBoardFromDropDown();
        app.getSession().pause(7000);
        app.getBoard().typeBoardName("qa20"+System.currentTimeMillis());
        app.getBoard().openDropdownList();
        app.getBoard().searchPrivateBoard();
        app.getBoard().submitCreateBoard();
        app.getSession().pause(10000);
        app.getBoard().returnToHomePage();
        app.getBoard().returnToHomePage();
        app.getSession().pause(3000);

        int after= app.getBoard().getPersonalBoardCount();
        //Assert.assertEquals(after,before+1);
        Assert.assertEquals(after,before+1);
    }

}


