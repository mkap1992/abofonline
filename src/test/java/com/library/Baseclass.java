package com.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {

	public static WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		if(Generic.getproperties("Browsername").equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(Generic.getproperties("Url"));
			driver.manage().window().maximize();
		}
		else if(Generic.getproperties("Browsername").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Browsers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(Generic.getproperties("Url"));
			driver.manage().window().maximize();
			
		}
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
