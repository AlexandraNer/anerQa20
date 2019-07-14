package fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Teams extends HelperBase{

    public Teams(WebDriver driver) {
        super(driver);
    }
    public void selectTeamGroup() {
        click(By.xpath(" //button[@data-test-id='header-create-team-button']"));
        //button[@data-test-id='header-create-team-button']
    }
    public void typeTeamName(String teamName) {
        click(By.cssSelector("[class='_1Am_PrV0YBkAmt']"));
        driver.findElement(By.cssSelector("[class='_1Am_PrV0YBkAmt']")).clear();
        driver.findElement(By.cssSelector("[class='_1Am_PrV0YBkAmt']")).sendKeys(teamName);
    }
    public int getTeamsCount() {
        return driver.findElements(By.xpath("//div[@class='_2SmDbz1bYpPjKK']")).size();

    }
    public void submitCreateTeam() {
        click(By.xpath("//button[@data-test-id='header-create-team-submit-button']"));
    }
}
