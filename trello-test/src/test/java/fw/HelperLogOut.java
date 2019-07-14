package fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperLogOut extends HelperBase {
    public HelperLogOut(WebDriver driver){
        super(driver);

    }
    public void clickOnButtonLogOut() {
        driver.findElement(By.xpath("//button[@data-test-id='header-member-menu-logout']")).click();
    }

    public void clickOnAvatar() {
        driver.findElement(By.xpath("//div[@class='_2p1tg_FGxt3yHa']")).click();
    }
}
