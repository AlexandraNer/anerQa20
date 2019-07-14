package fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    Board board ;
    SessionHelper session;
    Teams teams;
    HelperHeader hedBut;
    HelperLogOut logOut;
    WebDriver driver;

    public void init() throws InterruptedException {
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
