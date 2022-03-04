package amazon.assgt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class
  AddMinQuantityItem
{
    WebDriver driver;
    public AddMinQuantityItem(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    By searchBox=By.id("twotabsearchtextbox");
    By search=By.id("nav-search-submit-button");
    By item=By.xpath("//div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]");
    By addToCart=By.id("add-to-cart-button");
    By verifyAdded=By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']");
    public WebElement searchBox()
    {
        return driver.findElement(searchBox);
    }
    public WebElement search()
    {
        return driver.findElement(search);
    }
    public WebElement item()
    {
        return driver.findElement(item);
    }
    public WebElement addToCart()
    {
        return driver.findElement(addToCart);
    }
    public Object ScrollDownPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("window.scrollTo(0,500)");
    }
    public WebElement verifyAdded()
    {
        return driver.findElement(verifyAdded);
    }
}
