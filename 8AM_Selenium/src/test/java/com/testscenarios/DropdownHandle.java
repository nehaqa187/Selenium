package com.testscenarios;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandle {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://collegeweeklive.com/go-signup/");
		// Thread.sleep(8000);
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Select Country
		Select abc = new Select(driver.findElement(By.id("country")));
		abc.selectByVisibleText("INDIA");

		// Take a screenshot
		Date datenew = new Date();
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timeStamp = df.format(datenew);
		
		File mypic = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(mypic, new File(".\\Screenshots\\test"+timeStamp+".PNG"));
	}

}
