package fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Board extends HelperBase{

    public Board(WebDriver driver) {
        super(driver);

    }

    public void typeBoardName(String boardName) {
        type(By.cssSelector("[class=\"_2S-286TC5jzXKk\"]"), boardName);
    }

    public void submitCreateBoard() {
        click(By.xpath("//button[@data-test-id='header-create-board-submit-button']"));
    }

    public int getPersonalBoardCount() {
        return driver.findElements(By.xpath("//span[@class='icon-lg icon-member']/../../..//li")).size()-1;
    }

    public void cteateBoardFromDropDown() {
        click(By.cssSelector("[class=_2b-xS2onqCL250]"));
    }
    //---------------------------------------------------------------------------------------------------
    public void clickOnSumbitDelition() {
        click(By.xpath("//input[@class='js-confirm full negate']"));
    }

    public void clickDeleteBoard() {
        click(By.xpath("//a[@class='quiet js-delete']"));
    }

    public void closeBoard() {
        click(By.xpath("//input[@class='js-confirm full negate']"));
    }
    public void clickOnButtonCloseBoard() {
        click(By.xpath("//a[@class='board-menu-navigation-item-link js-close-board']"));
        //board-menu-navigation-item-link js-close-board
    }
    public void clickOnButtonMore() {
        click(By.xpath("//span[@class='icon-sm icon-overflow-menu-horizontal board-menu-navigation-item-link-icon']"));
    }
    public void openMenuOptions() {
        click(By.xpath("//a[@class='board-menu-navigation-item-link js-open-card-filter']"));
    }
    public void openFirstPrivateBoard() {
        WebElement privateBoardList =driver.findElement(By.xpath("//span[@class='icon-lg icon-member']/../../..//ul"));
        String boardNameForDelite = privateBoardList.findElement(By.xpath(".//li")).getText();
        System.out.println(boardNameForDelite);
        privateBoardList.findElement(By.xpath(".//li")).click();
    }

}
