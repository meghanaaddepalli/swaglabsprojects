package com.steps;

import com.pages.AboutPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AboutPageStep {
	AboutPage abt=new AboutPage();
	
	 @Given("^the web application will launch$")
	    public void the_web_application_will_launch() throws Throwable {
	      abt.Browsr();
	    }

	    @When("^the user opens the Swaglabs main page$")
	    public void the_user_opens_the_swaglabs_main_page() throws Throwable {
	    	abt.Login();
	      }

	    @Then("^the user entered the uname$")
	    public void the_user_enters_the_uname() throws Throwable {
	    
	    	abt.UName();
	    }
	    
	    @And("^the user entered the pswrd$")
	    public void the_user_enter_the_pswrd() throws Throwable {
	     
	       abt.Pwd();
	    }
	    
	    @Then("^clicks on the login button user will navigate to next page$")
	    public void click_on_the_login_button_user_will_navigate_to_the_next_page() throws Throwable {
	       abt.LoginClick();
	    }
	    
	    @Then("^the user clicks on about buttons$")
	    public void the_user_clicks_on_about_button() throws Throwable {
	       abt.Abot();
	    }
	    
	    @Then("^the user clicks on signin button to navigate to the next page$")
	    public void the_user_clicks_on_signin_button_to_navigate_to_the_next_page() throws Throwable {
	        abt.signin();
	    }

	        

}
