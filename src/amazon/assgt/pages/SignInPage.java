package amazon.assgt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage
{
    WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }
    By signIn=By.id("nav-link-accountList-nav-line-1");
    By loginId=By.id("ap_email");
    By continueButton=By.id("continue");
    By password=By.id("ap_password");
    By submit=By.id("signInSubmit");

    public WebElement clickOnSignIn()
    {
        return driver.findElement(signIn);
    }
    public WebElement enterLogInId()
    {
        return driver.findElement(loginId);
    }
    public WebElement clickOnContinue()
    {
        return driver.findElement(continueButton);
    }
    public WebElement enterPassword()
    {
        return driver.findElement(password);
    }
    public WebElement clickOnSubmit()
    {
        return driver.findElement(submit);
    }
}
