package com_Selenium.seleniumTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestJenkins {

	
	
		
		@Test
		public void openGoogle() {

			System.out.println("Test  Started");
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			
			System.out.println("open browser");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			System.out.println("open google");
			driver.get("https://google.com");

			//driver.quit();
			System.out.println("Test Ended");
		}
		
		@Test 
		public void typeInGoogle () {
			
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			
			System.out.println("open browser");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			System.out.println("open google");
			driver.get("https://google.com");
			driver.findElement(By.id("APjFqb")).sendKeys("chercherTech");
			
			
			
			
		}

	}


