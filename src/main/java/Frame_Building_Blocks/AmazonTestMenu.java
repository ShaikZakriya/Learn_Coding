package Frame_Building_Blocks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonTestMenu {

	public class ClickOnElemenetUsingDataProviderAnnotation {

		@Test(dataProvider="signInMenuTexts")
		public static void checkSignInXpaths(String text) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 WebElement signIn = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav-link-accountList']"));
			 Actions ac = new Actions(driver);
			 ac.moveToElement(signIn).build().perform();
			 Thread.sleep(3000);
			 WebElement target = driver.findElement(By.xpath("//div[@id='nav-al-container']//span[text()='"+text+"']"));
			 target.click();
			 Thread.sleep(3000);
			 driver.quit();
			 
		}
		@DataProvider(name="signInMenuTexts")
		public static Object[][] signInMenuTexts(){
			
			
			
			String[][]data = {
					{"Sign in"},
					{"New customer? Start here."},
					{"Your Lists"},
					{"Create a Wish List"},
					{"Wish from Any Website"},
					
					{"Baby Wishlist"},
					{"Discover Your Style"},
					{"Explore Showroom"},
					{"Your Account"},
					{"Your Account"},
					
					{"Your Orders"},
					{"Your Wish List"},
					{"Your Recommendations"},
					{"Your Prime Membership"},
					{"Your Prime Video"},
					
					{"Your Subscribe & Save Items"},
					{"Memberships & Subscriptions"},
					{"Your Seller Account"},
					{"Manage Your Content and Devices"},
					{"Register for a free Business Account"},
					
					
			};
			
			return data;
			
			
			
			
		}
		
	}	
}
		
/*
 Sign in
New customer? Start here.
Your Lists
Create a Wish List
Wish from Any Website

Baby Wishlist
Discover Your Style
Explore Showroom
Your Account
Your Account

Your Orders
Your Wish List
Your Recommendations
Your Prime Membership
Your Prime Video

Your Subscribe & Save Items
Memberships & Subscriptions
Your Seller Account
Manage Your Content and Devices
Register for a free Business Account

 
*/
		
		
		
		
		
		
		
		
		
		
		
		
	    
	