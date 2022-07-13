package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	
	public String getProperties(String value) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\26FebFrame\\src\\main\\java\\Config\\Config.Properties");
		prop.load(file);
		return prop.getProperty(value);
	}
	
	
	
	public void initialization() throws IOException
	{
		String browserName=getProperties("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		    driver=new FirefoxDriver();	
		}
		driver.manage().window().maximize();
		//driver.get("https://kite.zerodha.com/");
		driver.get(getProperties("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//priya
	}
}
