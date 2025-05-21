package Java_Tasks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_executor {

	public static void main(String[] args) throws InterruptedException {
		
		Javascript_executor();

	}

	private static void Javascript_executor() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		js.executeAsyncScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='product']//tr/td[4]"));
		int sum =0;
		
		for(int i=0; i<=list.size(); i++)
		{
			sum = sum + Integer.parseInt(list.get(i).getText());
			System.out.println(sum);
		}
		
		
		
		
		
	}

	
}
