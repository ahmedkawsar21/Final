package regressionSuite;

import base.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.Homepage;

public class TestHomepage extends CommonAPI {
    Homepage homepage;
    @BeforeMethod
    public void init() {
        homepage = PageFactory.initElements(driver, Homepage.class);
    }

    public void facebookLogin() {
        homepage.emailOrPhone.sendKeys("ahmedkawsar21@yahoo.com");
        sleepFor(1);
        homepage.logInPassword.sendKeys("wd385783");
        sleepFor(1);
        homepage.clickLoginButton();
        sleepFor(1);
    }
    @Test
    public void searchName() {
        homepage.emailOrPhone.sendKeys("ahmedkawsar21@yahoo.com");
        sleepFor(1);
        homepage.logInPassword.sendKeys("wd385783");
        sleepFor(1);
        homepage.clickLoginButton();
        sleepFor(1);
        driver.findElement(By.className("_1frb")).sendKeys("sakil ahmod", Keys.ENTER);
        sleepFor(1);


    }


}
