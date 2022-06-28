package TestCases;

import java.io.IOException;

import org.testng.asserts.SoftAssert;

import Base.TestBase;
import pcckknj.AfterMethod;
import pcckknj.BeforeMethod;
import pcckknj.LoginPage;
import pcckknj.Test;
import pcckknj.dashboardPage;

public class DashBoardPageTest extends TestBase{
	LoginPage login;
	dashboardPage Dash;
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		initialization();
		login=new LoginPage();
		login.loginToApp();
		Dash=new dashboardPage();
		 
	}
	
	
	
	
	@Test
	public void verifynameTest()
	{
		Dash.verifyName();
		
	}
	@Test
	public void verifyEmailIdTest()
	{
		Dash.verifyEmailId();
	}
	@Test
	public void verifyPlaceGttOrder()
	{
		Dash.placeGttOrder();
	}
	
	
	
	
	@AfterMethod
	
	public void exit()
	{
		driver.quit();
	}
	


}
