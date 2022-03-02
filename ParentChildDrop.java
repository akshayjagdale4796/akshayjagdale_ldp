import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildDrop
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay jagdale\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.cssSelector("input[class=\"css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu\"]:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div[css=\"10\"]")).click();
    }
}
