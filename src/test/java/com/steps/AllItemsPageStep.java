package com.steps;

import java.io.IOException;

import com.pages.AllItemsPage;
import com.pages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AllItemsPageStep {
	AllItemsPage lp=new AllItemsPage();
	@Given("^user is launched the webapplication$")
	public void the_user_launch_the_chrome_application() throws IOException  {
	   
		lp.browser();
	}
	
	@When("^user opens the Swaglabs Home page$")
	public void the_user_open_the_Myntra_Home_page() {
	   
		lp.LoginSwag();
	}
	
	@Then("^user enters the username$")
	public void the_user_login_using_username() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		lp.UserName();
	 
	}
	
	@And("^user enters the password$")
	public void the_user_login_using_password() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
			
		lp.Password();
	 
	}
	
	
	
	@Then("^click the login button user will navigate to the next page$")
	public void click_on_the_login_button_user_nagivate_to_the_next_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		lp.LoginBtn();
	
	}
	@And("^user clicks the menu button$")
	public void menubutton() throws InterruptedException {
		lp.menuBtn();
	}
	@And("^user clicks the AllItems button$")
	public void AllItemsButton() throws InterruptedException {
		lp.AllItem();
	}

}
