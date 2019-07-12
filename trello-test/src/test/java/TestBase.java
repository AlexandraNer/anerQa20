import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

     ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() {
        app.init();
        //login("narishkaalex@gmail.com", "301184Alex");
    }

    @AfterMethod
        public void tearDown(){
        app.stop();
    }

    /*public void fillGroupCreationForm(String teamName) {
        click(By.cssSelector("By.cssSelector(\"[class='_1Am_PrV0YBkAmt']\""));
        driver.findElement(By.cssSelector("[class='_1Am_PrV0YBkAmt']")).clear();
       driver.findElement(By.cssSelector("[class='_1Am_PrV0YBkAmt']")).sendKeys(teamName);
    }*/
    //------------------------------------------------------------------------------------------------------------------------

    ////a[@class='quiet js-delete']

    ////input[@class='js-confirm full negate']

}
