package com.sauceDemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutYourInformationPom {
    private WebDriver driver;
    
    @FindBy (xpath="//input[@id='first-name']")
    WebElement firstName;
    public void sendFirstName(String firstname) {
    	firstName.sendKeys(firstname);
    }
    
    @FindBy(xpath="//input[@id='last-name']")
    WebElement lastName;
    public void sendLastName(String lastname) {
    lastName.sendKeys(lastname);
    }
    
    @FindBy(xpath="//input[@id='postal-code']")
    WebElement postalCode;
    public void sendPostalCode(String postalcode)
    {
    	postalCode.sendKeys(postalcode);
    }
    
    @FindBy(xpath="//input[@id='continue']")
    WebElement continueButton;
    public void clickOnContinueButtonMethod() {
    continueButton.click();
    }
  
   //Constructor 
    public CheckOutYourInformationPom(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    
    }
    
    
}
