package com.sauceDemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverviewPomPage {
  private WebDriver driver ;
  
  
  @FindBy(xpath="//button[@id='finish']")
  WebElement finishButton;
  public void clickedOnFinishButton() {
	  finishButton.click();
  }
  
  
  
  
  
  
  
  
  //Constructor
  public CheckOutOverviewPomPage(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  
  
  
  
  
  
  
  
  
  
}
