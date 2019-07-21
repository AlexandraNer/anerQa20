package com.telRan.model.tests;

import com.telRan.model.model.User;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTrelloTest  extends  TestBase{
    @BeforeMethod
    public void  preconditions()throws InterruptedException{
        if(app.getSession().isUserLoggedIn()){
            app.getSession().logOut();
        }
    }
//    @AfterMethod
//    public void returnBack() {
//        app.getSession().returnBack();
//    }

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
