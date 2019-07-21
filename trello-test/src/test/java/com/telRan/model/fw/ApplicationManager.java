package com.telRan.model.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    private String browser;
    Board board ;
    SessionHelper session;
    Teams teams;
    HelperHeader hedBut;
    HelperLogOut logOut;
    WebDriver driver;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() throws InterruptedException {

        if (browser.equals(BrowserType.FIREFOX)) {
            driver = new FirefoxDriver();
        }else  if(browser.equals(BrowserType.CHROME)){
            driver = new ChromeDriver();
        }else  if(browser.equals(BrowserType.EDGE)){
            driver = new EdgeDriver();
        }else  if(browser.equals(BrowserType.IEXPLORE)){
            driver = new InternetExplorerDriver();
        }else {
            System.out.println("Unknown browser format");
        }
        driver = new FirefoxDriver();
        driver.get("https://trello.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        session=new SessionHelper(driver);
        session.login("narishka@walla.com","202010Zxc");
        hedBut = new HelperHeader(driver);
        board = new Board(driver);
        teams = new Teams(driver);
        logOut = new HelperLogOut(driver);
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
    public HelperHeader getHedBut() {
        return hedBut;
    }

    public HelperLogOut getLogOut() {
        return logOut;
    }
}
