#Author: ajaykumarthippani931@gmail.com

Feature: Validate OrangeHRM Website Functionality

Scenario: Validate OrangeHRM website login with valid username and password

Given user launch Chrome browser
When user enters URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
And user enters username "Admin" and password "admin123"
Then user clicks on the login button
And page title should be "OrangeHRM"
Then close the Browser


