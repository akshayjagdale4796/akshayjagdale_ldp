package handle.exception;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoFrameAndWindow
{
    public static void main(String[] args)
    {
        System.out.println("hello");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay jagdale\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.switchTo().window("fail");
       // driver.switchTo().frame("fail");
        driver.close();

    }
}
