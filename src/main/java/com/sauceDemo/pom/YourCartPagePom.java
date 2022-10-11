package com.sauceDemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPagePom {

	     private WebDriver driver;
	     
	     @FindBy(xpath="//button[@id='checkout']")
	     WebElement checkOutButton;
	     public void clickOnCheckOutButton() {
	    	 checkOutButton.click();
	     }
	     
	     
	     //Constructor
	     public YourCartPagePom(WebDriver driver) {
	    	 this.driver= driver;
	    	 PageFactory.initElements(driver,this);
	     }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
}
