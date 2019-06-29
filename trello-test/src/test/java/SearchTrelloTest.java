import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchTrelloTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
driver = new FirefoxDriver();
driver.get("https://trello.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.cssSelector("[class='btn btn-sm btn-link text-white']")).click();// login
        // type user name
        driver.findElement(By.id("user")).click();
        driver.findElement(By.id("user")).clear();
        driver.findElement(By.id("user")).sendKeys("narishkaalex@gmail.com");

        // type password
driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("301184Alex");

        driver.findElement(By.id("login")).click();

    }
    @Test
    public void createBoardTest(){
        //click on button on the header
driver.findElement(By.name("add")).click();
driver.findElement(By.cssSelector("[class=_2b-xS2onqCL250]")).click();
//type Board name
driver.findElement(By.cssSelector("[class=\"_2S-286TC5jzXKk\"]")).click();
driver.findElement(By.cssSelector("[class=\"_2S-286TC5jzXKk\"]")).clear();
driver.findElement(By.cssSelector("[class=\"_2S-286TC5jzXKk\"]")).sendKeys("new");
//click on button create board
driver.findElement(By.cssSelector("[class=\"_1wsVKP33UvhH19 _1bjJJFqVBowSe5 _1LsB1Fm13rEW9M\"]")).click();

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
