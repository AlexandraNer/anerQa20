package com.telran.ssuper.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginRegistrationTest extends TestBase {
    @Test
    public void testLogin() throws InterruptedException {
        app.pause(3000);
        app.getSession().fillLoginForm("telran+14@gmail.com","Aq123456");

        app.getSession().closeKeyBoard();
        app.getSession().confirmLogin();
        app.pause(4000);
       // Assert.assertFalse(app.getSession().isElrmrntPresent(By.xpath("")));
    }
}
