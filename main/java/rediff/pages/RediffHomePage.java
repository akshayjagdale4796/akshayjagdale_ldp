package rediff.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage
{
    WebDriver driver;

    public RediffHomePage(WebDriver driver)

    {
        this.driver=driver;
    }

    By searchbox=By.id("srchquery_tbox");
    By cricket=By.xpath("//a[contains(text(),'CRICKET')]");
    By signin=By.className("signin");
    public WebElement searchbox()
    {
        return driver.findElement(searchbox);
    }
    public WebElement cricket()
    {
        return driver.findElement(cricket);
    }
    public WebElement signin()
    {
        return driver.findElement(signin);
    }
}
