package baseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.PropertyFileReader;

public class CreateDriverObject {

	 public static void main(String[] args) throws Exception {
	        WebDriver driver = launchBrowser();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    }

	    public static WebDriver launchBrowser() throws Exception {
	       
	    	
	    	String url = PropertyFileReader.getKeyValue("url");
	        String browserType = PropertyFileReader.getKeyValue("browser");

	        WebDriver driver = null;

	        if (browserType.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver();
	        } else if (browserType.equalsIgnoreCase("edge")) {
	            driver = new EdgeDriver();
	        } else if (browserType.equalsIgnoreCase("firefox")) {
	            driver = new FirefoxDriver();
	        } else {
	            System.out.println("Please enter only Chrome or Edge or Firefox for browserType");
	        }

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	

	        return driver;
	    }
	}
