package com.telRan.model.tests;

import com.telRan.model.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import javax.swing.*;

public class LoginTrelloTest  extends  TestBase{
    @BeforeTest
    public void  preconditions()throws InterruptedException{
        if(app.getSession().isUserLoggedIn()){
            app.getSession().logOut();
        }
    }
    @AfterTest
    public void returnBack() {
        app.getSession().returnBack();
    }

        @Test
        public void loginTest() throws InterruptedException {
           app.getSession().clickLoginButton();
            app.getSession().fillLoginForm(new User()
                    .withEmail("narishka@walla.com")
                    .withPassword("202010Zxc"));
            app.getSession().pause(3000);
            app.getSession().confirmLogin();
            app.getSession().pause(10000);
    }




}
