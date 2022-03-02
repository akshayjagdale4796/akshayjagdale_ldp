package web.element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebBrowser
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay jagdale\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.className("nav-input nav-progressive-attribute")).click();
        driver.findElement(By.className("nav-input nav-progressive-attribute")).click();
    }
}
