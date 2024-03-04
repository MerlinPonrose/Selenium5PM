package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_DataProviders {

@Test(dataProvider="getdata")	
public void sigin(String email, String pass)
{
	WebDriver driver;
	
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demo.automationtesting.in/SignIn.html");
	
	
	WebElement emailtextbox = driver.findElement(By.xpath("//input[@placeholder='E mail']"));
	
	emailtextbox.click();
	emailtextbox.clear();
	emailtextbox.sendKeys(email);
	
	WebElement passtextbox = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	
	passtextbox.click();
	passtextbox.clear();
	passtextbox.sendKeys(pass);
	
}
	

@DataProvider
public Object[][] getdata()
{
	Object[][] data = new Object[3][2];
	
	data[0][0] = "test1@gmail.com";
	data[0][1] ="12345";
	
	data[1][0] = "test2@gmail.com";
	data[1][1] = "123";
	
	data[2][0] = "test3@gmail.com";
	data[2][1] = "236";
	
	return data;
}


}
