package com.sauceDemo.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauceDemo.pom.HomePagePom;
import com.sauceDemo.pom.LogInPagePOM;


public class TC02_LogOutFunctionality_Test extends BaseClass  {
  
	@Test
	public  void LogOutFuncionality() throws Exception {
	

      HomePagePom homePagePom = new HomePagePom(driver);
                  homePagePom.clickedMenuButton();
                  log.info("Clicked on menu Button");
                  
                  homePagePom.clickedOnLogOutButton();
                  log.info("clicked on logout Button ");
//                 Thread.sleep(4000);
//                 ScreenShotClass.captureScreenShot(driver);
                  System.out.println("***********Validation*************");
                  
                  String expected = "Swag Labs";
                  String actual = driver.getTitle();
                  if (expected.equals(actual)) {
                	  log.info("Log out Fuctionality Test Case is Passed ");
				} else {
					  log.info("Log out Fuctionality Test Case is Failed ");

				}
}
}
