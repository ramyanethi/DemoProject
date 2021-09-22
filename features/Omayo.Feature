Feature: Login to omayo application

Scenario Outline: User should only be able to login with valid credentials
Given I navigatee to omayo website
When I enter Username as<username> and password as <password>
And I click on login button
Then user should login based on expected <loginstatus> status

Examples:
|username			 |password |loginstatus
|arun    			 |12345    |failure
|SeleniumByArun|Test143$ |sucess
|Ramya 				 |ramya1990|failure