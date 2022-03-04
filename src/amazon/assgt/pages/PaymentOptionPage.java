package amazon.assgt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentOptionPage
{
    WebDriver driver;

    public PaymentOptionPage(WebDriver driver) {
        this.driver = driver;
    }
    By account=By.id("nav-link-accountList-nav-line-1");
   By paymentOption=By.xpath("//span[contains(text(),'Edit or add payment methods')]");
   By textVerify=By.xpath("//span[contains(text(),'Your Payment Options')]");
   // By setPreFeRedMethod=By.xpath("//a[contains(text(),'set a preferred payment method')]");
    //By change=By.xpath("//body/div[@id='a-page']/div[@id='manageOneClickWebsiteContainer']/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/span[2]/input[1]");
    //By nameOnCard=By.xpath("//input[@id='pp-Zmo6ln-60']");
    //By cardNumber=By.id("pp-Zmo6ln-61");
    //By date=By.xpath("//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[4]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]");
    //By selectMonth=By.xpath("//a[@id='pp-Zmo6ln-63_11']");
    //By year=By.xpath("//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[4]/div[1]/div[1]/span[3]/span[1]/span[1]/span[1]");
    //By selectYear=By.xpath("//a[@id='pp-Zmo6ln-65_1']");
    //By addYourCard=By.xpath("//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[5]/span[1]/span[1]/input[1]");
    public WebElement clickOnAccount()
    {
        return driver.findElement(account);
    }
    public WebElement clickOnPaymentOption()
    {
        return driver.findElement(paymentOption);
    }
    public WebElement textVerifying()
    {
        return driver.findElement(textVerify);
    }

 //   public WebElement clickOnSetPreFeRedAddMethod(){
 //       return driver.findElement(setPreFeRedMethod);
 //   }
  //  public WebElement clickOnChange()
  //  {
  //      return driver.findElement(change);
  //  }
  //  public WebElement enterNameOnCard()
  //  {
  //      return driver.findElement(nameOnCard);
  //  }
  //  public WebElement enterCardNumber()
   // {
   //     return driver.findElement(cardNumber);
  //  }
  //  public WebElement clickOnDate()
  //  {
  //      return driver.findElement(date);
  //  }
  //  public WebElement selectMonth()
  //  {
  //      return driver.findElement(selectMonth);
  //  }
  //  public WebElement clickOnYear()
  //  {
  //      return driver.findElement(year);
  //  }
  //  public WebElement selectYear()
  //  {
  //      return driver.findElement(selectYear);
  //  }
  //  public WebElement clickOnAddYourCard()
  //  {
  //      return driver.findElement(addYourCard);
  //  }

}
