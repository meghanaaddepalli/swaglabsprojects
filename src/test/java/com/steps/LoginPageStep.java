package com.steps;

import java.io.IOException;

import com.pages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep {
	LoginPage lp=new LoginPage();
	@Given("^user is launching the webapplication$")
	public void the_user_launch_the_chrome_application() throws IOException  {
	   
		lp.browser();
	}
	
	@When("^the user opens the Swaglabs Home page$")
	public void the_user_open_the_Myntra_Home_page() {
	   
		lp.LoginSwag();
	}
	
	@Then("^the user enters the username$")
	public void the_user_login_using_username() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		lp.UserName();
	 
	}
	
	@And("^the user enters the password$")
	public void the_user_login_using_password() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		lp.Password();
	 
	}
	
	
	
	@Then("^click on the login button user will navigate to the next page$")
	public void click_on_the_login_button_user_nagivate_to_the_next_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		lp.LoginBtn();
	
	}

}
