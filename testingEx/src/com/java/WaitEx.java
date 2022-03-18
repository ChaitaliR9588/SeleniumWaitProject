package com.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitEx {
WebDriver driver;// global
	
	@Test
	public void test01() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		
		//driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);// timeout exception throw
		// dynamic wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// will work for all webElement--NoSuchElement
		
			
		WebElement uname=driver.findElement(By.id("email"));
		uname.sendKeys("kiran@gmail.com");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);// NosuchElement-- dedicated to specific webElement
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password1"))));
		
		
		Wait w= new FluentWait(driver).
				withTimeout(30, TimeUnit.SECONDS).
				pollingEvery(20, TimeUnit.SECONDS).
				ignoring(NoSuchElementException.class);// handling of exception		
		
		
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password1"))));
		
	}
}
