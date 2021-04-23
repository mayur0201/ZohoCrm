package com.bene.qa.pages;

import org.openqa.selenium.By;

import com.bene.base.TestBase;

public class Account extends TestBase {
	
	
	
   public createAccount clickCreateAccount()
	
	{
		driver.findElement(By.xpath("//*[@id=\"table_row_1\"]/lyte-td[3]/span[1]/link-to/button")).click();
		
		return new createAccount();
	}
   
   
}
