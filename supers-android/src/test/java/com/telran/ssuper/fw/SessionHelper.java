package com.telran.ssuper.fw;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(AppiumDriver driver) {

        super(driver);
    }
    public void confirmLogin()
    {click(By.id("login_btn"));}

    public void fillLoginForm(String email,String pasword) {
       type(By.id("log_email_input"), email);
        type(By.id("log_password_input"),pasword);
    }

    public void pause(int millis) throws InterruptedException {
          Thread.sleep(millis);
        }
    public void login (String email,String password) throws InterruptedException {
        initLogin();
        fillLoginForm(email,password);
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
