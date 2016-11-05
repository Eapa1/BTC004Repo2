package com.bit.shared;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Shared 
{
	FirefoxDriver driver;
	@Test
	public void m1() throws InterruptedException, IOException
	{
		
		
		
		
		
		
		SimpleDateFormat f1=new SimpleDateFormat("MM/dd/yyyy");
		
		Date d=new Date();
		System.out.println(f1.format(d));
		FirefoxProfile fp=new FirefoxProfile();
		File f=new File("/Users/bittech/Downloads/firebug-2.0.2.xpi");
		fp.addExtension(f);
		FirefoxBinary fb=new FirefoxBinary(new File("/Users/bittech/Desktop/untitled folder/firefox"));
		driver=new FirefoxDriver(fb,fp);
		driver.get("http://www.facebook.com");
		JavascriptExecutor js = (JavascriptExecutor)(driver);
		
		js.executeScript("document.getElementById('email').value='sdf'");
		js.executeScript("document.getElementById('pass').value='sdf'");
		System.out.println(js.executeScript("return document.title"));
		
/*//		js.executeScript("arguments[0].value='shahid@yahoo.com'", driver.findElement(By.id("email")));
//		js.executeScript("arguments[0].value='Abc123'", driver.findElement(By.id("pass")));
//		js.executeScript("arguments[0].click()", driver.findElement(By.xpath(".//*[@id='u_0_y']")));
*/		
		Thread.sleep(3000);
		//driver.quit();
	}
	
	@Test
	public void lonInToFaceBook() throws InterruptedException
	{
		driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.facebook.com/");
        
        WebElement email = driver.findElement(By.id("email"));
        WebElement pass  = driver.findElement(By.id("pass"));
        WebElement logIn = driver.findElement(By.id("u_0_n"));
        
        m3(email, pass, logIn);
		Thread.sleep(3000);
		driver.quit();
		
    }
    
    public void m3(WebElement email, WebElement pass, WebElement logIn)
    {
    		//JavascriptExecutor js = (JavascriptExecutor)(driver);
   		//js.executeScript(script, args)
    		
        ((JavascriptExecutor)driver).
        executeScript("arguments[1].value='1234', arguments[0].value='asad', arguments[2].click();", email, pass, logIn);
        
        //((JavascriptExecutor)driver).executeScript("arguments[0].value='1234';",ele1);
        //((JavascriptExecutor)driver).executeScript("arguments[0].click();", ele2);
    }

    
	@Test
	public void findText() throws InterruptedException
	{
		driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.facebook.com/");
        
      //WebElement searchTextBox=driver.findElement(By.id("twotabsearchtextbox"));
        //getTextValue(searchTextBox);
        //searchTextBox.sendKeys("Mobiles");
        WebElement ele1=driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[2]"));
        Thread.sleep(3000);
    
        getTextValue(ele1);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String s=(String) js.executeScript("return document.title");
        System.out.println(s);
        
        js.executeScript("document.getElementById('twotabsearchtextbox').value='ABCD'");

        WebElement goButton = driver.findElement(By.cssSelector("input[value=Go]"));
        clickOnelement(goButton);
        
        Thread.sleep(3000);
		driver.quit();
    }
	
    public void clickOnelement(WebElement ele)
    {
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", ele);
    }
    
    public void getTextValue(WebElement ele)
    {
        //((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute(arguments[1])", ele);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //String s=(String) js.executeScript("return arguments[0].innerText();", ele).toString();
        String text = (String) js.executeScript("return arguments[0].text;", ele);
        System.out.println(text);
        //System.out.println(s);

    
    }
        

	
		
    
	
	
	

}
