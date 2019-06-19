import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Homepage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement userId;
    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement password;
}
