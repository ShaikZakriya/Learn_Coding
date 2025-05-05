package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_last_butone_value {

	public static void main(String[] args) {
		
		Dropdown_last_butone_value();

	}

	private static void Dropdown_last_butone_value() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		
		
		
		//locating the dropdown element on the page using Xpath
		WebElement lastbutone = driver.findElement(By.xpath("//select"));
		
		//Creating a select object to interact with dropdown options
		Select sc = new Select(lastbutone);
		
	   //Now Fetching all the options from the dropdown into a list
		List<WebElement> allOptions = sc.getOptions();
	    
	   //Now Getting the last butone value option from the list
		WebElement lastbutone2 =  allOptions.get(allOptions.size()-2);
	    
	    //Selecting the last butone value option using its visible text
		sc.selectByVisibleText(lastbutone2.getText());
	    
	    //Last now i am printing the selected option's text
		System.out.println("Selected Option: " + lastbutone2.getText());
	    
	    //Closing the browser
		driver.quit();
	    
	    
	    
	    
	    
	    
	}

}
