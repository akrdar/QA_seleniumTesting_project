package com_Selenium.seleniumTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement search =driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("Way2Automation");
		driver.findElement(By.xpath("//input[@name='btnK'][1]")).click();
		List <WebElement> allLinks =driver.findElements(By.tagName("a"));
		for(WebElement link:allLinks) {
			//System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		
		}
		 //driver.quit();

	}

}
