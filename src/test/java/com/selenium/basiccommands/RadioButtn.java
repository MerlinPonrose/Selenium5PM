package com.selenium.basiccommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='FeMale']"));
		
	//	femaleRadioButton.click();
		
		/*WebElement femaleRadioButton1 = driver.findElement(By.xpath("//input[@value='FeMale']"));
		
		String attribute = femaleRadioButton1.getAttribute("class");
		
		System.out.println(attribute);
		
		if(attribute.contains("ng-valid ng-dirty ng-valid-parse"))
		{
			System.out.println("Female Radio button is clicked");
		}
		else
		{
			System.out.println("Female Radio button is not clicked");
		}*/
		
		
	//	Assert.assertTrue(femaleRadioButton.isSelected());
		
		if(femaleRadioButton.isSelected())
		{
			System.out.println("Female Radio Button is selected");
		}
		
		else
		{
			Assert.fail("Female Radio button not selected");
			System.out.println("Female Radio button not selected");
		}
		
		System.out.println("Female Radio Button ="+femaleRadioButton.isSelected());
		
		
		
WebElement MaleRadioButton = driver.findElement(By.xpath("//input[@value='Male']"));

System.out.println("Male Radio Button ="+MaleRadioButton.isSelected());
	}

}
