package com.steps;

import java.io.IOException;

//import com.pages.AddToCardPage;
import com.pages.DropDownPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DropDownPagStep {
	DropDownPage lp = new DropDownPage();

	@Given("^user is launched the web applications$")
	public void the_user_launch_the_chrome_application() throws IOException {

		lp.browser();
	}

	@When("^user open the Swaglab Home page$")
	public void the_user_open_the_Myntra_Home_page() {

		lp.LoginSwag();
	}

	@Then("^users enter the username$")
	public void the_user_login_using_username() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions

		lp.UserName();

	}

	@And("^users enter the password$")
	public void the_user_login_using_password() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions

		lp.Password();

	}

	@Then("^click the login buttons user will navigate the next page$")
	public void click_on_the_login_button_user_nagivate_to_the_next_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		lp.LoginBtn();

	}

	@And("^user click the dropdown button$")
	public void dropdownBtn() throws InterruptedException {
		lp.dropDownBtn();
	}

}
