package amazon.assgt.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage
{
    WebDriver driver;

    public AddressPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
    WebElement account;
    @FindBy(xpath = "//body/div[@id='a-page']/div[2]/div[1]/div[3]/div[1]/a[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement address;
    @FindBy(xpath = "//div[@id='ya-myab-plus-address-icon']")
    WebElement addAddress;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressFullName']")
    WebElement fullName;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
    WebElement mobileNumber;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPostalCode']")
    WebElement pinCode;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine1']")
    WebElement flatHouseNo;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine2']")
    WebElement area;
    @FindBy(xpath = "//input[@id='address-ui-widgets-landmark']")
    WebElement landMark;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressCity']")
    WebElement city;
    @FindBy(xpath = "//body/div[@id='a-page']/div[2]/div[1]/div[2]/form[1]/span[1]/div[1]/div[1]/div[1]/div[18]/")
    WebElement selectState;
    @FindBy(xpath = "//a[@id='address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_20']")
    WebElement maharashtra;
    @FindBy(xpath = "//span[contains(text(),'Select an Address Type')]")
    WebElement addressType;
    @FindBy(xpath = "//a[@id='dropdown1_1']")
    WebElement home;
    @FindBy(xpath = "//input[@aria-labelledby='address-ui-widgets-form-submit-button-announce']")
    WebElement addAddressButton;
    @FindBy(xpath = "//body/div[@id='a-page']/div[2]/div[1]/div[2]/form[1]/span[1]/div[1]/span[1]/span[1]/span[1]/input[1]")
    WebElement saveAddress;

    @FindBy(xpath = "//body/div[@id='a-page']/div[2]/div[1]/div[2]/div[1]")
    WebElement verifyAddressSaved;
    ////body/div[@id='a-page']/div[2]/div[1]/div[2]/div[1]
    public WebElement clickOnAddress()
    {
        return address;
    }
    public WebElement clickOnAccount()
    {
        return account;
    }
    public WebElement clickOnAddAddress()
    {
        return addAddress;
    }
    public WebElement enterFullName()
    {
        return fullName;
    }
    public WebElement enterMobileNumber()
    {
        return mobileNumber;
    }
    public WebElement enterPinCode()
    {
        return pinCode;
    }
    public WebElement enterFlatHouseNo()
    {
        return flatHouseNo;
    }
    public WebElement enterAreaName()
    {
        return area;
    }
    public WebElement enterLandmark()
    {
        return landMark;
    }
    public WebElement enterCity()
    {
        return city;
    }
    public WebElement selectStateDropDown()
    {
        return selectState;
    }
    public Object ScrollDownPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("window.scrollTo(0,900)");
    }
    public WebElement clickONMaharashtra()
    {
        return maharashtra;
    }
    public WebElement clickONAddressType()
    {
        return addressType;
    }
    public WebElement clickOnHomeType()
    {
        return home;
    }
    public WebElement clickOnAddAddressButton()
    {
        return addAddressButton;
    }
    public WebElement clickOnSaveAddAddressButton()
    {
        return saveAddress;
    }
    public WebElement verifyAddress()
    {
        return verifyAddressSaved;
    }

}
