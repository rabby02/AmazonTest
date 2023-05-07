package Qa.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Qa.base.LauchingUrl;
import Qa.com.WebPages.AddtoCartPage;
import Qa.com.WebPages.BestSellerpage;
import Qa.com.WebPages.Homepageclass;

public class addtoCartTest extends LauchingUrl {
	
	  public static Homepageclass home;
      public static BestSellerpage bp;
      public static  AddtoCartPage Ac;
	
	public addtoCartTest()
	{
		
		super();
	}
	@BeforeClass
	public void tearUp() throws Exception
	{
		
		Initialization();
		home=new Homepageclass();
		bp=new BestSellerpage();
		Ac=new AddtoCartPage();
		
	}
	
	@Test(priority=1)
	public void ClickOnAc()
	{
		Ac.ClickCart();
		
	}
	
	
	@AfterClass
	public void TearDown()
	{
		
		driver.quit();
	}
	
	

}
