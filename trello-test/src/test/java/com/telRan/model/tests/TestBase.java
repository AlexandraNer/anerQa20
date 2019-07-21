package com.telRan.model.tests;

import com.telRan.model.fw.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    static ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);

    @BeforeSuite
    public void setUp() throws InterruptedException {
        app.init();
    }

    @AfterSuite
        public void tearDown(){
        app.stop();
    }
}
