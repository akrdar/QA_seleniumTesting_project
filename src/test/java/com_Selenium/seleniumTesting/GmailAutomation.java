package com_Selenium.seleniumTesting;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailAutomation {


	

		public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.gmail.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			/*WebElement username = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
			username.sendKeys("akrsidiqi@gmail.com");
			WebElement next = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
			next.click();
			WebElement password = driver.findElement(By.xpath("")); */
			
			

		}
}
