package Qa.com.WebPages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Qa.base.LauchingUrl;

public class BestSellerpage extends LauchingUrl {
	
	public static WebDriverWait wait;
	
	public BestSellerpage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public WebDriverWait exoplicitWait()
	{
		
		 wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		 return wait;
	}
	
	@FindBy(xpath="(//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers'])[1]")
	WebElement BestSeller;
	
	@FindBy(xpath="//a[normalize-space()='Most Wished For']")
	WebElement mostWishDeals;
	
	@FindBy(xpath="//span[@id='zg_banner_text']")
	WebElement DisplayText;
	@FindBy(xpath="//div[normalize-space()='Crocs Unisex-Adult Classic Clog']")
	WebElement shoe;
	
	@FindBy(xpath="//span[@class='a-price aok-align-center']//span[@class='a-price-whole']")
	WebElement ShoePricetag;
	
	@FindBy(xpath="//span[@class='a-size-medium a-color-success']")
	WebElement InStock;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	
	WebElement AddtoCart;
	public void ClickOnBestSeller()
	{
		BestSeller.click();
		
	}
	
	public void ClickOnMostWish()
	{
		
		mostWishDeals.click();
	}
	
	public boolean DisplayWishDeals()
	{
		
		return DisplayText.isDisplayed();
	}
	
	public void ClickOnproduct()
	{
		
		shoe.click();
		
	}
	public void  PriceTag()
	{
		//ShoePricetag.isDisplayed();
	   Assert.assertTrue(ShoePricetag.isDisplayed());
		
	}
	
	public boolean verifyProductInstockOrnot()
	{
		
		return InStock.isDisplayed();
	}
	
	public void ClickOnAddtocart()
	{
		//AddtoCart.click();
		exoplicitWait().until(ExpectedConditions.visibilityOf(AddtoCart)).click();
		
	}

}
