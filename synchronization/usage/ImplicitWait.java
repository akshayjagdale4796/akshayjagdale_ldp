package synchronization.usage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImplicitWait
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay jagdale\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
       driver.get("https://rahulshettyacademy.com/seleniumPractise/");
       // Thread.sleep(3000);
        addItems(driver,itemsNeeded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

     // WebDriverWait  w=new WebDriverWait(driver,5);
       //  w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
      //  Thread.sleep(5);
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

       //w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
       // Thread.sleep(5);
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());



    }
    public static  void addItems(WebDriver driver,String[] itemsNeeded)
    {
        int j=0;
        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
        for(int i=0;i<products.size();i++)
        {
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();
            //format it to get actual vegetable name
            //convert array into array list for easy search
            //  check whether name you extracted is present in arrayList or not-
            List itemsNeededList = Arrays.asList(itemsNeeded);
            if (itemsNeededList.contains(formattedName))
            {
                j++;
                //click on Add to cart
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if (j == itemsNeeded.length)
                {
                    break;
                }
            }
        }
    }
}
