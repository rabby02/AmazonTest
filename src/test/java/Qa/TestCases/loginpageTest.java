package Qa.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Qa.base.LauchingUrl;
import Qa.com.WebPages.BestSellerpage;
import Qa.com.WebPages.Homepageclass;

public class loginpageTest extends LauchingUrl{
	
	public static Homepageclass home;
	
	public static BestSellerpage bp;
	
	
	public loginpageTest()
	{
		
		super();
	}
	@BeforeClass
	public void setUpTest() throws Exception
	{
		
		Initialization();
		home=new Homepageclass();
		bp=new BestSellerpage();
		
		
	}
	
   @Test(priority=2)
	public void CustomerServicePage()
	{
		home.clickOnCustomerService();
		home.ClickOnPayPage();
		
	}
   
   @Test(priority=3)
   public void LauchToHp()
   {
	   
	   home.EnterSignInCredentials(prop.getProperty("username"), prop.getProperty("password"));
   }
	
   @Test(priority=4)
   public void ClickingOnBestSeller()
   {
	   bp.ClickOnBestSeller();
	   
   }
	
	
	@AfterClass
	public void TearDown()
	{
		
		driver.quit();
	}
}
