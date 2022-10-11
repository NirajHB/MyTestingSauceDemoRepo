package com.sauceDemo.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauceDemo.pom.CheckOutOverviewPomPage;
import com.sauceDemo.pom.CheckOutYourInformationPom;
import com.sauceDemo.pom.HomePagePom;
import com.sauceDemo.pom.LogInPagePOM;
import com.sauceDemo.pom.YourCartPagePom;



public class TC04_BuyProductFunctionality_Test extends BaseClass {
   
	@Test
	public void BuyProductFunctionality(){
	    //Select product and add to cart from homepage
	   System.out.println("*********** ADD TO CART FUNCTIONALITY *********");
	          HomePagePom hp = new HomePagePom(driver);
	                      hp.clickOnBagProduct();
	                      log.info("clicked on bag product add to cart");
	               
	                     hp.clickOnCartMethod();
	                     log.info("Clicked on cart button");
	                      
 //your cart page
	                      YourCartPagePom ycp =new YourCartPagePom(driver);
	                      ycp.clickOnCheckOutButton();
	                      log.info("Clicked on Checked Out Button");
	                      
//checkout your information page	                      
	                      CheckOutYourInformationPom cip =new CheckOutYourInformationPom(driver);
	                      cip.sendFirstName("Niraj");
	                      log.info("Enter First Name");
	                      cip.sendLastName("Borse");
	                      log.info("Enter Last Name");

	                      cip.sendPostalCode("444002");
	                      log.info("Enter PostalCode");

	                      cip.clickOnContinueButtonMethod();
	                      
	                      log.info("Clicked on continue Button");
	                      
//check out overview page
	                      CheckOutOverviewPomPage cop = new CheckOutOverviewPomPage(driver);
	                      cop.clickedOnFinishButton();
	                      log.info("Clicked on Finish Button");
	         
}
}
