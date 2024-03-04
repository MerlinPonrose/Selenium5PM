package com.selenium.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot_ParticularElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement title = driver.findElement(By.tagName("h1"));
		
		File src = title.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\neworkspace\\Selenium5PM\\Screenshot\\element"+System.currentTimeMillis()+".png");
		
		
		FileUtils.copyFile(src, dest);

	}

}
