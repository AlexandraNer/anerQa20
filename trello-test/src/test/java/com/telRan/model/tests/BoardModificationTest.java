package com.telRan.model.tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardModificationTest extends TestBase {
    @Test

    public void changeBoardNameTest() throws InterruptedException {
       String nameOnHomePage = app.getBoard().getFirstPersonalBoardName();
        logger.info("Opened board with name:" +nameOnHomePage);
        app.getBoard().openFirstPrivateBoard();
        String boardName = app.getBoard().getBoardName();
        Assert.assertEquals(boardName,nameOnHomePage);
        app.getSession().pause(3000);
        app.getBoard().changeBoardName("Changes" +System.currentTimeMillis()+ Keys.ENTER);

        //Assert.assertTrue();



    }
}

