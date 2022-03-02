package web.element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemetDefining
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay jagdale\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
       // driver.findElement(By.name("q"));
        //By by=By.name("q");
      //  WebElement elementname= driver.findElement(by);
        WebElement wEname=driver.findElement(By.name("q"));
        wEname.sendKeys("automate the browser");
       // driver.findElement(By.name("q")).sendKeys("selenium tutorial");
        driver.close();

    }

}
