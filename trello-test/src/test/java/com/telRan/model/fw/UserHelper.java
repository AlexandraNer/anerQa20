package com.telRan.model.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class UserHelper extends HelperBase {
    public UserHelper(WebDriver driver) {
        super(driver);
    }
    public void clickOnAvatar() throws InterruptedException {

        click(By.xpath("//button[@data-test-id='header-member-menu-button']"));
        pause(3000);
    }
    public void enterToProfile(){
        click(By.xpath("//a[@data-test-id='header-member-menu-profile']"));
    }
    public void changeAvatar() throws InterruptedException {
//        Actions actions = new Actions(driver);
//        WebElement photo = driver.findElement(By.xpath("//div[@class='rsiNque2CCqtPE']"));
//        pause(3000);
//        actions.moveToElement(photo).click().perform();
        WebElement avatar = driver.findElement(By.xpath("//div[@class='rsiNque2CCqtPE']"));
        new Actions(driver).moveToElement(avatar).pause(3000).click(driver.findElement(By.cssSelector("button._2e97X7K2YRLv4Q"))).perform();
        attach(By.name("file"),new File("src/test/resources/cat_small1.png"));
        pause(10000);

    }
    public void attach(By locator, File file){
        driver.findElement(locator).sendKeys(file.getAbsolutePath());
    }
//    public void saveChanger() {
//    }
//    public void choosePhoto() throws InterruptedException {
//        String filePhath = "C:/Users/alex/Pictures/Camera1/20171015_175149.jpg";
//        WebElement uploadElement = driver.findElement(By.cssSelector("[name='attachment']"));
//        uploadElement.click();
//        pause(3000);
//        uploadElement.sendKeys(filePhath);
//
//    }

//    public void doubleClick() {
//
//        Actions actions = new Actions(driver);
//        actions.doubleClick();
//    }


}
