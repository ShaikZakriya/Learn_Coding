package Frame_Building_Blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Constructor {

	public static void main(String[] args) throws InterruptedException {
		
		Constructor obj = new Constructor();
	    obj.car();
	    obj.Bike();
	   
	
	}

	
		
	public void car()
		
		{
			System.out.println("car");
		}
	


        public void Bike()
       
        {
	       System.out.println("Bike");
        }
        
    
        public void Thar()

       {
         System.out.println("Thar");
       }


        public Constructor()
        
        {
        	System.out.println("Constructor");
        }

}



