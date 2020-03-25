$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/feature/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "     In order to login in Task management\n     I want to get access to the portal",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "ValidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have browser with task management page",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on Administration Icon and I enter username as \u0027admin\u0027 and  I enter password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I should access to the portal and check the presence of AddTask and TaskList",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "admin"
      ]
    }
  ]
});
formatter.scenario({
  "name": "ValidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have browser with task management page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_have_browser_with_task_management_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Administration Icon and I enter username as \u0027admin\u0027 and  I enter password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_click_on_Administration_Icon_and_I_enter_username_as_and_I_enter_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should access to the portal and check the presence of AddTask and TaskList",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_should_access_to_the_portal_and_check_the_presence_of_AddTask_and_TaskList()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "InvalidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have browser with task management page1",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on Administration Icon and I enter invalid username as \u0027abc\u0027 and I enter valid password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "It should display an error message1",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "abc",
        "admin"
      ]
    }
  ]
});
formatter.scenario({
  "name": "InvalidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have browser with task management page1",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_have_browser_with_task_management_page1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Administration Icon and I enter invalid username as \u0027abc\u0027 and I enter valid password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_click_on_Administration_Icon_and_I_enter_invalid_username_as_and_I_enter_valid_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display an error message1",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.it_should_display_an_error_message1()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "InvalidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have browser with task management page2",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on Administration Icon and I enter valid username as \u0027admin\u0027 and I enter invalid password as \u0027abcxyz\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "It should display an error message2",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "abcxyz"
      ]
    }
  ]
});
formatter.scenario({
  "name": "InvalidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have browser with task management page2",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_have_browser_with_task_management_page2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Administration Icon and I enter valid username as \u0027admin\u0027 and I enter invalid password as \u0027abcxyz\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_click_on_Administration_Icon_and_I_enter_valid_username_as_and_I_enter_invalid_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display an error message2",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.it_should_display_an_error_message2()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "InvalidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have browser with task management page3",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on Administration Icon and I enter invalid username as \u0027abc\u0027 and I enter invalid password as \u0027xyz\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "It should display an error message3",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "abc",
        "xyz"
      ]
    }
  ]
});
formatter.scenario({
  "name": "InvalidCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have browser with task management page3",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_have_browser_with_task_management_page3()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Administration Icon and I enter invalid username as \u0027abc\u0027 and I enter invalid password as \u0027xyz\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_click_on_Administration_Icon_and_I_enter_invalid_username_as_and_I_enter_invalid_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display an error message3",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.it_should_display_an_error_message3()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To check whether the logOut is working",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have browser with the task management page",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on the Administration Icon and I enter valid username as \u0027admin\u0027 and I enter valid password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I should display the page and click on LogOut",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "admin"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To check whether the logOut is working",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have browser with the task management page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_have_browser_with_the_task_management_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Administration Icon and I enter valid username as \u0027admin\u0027 and I enter valid password as \u0027admin\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_click_on_the_Administration_Icon_and_I_enter_valid_username_as_and_I_enter_valid_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should display the page and click on LogOut",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinitions.i_should_display_the_page_and_click_on_LogOut()"
});
formatter.result({
  "status": "passed"
});
});