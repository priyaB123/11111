package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class dashboardPage extends TestBase {
	
     @FindBy(xpath="//div[@id='avatar-84']")private WebElement avtarButton;
     @FindBy(xpath="//h4[@class='username']")private WebElement name;
     @FindBy(xpath="//div[@class='email']")private WebElement emailId;
     
     @FindBy(xpath="//button[text()='Start investing ']")private WebElement startInvesting;
     @FindBy(xpath="(//input[@icon='search'])[2]")private WebElement searchBar;
     @FindBy(xpath="//span[@class='tradingsymbol']")private WebElement tradingSymbol;
     @FindBy(xpath="//button[text()='Create GTT ']")private WebElement createGttOrder;
     @FindBy(xpath="//input[@label='Trigger price']")WebElement triggerPriceTextbox;
     @FindBy(xpath="//input[@label='Qty.']")WebElement quantityTextbox;
     @FindBy(xpath="//input[@label='Price']")WebElement priceTextbox;
     @FindBy(xpath="//button[normalize-space(text())='Cancel']")WebElement cancelButton;
     

     public dashboardPage()
     {
    	PageFactory.initElements(driver, this);
     }
    
     
     public void verifyName()
     {
    	 avtarButton.click();
    	 name.getText();
     }
     public void verifyEmailId()
     {
    	 avtarButton.click();
    	 emailId.getText();
     }
     
     public void placeGttOrder()
     {
    	 startInvesting.click();
    	 searchBar.sendKeys("INFY");
    	 tradingSymbol.click();
    	 createGttOrder.click();
    	 triggerPriceTextbox.clear();
    	 triggerPriceTextbox.sendKeys("1400");
    	 quantityTextbox.clear();
    	 quantityTextbox.sendKeys("100");
    	 priceTextbox.clear();
    	 priceTextbox.sendKeys("1450");
    	 cancelButton.click();
    	 
    	 
    	 
     }

}
