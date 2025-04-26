package Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finalize_keyword {

	public static void main(String[] args) {
		
        
		Finalize_keyword();
		
	}

	private static void Finalize_keyword() {
		
		class BrowserHandler {
		    WebDriver driver;

		    BrowserHandler() {
		        System.out.println("Opening browser...");
		        driver = new ChromeDriver();  // Browser open ho raha hai
		    }

		    // finalize method to close browser
		    @Override
		    protected void finalize() throws Throwable {
		        if (driver != null) {
		            System.out.println("Closing browser from finalize...");
		            driver.quit();  // Browser band ho jayega
		        }
		    }
		}

		       class MainTest {
		    public static void main(String[] args) {
		        BrowserHandler bh = new BrowserHandler();  // Browser open

		        // Kaam ho gaya but bh object ko null kar diya
		        bh = null;

		        // Garbage Collector ko request
		        System.gc();

		        System.out.println("Test complete.");
		    }
		}
		
	}		
		
}

	
  /*  
   * finalize() ek method hai jo object destroy hone se pehle call hoti hai.

     Real-time mein iska use cleanup ke liye hota hai (jaise browser close karna, file close karna).

     Aajkal production code mein finalize pe jyada depend nahi karte.

     Garbage Collector finalize method ko kab call karega, ye Java decide karta hai (hum nahi).

     Modern solutions: try-with-resources, AutoCloseable interface.
   */




    /*The main purpose of finalize method is to release the resource that is allocated by un-used object,
      before removing un-used object by garbage collector

      jo b unused object hai so jis b resouce ko allocate karke rakha hai us resource ko de-allocate karne ka kaam karte hai
    */     