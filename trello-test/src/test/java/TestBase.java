import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("https://trello.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


        @AfterMethod
        public void tearDown(){
            driver.quit();
        }

    //-------------------------------------------------------------------------------------------------------------
    public void pause(int millis) throws InterruptedException {
            Thread.sleep(millis);
        }

    public void confirmLogin() {
            click(By.id("login"));
        }

    void click(By locator) {
        driver.findElement(locator).click();
    }

    // universary method
    public void fillLoginForm(String email, String password) {
        type(By.id("user"), email);
        type(By.id("password"), password);
    }

    public void getClick() {
        click(By.cssSelector("[class='btn btn-sm btn-link text-white']"));
    }

    public void login (String email,String pwd) throws InterruptedException {
        getClick();// login
        fillLoginForm(email,pwd);//fill login form //"narishkaalex@gmail.com", "301184Alex"
        pause(3000);
        confirmLogin();//confirm login
        pause(10000);

    }

    public void confimBoardCreation(){
        click(By.cssSelector("[class=\"_1wsVKP33UvhH19 _1bjJJFqVBowSe5 _1LsB1Fm13rEW9M\"]"));
    }

    public void typeBoardName(String boardName) {
        click(By.cssSelector("[class=\"_2S-286TC5jzXKk\"]"));
        driver.findElement(By.cssSelector("[class=\"_2S-286TC5jzXKk\"]")).clear();
        driver.findElement(By.cssSelector("[class=\"_2S-286TC5jzXKk\"]")).sendKeys(boardName);
    }

    public void clickOnButtononeHeader() {
        //click on button on the header
        click(By.xpath("//span[@class='_2O4TvNuF7v0hxu GAI2GE8czAVHCQ _2p2TP4mBgXTJP3 pv4EOUnR9L6jBk']"));
    }

    // universary method
    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void pressSubmit() {
        click(By.xpath("//button[@data-test-id='header-create-team-submit-button']"));
    }

    /*public void fillGroupCreationForm(String teamName) {
        click(By.cssSelector("By.cssSelector(\"[class='_1Am_PrV0YBkAmt']\""));
        driver.findElement(By.cssSelector("[class='_1Am_PrV0YBkAmt']")).clear();
       driver.findElement(By.cssSelector("[class='_1Am_PrV0YBkAmt']")).sendKeys(teamName);
    }*/

    public void selectTeamGroup() {
        click(By.xpath(" //button[@data-test-id='header-create-team-button']"));
        //button[@data-test-id='header-create-team-button']
    }

    public void typeTeamName(String teamName) {
        click(By.cssSelector("[class='_1Am_PrV0YBkAmt']"));
       driver.findElement(By.cssSelector("[class='_1Am_PrV0YBkAmt']")).clear();
       driver.findElement(By.cssSelector("[class='_1Am_PrV0YBkAmt']")).sendKeys(teamName);
    }
}
