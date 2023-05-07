package Qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Qa.base.LauchingUrl;
import Qa.com.WebPages.BestSellerpage;
import Qa.com.WebPages.Homepageclass;

public class BestSellerTest extends  LauchingUrl {
	
             public static Homepageclass home;
            public static BestSellerpage bp;
            
            
            public BestSellerTest()
            {
            	
            	super();
            }
            
            @BeforeClass
            public void Setup() throws Exception
            {
            	
            	Initialization();
        		home=new Homepageclass();
        		bp=new BestSellerpage();
            }
            
            @Test(priority=1)
            public void ClickBestSeller()
            {
            	bp.ClickOnBestSeller();
            	
            	
            }
            
            @Test(priority=2)
            public void clickOnShoe()
            {
            	bp.ClickOnBestSeller();
            	bp.ClickOnproduct();
            	bp.PriceTag();
            }
            
            
            @Test(priority=3)
            public void verifyStock()
            {
            	bp.ClickOnBestSeller();
            	bp.ClickOnproduct();
            	boolean bool=bp.verifyProductInstockOrnot();
            	if(bool==true)
            	{
            		
            		System.out.println("Yes In stock");
            	}
            	
            }
            
            @Test(priority=5)
            public void AddtoCartButtonClick()
            {
            	bp.ClickOnBestSeller();
            	bp.ClickOnproduct();
            	bp.ClickOnAddtocart();
            	
            	
            }
         /*   @Test(priority=2)
            public void ClickMostWish()
            {
            	
            	bp.ClickOnMostWish();
            	
            }*/
            
            @AfterClass
            public void DownTear()
            {
            	
            	driver.quit();
            }



}
