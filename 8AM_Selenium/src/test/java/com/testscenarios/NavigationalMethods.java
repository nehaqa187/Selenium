package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalMethods {

	public static void main(String[] args) throws Exception {
		// Create webdriver Object
		WebDriver driver;
		// Open Browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// Type URL
		driver.get("https://www.justrechargeit.com/");

		// Click on Create New aCCOUNT link
		driver.findElement(By.id("signup-link9")).click();

		// Wait
		Thread.sleep(3000);
		driver.findElement(By.name("signup_name")).sendKeys("asdfsdfsdfd");
		//Click on Refresh icon
		driver.navigate().refresh();

		// Clikc on Back Icon
		driver.navigate().back();

		// Wait
		Thread.sleep(3000);

		// Click on Frowrds icon
		driver.navigate().forward();
		
		
		
		
	}

}
