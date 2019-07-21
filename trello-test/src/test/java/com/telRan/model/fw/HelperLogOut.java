package com.telRan.model.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperLogOut extends HelperBase {
    public HelperLogOut(WebDriver driver){
        super(driver);

    }
    public void clickOnButtonLogOut() {
        click(By.xpath("//button[@data-test-id='header-member-menu-logout']"));
    }

    public void clickOnAvatar() {
        click(By.xpath("//span[@class='_24AWINHReYjNBf']"));
    }
}
