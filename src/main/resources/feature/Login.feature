Feature: Login
     In order to login in Task management
     I want to get access to the portal
     
Scenario Outline:ValidCredential
Given I have browser with task management page
When I click on Administration Icon and I enter username as '<username>' and  I enter password as '<password>'
Then I should access to the portal and check the presence of AddTask and TaskList 
Examples:
|username|password|
|admin|admin|

Scenario Outline:InvalidCredential
Given I have browser with task management page1
When I click on Administration Icon and I enter invalid username as '<username>' and I enter valid password as '<password>'
Then It should display an error message1
Examples:
|username|password|
|abc|admin|

Scenario Outline:InvalidCredential
Given I have browser with task management page2
When I click on Administration Icon and I enter valid username as '<username>' and I enter invalid password as '<password>'
Then It should display an error message2
Examples:
|username|password|
|admin|abcxyz|

Scenario Outline:InvalidCredential
Given I have browser with task management page3
When I click on Administration Icon and I enter invalid username as '<username>' and I enter invalid password as '<password>'
Then It should display an error message3
Examples:
|username|password|
|abc|xyz|

Scenario Outline: To check whether the logOut is working
Given I have browser with the task management page
When I click on the Administration Icon and I enter valid username as '<username>' and I enter valid password as '<password>'
Then I should display the page and click on LogOut
Examples:
|username|password|
|admin|admin|


