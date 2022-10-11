package com.sauceDemo.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauceDemo.pom.HomePagePom;
import com.sauceDemo.pom.LogInPagePOM;

public class TC05_ApplyFilterFun_Test extends BaseClass {
	
	@Test
    public void ApplyFilterFunctionality(){
	//filter function
	          HomePagePom hp =new HomePagePom(driver);
	          hp.selectFilterOptin("Price (high to low)");
	               
	          log.info("filter is Applied for high to lowm priority");     
	               
	               
	               
}
}
