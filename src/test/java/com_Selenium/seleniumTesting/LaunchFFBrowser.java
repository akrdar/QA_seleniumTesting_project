package com_Selenium.seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFFBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("cnn",Keys.ENTER);
		
		// driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));

	}

}
