package Qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LauchingUrl {
	
	public static WebDriver driver;
	public  static Properties prop;
	//browserName
	
	public LauchingUrl()
	{
		
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("/Users/shaheenhaider/eclipse-workspace/TestAmazon/src/main/java/Qa/config/config.properties");
			prop.load(ip);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void Initialization() throws Exception
	{
		String browserName="Firefox";
		
		
		
		if(browserName.equals(browserName))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/shaheenhaider/eclipse-workspace/TestAmazon/Drivers/geckodriver");
			driver=new FirefoxDriver();
		}
	
		Thread.sleep(2000);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
		
		
	}
	

}
