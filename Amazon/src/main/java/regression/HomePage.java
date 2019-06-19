package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[2]")
    public static WebElement account;
    @FindBy(xpath = "//*[@id=\"nav-flyout-ya-signin\"]/a/span")
    public static WebElement signInButton;
    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    public  static WebElement emailOrNumber;
    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    public static WebElement signInPassword;
    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    public static WebElement signInfromSignInButton;
    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    public static WebElement searchBox;

    public void clickAccount() {
        account.click();
    }
    public void signIn(String email, String password) {
        emailOrNumber.sendKeys(email);
        signInPassword.sendKeys(password);
        signInfromSignInButton.click();

    }
    public void clearSearchBox() {
        searchBox.clear();

    }
}
