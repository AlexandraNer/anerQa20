package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase {
    WebDriver driver;

    @Test
    public void logOutTest(){

        app.getLogOut().clickOnAvatar();
        app.getLogOut().clickOnButtonLogOut();
    }


}

