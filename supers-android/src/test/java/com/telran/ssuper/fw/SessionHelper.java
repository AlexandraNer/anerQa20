package com.telran.ssuper.fw;

import com.telRan.model.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(WebDriver driver) {

        super(driver);
    }
    public void confirmLogin()
    {click(By.cssSelector("#login[type=submit]"));}

    public void fillLoginForm(User user) {
       type(By.id("user"), user.getEmail());
        type(By.id("password"), user.getPassword());
    }

    public void pause(int millis) throws InterruptedException {
          Thread.sleep(millis);
        }
    public void login (User user) throws InterruptedException {
        initLogin();
        fillLoginForm(user);
        pause(3000);
        confirmLogin();
        pause(10000);
    }

    public void initLogin() throws InterruptedException {
        click(By.xpath("//*[@href='/login']"));
        }


    public void clickLoginButton() throws InterruptedException {
        click(By.cssSelector("[href='/login']"));
    }

    public boolean isUserLoggedIn() {
        return isElrmrntPresent2(By.xpath("//button[@data-test-id='header-member-menu-button']"));
    }

    public void logOut() throws InterruptedException{
        click(By.cssSelector(".js-open-header-member-menu"));
        click(By.xpath("//button[@data-test-id='header-member-menu-logout']"));
    }
}
