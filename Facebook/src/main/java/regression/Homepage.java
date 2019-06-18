package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement emailOrPhone;
    @FindBy(xpath = "//*[@id=\"pass\"]")
    public WebElement logInPassword;
    @FindBy(xpath = "//*[@id=\"login_form\"]/table/tbody/tr[2]/td[3]")
    public WebElement logInButton;

    public void clickLoginButton() {
        logInButton.click();
    }


    public void facebookLogin (String email, String password) {
        emailOrPhone.sendKeys(email);
        logInPassword.sendKeys(password);

    }
}
