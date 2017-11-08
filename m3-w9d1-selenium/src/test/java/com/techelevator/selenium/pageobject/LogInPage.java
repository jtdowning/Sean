package com.techelevator.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

	private static WebDriver webDriver;
	
	public LogInPage (WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public LogInPage enterEmailAddress (String email) {
		WebElement usernameInput = webDriver.findElement(By.name("email"));
		usernameInput.sendKeys(email);
		return this;
	}
	
	public LogInPage enterPassword (String password) {
		WebElement userPasswordInput = webDriver.findElement(By.name("password"));
		userPasswordInput.sendKeys(password);
		return this;
	}
	public HomePage clickSubmit () {
		WebElement clickOnSubmit = webDriver.findElement(By.id("submit"));
		clickOnSubmit.click();
		return new HomePage(webDriver);
	}

	public static boolean isShown() {
		try {
			WebElement registerForm = webDriver.findElement(By.id("login"));
			return registerForm != null;
		} catch (NoSuchElementException e) {
			return false;
 		}
	}	
}
