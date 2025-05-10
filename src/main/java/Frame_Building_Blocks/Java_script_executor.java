package Frame_Building_Blocks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_script_executor {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		    WebElement Element = driver.findElement(By.xpath("//span[@class='fa fa-google-plus-square']"));

	       
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", Element);  
	        Thread.sleep(3000);
	        js.executeScript("arguments[0].click();", Element);

	        System.out.println("Element clicked successfully.");

	        driver.quit();

	}

}
