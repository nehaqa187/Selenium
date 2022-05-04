package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JRI_NAvigation {
	@Test
	public void f() throws Exception {
		// Create a WebDriver object
		WebDriver driver;

		// Open Browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// type URL
		driver.get("https://www.justrechargeit.com/SignIn.aspx");

		// click on any link(create new account)
		driver.findElement(By.id("signup-link9")).click();

		// wait statement"
		Thread.sleep(3000);
		driver.findElement(By.name("signup_name")).sendKeys("nehartghbf");

		// click on refresh icon
		driver.navigate().refresh();

//Click on BAck icon

		driver.navigate().back();
		Thread.sleep(3000);

		// Click on forward icon
		driver.navigate().forward();
	}
}
