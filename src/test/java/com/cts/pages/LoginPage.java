package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private  By UserName=By.xpath("//input[@name='login']");
	private By Password=By.xpath("//input[@name='password']");
	private By loginLoc=By.xpath("//input[@name='DoLogin']");
	private  By AdminIcon=By.xpath("//img[@src='images/administration-button.gif']");
	private  By logOut=By.xpath("//a[contains(text(),'Logout')]");
	
	
	//scenario 1
	
	public  void enterUserName(WebDriver driver,String username)
	{
		driver.findElement(UserName).sendKeys(username);
	}
     public  void enterPassword(WebDriver driver,String password)
     {
    	 driver.findElement(Password).sendKeys(password);
     }
     public  void clickOnLogin(WebDriver driver)
     {
    	 driver.findElement(loginLoc).click();
     }
     public void ClickOnAdminIcon(WebDriver driver)
     {
    	 driver.findElement(AdminIcon).click();
     }
     public void ClickOnLogOut(WebDriver driver)
     {
    	 driver.findElement(logOut).click();
     }
          
     //scenario 2
     public void enterInvalidUser(WebDriver driver,String username)
     {
    	 driver.findElement(UserName).sendKeys(username);
     }
     public  void enterValidPass(WebDriver driver,String password)
     {
    	 driver.findElement(Password).sendKeys(password);
     }
     
     
     //scenario 3
     public  void enterValidUserName(WebDriver driver,String username)
     {
    	 driver.findElement(UserName).sendKeys(username);
     }
     public void enteInvalidPassword(WebDriver driver,String password)
     {
    	 driver.findElement(Password).sendKeys(password);
     }
     
     
     //scenario 4
     public  void enterInValidUserName(WebDriver driver,String username)
     {
    	 driver.findElement(UserName).sendKeys(username);
     }
     public void enteInvalidPass(WebDriver driver,String password)
     {
    	 driver.findElement(Password).sendKeys(password);
     }
     
     //scenario 5
     public void checkForLogOutuser(WebDriver driver,String username)
     {
    	 driver.findElement(UserName).sendKeys(username);
     }
     public void checkForLogOutpass(WebDriver driver,String password)
     {
    	 driver.findElement(Password).sendKeys(password);
     }
     public void checkForLogOut(WebDriver driver)
     {
    	 driver.findElement(logOut).click();
     }
     
     

}
