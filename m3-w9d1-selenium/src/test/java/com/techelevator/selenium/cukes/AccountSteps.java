package com.techelevator.selenium.cukes;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.techelevator.selenium.pageobject.HomePage;
import com.techelevator.selenium.pageobject.LogInPage;
import com.techelevator.selenium.pageobject.RegisterInputPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountSteps {
	
		private WebDriver webDriver;
		private HomePage homePage;
		private RegisterInputPage registerPage;
		
		@AutoWired 
		public AccountSteps(WebDriver webDriver) {
			this.webDriver = webDriver;
			this.homePage = new HomePage(webDriver);
			this.registerPage = new RegisterInputPage(webDriver);
		}
		
		@Given("^I am on the home page$") 
		public void goToTheHomePage() {
			webDriver.get("http://extreme-programming.herokuapp.com/");
		}
		
		@Given("^I am logged out$")
		public void logout() {
			homePage.logout();
		}
		
		@When("^I click the Register link$")
		public void clickRegisterLink() { 
			homePage.clickRegisterLink();
		}
		
		@Then("^I am taken to the register form$")
		public void shouldBeOnRegisterForm() {
			Assert.assertTrue("We should be seeing the register input form", registerPage.isShown());
		}
		
		@Given("^I am on the register form$")
		public void goToTheRegisterPage() {
			goToTheHomePage();
			homePage.clickRegisterLink();
		}
		@Given("^I enter the email address (.*)$")
		public void enterRegisterEmail(String emailAddress){	
			registerPage.enterEmailAddress(emailAddress);
		}
		
		@Given("^I enter the user (.*)$")
		public void enterUserName(String username) {
			registerPage.enterUsername(username);
		}
		
		@Given("^I enter the password(.*)$")
		public void enterPassword(String password) {
			registerPage.enterPassword(password);
		}
		@Given("^I confrim the password(.*)$")
		public void confrimPassword(String confrimPassword) {
			registerPage.enterConfrimedPassword(confrimPassword);
		}
		@When("^I register the account$")
		public void submitRegisterForm() {
			registerPage.submitForm();	
		}
	
		@Then("^I am logged in$")
		public void shouldBeLoggedIn() {
			Assert.assertTrue("Should be logged in", homePage.isLoggedIn());
		}
		@Given("^I am on the home page$")
		public void getToTheLoginPage() {
			Assert.assertEquals("We should be seeing the login page", homePage.clickLogIn());
		}
		
		
}		
//		@Given("^I am on the login page$")
//		public void enterInfoOnPage {
//			LoginPage.enterEmailAddress(emailAddress);
//		}
