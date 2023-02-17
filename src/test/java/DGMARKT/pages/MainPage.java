package DGMARKT.pages;

import DGMARKT.utilities.BrowserUtils;
import DGMARKT.utilities.ConfigurationReader;
import DGMARKT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

@FindBy(xpath = "//span[text() = 'My Account']")
    public WebElement myAccountMenu;

@FindBy(id = "pt-login-link")
    public WebElement loginLink;

@FindBy(id = "input-email")
    public WebElement usernameInputBox;

@FindBy(id = "input-password")
    public WebElement passwordInputBox;

@FindBy(xpath = "//span[text() = 'Login']")
    public WebElement loginButton;

@FindBy(xpath = "//i[@class='fa fa-check-circle']/..")
    public WebElement successMessage;

@FindBy(className = "cbk_newsletter")
public WebElement popUp;

@FindBy(xpath = "//a[text()='Close']")
public WebElement closePopUp;

public void navigatesToLoginLink(String loginLnk, String myAccountMenu){
    popUp.click();
    closePopUp.click();
    WebElement myAccount = Driver.get().findElement(By.xpath("//span[text() = '" + myAccountMenu + "']"));
    BrowserUtils.clickWithJS(myAccount);
   // BrowserUtils.waitForClickablility(myAccount, 10);
   // myAccount.click();
    WebElement login = Driver.get().findElement(By.xpath("//a[text()='" + loginLnk + "']"));
    login.click();
    BrowserUtils.waitFor(10);
    loginButton.click();
}

public void enterCredentials(){
    usernameInputBox.sendKeys(ConfigurationReader.get("username"));
    passwordInputBox.sendKeys(ConfigurationReader.get("password"));
    loginButton.click();
}

public String successMessage(){
    return  Driver.get().findElement(By.xpath("//i[@class='fa fa-check-circle']/..")).getText();
}



}
