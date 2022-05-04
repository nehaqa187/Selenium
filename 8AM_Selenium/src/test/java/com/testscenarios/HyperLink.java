package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		
//		//code for hyper link
//		//driver.findElement(By.linkText("Forgot password?")).click();
//		
//		driver.findElement(By.partialLinkText("Fo")).click();
		
		
		driver.get("https://www.google.com/");
		//Click on Images hyper link
		driver.findElement(By.partialLinkText("mag")).click();
		

	}

}
