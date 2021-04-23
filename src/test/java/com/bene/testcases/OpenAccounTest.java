package com.bene.testcases;

import org.testng.annotations.Test;

import com.bene.base.TestBase;
import com.bene.qa.pages.Account;

public class OpenAccounTest   {
    
	
	@Test
	
	public void clickAccount()
	{
		 TestBase.tp.gotoAccount();
	}
}
