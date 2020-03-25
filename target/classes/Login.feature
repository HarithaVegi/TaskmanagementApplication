Feature: Login
     In order to login in Task management
     I want to get access to the portal
     
Scenario Outline:ValidCredential
Given I have browser with task management page
When I click on Administration Icon and I enter username as 'admin' and  I enter password as 'admin'
Then I should access to the portal and check the presence of AddTask and TaskList 
Examples:
|username|password|
|admin|admin|

Scenario Outline:InvalidCredential
Given I have browser with task management page1
When I click on Administration Icon and I enter invalid username as 'abc' and I enter valid password as 'admin'
Then It should display an error message1
Examples:
|username|password|
|abc|admin|

Scenario Outline:InvalidCredential
Given I have browser with task management page2
When I click on Administration Icon and I enter valid username as 'admin' and I enter invalid password as 'abcxyz'
Then It should display an error message2
Examples:
|username|password|
|admin|abcxyz|

Scenario Outline:InvalidCredential
Given I have browser with task management page3
When I click on Administration Icon and I enter invalid username as 'abc' and I enter invalid password as 'xyz'
Then It should display an error message3
Examples:
|username|password|
|abc|xyz|

Scenario Outline: To check whether the logOut is working
Given I have browser with the task management page
When I click on the Administration Icon and I enter valid username as 'admin' and I enter valid password as 'admin'
Then I should display the page and click on LogOut
Examples:
|username|password|
|admin|admin|


