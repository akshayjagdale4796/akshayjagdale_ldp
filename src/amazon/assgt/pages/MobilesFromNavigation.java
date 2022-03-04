package amazon.assgt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MobilesFromNavigation
{
    WebDriver driver;

    public MobilesFromNavigation(WebDriver driver) {
        this.driver = driver;
    }
  //  By leftNavigation=By.xpath("//i[@class='hm-icon nav-sprite']");
    By selectMobiles=By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']");
 //   By selectMobilePhones=By.xpath("//div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[8]/li[3]");

    By homeButton=By.id("nav-logo-sprites");


    public Object ScrollDownPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("window.scrollTo(0,700)");
    }
    public WebElement selectMobiles()
    {
        return driver.findElement(selectMobiles);
    }

    public WebElement clickOnHomeButton()
    {
        return driver.findElement(homeButton);
    }

}
