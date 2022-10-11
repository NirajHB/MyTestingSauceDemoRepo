package com.sauceDemo.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePom {
   
private WebDriver driver;
	 private Select select;
//menu button
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement menuButton;
	public void clickedMenuButton() {
	   menuButton.click();
	}
	
//LogOut button
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logOutButton;
     public void clickedOnLogOutButton() {
	   logOutButton.click();
	}

     
 	
//Bag product
 		@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
 		WebElement bagproduct;
 		
 		public void clickOnBagProduct() {
 			
 			bagproduct.click();
 		}     
     
//cart element 
 		@FindBy(xpath="//a[@class='shopping_cart_link']")
        WebElement cart;
 		 //cart element get text method
 		public String getCartTextMethod()
 		{
 		return cart.getText();
 			
 		}
//click on cart element
 		public void clickOnCartMethod() {
 			cart.click();
 		}
     
//filter element 
 		@FindBy(xpath="//select[@class='product_sort_container']")
 		WebElement fliter;
 		public void selectFilterOptin(String option)
 		{
 			fliter.click();
 			select.selectByVisibleText(option);
 		}
 		
 //about tab
 		@FindBy(xpath="//a[@id='about_sidebar_link']")
 		WebElement about;
 		public void clickedOnAboutTab() {
 			about.click();
 		}
 //select  multiple element at a time
 		@FindBy(xpath="//button[text()='Add to cart']")
 		  List<WebElement> addToCart;
 		public void clickedAllElementAtTime() {
 			for(WebElement e:addToCart) {
 				e.click();
 			}
 			
 		}
// 	@FindBy(xpath="")
// 	private List<WebElement> allproducts;
// 	public String getTextAllProducts() {
// 		for(WebElement j:allproducts) {
// 		String Text=j.getText();
// 		
// 		}return Text;
// 	}
 	
 	
 	
//constructor	
	public HomePagePom(WebDriver driver) {
	   this.driver = driver;
	  PageFactory.initElements(driver, this);
	  select = new Select(fliter);
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
