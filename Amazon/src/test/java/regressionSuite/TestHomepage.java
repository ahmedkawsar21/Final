package regressionSuite;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.HomePage;

public class TestHomepage extends CommonAPI {
    HomePage homePage;


    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    public void signInButtonTest(){
        homePage.clickAccount();
        sleepFor(1);
        homePage.signIn("myemail@gmail.com", "password");
        sleepFor(1);
        WebElement errorLoginFail = driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
        if (errorLoginFail.isDisplayed()){
            System.out.println("Success. Message was shown up");
            getScreenshot(driver);
        }
        else{
            System.out.println("Failed");
            getScreenshot(driver);
        }

    }
    @Test
    public void searchBoxTest(){
        homePage.clearSearchBox();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("anything you want");
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        sleepFor(1);
        System.out.println("success. new page opened");
        getScreenshot(driver);
    }



}
