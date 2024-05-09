package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {

	
	public WebDriver driver;
	
	//constructor
	
	
	public Admin(WebDriver driver) {
		
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);


	}
//	@FindBy (xpath = "//button[@role='none']")
//	
//	public WebElement icon;

	@FindBy(xpath = "//button[@title='Assign Leave']//*[name()='svg']")

	
	public WebElement Click;
	
	
	
	
	
	public void usermangement() {
		//serching the Existing user
		
		Click.click();
		
		//
		
		
		
	}
	
}
