package com.bene.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	 
	public static TopPage tp; 
	 
	
	public TestBase(){
		if(driver == null)
        {
		try {
			prop =new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//Properties//config.properties");
			prop.load(fis);
		}
		catch (IOException e )
		{
			e.printStackTrace();
		}
		WebDriverManager.chromedriver().setup();
		
		  ChromeOptions cr = new ChromeOptions();
		  
		  cr.addArguments("--disable-notifications");
          
		  driver = new ChromeDriver(cr);
		  
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		 
		  
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  driver.get(prop.getProperty("url"));
		  driver.findElement(By.xpath(prop.getProperty("signin"))).click();
		 
		   tp =new TopPage(driver);
		}
		
		
          
	}
	
	public  void dropdownselect(List<WebElement> e , String value )
	{   String text ="";
	    for(WebElement e1:e)
       {
		
		System.out.println(e1.getText());
		if(e1.getText().equals(value))
		{
			e1.click();
			//text= e.getAttribute("aria-activedescendant");
			break;
		}
	   }
		
	
  }
	


  
       
     
     
  }