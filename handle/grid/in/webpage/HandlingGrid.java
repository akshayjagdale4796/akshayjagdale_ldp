package handle.grid.in.webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingGrid
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay jagdale\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
        driver.findElement(By.xpath("//table[@id='customers']"));

        for (int row = 2; row < 5; row++)
        {
            for (int col = 2; col < 6; col++)
            {
                WebElement elements= driver.findElement(By.xpath("//table[@id='customers']//tr["+row+"]//td["+col+"]"));
                System.out.print(elements.getText());
            }
            System.out.println();
        }
    }
}
