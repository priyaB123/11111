package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//img[@alt='Kite']")  private WebElement kitelogo;
	@FindBy(xpath="//img[@alt='Zerodha']") private WebElement zerodhalogo;
	@FindBy(xpath="//input[@id='userid']")private WebElement usernameTextbox;
	@FindBy(xpath="//input[@id='password']")private WebElement passwordTextbox;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
	@FindBy(xpath="//input[@id='pin']")private WebElement pinTextbox;
	@FindBy(xpath="//button[@type='submit']")private WebElement continueButton;
    @FindBy(xpath="//span[@class='nickname']")private WebElement nickname;

	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String zerodhaTitleVerify()
	{
		return driver.getTitle();
	}
	
	public void kiteLogoVerify()
	{
		kitelogo.isDisplayed();
	}
	
	public void zerodhaLogoVerify()
	{
		zerodhalogo.isDisplayed();
	}
	
	public String loginToApp() throws IOException, InterruptedException
	{
		usernameTextbox.sendKeys(getProperties("username"));
		passwordTextbox.sendKeys(getProperties("password"));
		loginButton.click();
		pinTextbox.sendKeys(getProperties("pin"));
		continueButton.click();
		Thread.sleep(2000);
		return nickname.getText();
	}

}
