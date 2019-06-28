import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchWikiTest {
    WebDriver driver;

    @BeforeMethod
    public  void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }
    @Test
    public void wikiWebTest(){
        driver.navigate().to("https://www.google.com/");
      // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       //  driver.findElement(By.id("q")).sendKeys("wikipedia");
       // driver.findElement(By.cssSelector(".sprite.svg-search-icon")).click();
    }

    @Test
    public void wikiWebTest1(){
        driver.navigate().to("https://www.wikipedia.org/");
        driver.findElement(By.name("btnK")).click();

    }
   /* @Test
    public void wikiWebTest2(){
        driver.navigate().to("https://www.wikipedia.org/");
        driver.findElement(By.id("searchInput")).sendKeys("Tel Aviv");
        driver.findElement(By.cssSelector(".sprite.svg-search-icon")).click();
    }*/
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

