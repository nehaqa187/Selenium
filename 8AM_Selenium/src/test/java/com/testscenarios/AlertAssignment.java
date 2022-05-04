package com.testscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.gson.annotations.Until;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertAssignment {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		// to capture the message
		String first_alert = driver.switchTo().alert().getText();
		System.out.println(first_alert);
		Thread.sleep(1000);
		// to accept or cancel the alert
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

		driver.findElement(By.id("timerAlertButton")).click();
		//explicit wait
		WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(30));
		ww.until(ExpectedConditions.alertIsPresent());
		
//		Thread.sleep(9000);
//		String second_alert = driver.switchTo().alert().getText();
//		System.out.println(second_alert);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);

		// third click
		driver.findElement(By.id("confirmButton")).click();
		String third_alert = driver.switchTo().alert().getText();
		System.out.println(third_alert);

		if (third_alert.equals("Do you confirm action?")) {
			System.out.println("You selected Ok");
		} else {
			System.out.println("You selected Cancel");
		}

		driver.switchTo().alert().accept();
		Thread.sleep(1000);

		// Fourth click

		driver.findElement(By.id("promtButton")).click();
		String fourth_alert = driver.switchTo().alert().getText();
		System.out.println(fourth_alert);
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Jaipal");
	}
}
