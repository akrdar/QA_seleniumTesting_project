package com_Selenium.seleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebElements {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		username.sendKeys("aksidiqi123@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		password.sendKeys("Xra4qdxc@12345");
		WebElement login = driver.findElement(By.xpath("//*[@name=\"login\"]"));                                        
		login.click();

	}

}
