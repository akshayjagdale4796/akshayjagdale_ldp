package handle.exception;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingException
{
    public static void main(String[] args)
    {
        System.out.println("hello");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay jagdale\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        try
        {
            driver.findElement(By.name("fake")).click();
        }
        catch (NoSuchElementException e)
        {
           System.out.println(e);
            System.out.println("helloo");
          //  throw(e);
        }
        finally {
            System.out.println("always execute whether exception is handled or not");
        }
        System.out.println("hi");

    }
}
