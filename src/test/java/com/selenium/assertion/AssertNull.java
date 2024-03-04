package com.selenium.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
	
	@Test
	public void assertNull()
	{
		String a = null;
		
		Assert.assertNull(a);
		
	}
	
	
	@Test
	public void assertNotNull()
	{
String a = "bjkhkjh";
		
		Assert.assertNotNull(a);
	}

}
