package fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperHeader extends HelperBase{
    public HelperHeader(WebDriver driver) {
        super(driver);
    }
    public void clickOnPlusButtonOnHeader() {
        //click on button on the header
        click(By.xpath("//button[@data-test-id='header-create-menu-button']"));
    }
    public void returnToHomePage() {
        click(By.cssSelector("[href='/']"));
    }
}
