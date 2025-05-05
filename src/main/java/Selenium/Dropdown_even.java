package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_even {

	public static void main(String[] args) {
		
		//Print_ODD_text();
		  Even_even_text();

	}

	private static void Even_even_text() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement dropdown = driver.findElement(By.xpath("//select"));
		
		Select sc = new Select(dropdown);
		
		List<WebElement> options = sc.getOptions();
		
		System.out.println("Even indexed options");
		
		for(int i=0; i<options.size(); i++)
              
			if(i% 2 == 0) 
			{
				System.out.println("Index " + i + ": " + options.get(i).getText());
				
			}
	              driver.quit();
	
	    }

		
	

	private static void Print_ODD_text() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement dropdown = driver.findElement(By.xpath("//select"));
		
		Select sc = new Select(dropdown);
		
		List<WebElement> options = sc.getOptions();
		
		System.out.println("Even indexed options");
		
		for(int i=0; i<options.size(); i++)
              
			if(i% 2 == 1) 
			{
				System.out.println("Index " + i + ": " + options.get(i).getText());
				
			}
	
	
	    }

             
}
