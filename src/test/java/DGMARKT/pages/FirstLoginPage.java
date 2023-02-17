package DGMARKT.pages;

import DGMARKT.utilities.ConfigurationReader;
import DGMARKT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstLoginPage extends BasePage{

@FindBy(name = "email")
    public WebElement firstEmailInputBox;

@FindBy(name = "password")
    public WebElement firstPasswordInputBox;

@FindBy(name = "login")
public WebElement firstLoginButton;

public void navigatesToFirstLogin(){
    Driver.get().get(ConfigurationReader.get("url"));
}

public void firstLogin(String username, String password){
    firstEmailInputBox.sendKeys(username);
    firstPasswordInputBox.sendKeys(password);
    firstLoginButton.click();
}


}
