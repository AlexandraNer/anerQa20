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
        click(By.xpath(" //button[@data-test-id='header-create-team-button']"));
        //button[@data-test-id='header-create-team-button']
    }
    public void typeTeamName(String teamName) {
        click(By.cssSelector("[data-test-id='header-create-team-name-input']"));
        driver.findElement(By.cssSelector("[data-test-id='header-create-team-name-input']")).clear();
        driver.findElement(By.cssSelector("[data-test-id='header-create-team-name-input']")).sendKeys(teamName);
    }
    public int getTeamsCount() {
        return driver.findElements(By.xpath("//div[@class='boards-page-top-banner']")).size();

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
    public void changeOfPhoto() throws InterruptedException {

        click(By.xpath("//button[@data-test-id='header-member-menu-button']"));
        click(By.xpath("//a[@data-test-id='header-member-menu-profile']"));
        pause(3000);
    }
    public void attachPhoto() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement photo = driver.findElement(By.xpath("//div[@class='rsiNque2CCqtPE']"));
        pause(3000);
        actions.moveToElement(photo).click().perform();
    }
    public void choosePhoto() throws InterruptedException {

        WebElement uploadElement = driver.findElement(By.cssSelector("[name='attachment']"));
        uploadElement.click();
        pause(3000);
        uploadElement.sendKeys("C:\\Users\\alex\\Pictures\\Camera1\\20171015_175149.jpg");

    }


    public void doubleClick() {
        Actions actions = new Actions(driver);
        actions.doubleClick();
    }
}
