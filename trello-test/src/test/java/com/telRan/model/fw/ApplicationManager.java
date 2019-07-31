package com.telRan.model.fw;

import com.telRan.model.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {


    private Board board ;
    SessionHelper session;
    UserHelper user;
    Teams teams;
    EventFiringWebDriver driver;
    String browser;
    public static  class MyListener extends AbstractWebDriverEventListener{
        @Override
        public void afterFindBy(By by, WebElement element, WebDriver driver) {
            System.out.println(by + "found");
        }
        @Override
        public void onException(Throwable throwable, WebDriver driver) {
            System.out.println(throwable);
        }
        @Override
        public void beforeFindBy(By by, WebElement element, WebDriver driver) {
            System.out.println("Start search" + by);
        }
    }

    public ApplicationManager(String browser) {
        this.browser = browser;
    }
    public void init() throws InterruptedException {

        if (browser.equals(BrowserType.FIREFOX)) {
            driver = new EventFiringWebDriver(new FirefoxDriver());
        }else  if(browser.equals(BrowserType.CHROME)){
            driver = new EventFiringWebDriver(new ChromeDriver());
        }else  if(browser.equals(BrowserType.EDGE)){
            driver = new EventFiringWebDriver(new EdgeDriver());
        }else  if(browser.equals(BrowserType.IEXPLORE)){
            driver = new EventFiringWebDriver(new InternetExplorerDriver());
        }else {
            System.out.println("Unknown browser format");
        }
        driver.register(new MyListener());
        openSite("https://trello.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        session=new SessionHelper(driver);
        user = new UserHelper(driver);
        session.login(new User().withEmail("narishka@walla.com").withPassword("202010Zxc"));
        board = new Board(driver);
        teams = new Teams(driver);
    }
    public void openSite(String url) {
        driver.get(url);
    }

    public void stop() {
        driver.quit();
    }
    //-------------------------------------------------------------------------------------------------------------
    public Board getBoard() {
        return board;
    }
    public SessionHelper getSession() {
        return session;
    }
    public Teams getTeams() {
        return teams;
    }

    public UserHelper getUser() {
        return user;
    }
}
