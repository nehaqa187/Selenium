package com.testscenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllTheErrorMessages {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(8000);

		// Maximize the window
		driver.manage().window().maximize();
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);

//		String nam = driver.findElement(By.id("firstNameError")).getText();
//		System.out.println(nam);
		
		//Get all the Errormesage at a time by using Findelements() method
		//Stored into An array<LIST webelement>, 
		List<WebElement> allErrorMsg = driver.findElements(By.className("formValidationMessage"));
		
		//then print with Advanced for loop/Enhanced for loop / FOR EACH loop
		for (WebElement abc : allErrorMsg) {
			System.out.println(abc.getText());
		}

	}
}
