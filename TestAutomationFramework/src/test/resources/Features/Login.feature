Feature: feature to test Login functionality
Scenario Outline: Check login is successful with valid credentials
Given User is on Login Page
When User Enters valid "<username>" and "<password>"
And clicks on Login button
Then user is navigated to the home page

Examples:
| username | password|
| John Doe | ThisIsNotAPassword |