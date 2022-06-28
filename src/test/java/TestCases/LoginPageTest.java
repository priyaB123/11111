package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;


public class LoginPageTest extends TestBase {
	
	LoginPage login;
	
	
	@BeforeMethod
	
	public void setup() throws IOException
    {
		initialization();
		 login=new LoginPage();
	}	
	
	
	@Test
	public void zerodhaTitleVerifyTest()
	{
	      String value=login.zerodhaTitleVerify();
	      Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform", value);
	}
	
	
	@Test(enabled=false)
	
	public void kiteLogoVerifyTest()
	{
	login.kiteLogoVerify();
	}
	
	@Test(enabled=false)
	public void zerodhaLogoVerifyTest() 
	{
		login.zerodhaLogoVerify();
	}
	
	@Test
	public void verifyLoginToApp() throws IOException, InterruptedException
	{
		String nicknameLabel = login.loginToApp();
		Assert.assertEquals(nicknameLabel, "Pratiksha");
	}
	
	
	
	
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	

}
