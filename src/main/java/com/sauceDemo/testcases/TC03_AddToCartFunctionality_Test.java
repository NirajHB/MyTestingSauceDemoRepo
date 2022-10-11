package com.sauceDemo.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauceDemo.pom.HomePagePom;
import com.sauceDemo.pom.LogInPagePOM;



public class TC03_AddToCartFunctionality_Test extends BaseClass {
	
	@Test
  public  void AddToCartFunctionality() {
	
     
	               
	               //Select product and add to cart
	   System.out.println("*********** ADD TO CART FUNCTIONALITY *********");
	          HomePagePom hp = new HomePagePom(driver);
	                      hp.clickOnBagProduct();
	                      log.info("clicked on bag product add to cart");
	               
	               System.out.println("******** validation ********");
	               String expected = "1";       
	               String actual  =  hp.getCartTextMethod();
	               log.info("No of product added in cart :- "+actual);
	               if (expected.equals(actual)) {
	            	   log.info("Add to cart functionality test case passed");
				} else {
					  log.info("Add to cart functionality test case failed");

				}
	               
	               
	               
	               
	               
	               
	               
 }
}
