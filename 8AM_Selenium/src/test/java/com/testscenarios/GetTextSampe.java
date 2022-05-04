package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextSampe {
	@Test
	public void f() {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.justrechargeit.com/SignUp.aspx");
		// Click on CreateNewAccount button wihtput fill any data
		driver.findElement(By.name("imgbtnSubmit")).click();

		String eleText = driver.findElement(By.className("errormsg")).getText();
		System.out.println(eleText);
		//
		// Validate the error mesage
		if (eleText.equals("ENTER YOUR NAME")) {
			System.out.println("The error message text is displayed as expected");
		} else {
			System.out.println("The error message text is NOT displayed as expected");
		}

	}
}
