package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTestNg {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(8000);

		// Select Country
		Select abc = new Select(driver.findElement(By.id("country")));
		abc.selectByVisibleText("INDIA");
	}
}
