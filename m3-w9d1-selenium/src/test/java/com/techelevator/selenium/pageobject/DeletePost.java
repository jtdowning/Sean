package com.techelevator.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeletePost {

	private WebDriver webDriver;
	
	public DeletePost (WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public DeletePost removePost (String delete) {
		WebElement deletePostInput = webDriver.findElement(By.name("Delete Post"));
		deletePostInput.click();
		return this;
	}
	public DeletePost okButton (String okButtonPush) {
		WebElement okButtonConfrim = webDriver.findElement(By.name("OK"));
		okButtonConfrim.click();
		return new DeletePost (webDriver);
	}
	
}
