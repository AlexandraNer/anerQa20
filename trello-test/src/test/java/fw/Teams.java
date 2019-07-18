package fw;

import model.Team;
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
        click(By.cssSelector("[data-test-id='header-create-team-name-input']"));
        driver.findElement(By.cssSelector("[data-test-id='header-create-team-name-input']")).clear();
        driver.findElement(By.cssSelector("[data-test-id='header-create-team-name-input']")).sendKeys(teamName);
    }
    public int getTeamsCount() {
        return driver.findElements(By.xpath("//div[@class='_2SmDbz1bYpPjKK']")).size();

    }
    public void submitCreateTeam() {
        click(By.xpath("//button[@data-test-id='header-create-team-submit-button']"));
    }

    public void fillTeamForm(Team team) {
        typeTeamName(team.getTeamName());
        typeTeamDescription(team.getTeamDescription());
    }

    public void typeTeamDescription(String teamDescription) {
        type(By.cssSelector("[name=desc]"),teamDescription);
    }
}
