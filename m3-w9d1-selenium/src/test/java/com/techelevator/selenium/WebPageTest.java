package com.techelevator.selenium;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.techelevator.selenium.pageobject.CreatePost;
import com.techelevator.selenium.pageobject.HomePage;
import com.techelevator.selenium.pageobject.LogInPage;
import com.techelevator.selenium.pageobject.RegisterInputPage;

public class WebPageTest {
	
	private static WebDriver webDriver;
	private HomePage homePage;

 
	@BeforeClass
	public static void openBrowser() {
		String homeDir = System.getProperty("user.home");
		System.setProperty("webdriver.chrome.driver", homeDir+"/dev-tools/chromedriver/chromedriver");
		webDriver = new ChromeDriver();
	}
	
	@AfterClass
	public static void closeBrowser() {
		webDriver.close();
	}
	
	@Before
	public void goToTheHomepage() {
		webDriver.get("http://extreme-programming.herokuapp.com/");
		homePage = new HomePage(webDriver);
	}
	
	@Test
	public void register() {
		if (homePage.isLoggedIn()) {
			homePage.logout();
		}
		RegisterInputPage register = homePage.clickRegisterLink();
		register.enterEmailAddress("Jdub545454@techelevator.com");
		register.enterPassword("Shorty");
	}
	
	@Test
	public void subjectLink () {
		Assert.assertTrue(homePage.subjectLink("Goodbye Milton"));
	
	}
	@Test
	public void submitNewPost () {
		if (homePage.isLoggedIn()==false) {
		}
	}
	
	@Test
	public void subject () {
		if (!homePage.isLoggedIn()) {
			login();
		}
		CreatePost subject = homePage.clickPost();
		subject.subjectInputArea("Extreme Programming");
		subject.postMessageArea("Totally Extreme");
		subject.clickSubmit(); 
	}
	@Test
	public void post () {
		if(!homePage.isLoggedIn()) {
			login();
		}
		CreatePost post = homePage.clickPost();
		post.subjectInputArea("Extreme Programming");
		post.postMessageArea("i mean its okay. it like a good Bon Jovi song but a mix of Hall & Oates. If you want to discuss Hall & Oates you should check out our meet up at AlloftheOates.com");
		
	}
	@Test
	public void submitButton() {
		CreatePost submit = homePage.clickPost();
		submit.clickSubmit();
		
	}
	
	public void login() {
		LogInPage login = homePage.clickLogIn();
		login.enterEmailAddress("jon@techelevator.com").enterPassword("password1").clickSubmit();
	}
	
	@Test
	public void deletePost() {
		if(!homePage.isLoggedIn()) {
			login();
		}
		HomePage removePost = homePage.removePost();
		
	}
}

