package com.techelevator.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatePost {

	private WebDriver webDriver;
	
	public CreatePost (WebDriver webDriver) {
		this.webDriver = webDriver;
	} 
	
	public CreatePost subjectInputArea (String subject) {
		WebElement subjectInput = webDriver.findElement(By.name("subject"));
		subjectInput.sendKeys(subject);
		return this;
	}
	
	public CreatePost postMessageArea (String post) {
		WebElement postInput = webDriver.findElement(By.name("message"));
		postInput.sendKeys(post);
		return this;
	
	}
	
	public CreatePost clickSubmit () {
		WebElement submitButton = webDriver.findElement(By.id("submit"));
		submitButton.click();
		return this;
	}

	public static CreatePost clickCreatePostLink() {
		
		return null;
	}
}
