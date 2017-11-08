package com.techelevator.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterInputPage {
	
	private WebDriver webDriver;
	
	public RegisterInputPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public RegisterInputPage enterEmailAddress(String emailAddress) {
		WebElement emailInput = webDriver.findElement(By.name("email"));
		emailInput.sendKeys(emailAddress);
		return this;
	}
	
	public RegisterInputPage enterUsername(String username) {
		WebElement usernameInput = webDriver.findElement(By.name("username"));
		usernameInput.sendKeys(username);
		return this;
	} 
	public RegisterInputPage enterPassword(String password) {
		WebElement userPasswordInput = webDriver.findElement(By.name("password"));
		userPasswordInput.sendKeys(password);
		return this;
	}
	public RegisterInputPage enterConfrimedPassword (String confrimPassword) {
		WebElement userConfrimPasswordInput = webDriver.findElement(By.name("confrimPassword"));
		userConfrimPasswordInput.sendKeys(confrimPassword);
		return this;
	}
	
	public boolean isShown() {
		try {
			WebElement registerForm = webDriver.findElement(By.id("register"));
			return registerForm != null;
		} catch (NoSuchElementException e) {
			return false;
 		}
	}
	
	public RegisterInputPage submitForm() {
		WebElement submitButton = webDriver.findElement(By.linkText("Submit"));
		submitButton.click();
		return new RegisterInputPage (webDriver);
	}
}
