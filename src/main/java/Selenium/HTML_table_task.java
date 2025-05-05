package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML_table_task {

	public static void main(String[] args) throws InterruptedException {
		
		//HTML_Task();
		  Dynamic_webtable_task();
		

	}

	private static void Dynamic_webtable_task() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		//first of all we should find all rows
	      List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
	      
	      for(int i=1; i<=rows.size(); i++);
	      
	      WebElement companyName = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr[\" + i + \"]/td[1]/a"));
	      
	      String name = companyName.getText();
	      
	      if(name.equalsIgnoreCase("Capital First"))
	    	  
	      {
	    	  System.out.println("Comapany found: " + name);
	    	  
	      }
	      
	      Thread.sleep(5000);
	      driver.quit();
	      	  
		
	}

	private static void HTML_Task() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']//tr[5]//td[3]"));
		
		System.out.println("Value in cell: " + table.getText());
		
		driver.quit();
		
	}

}
