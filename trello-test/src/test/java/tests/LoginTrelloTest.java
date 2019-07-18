package tests;

import org.testng.annotations.Test;

public class LoginTrelloTest  extends  TestBase{

        @Test
        public void loginTest() throws InterruptedException {
            app.getSession().initLogin();
            app.getSession().fillLoginForm("narishka@walla.com", "202010Zxc");
            app.getSession().pause(3000);
            app.getSession().confirmLogin();
            app.getSession().pause(10000);




    }

}
