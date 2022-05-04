package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {
	@Test
	public void f() throws InterruptedException {
		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		Thread.sleep(3000);
		driver.findElement(By.className("login_button")).click();
		Thread.sleep(3000);

		// Click Login button without fill any data
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(3000);
		// Alert will display
		// get the alert message text
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		System.out.println("Hi all, How r u");
		// Click on OK button on Alert
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		// Click on New User Link
		// driver.findElement(By.linkText("New User ? Register here/Activate")).click();
		driver.findElement(By.partialLinkText("User")).click();
		Thread.sleep(3000);

		// Click on Cancel button on Confirmation Alert
		// driver.switchTo().alert().dismiss();
		// Click on OK button on Confirmation Alert
		driver.switchTo().alert().accept();
	}
}
