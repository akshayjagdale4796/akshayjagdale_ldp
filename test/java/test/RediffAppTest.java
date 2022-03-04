package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import rediff.pages.RediffHomePage;
import rediff.pages.RediffSignInPage;

public class RediffAppTest
{
    @Test
    public void logInTest()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay jagdale\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.rediff.com/");
        RediffHomePage homePage=new RediffHomePage(driver);
        homePage.searchbox().sendKeys("sports news");
        homePage.cricket().click();
        homePage.signin().click();

        RediffSignInPage signinPage=new RediffSignInPage(driver);
        signinPage.username().sendKeys("rediff");
        signinPage.password().sendKeys("pass1234");
        signinPage.submit().click();
        System.out.println("successfully run the test");
    }

}
