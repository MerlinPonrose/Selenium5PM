package com.selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNG_Annotation {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("In beforesuite");
	}

	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("In beforemethod");
	}
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("in before class");
	}

	@BeforeTest
	public void beforetest()
	{
		System.out.println("in beforetest");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("after suite");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	
	@org.testng.annotations.Test
	public void testcase1()
	{
		System.out.println("testcase 1");
	}
	
	@org.testng.annotations.Test
	public void testcase2()
	{
		System.out.println("testcase 2");
	}
}
