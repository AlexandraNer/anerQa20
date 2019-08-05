package com.telRan.model.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Board extends HelperBase{

    public Board(WebDriver driver) {
        super(driver);

    }

    public void typeBoardName(String boardName) {
        type(By.xpath("//input[@data-test-id='header-create-board-title-input']"), boardName);
    }

    public void submitCreateBoard() {
        click(By.xpath("//button[@data-test-id='header-create-board-submit-button']"));
    }

    public int getPersonalBoardCount() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver.findElements(By.xpath("//span[@class='icon-lg icon-member']/../../..//li")).size()-1;
    }

    public void cteateBoardFromDropDown() {
        click(By.xpath("//button[@data-test-id='header-create-board-button']"));
    }

    public void clickOnPlusButtonOnHeader() {
        click(By.name("add"));

    }
    public void returnToHomePage() {
        click(By.cssSelector("[href='/']"));


    }
    //---------------------------------------------------------------------------------------------------
    public void clickOnSumbitDelition() {
        click(By.xpath("//input[@class='js-confirm full negate']"));
    }

    public void clickDeleteBoard() {
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='quiet js-delete']")));
        //click(By.xpath("//a[@class='quiet js-delete']"));
    }

    public void closeBoard() {
        click(By.xpath("//input[@class='js-confirm full negate']"));
    }
    public void clickOnButtonCloseBoard() {
        click(By.xpath("//a[@class='board-menu-navigation-item-link js-close-board']"));

    }
    public void clickOnButtonMore() {
        waitForElementAndClick((long)5,By.xpath("//a[@class='board-menu-navigation-item-link js-open-more']"));
        //click(By.xpath("//a[@class='board-menu-navigation-item-link js-open-more']"));
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

    public void openDropdownList() {
        click(By.cssSelector("[class='W6rMLOx8U0MrPx']"));
    }

    public void searchPrivateBoard() {
        click(By.xpath("//button[@class='_2jR0BZMM5cBReR']"));
    }
//==========================================================================================================
    public String getFirstPersonalBoardName() {
        return driver.findElement(By.xpath("//span[@class='icon-lg icon-member']/../../..//li")).getText();
    }

    public String getBoardName() {
        return driver.findElement(By.cssSelector(".js-rename-board")).getText();
    }

    public void changeBoardName(String newName) {
        click(By.cssSelector(".js-board-editing-target"));
        driver.findElement(By.cssSelector("input.board-name-input")).sendKeys("newName");
//        waitForElementAndClick((long)3,(By.cssSelector(".js-board-editing-target.board-header-btn-text")));


    }
}
