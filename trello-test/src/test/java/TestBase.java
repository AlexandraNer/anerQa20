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
    protected void pause(int millis) throws InterruptedException {
            Thread.sleep(millis);
        }

    protected void confirmLogin() {
            click(By.id("login"));
        }

    void click(By locator) {
        driver.findElement(locator).click();
    }

    // universary method
    protected void fillLoginForm(String email, String password) {
        type(By.id("user"), email);
        type(By.id("password"), password);
    }

    protected void getClick() {
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

    protected void typeBoardName(String boardName) {
        click(By.cssSelector("[class=\"_2S-286TC5jzXKk\"]"));
        driver.findElement(By.cssSelector("[class=\"_2S-286TC5jzXKk\"]")).clear();
        driver.findElement(By.cssSelector("[class=\"_2S-286TC5jzXKk\"]")).sendKeys(boardName);
    }

    protected void clickOnButtononeHeader() {
        //click on button on the header
        click(By.name("add"));
    }

    // universary method
    void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }
}
