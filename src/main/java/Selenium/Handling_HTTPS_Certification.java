package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_HTTPS_Certification {

	public static void main(String[] args) {
		
		Handling_Certification();

	}

	private static void Handling_Certification() {
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://expired.badssl.com/");
	    
	    System.out.println(driver.getTitle());
	    driver.quit();
	    
		
	}

}
