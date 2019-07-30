package com.telRan.model.fw;

import com.telRan.model.model.Team;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Teams extends HelperBase{

    public Teams(WebDriver driver) {
        super(driver);
    }
    public void selectTeamGroup() {
        click(By.xpath("//button[@class='_2jR0BZMM5cBReR']/../../li[2]"));
        //button[@data-test-id='header-create-team-button']
    }
    public void typeTeamName(String teamName) {
        type(By.cssSelector("[data-test-id='header-create-team-name-input']"),teamName);
    }
    public void fillTeamForm(Team team) {
        typeTeamName(team.getTeamName());
        typeTeamDescription(team.getTeamDescription());
    }
    public void typeTeamDescription(String teamDescription) {
        type(By.cssSelector("[name='desc']"),teamDescription);

    }
    public int getTeamsCount() {
        return driver.findElements(By.xpath("//div[@class='boards-page-top-banner']")).size();

    }
    public void submitCreateTeam() {
        click(By.xpath("//button[@data-test-id='header-create-team-submit-button']"));
    }



    public void chooseTeamForDelete() {
        click(By.xpath("//body//a[3]"));
    }

    public void deleteThisTeam() {
        click(By.xpath("//a[@class='quiet-button']"));
    }

    public void deleteForever() {
        click(By.xpath("//input[@class='js-confirm full negate']"));
    }
    //---------------

}
