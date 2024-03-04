package com.selenium.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AsserTrue {
	
	@Test
	public void assertTrue()
	{
		Assert.assertTrue(validateNumber());
		
		
		
		
	}

	
	public boolean validateNumber()
	{
		int num = 100;
		
		if(num>=1000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
