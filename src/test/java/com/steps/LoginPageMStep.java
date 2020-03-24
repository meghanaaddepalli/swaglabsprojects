package com.steps;

import java.io.IOException;

import com.pages.LoginPageM;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageMStep {
LoginPageM lp=new LoginPageM();
	
	
	@Given("^launching the webapplication$")
	public void the_user_launch_the_chrome_application() throws IOException  {
	   
		lp.browser();
	}
	
	@When("^opens the Swaglabs Home page$")
	public void the_user_open_the_Myntra_Home_page() {
	   
		lp.LoginSwag();
	}
	
//	@Then("^the user enters the (.+) $")
//	public void the_user_login_using_username(String username) throws InterruptedException, IOException {
//	    // Write code here that turns the phrase above into concrete actions
//			System.out.println("username "+username);
//		lp.UserName(username);
//	 
//	}
	
	  @Then("^enters the (.+)$")
	    public void the_user_enters_the(String username) throws Throwable {
			System.out.println("username "+username);
			lp.UserName(username);
	    }
	
//	@And("^the user enters the pas (.+)$")
//	public void the_user_login_using_password(String password) throws InterruptedException, IOException {
//	    // Write code here that turns the phrase above into concrete actions
//			System.out.println("password " +password);
//		lp.Password(password);
//	 
//	}
	
    @And("^enter the pas (.+)$")
    public void the_user_enters_the_pas(String password) throws Throwable {
    	System.out.println("password " +password);
		lp.Password(password);
    }

	
	
	
	@Then("^click on the login button it will navigate to the next page$")
	public void click_on_the_login_button_user_nagivate_to_the_next_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		lp.LoginBtn();
	
	}
	
	
	 @Then("^logout from the webapplication$")
	 public void logout_from_the_webapplication() throws InterruptedException  {
		 lp.Logout();
		 
	 }
	       

}


