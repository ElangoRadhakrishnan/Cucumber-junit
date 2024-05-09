package com.lao.stepdefenition;

import org.openqa.selenium.WebDriver;

import com.lao.Hooks.OrangHrm;
import com.page.Admin;
import com.page.signin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefenition {
	
	
	public WebDriver driver= OrangHrm.driver;
	
	
	signin log;
	Admin user;
	
	@Given("Launch  the Browser")
	public void launch_the_browser() {
		signin log = new signin(driver);
		
		log.sendValues();
	   
	
	}

	@When("Login creditaials")
	public void login_creditaials() {
	    
		Admin user = new Admin(driver);
		
		user. usermangement();
	}

	@When("Login click")
	public void login_click() {
	    
	}

	@When("yet another action")
	public void yet_another_action() {
	    
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    
	    
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    
	}


}
