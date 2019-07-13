import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(WebDriver driver) {

        super(driver);
    }
    public void confirmLogin() {
        click(By.id("login"));
    }
    public void fillLoginForm(String email, String password) {
       type(By.id("user"), email);
        type(By.id("password"), password);
    }
    public void pause(int millis) throws InterruptedException {
          Thread.sleep(millis);
        }
    public void login (String email, String pwd) throws InterruptedException {
        clickLoginButton();
        fillLoginForm(email,pwd);
        pause(3000);
        confirmLogin();
        pause(10000);
    }
    public void clickLoginButton() {
        click(By.xpath("//a[@href='/login']"));
    }

    public boolean isUserLoggedIn() {
        return isElrmrntPresent2(By.xpath("//button[@class='_3bl7HhpXOOyEkB js-open-header-member-menu _2OG55MZw5Ysbaz']"));
    }
}
