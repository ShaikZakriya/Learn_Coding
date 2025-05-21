package Java_Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Tasks {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		    WebElement web = driver.findElement(By.xpath("//span[@class='fa fa-google-plus-square']"));

	       
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", web);
	        Thread.sleep(1000);  
	        js.executeScript("arguments[0].click();", web);

	        System.out.println("Element scrolled into view and clicked successfully.");

	        driver.quit();
	    }
	

	}

