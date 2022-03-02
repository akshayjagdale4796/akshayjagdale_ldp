package automates.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionByTestng
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay jagdale\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());


        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
        int i=1;
        while (i<4)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"4 Adult");
        System.out.println( driver.findElement(By.id("divpaxinfo")).getText());

    }

}
