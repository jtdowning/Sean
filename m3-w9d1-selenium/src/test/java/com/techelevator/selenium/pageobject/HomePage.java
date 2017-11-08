package com.techelevator.selenium.pageobject;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver webDriver;
	
	public HomePage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public boolean isLoggedIn() {
		try {WebElement logInLink = webDriver.findElement(By.linkText("Login"));
		if (logInLink == null ) {
			return true;
		} else {
			return false;
		}
		} catch (Exception e) {
			return  true;
			}
		} 
	
	public void logout() {
		try { 
			WebElement logoutButton = webDriver.findElement(By.cssSelector("input[value='Logout']"));
			 if (logoutButton != null) {
				logoutButton.click();
			} }catch(NoSuchElementException e) {
			
			 }
		}
		
//		public isShownLink isShown() {
//			return webDriver.getCurrentUrl().equals("http://extreme-programming.herokuapp.com/");
//		}
//	}
	
	public RegisterInputPage clickRegisterLink() {
		WebElement registerLink = webDriver.findElement(By.linkText("Register"));
		registerLink.click();
		return new RegisterInputPage (webDriver);	
	}
	
	public LogInPage clickLogIn () {
		WebElement logInLink = webDriver.findElement(By.linkText("Login"));
		logInLink.click();
		return new LogInPage (webDriver);
	}
	
	
	public boolean subjectLink (String linkText) {
		WebElement findSubjectLink = webDriver.findElement(By.linkText(linkText));
		if (findSubjectLink == null) {
		return false;
		} else {
			return true;
		}
	}
	
	public CreatePost clickPost() {
		WebElement clickOnPost = webDriver.findElement(By.linkText("Create Post"));
		clickOnPost.click();
		return new CreatePost (webDriver);
	}

	
	public HomePage removePost () {
		List <WebElement> deletePostInput = webDriver.findElements(By.cssSelector("button[title='Delete Post']"));
		deletePostInput.get(0).click();
		return this;
	}
	public HomePage okButton (String okButtonPush) {
		WebElement okButtonConfrim = webDriver.findElement(By.name("OK"));
		okButtonConfrim.click();
		return new HomePage (webDriver);
	}
	
	
}
