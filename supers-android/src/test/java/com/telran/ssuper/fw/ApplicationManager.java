package com.telran.ssuper.fw;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    SessionHelper session;
  // Appium
    String browser;


    public static  class MyListener extends AbstractWebDriverEventListener{
        @Override
        public void afterFindBy(By by, WebElement element, WebDriver driver) {
            System.out.println(by + "found");
        }
        @Override
        public void onException(Throwable throwable, WebDriver driver) {
            System.out.println(throwable);
            File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File screenshot = new File ("src/test/resources/screenshorts/screenshot -" +System.currentTimeMillis()+".png");
           // C:\Users\alex\Documents\GitHub\anerQa20\trello-test\src\test\resources\screenshorts
            try {
                Files.copy(tmp,screenshot);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("!!!Created Screenshot" +screenshot);
        }
        @Override
        public void beforeFindBy(By by, WebElement element, WebDriver driver) {
            System.out.println("Start search" + by);
        }
    }

    public ApplicationManager(String browser) {
        this.browser = browser;
    }
    public void init() throws InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "qa20_class");
        capabilities.setCapability( "platformVersion", "8.0");
        capabilities.setCapability( "automationName", "Appium");
        capabilities.setCapability( "appPackage", "com.example.svetlana.scheduler");
        capabilities.setCapability( "appActivity", ".presentation.splashScreen.SplashScreenActivity");
        capabilities.setCapability( "app", "C:/Users/alex/Documents/GitHub/anerQa20/supers-android/src/test/resources/v.0.0.2.apk ");



//        if (browser.equals(BrowserType.FIREFOX)) {
//            driver = new EventFiringWebDriver(new FirefoxDriver());
//        }else  if(browser.equals(BrowserType.CHROME)){
//            driver = new EventFiringWebDriver(new ChromeDriver());
//        }else  if(browser.equals(BrowserType.EDGE)){
//            driver = new EventFiringWebDriver(new EdgeDriver());
//        }else  if(browser.equals(BrowserType.IEXPLORE)){
//            driver = new EventFiringWebDriver(new InternetExplorerDriver());
//        }else {
//            System.out.println("Unknown browser format");
//        }
        //driver.register(new MyListener());
        openSite("https://trello.com/");
       manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        session=new SessionHelper(driver);

       // session.login(new User().withEmail("narishka@walla.com").withPassword("202010Zxc"));


    }
    public void openSite(String url) {
        driver.get(url);
    }

    public void stop() {
        driver.quit();
    }
    //-------------------------------------------------------------------------------------------------------------

    public SessionHelper getSession() {
        return session;
    }

}
