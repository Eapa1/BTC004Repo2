package com.bit.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserInitializing 
{
	WebDriver dr;
	public void openBrowser()
	{
		String s=System.getProperty("browser");
		if(s.equals("saidur"))
		{
		dr=new FirefoxDriver();
		dr.get("http://www.eshopper24.com");
		}
		else if(s.equals("nafij"))
		{
			
			System.setProperty("webdriver.ie.driver", "/Users/bittech/Downloads/IEDriverServer");
				
			 dr=new InternetExplorerDriver();
			 dr.get("http://www.eshopper24.com");
				
				
		}
		else if(s.equals("bodrol"))
		{

			System.setProperty("webdriver.chrome.driver", "/Users/bittech/Downloads/chromedriver");
				
		     dr=new ChromeDriver();
		     dr.get("http://www.eshopper24.com");
		}
		else
			dr=new FirefoxDriver();
		dr.get("http://www.eshopper24.com");
	}
	
	public void closeBrowser()
	{
		dr.quit();
	}

}
