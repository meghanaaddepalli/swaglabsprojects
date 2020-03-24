package com.steps;

import java.io.IOException;

import com.pages.AddToCardPage;
//import com.pages.AllItemsPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCardPageStep {
	AddToCardPage lp = new AddToCardPage();

	@Given("^user is launched the web application$")
	public void the_user_launch_the_chrome_application() throws IOException {

		lp.browser();
	}

	@When("^user open the Swaglabs Home page$")
	public void the_user_open_the_Myntra_Home_page() {

		lp.LoginSwag();
	}

	@Then("^user enter the username$")
	public void the_user_login_using_username() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions

		lp.UserName();

	}

	@And("^user enter the password$")
	public void the_user_login_using_password() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions

		lp.Password();

	}

	@Then("^click the login button user will navigate the next page$")
	public void click_on_the_login_button_user_nagivate_to_the_next_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		lp.LoginBtn();

	}

	@And("^user clicks addToCard button$")
	public void addToCard() throws InterruptedException {
		lp.AddToCardBtn();
	}

	@And("^user clicks card button$")
	public void CardBtn() throws InterruptedException {
		lp.CardBtn();
	}

	@And("^user clicks Checkout button$")
	public void CheckBtn() throws InterruptedException {
		lp.CheckOutBtn();
	}

	@And("^user enters FirstName$")
	public void firstName() throws InterruptedException {
		lp.FirstName();
	}

	@And("^user enters LastName$")
	public void lastName() throws InterruptedException {
		lp.LastName();
	}

	@And("^user enters Zip/Postal Code$")
	public void zipCode() throws InterruptedException {
		lp.ZipCode();
	}

	@And("^user clicks the continue button$")
	public void continueBtn() throws InterruptedException {
		lp.ContinueBtn();
	}
	@And("^user clicks the Finish button$")
	public void finishBtn() throws InterruptedException {
		lp.FinishBtn();
	}
}
