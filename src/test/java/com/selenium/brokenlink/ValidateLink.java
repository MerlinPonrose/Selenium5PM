package com.selenium.brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateLink {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		
int link_count = links.size();

for(int i=0;i<link_count;i++)
{
	int brokencount =0;
	WebElement link_element = links.get(i);
	
	String attribute = link_element.getAttribute("href");
	
	HttpURLConnection httpurl = null;
	
	URL url = new URL(attribute);
	
	//enabling the connection
	httpurl = (HttpURLConnection) url.openConnection();
	
	int responseCode = httpurl.getResponseCode();
	
	if(responseCode>=400)
	{
		brokencount++;
		System.out.println(attribute+"= broken link");
	}
	else
	{
		System.out.println(attribute+"= Valid link");
	}
	
}

	}

}
