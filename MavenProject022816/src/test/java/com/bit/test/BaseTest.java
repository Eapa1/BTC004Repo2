package com.bit.test;

import org.junit.After;
import org.junit.Before;

import com.bit.support.BrowserInitializing;

public class BaseTest 
{
	BrowserInitializing b=new BrowserInitializing();
	@Before
	public void start()
	{
		b.openBrowser();
	}
	@After
	public void end()
	{
		System.out.println("eapa ");
		System.out.println("habib");
		System.out.println("hi");
		b.closeBrowser();
	}

}
