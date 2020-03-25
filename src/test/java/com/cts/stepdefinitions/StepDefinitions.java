package com.cts.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cts.pages.HomePage;
import com.cts.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	WebDriver driver;
	HomePage homePageObject = new HomePage();
	LoginPage loginPageObject = new LoginPage();

	// scenario 1
	@Given("I have browser with task management page")
	public void i_have_browser_with_task_management_page() {

		// LaunchWebsite.launchWeb(driver);
		// Write code here that turns the phrase above into concrete actions

		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://examples.codecharge.com/TaskManager/Default.php");

	}

	@When("I click on Administration Icon and I enter username as {string} and  I enter password as {string}")
	public void i_click_on_Administration_Icon_and_I_enter_username_as_and_I_enter_password_as(String username,
			String password) {
		// Write code here that turns the phrase above into concrete actions
		homePageObject.clickOnMyAccountIcon(driver);
		loginPageObject.enterUserName(driver, username);
		loginPageObject.enterPassword(driver, password);
		loginPageObject.clickOnLogin(driver);

	}

	@Then("I should access to the portal and check the presence of AddTask and TaskList")
	public void i_should_access_to_the_portal_and_check_the_presence_of_AddTask_and_TaskList() {
		// Write code here that turns the phrase above into concrete actions
		// To check presence of Add task and TaskList
		WebElement actualTitle = driver.findElement(By.xpath("//img[@src='images/add-task-button.gif']"));
		actualTitle.click();
		WebElement actualTitle1 = driver.findElement(By.xpath("//img[@src='images/task-list-button.gif']"));
		actualTitle1.click();
		loginPageObject.ClickOnAdminIcon(driver);
		loginPageObject.ClickOnLogOut(driver);

	}

	// scenario 2
	@Given("I have browser with task management page1")
	public void i_have_browser_with_task_management_page1() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://examples.codecharge.com/TaskManager/Default.php");
	}

	@When("I click on Administration Icon and I enter invalid username as {string} and I enter valid password as {string}")
	public void i_click_on_Administration_Icon_and_I_enter_invalid_username_as_and_I_enter_valid_password_as(
			String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		homePageObject.clickOnMyAccountIcon(driver);
		loginPageObject.enterInvalidUser(driver, username);
		loginPageObject.enterValidPass(driver, password);
		loginPageObject.clickOnLogin(driver);

	}

	@Then("It should display an error message1")
	public void it_should_display_an_error_message1() {
		// Write code here that turns the phrase above into concrete actions
		String actualText = driver.findElement(By.xpath("//td[contains(text(),'Login or Password is incorrect.')]"))
				.getText();
		String expectedText = ("Login or Password is incorrect.");
		Assert.assertEquals(expectedText, actualText);
		System.out.println(actualText);

		driver.quit();
	}

	// scenario 3
	@Given("I have browser with task management page2")
	public void i_have_browser_with_task_management_page2() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://examples.codecharge.com/TaskManager/Default.php");
	}

	@When("I click on Administration Icon and I enter valid username as {string} and I enter invalid password as {string}")
	public void i_click_on_Administration_Icon_and_I_enter_valid_username_as_and_I_enter_invalid_password_as(
			String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		homePageObject.clickOnMyAccountIcon(driver);
		loginPageObject.enterValidUserName(driver, username);
		loginPageObject.enteInvalidPassword(driver, password);
		loginPageObject.clickOnLogin(driver);

	}

	@Then("It should display an error message2")
	public void it_should_display_an_error_message2() {
		// Write code here that turns the phrase above into concrete actions
		String actualText = driver.findElement(By.xpath("//td[contains(text(),'Login or Password is incorrect.')]"))
				.getText();
		String expectedText = ("Login or Password is incorrect.");
		Assert.assertEquals(expectedText, actualText);
		System.out.println(actualText);

		driver.quit();
	}

	// scenario 4
	@Given("I have browser with task management page3")
	public void i_have_browser_with_task_management_page3() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://examples.codecharge.com/TaskManager/Default.php");
	}

	@When("I click on Administration Icon and I enter invalid username as {string} and I enter invalid password as {string}")
	public void i_click_on_Administration_Icon_and_I_enter_invalid_username_as_and_I_enter_invalid_password_as(
			String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		homePageObject.clickOnMyAccountIcon(driver);
		loginPageObject.enterInValidUserName(driver, username);
		loginPageObject.enteInvalidPass(driver, password);
		loginPageObject.clickOnLogin(driver);
	}

	@Then("It should display an error message3")
	public void it_should_display_an_error_message3() {
		// Write code here that turns the phrase above into concrete actions
		String actualText = driver.findElement(By.xpath("//td[contains(text(),'Login or Password is incorrect.')]"))
				.getText();
		String expectedText = ("Login or Password is incorrect.");
		Assert.assertEquals(expectedText, actualText);
		System.out.println(actualText);

		driver.quit();

	}
	
     //scenario 5
	@Given("I have browser with the task management page")
	public void i_have_browser_with_the_task_management_page() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://examples.codecharge.com/TaskManager/Default.php");
	}

	@When("I click on the Administration Icon and I enter valid username as {string} and I enter valid password as {string}")
	public void i_click_on_the_Administration_Icon_and_I_enter_valid_username_as_and_I_enter_valid_password_as(
			String username, String password) {
		homePageObject.clickOnMyAccountIcon(driver);
		loginPageObject.checkForLogOutuser(driver, username);
		loginPageObject.checkForLogOutpass(driver, password);
		loginPageObject.clickOnLogin(driver);

	}

	@Then("I should display the page and click on LogOut")
	public void i_should_display_the_page_and_click_on_LogOut() {
		loginPageObject.checkForLogOut(driver);
		driver.quit();

	}

}
