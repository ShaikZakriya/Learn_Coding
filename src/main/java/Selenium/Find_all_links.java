package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_all_links {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		try 
		{
			Thread.sleep(5000);
	    }
		
	    catch(InterruptedException e) 
		{
		  e.printStackTrace();
		}
		
		
		/*List<WebElement> link = driver.findElements(By.xpath("//div[@class='_95ke _8opy']//a"));
		
		
		System.out.println(link.size());
		Thread.sleep(3000);
		
		driver.quit();*/
		
	}

}      


