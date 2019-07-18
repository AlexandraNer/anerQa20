package tests;

import model.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTrelloTest  extends  TestBase{


        @Test
        public void loginTest() throws InterruptedException {
            //app.getSession().initLogin();
            app.getSession().fillLoginForm(new User()
                    .withEmail("narishka@walla.com")
                    .withPassword("202010Zxc"));
            app.getSession().pause(3000);
            app.getSession().confirmLogin();
            app.getSession().pause(10000);




    }

}
