package com.techelevator.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangePassword {

	private WebDriver webDriver;
	
	public ChangePassword (WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public ChangePassword currentPassword (String oldPassword) {
		WebElement currentPasswordInput = webDriver.findElement(By.name("oldPassword"));
		currentPasswordInput.sendKeys(oldPassword);
		return this;
	}
	
	public ChangePassword newPassword (String newPassword) {
		WebElement newPasswordInput = webDriver.findElement(By.name("newPassword"));
		newPasswordInput.sendKeys(newPassword);
		return this;
		
	}
	public ChangePassword confrimNewPassword (String confrimNewPassword) {
		WebElement confrimNewPasswordInput = webDriver.findElement(By.name("newPasswordConfrimation"));
		confrimNewPasswordInput.sendKeys(confrimNewPassword);
		return this;
	}
	public HomePage clickSubmit () {
		WebElement clickOnSubmit = webDriver.findElement(By.id("submit"));
		clickOnSubmit.click();
		return new HomePage(webDriver); 
	}

}