package web.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay jagdale\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fhomepage.html%3F_encoding%3DUTF8%26ref_%3Dnavm_em_signin%3Faction%3Dsign-out%26path%3D%252Fgp%252Fhomepage.html%253F_encoding%253DUTF8%2526ref_%253Dnavm_em_signin%26signIn%3D1%26useReectOnSuccess%3D1%26ref_%3Dnav_em_signout_0_1_1_32&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.findElement(By.id("ap_email")).sendKeys("7709096079");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.name("password")).sendKeys("akshay47");
        driver.findElement(By.id("signInSubmit")).click();
       driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("nike football by size 5");
       // driver.findElement(By.cssSelector("input[value='Go']")).click();
      // driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("football studs nike");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        //driver.close();
      //  driver.quit();
    }
}
