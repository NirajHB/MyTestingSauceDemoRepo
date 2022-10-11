package com.sauceDemo.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauceDemo.pom.HomePagePom;
import com.sauceDemo.pom.LogInPagePOM;

public class TC07_SelectMultipleProductAtTime extends BaseClass {

	@Test
	public void SelectMultipleProductAtTime() throws InterruptedException {
	 
	               HomePagePom homePagePom= new HomePagePom(driver);
	               homePagePom.clickedAllElementAtTime();
	               log.info("Multiple products are get selected");
}
}
