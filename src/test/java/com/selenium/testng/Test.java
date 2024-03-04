package com.selenium.testng;



public class Test {
	
	
	@org.testng.annotations.Test(priority=1)
	public void testmethod()
	{
		System.out.println("helo");
	}
	
	@org.testng.annotations.Test(groups= {"Regression"})
	public void apple()
	{
		System.out.println("apple");
	}
	
	@org.testng.annotations.Test(priority=-2,groups= {"test"})
public void mango()
{
	System.out.println("mango");
}
	
	@org.testng.annotations.Test	
	public void banana()
	{
		System.out.println("banana");
	}
}
