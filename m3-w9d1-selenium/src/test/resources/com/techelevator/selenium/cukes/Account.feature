Feature: Accounts

Scenario: Register for an account
	Given I am on the home page
	And I am logged out
	When I click the Register link
	Then I am taken to the register form
		
		
Scenario: Create an account
	Given I am on the register form
	And I enter the email address jon@techelevator.com
	And I enter the username Jon
	And I enter the password Password1
	And I confirm the password Password1
	When I register the account
	Then the home page should be shown
	And I am logged in
		

Scenario: Get to the login page
	Given I am on the home page
	When I click on the login link
	Then the login page should appear
	
Scenario: Log into account
	Given I am on the login page
	And I enter the email address jon@techelevator.com
	And I enter the password password1
	When I click the submit button
	Then I am taken to the home page
		
Scenario: Change Password
	Given I am on the change password page
	And I enter my current password
	And I enter my new password
	And I enter my new confirmed password
	When I submit my new password
	Then the home page should be shown
	
Scenario: Get to a new Post
	Given I am on the home page
	When I click on create post link
	Then the create post page should be shown
	
Scenario: Create a new Post
	Given I am on the create Post page
	And I type my Extreme Programming into the subject field
	And I type my text into the message field 
	When I click on submit post button
	Then the home page should be shown with new post

Scenario: Delete post
	Give I am on the home page
	And I select the delete button of current post
	When I click on delete
	Then the home page should be shown without new post

Scenario: Logout of account
	Given I am on the home page
	When I click on logout link
	Then the home page should be shown with login option