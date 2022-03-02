package amazon.assgt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn
{
    private static WebElement element=null;

    public WebElement logInId(WebDriver driver)
    {
        element= driver.findElement(By.id("ap_email"));
        return element;
    }
    public WebElement clickOnContinue(WebDriver driver)
    {
        element= driver.findElement(By.id("continue"));
        return element;
    }
    public WebElement password(WebDriver driver)
    {
        element= driver.findElement(By.name("password"));
        return element;
    }
    public WebElement clickOnSighInButton(WebDriver driver)
    {
        element= driver.findElement(By.id("signInSubmit"));
        return element;
    }
}
