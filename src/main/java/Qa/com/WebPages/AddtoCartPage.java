package Qa.com.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Qa.base.LauchingUrl;

public class AddtoCartPage extends LauchingUrl {
	
	
	public AddtoCartPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="nav-cart-count")
	WebElement addtocart;
	
	public void ClickCart()
	{
		
		addtocart.click();
	}

}
