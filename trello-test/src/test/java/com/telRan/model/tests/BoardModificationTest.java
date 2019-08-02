package com.telRan.model.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardModificationTest extends TestBase {
    @Test

    public void changeBoardNameTest(){
        String nameOnHomePage = app.getBoard().getFirstPersonalBoardName();
        app.getBoard().openFirstPrivateBoard();
        String boardName = app.getBoard().getBoardName();
        Assert.assertEquals(boardName,nameOnHomePage);

    }
}

