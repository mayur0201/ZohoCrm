package com.bene.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopPage  {
	WebDriver driver;

	public TopPage(WebDriver driver)
	{
	   this.driver = driver;	
	}

	public void gotoAccount()
	
	{
		driver.findElement(By.xpath("//*[@id=\"mainMenuTabDiv\"]/crm-menu/div[1]/crm-tab/div[2]/div[4]/a")).click();
	}

	
	
}
