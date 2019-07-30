package com.telRan.model.tests;

import org.testng.annotations.Test;

public class EditUserDataTests extends TestBase{

    @Test
    public void changeAvatarTest() throws InterruptedException {
        app.getUser().clickOnAvatar();
        app.getUser().enterToProfile();
        app.getUser().changeAvatar();
        app.getUser().saveChanger();
    }
}
