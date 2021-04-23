package com.bene.qa.pages;

import com.bene.base.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

public LoginPage()
 {
	PageFactory.initElements(driver, this);
	
 }
 
 
 public void login(String use , String pswd) {
	
	 driver.findElement(By.xpath(prop.getProperty("user"))).sendKeys(use);
	 driver.findElement(By.xpath(prop.getProperty("next"))) .click();
	 driver.findElement(By.xpath(prop.getProperty("pswd"))).sendKeys(pswd);
	 driver.findElement(By.xpath(prop.getProperty("sign"))) .click();
	 
	 
	 
 }
 
 
	

	
	

	}

