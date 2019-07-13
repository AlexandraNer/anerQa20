import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    Board board ;
    SessionHelper session;
    Teams teams;
    HeaderButton hedBut;
    WebDriver driver;

    public void init() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get("https://trello.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        session=new SessionHelper(driver);
        session.login("narishka@walla.com","202010Zxc");
        hedBut = new HeaderButton(driver);
        board = new Board(driver);
        teams = new Teams(driver);
    }

    public void stop() {
        driver.quit();
    }

    //-------------------------------------------------------------------------------------------------------------

    public void clickOnSumbitDelition() {
        board.click(By.xpath("//input[@class='js-confirm full negate']"));
    }

    public void clickDeleteBoard() {
        board.click(By.xpath("//a[@class='quiet js-delete']"));
    }

    public void closeBoard() {
        board.click(By.xpath("//input[@class='js-confirm full negate']"));
    }
    public void clickOnButtonCloseBoard() {
        board.click(By.xpath("//a[@class='board-menu-navigation-item-link js-close-board']"));
        //board-menu-navigation-item-link js-close-board
    }
    public void clickOnButtonMore() {
        board.click(By.xpath("//span[@class='icon-sm icon-overflow-menu-horizontal board-menu-navigation-item-link-icon']"));
    }
    public void openMenuOptions() {
        board.click(By.xpath("//a[@class='board-menu-navigation-item-link js-open-card-filter']"));
    }
    public void openFirstPrivateBoard() {
        WebElement privateBoardList =driver.findElement(By.xpath("//span[@class='icon-lg icon-member']/../../..//ul"));
        String boardNameForDelite = privateBoardList.findElement(By.xpath(".//li")).getText();
        System.out.println(boardNameForDelite);
        privateBoardList.findElement(By.xpath(".//li")).click();
    }

    public Board getBoard() {
        return board;
    }
    public SessionHelper getSession() {
        return session;
    }
    public Teams getTeams() {
        return teams;
    }
    public HeaderButton getHedBut() {
        return hedBut;
    }
}
