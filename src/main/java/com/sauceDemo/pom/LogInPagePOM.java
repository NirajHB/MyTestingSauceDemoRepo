package com.sauceDemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPagePOM {
    // Webdriver Declaire
	WebDriver driver;
	
	
	//find username webElement and pass the value
	@FindBy(xpath="//input[@id='user-name']")
	   WebElement username;
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}

	////find password webElement and pass the value
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	public void sendPassword() {	
	password.sendKeys("secret_sauce");
	}
	
   //find login button and click on Login button
    @FindBy(xpath = "//input[@id='login-button']")
     WebElement logInButton;
    public void clickOnLogInButton() {  
        logInButton.click();
        }
	
	
	//create constructor 
    public LogInPagePOM(WebDriver driver) {
    	
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
	
	
	
}
