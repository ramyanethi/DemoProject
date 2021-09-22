Feature:Login Tests
This feature file contains all the scenarios related to login functionality of the application. 
@ninja
Scenario: Login with valid credentials
Provide valid username and valid password into the email address and password fields to login
	Given User navigates to login page of the application
	When User enters Username ramya.nethi@gmail.com and Password ramya@287 into the fields
	And Clicks on Login button
	Then User should successfully login