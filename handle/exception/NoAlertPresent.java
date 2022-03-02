package handle.exception;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoAlertPresent
{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay jagdale\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        Thread.sleep(5000);

        try {
            driver.switchTo().alert().accept();
        }
        catch (NoAlertPresentException na){
            System.out.println(na);
        }
        System.out.println("end");
    }
}
