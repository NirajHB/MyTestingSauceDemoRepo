package com.sauceDemo.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauceDemo.pom.HomePagePom;
import com.sauceDemo.pom.LogInPagePOM;



public class TC06_AboutTabFunctionality_Test extends BaseClass {

	@Test
	public void AboutTabFunctionality(){
	 
//Home page ---------------------------------------------------------------------
	               HomePagePom hp = new HomePagePom(driver);
	               hp.clickedMenuButton();
	               hp.clickedOnAboutTab();
	               
	               log.info("clicked on about Tab");
	     
	     
}
}
