package com.selenium.assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Test {
	
	@Test
	public  void softAssert()
	{
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals("hii", "helo","values are not equal");
		
		System.out.println("next line");
		
		System.out.println("next line2");
		
		System.out.println("next line3");
		System.out.println("next line4");
		
		soft.assertAll();
	}

}
