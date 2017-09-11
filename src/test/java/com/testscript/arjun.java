package com.testscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.library.Baseclass;

public class arjun extends Baseclass 
{
@Test
public void Registration() throws InterruptedException 
{
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("patil");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("nagarjuna");
	driver.findElement(By.tagName("textarea")).sendKeys("anantapur");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("patilnagarjuna92@gmail.com");
	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9494949494");
	List<WebElement>element=driver.findElements(By.name("radiooptions"));
	int count=element.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		
		element.get(i).click();
	}
	driver.findElement(By.id("checkbox1")).click();
	driver.findElement(By.id("firstpassword")).sendKeys("123456789");
    driver.findElement(By.id("countries")).click();
	Select select1=new Select(driver.findElement(By.id("countries")));
	select1.selectByVisibleText("India");
    driver.findElement(By.id("secondpassword")).sendKeys("123456789");
	driver.findElement(By.id("checkbox2")).click();
	driver.findElement(By.id("Skills")).click();
	Thread.sleep(5000);
	Select select=new Select(driver.findElement(By.id("Skills")));
	select.selectByVisibleText("C++");
	driver.findElement(By.id("country")).click();
	Thread.sleep(5000);
	Select select2=new Select(driver.findElement(By.id("country")));
	Thread.sleep(5000);
	select2.selectByVisibleText("Australia");
	Thread.sleep(5000);
}
}
