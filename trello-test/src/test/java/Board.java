import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}
