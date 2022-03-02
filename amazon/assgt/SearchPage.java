package amazon.assgt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage
{
    private static WebElement element=null;

    public WebElement textBoxSearch(WebDriver driver)
    {
        element=driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
        return element;
    }
    public WebElement clickOnSearch(WebDriver driver)
    {
        element=driver.findElement(By.xpath("//input[@type='submit']"));
        return element;
    }
}
