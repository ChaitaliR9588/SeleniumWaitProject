package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTesting {
	@Test
	public void check_login_page_with_blank() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actualMsg = driver.findElement(By.xpath("//*[@id=\"email_error\"]")).getText();
		String expMsg = "blank not allowed";
		driver.close();
		Assert.assertEquals(actualMsg, expMsg);
	}

	@Test
	public void check_login_page_with_spChars() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("&**^*^*");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actualMsg = driver.findElement(By.xpath("//*[@id=\"email_error\"]")).getText();
		String expMsg = "alphabets only allowed";
		driver.close();
		Assert.assertEquals(actualMsg, expMsg);
	}

	@Test
	public void check_login_page_with_correct_credential() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actualHeading = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1/small")).getText();
		String expMsg = "Courses Offered";
		driver.close();
		Assert.assertEquals(actualHeading, expMsg);
	}

	@Test
	public void checkHeading() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/java-by-kiran-classes-batch-schedule/");
		String actualHeading = driver
				.findElement(
						By.xpath("//*[@id=\"post-293\"]/div/div/div/div/section[1]/div/div/div/div/div/div/div/h2"))
				.getText();
		driver.close();
		Assert.assertEquals(actualHeading, "Batch Schedule");
	}

	@Test
	public void checkDuration() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/java-by-kiran-classes-batch-schedule/");
		String actualDuration = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/td[5]")).getText();
		driver.close();
		Assert.assertEquals(actualDuration, "2.5 Months");
	}

	@Test
	public void loginPage() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actualError = driver.findElement(By.id("email_error")).getText();
		driver.close();
		Assert.assertEquals(actualError, "Please enter email.");
	}

	@Test
	public void openDashboard() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
		String actualDashboard = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
		driver.close();
		Assert.assertEquals(actualDashboard, "Dashboard Courses Offered");
	}

	@Test
	public void courseName() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/java-by-kiran-classes-batch-schedule/");
		String actualCourse = driver.findElement(By.xpath("//*[@id=\"customers\"]/thead/tr/th[1]")).getText();
		driver.close();
		Assert.assertEquals(actualCourse, "Course Name");
	}

	@Test
	public void batchDate() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/java-by-kiran-classes-batch-schedule/");
		String actualDate = driver.findElement(By.xpath("//*[@id=\"customers\"]/thead/tr/th[2]")).getText();
		driver.close();
		Assert.assertEquals(actualDate, "Batch Date");
	}

	@Test
	public void batchDays() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/java-by-kiran-classes-batch-schedule/");
		String actualDays = driver.findElement(By.xpath("//*[@id=\"customers\"]/thead/tr/th[3]")).getText();
		driver.close();
		Assert.assertEquals(actualDays, "Batch Days");
	}

	@Test
	public void startTime() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/java-by-kiran-classes-batch-schedule/");
		String actualTime = driver.findElement(By.xpath("//*[@id=\"customers\"]/thead/tr/th[4]")).getText();
		driver.close();
		Assert.assertEquals(actualTime, "Start Time");
	}

	@Test
	public void logout() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li/a")).click();
		String actualLog = driver.findElement(By.xpath("/html/body/div/div[2]/p[2]")).getText();
		driver.close();
		Assert.assertEquals(actualLog, "Logout successfully");
	}

}
