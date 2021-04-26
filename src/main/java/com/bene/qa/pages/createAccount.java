package com.bene.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.bene.base.TestBase;

public class createAccount extends TestBase {
	
	
	public void createaccount()
	{
		
	   
	   driver.findElement(By.xpath(prop.getProperty("Account_Name"))).sendKeys("Mayur Mangal");
	   driver.findElement(By.xpath(prop.getProperty("Account_Number"))).sendKeys("12345678");
	   driver.findElement(By.xpath(prop.getProperty("Phone"))).sendKeys("9000121243");
	   WebElement rating =driver.findElement(By.xpath(prop.getProperty("rating")));
	   rating.click();
	   List<WebElement> el =driver.findElements(By.xpath(prop.getProperty("rating_elements")));
	   
	   dropdownselect(el,"Active");
	   driver.findElement(By.xpath(prop.getProperty("save_button"))).click();
	   
	   
	   
	}
	
	public void gotoHome()
	{
		driver.navigate().to(prop.getProperty("account_url"));
		
		
	}

}
