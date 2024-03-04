package com.selenium.museactin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_mouseaction {

	@Test
	public void mouseclick()
	{
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,2500)", "");

		
		WebElement refresh_button = driver.findElement(By.id("Button1"));
		
		
		Actions act = new Actions(driver);
		
		act.click(refresh_button).build().perform();
		
		driver.close();
	}
}
