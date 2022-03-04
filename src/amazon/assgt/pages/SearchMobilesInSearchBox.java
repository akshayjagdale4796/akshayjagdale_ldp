package amazon.assgt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchMobilesInSearchBox
{
    WebDriver driver;

    public SearchMobilesInSearchBox(WebDriver driver) {
        this.driver = driver;
    }
    By searchBox=By.id("twotabsearchtextbox");
    By search=By.id("nav-search-submit-button");
    By getLastItem=By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[14]/div[1]");
    //body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[14]/div[1]
    //img[@data-image-index='22']
    public WebElement searchBox()
    {
        return driver.findElement(searchBox);
    }
    public WebElement search()
    {
        return driver.findElement(search);
    }
    public Object ScrollDownPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("window.scrollTo(0,5800)");
    }
    public WebElement getLastDisplayedItem()
    {
        return driver.findElement(getLastItem);
    }
}
