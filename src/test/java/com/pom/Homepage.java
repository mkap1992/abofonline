package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.library.Baseclass;

public class Homepage {
	public Homepage() {
		PageFactory.initElements(Baseclass.driver, this);
	}
	@FindBy(xpath="//a[@tile='Men']")
	public WebElement abofmen;
	

}
