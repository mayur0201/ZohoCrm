package com.bene.testcases;

import org.testng.annotations.Test;

import com.bene.base.TestBase;
import com.bene.qa.pages.Account;
import com.bene.qa.pages.createAccount;

public class CreateAccountTest {
    
	
	
	@Test
	public void accountcreate()
	{
		Account  acc = new Account();
		createAccount ab=acc.clickCreateAccount(); 
		ab.createaccount();
		//ab.gotoHome();
	}
}
