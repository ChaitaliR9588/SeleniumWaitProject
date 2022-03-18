package com.jbk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Users {
	// Dashboard page open
	@Test
	public void dashboardPage() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "JavaByKiran | Dashboard";
		Assert.assertEquals(expectedTitle, actualTitle);
		driver.close();
	}

	// Courses listed on dashboard page
	@Test
	public void checkCourses_On_Dashboard() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		ArrayList<String> alMenuExp = new ArrayList<>();
		alMenuExp.add("Selenium");
		alMenuExp.add("Java / J2EE");
		alMenuExp.add("Python");
		alMenuExp.add("Php");
		ArrayList<String> alMenuAct = new ArrayList<>();
		String actname1 = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/div[1]/h3"))
				.getText();
		String actname2 = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/div[1]/h3"))
				.getText();
		String actname3 = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/div[1]/h3"))
				.getText();
		String actname4 = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/div[1]/h3"))
				.getText();
		alMenuAct.add(actname1);
		alMenuAct.add(actname2);
		alMenuAct.add(actname3);
		alMenuAct.add(actname4);
		Assert.assertEquals(alMenuAct, alMenuExp);
		driver.close();
	}

	// Hyperlinks present in dashboard
	@Test
	public void check_hyperlinks() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		ArrayList<String> alHypeExp = new ArrayList<>();
		alHypeExp.add("Dashboard");
		alHypeExp.add("Users");
		alHypeExp.add("Operators");
		alHypeExp.add("Useful Links");
		alHypeExp.add("Downloads");
		alHypeExp.add("Logout");
		ArrayList<String> alHypeAct = new ArrayList<>();
		String h1 = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[2]/a")).getText();
		String h2 = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).getText();
		String h3 = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[4]/a")).getText();
		String h4 = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[5]/a")).getText();
		String h5 = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/a")).getText();
		String h6 = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[7]/a")).getText();
		alHypeAct.add(h1);
		alHypeAct.add(h2);
		alHypeAct.add(h3);
		alHypeAct.add(h4);
		alHypeAct.add(h5);
		alHypeAct.add(h6);
		Assert.assertEquals(alHypeAct, alHypeExp);
		driver.close();
	}

	//Sidemenu bar oder maintained test case
	@Test
	public void order_hyperlinks() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		ArrayList<String> alHypeExp = new ArrayList<>();
		alHypeExp.add("Dashboard");
		alHypeExp.add("Users");
		alHypeExp.add("Operators");
		alHypeExp.add("Useful Links");
		alHypeExp.add("Downloads");
		alHypeExp.add("Logout");
		List<String> alHypeAct=new ArrayList<String>();
		String h1 = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[2]/a")).getText();
		String h2 = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).getText();
	    String h3 = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[4]/a")).getText();
		String h4 = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[5]/a")).getText();
		String h5 = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/a")).getText();
		String h6 = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[7]/a")).getText();
		alHypeAct.add(h1);
		alHypeAct.add(h2);
		alHypeAct.add(h3);
		alHypeAct.add(h4);
		alHypeAct.add(h5);
		alHypeAct.add(h6);
		System.out.println(alHypeAct);
		Collections.sort(alHypeAct);
		System.out.println(alHypeAct);
//		Assert.assertEquals(alHypeAct, alHypeExp);
		driver.close();
		
	}

	// All hyperlinks present in dashboard will be open
	@Test
	public void dashboardPageLinksOpen() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.partialLinkText("Dashboard")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.findElement(By.partialLinkText("Users")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.findElement(By.partialLinkText("Operators")).click();
		String title3 = driver.getTitle();
		System.out.println(title3);
		driver.findElement(By.partialLinkText("Useful Links")).click();
		String title4 = driver.getTitle();
		System.out.println(title4);
		driver.findElement(By.partialLinkText("Downloads")).click();
		String title5 = driver.getTitle();
		System.out.println(title5);
		driver.findElement(By.partialLinkText("Logout")).click();
		String title6 = driver.getTitle();
		System.out.println(title6);

		ArrayList<String> actMsg = new ArrayList<>();
		actMsg.add(title1);
		actMsg.add(title2);
		actMsg.add(title3);
		actMsg.add(title4);
		actMsg.add(title5);
		actMsg.add(title6);

		ArrayList<String> expMsg = new ArrayList<>();
		expMsg.add("JavaByKiran | Dashboard");
		expMsg.add("JavaByKiran | User");
		expMsg.add("JavaByKiran | Operators");
		expMsg.add("JavaByKiran | Useful Links");
		expMsg.add("JavaByKiran | Downloads");
		expMsg.add("JavaByKiran | Log in");
		driver.close();
	}

	// Select all more info link in dashboard
	@Test
	public void info() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/a")).click();
		Thread.sleep(2000);
		Set<String> ss = driver.getWindowHandles();
		int actualTab = ss.size();
		Assert.assertEquals(actualTab, 5);
		driver.close();
		
		//second method
//		List<WebElement> ll = driver.findElements(By.partialLinkText("info"));
//		for (WebElement webElement : ll) {
//			webElement.click();
//		}
//		Set<String> set= driver.getWindowHandles();
//		System.out.println(set.size());
	}

	// Click on more info link
	@Test
	public void moreInfo() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		// driver.findElement(By.linkText("JavaByKiran")).click(); //using for anchor tag
		driver.findElement(By.partialLinkText("info")).click();
		String actualInfo = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a")).getText();
		Assert.assertEquals(actualInfo, "More info");
		driver.close();
	}

	// select dropdown list in select by index, value, visibletext form
	@Test
	public void check_dropdown() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		WebElement ee = driver
				.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		Select ss = new Select(ee);
		// ss.selectByIndex(3);
		// ss.selectByValue("Maharashtra");
		ss.selectByVisibleText("HP");
		String actualdd = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select/option[4]")).getText();
		Assert.assertEquals(actualdd, "HP");
		driver.close();
	}

	// Print all dropdown list
	@Test
	public void dropdown_list() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		WebElement dropdown = driver
				.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select")); // select
																														// xpath
		Select list = new Select(dropdown);
		List<WebElement> dropdown_list = list.getOptions();
		for (int i = 0; i < dropdown_list.size(); i++) {
			String dropdown_value = dropdown_list.get(i).getText();
			System.out.println(dropdown_value);
		}
		driver.close();
	}

	// To Check radio button
	@Test
	public void radio_button() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		driver.findElement(By.id("Female")).click();
//         String actualButton=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/text()[2]")).getText();
//         Assert.assertEquals(actualButton, "Female");
		driver.close();
	}

	// To handle Alert or popup window
	@Test
	public void alert() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[8]/a/span"))
				.click(); // delete button xpath
		String ActualAlert = driver.switchTo().alert().getText();
		System.out.println(ActualAlert);
		driver.switchTo().alert().accept();
		Assert.assertEquals(ActualAlert, "You can not delete Default User");
		driver.close();
	}

	// Two popup window
	@Test
	public void alert2() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[8]/a/span"))
				.click(); // delete button xpath
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		// driver.switchTo().alert().dismiss(); //when we have to click cancel button
		driver.switchTo().alert().accept();
		String ActualAlert2 = driver.switchTo().alert().getText();
		System.out.println(ActualAlert2);
		driver.switchTo().alert().accept();
		Assert.assertEquals(ActualAlert2, "User deleted successfully.");
		driver.close();
	}

	// After clicking users menu users list displayed
	@Test
	public void check_User() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		String actualUser = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/h1")).getText();
		String expUser = "Users";
		driver.close();
		Assert.assertEquals(actualUser, expUser);
		
	}

	// Check Adduser button is clickable or not
	@Test
	public void check_Adduser_Test() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		String actualHeading = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
		String expHeading = "Add User";
		driver.close();
		Assert.assertEquals(actualHeading, expHeading);
	}

	// User added after submitted the form
	@Test
	public void Add_User() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click(); // click on users
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click(); // click
																													// on
																													// AddUsers
		driver.findElement(By.id("username")).sendKeys("Chaitali");
		driver.findElement(By.id("mobile")).sendKeys("256341526");
		driver.findElement(By.id("email")).sendKeys("chaitu@123.gmail.com");
		driver.findElement(By.id("course")).sendKeys("java");
		driver.findElement(By.id("Female")).click();
		WebElement ee = driver
				.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		Select ss = new Select(ee);
		ss.selectByVisibleText("Maharashtra");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input"))
				.sendKeys("5264");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(3000);
		String ActualAlert = driver.switchTo().alert().getText();
		System.out.println(ActualAlert);
		driver.switchTo().alert().accept();
		Assert.assertEquals(ActualAlert, "User Added Successfully. You can not see added user.");
		driver.close();
	}

	// After click on cancel button users page opened
	@Test
	public void cancel() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click(); // click on users
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click(); // click on AddUsers
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/a/span")).click(); // click on cancel button
		Thread.sleep(1500);
		String actPage = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/h1")).getText();
		String expPage = "Users";
		Assert.assertEquals(actPage, expPage);
		driver.close();
	}
}
