package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBLOGIN {

	public static void main(String[] args) {
		// Create referenceName/Object of webdriver interface
		WebDriver driver;
		// Launch any browser(Chrome)/ Open Webpage
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// To maximize the current window
		driver.manage().window().maximize();
		// Type URL
		driver.get("https://www.facebook.com");
		// Get the Current URL
		System.out.println(driver.getCurrentUrl());

		// Get the title of the webpage
		System.out.println(driver.getTitle());

		// CLick ok ForgotPassword hyperlink
		driver.findElement(By.partialLinkText("Fo")).click();

		// get the current URL
		System.out.println(driver.getCurrentUrl());

		// Get the title of the webpage
		System.out.println(driver.getTitle());

//		// Type UN and PWD
//		driver.findElement(By.id("email")).sendKeys("Testgwe234@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("2342dsatres@$3454");
//		// Click on Login button
//		driver.findElement(By.name("login")).click();

		driver.close();

	}

}
