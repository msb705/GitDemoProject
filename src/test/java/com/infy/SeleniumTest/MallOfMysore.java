package com.infy.SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MallOfMysore {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		String url = "http://www.msn.com/en-in/?ocid=iehp";
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\user\\Desktop\\Selenium files\\drivers\\IEDriverServer.exe");
		// System.setProperty("webdriver.ie.driver", "/root/Desktop/Selenium
		// files/drivers/IEDriverServer");
		// driver= new FirefoxDriver();
		// driver = new ChromeDriver();
		driver = new InternetExplorerDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void submit() {

		System.out.println("In Test");

	}

}
