package com.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.library.Baseclass;



public class loginmodule extends Baseclass
{

	
	@Test
	public  void login() throws InterruptedException
	
	{
		driver.findElement(By.xpath("//span[text()='Sign In/Register']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@aria-controls='tabs-tab-1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@name='emailAddress'])[2]")).sendKeys("patilnagarjuna92@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("949494949");
		Thread.sleep(3000);
		
	}
}