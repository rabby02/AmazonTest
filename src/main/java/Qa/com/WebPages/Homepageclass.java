package Qa.com.WebPages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Qa.base.LauchingUrl;

public class Homepageclass extends LauchingUrl {
	
	public WebDriverWait wait;
	
	
	public Homepageclass()
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public WebDriverWait exoplicitWait()
	{
		
		 wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 return wait;
	}
	
	@FindBy(xpath="(//a[contains(text(),'Customer Service')])[1]")
	WebElement CustomerService;
	
	@FindBy(xpath="//div[contains(text(),'Payment, charges or gift cards')]")
	WebElement PayPage;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement Entermail;
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement pass;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement SignInbtn;
	
	
	public void clickOnCustomerService()
	{
		
		CustomerService.click();
	}
	
	public void ClickOnPayPage()
	{
		PayPage.click();
		
	}
	
	public void EnterSignInCredentials(String uname,String pw)
	{
		Entermail.sendKeys(uname);
		pass.sendKeys(pw);
		SignInbtn.click();
		
	}
	
	
	
	
	
	

}
