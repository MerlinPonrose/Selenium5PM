package com.selenium.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/sortable");
		
		Thread.sleep(2000);
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\neworkspace\\Selenium5PM\\Screenshot\\image"+System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(src, dest);
		
		

	}

}
