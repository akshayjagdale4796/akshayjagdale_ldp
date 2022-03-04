package rediff.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffSignInPage
{
    WebDriver driver;

    public RediffSignInPage(WebDriver driver1)
    {
        this.driver=driver1;
        PageFactory.initElements(driver1,this);
    }

    //By username=By.id("login1");
    //By password=By.xpath("//input[@id='password']");
    //By submit=By.name("proceed");
    @FindBy(id="login1")
    WebElement username;
    @FindBy(xpath ="//input[@name='passwd']")
    WebElement password;
    @FindBy(name = "proceed")
    WebElement submit;

    public WebElement username()
    {
        return username;
    }
    public WebElement password()
    {
        return password;
    }
    public WebElement submit()
    {
        return submit;
    }

}
