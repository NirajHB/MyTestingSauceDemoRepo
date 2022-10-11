package com.sauceDemo.testcases;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauceDemo.pom.LogInPagePOM;
import com.sauceDemo.utilityclasses.ScreenShotClass;



public class TC01_LogInFunctionality_Test extends BaseClass {
           
 @Test	
 public void LoginFunctionality() throws InterruptedException, IOException {
	    
	 String expected = "Swag Labs";
	     String actual= driver.getTitle();
	     
	     if (expected.equals(actual)) {
	    	  log.info("LoginFunctionality test Case  is passed");
		} else {
			  log.info("LoginFunctionality test Case  is Failed");

		}
}
}
