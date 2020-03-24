package com.steps;

import java.io.IOException;

import com.pages.AddToCardFailurePage;
import com.pages.AddToCardPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCardFailurePageStep {
	AddToCardFailurePage lp = new AddToCardFailurePage();

	@Given("^user is launched the web application.$")
	public void the_user_launch_the_chrome_application() throws IOException {

		lp.browser();
	}

	@When("^user open the Swaglabs Home page.$")
	public void the_user_open_the_Myntra_Home_page() {

		lp.LoginSwag();
	}

	@Then("^user enter the username.$")
	public void the_user_login_using_username() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions

		lp.UserName();

	}

	@And("^user enter the password.$")
	public void the_user_login_using_password() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions

		lp.Password();

	}

	@Then("^click the login button user will navigate the next page.$")
	public void click_on_the_login_button_user_nagivate_to_the_next_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		lp.LoginBtn();

	}

	@And("^user clicks card button.$")
	public void cardBtn() throws InterruptedException {
		lp.CardBtn();
	}

}
