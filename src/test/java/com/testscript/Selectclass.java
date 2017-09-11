package com.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.library.Baseclass;

public class Selectclass extends Baseclass{
	@Test
	public void Select() throws InterruptedException 
	{
		driver.findElement(By.id("Skills")).click();
		Select select=new Select(driver.findElement(By.id("Skills")));
		Thread.sleep(4000);
		select.selectByVisibleText("C++");
		Thread.sleep(4000);
		
	}
}
