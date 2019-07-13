import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderButton extends HelperBase{
    public HeaderButton(WebDriver driver) {
        super(driver);
    }
    public void clickOnPlusButtonOnHeader() {
        //click on button on the header
        click(By.xpath("//span[@class='_2O4TvNuF7v0hxu GAI2GE8czAVHCQ _2p2TP4mBgXTJP3 pv4EOUnR9L6jBk']"));
    }
    public void returnToHomePage() {
        click(By.cssSelector("[href='/']"));
    }
}
