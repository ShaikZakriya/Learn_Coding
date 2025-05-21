package Java_Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finalize_keyword {

	public static void main(String[] args) {
		
        
		Finalize_keyword();
		
	}

	private static void Finalize_keyword() {
		
		        class MyClass {
		        @Override
		        protected void finalize() throws Throwable {
		            System.out.println("Finalize method called");
		        }
		    }

		         MyClass obj = new MyClass();
		        obj = null; // Object ko null kar diya

		        System.gc(); // Garbage collector ko request ki

		        // Thoda time wait karte hain taake garbage collection ho sake
		        try {
		            Thread.sleep(1000); // 1 second ka delay
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        System.out.println("Main method ends");
		    }
	
}    

      /*
       
       Definition of finalize:
       finalize is a method in Java that is called just before an object is destroyed by the garbage collector.

       Purpose of finalize:
       We use finalize to perform cleanup — like closing files, releasing resources, 
       or doing last tasks before the object is deleted from memory.

       Simple way to think:
       Before throwing an old object away, Java gives it one last chance to clean up using finalize().
       
       */





