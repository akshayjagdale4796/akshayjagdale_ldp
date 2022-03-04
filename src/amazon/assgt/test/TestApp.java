package amazon.assgt.test;

import amazon.assgt.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestApp

{
    Properties Sitedata = new Properties();
    FileInputStream fi = new FileInputStream("C:\\Users\\akshay jagdale\\IdeaProjects\\PageObject\\src\\configuration\\config.properties");

    public TestApp() throws FileNotFoundException
    {
    }

    @Test
    public void firstTest() throws IOException {

        this.Sitedata.load(this.fi);
        String browserKey = this.Sitedata.getProperty("browser");
        System.out.println("browser key " + browserKey);
        System.setProperty("webdriver."+browserKey+".driver","C:\\Users\\akshay jagdale\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(this.Sitedata.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(600));

        TodaysDeal todaysDeal1 =new TodaysDeal(driver);
        todaysDeal1.todayDeal().click();
        todaysDeal1.thirdDeal().click();

        AddMinQuantityItem quantiy=new AddMinQuantityItem(driver);
        quantiy.searchBox().sendKeys(this.Sitedata.getProperty("productName"));
        quantiy.search().click();
        quantiy.item().click();
        quantiy.ScrollDownPage();
        quantiy.addToCart().click();
        System.out.println(quantiy.verifyAdded().getText().equalsIgnoreCase("Added to cart"));

        SearchMobilesInSearchBox mobiles=new SearchMobilesInSearchBox(driver);
        mobiles.searchBox().sendKeys(this.Sitedata.getProperty("mobile"));
        mobiles.search().click();
        mobiles.ScrollDownPage();
        mobiles.getLastDisplayedItem().click();

        MobilesFromNavigation leftNa=new MobilesFromNavigation(driver);
        leftNa.selectMobiles().click();
        leftNa.clickOnHomeButton().click();

        SignInPage signIn=new SignInPage(driver);
        signIn.clickOnSignIn().click();
        signIn.enterLogInId().sendKeys(this.Sitedata.getProperty("id"));
        signIn.clickOnContinue().click();
        signIn.enterPassword().sendKeys(this.Sitedata.getProperty("password"));
        signIn.clickOnSubmit().click();

        PaymentOptionPage payOptions=new PaymentOptionPage(driver);
        payOptions.clickOnAccount().click();
        payOptions.clickOnPaymentOption().click();
        System.out.println(payOptions.textVerifying().getText().equalsIgnoreCase("Your Payment options"));

        AddressPage address=new AddressPage(driver);
        address.clickOnAccount().click();
        address.clickOnAddress().click();
        address.clickOnAddAddress().click();
        address.enterFullName().sendKeys(this.Sitedata.getProperty("fullName"));
        address.enterMobileNumber().sendKeys(this.Sitedata.getProperty("mobileNumber"));
        address.enterPinCode().sendKeys(this.Sitedata.getProperty("passCode"));
        address.enterFlatHouseNo().sendKeys(this.Sitedata.getProperty("houseNo"));
        address.enterAreaName().sendKeys(this.Sitedata.getProperty("areaName"));
        address.enterLandmark().sendKeys(this.Sitedata.getProperty("landmark"));
      //  address.enterCity().sendKeys("Pune");
     //   address.selectStateDropDown().click();
       // address.ScrollDownPage();
        //address.clickONMaharashtra().click();
        address.clickONAddressType().click();
        address.clickOnHomeType().click();

        address.ScrollDownPage();
        address.clickOnAddAddressButton().click();
       // address.clickOnSaveAddAddressButton().click();
      //  System.out.println(address.verifyAddress().getText());
    }
}
