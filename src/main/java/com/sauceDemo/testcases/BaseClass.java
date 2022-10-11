package com.sauceDemo.testcases;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.sauceDemo.pom.HomePagePom;
import com.sauceDemo.pom.LogInPagePOM;

public class BaseClass {
	WebDriver driver;
	   Logger log= Logger.getLogger("SauceDemoMavenProject");
	  
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
	     driver= new ChromeDriver();  
		 driver.navigate().to("https://www.saucedemo.com/");
	     driver.manage().window().maximize();
	  //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     LogInPagePOM logInPom = new LogInPagePOM(driver);
	              logInPom.sendUsername();
	              log.info("Enter Username");
	              logInPom.sendPassword();
	              log.info("Enter password");
	              logInPom.clickOnLogInButton();
	              log.info("Clicked on Login Button");
	          
	}
	
	@AfterMethod
	public void tearDown() {
//		HomePagePom homePagePom = new HomePagePom(driver);
//	                homePagePom.clickedMenuButton();
//	                System.out.println("clicked on menu button");
//	               homePagePom.clickedOnLogOutButton();
//	               System.out.println("clicked on logout button");
	               driver.quit();
	}
}
