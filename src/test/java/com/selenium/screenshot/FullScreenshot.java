package com.selenium.screenshot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullScreenshot {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
	Robot r = new Robot();
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect = new Rectangle(d);
		
		BufferedImage src = r.createScreenCapture(rect);
		
		File dest = new File("C:\\neworkspace\\Selenium5PM\\Screenshot\\fullimage"+System.currentTimeMillis()+".png");
		
	ImageIO.write(src, "png", dest);
		
		
		
	}

}
