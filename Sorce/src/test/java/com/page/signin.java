package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signin {

	
	//global level webdriver to access the Elements
public WebDriver driver;
	
	


//constructor

public signin(WebDriver driver) {
	
	
	this.driver = driver;
	
	PageFactory.initElements(driver, this);


}
	
@FindBy(xpath = "//input[@placeholder='Username']")
public WebElement Username;



@FindBy(xpath = "//input[@placeholder='Password']")
public WebElement password;
	

@FindBy(xpath = "//button[@type='submit']")
public WebElement click;



	
public void sendValues() {
	
	Username.sendKeys("Admin");
	
	password.sendKeys("admin123");
	
	click.click();
	
}
	
	
	
}
