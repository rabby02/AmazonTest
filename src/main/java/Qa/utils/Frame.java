package Qa.utils;

import Qa.base.LauchingUrl;

public class Frame extends LauchingUrl { 
	
	public void Iframe()
	{
		driver.switchTo().frame(0);
	
	}

}
