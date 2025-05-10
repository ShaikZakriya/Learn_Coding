package Frame_Building_Blocks;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ArrayList_concept {

	public static void main(String[] args) {
		
	      Print_values_from_ddl();   
		 // Compare_two_arraylist();
		
     }

	private static void Print_values_from_ddl() {
		
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	       
	        ArrayList<String> list = new ArrayList<>();
	        list.add("January");
	        list.add("February");
	        list.add("March");
	        list.add("April");
	        list.add("May");
	        list.add("April");
	        list.add("July");
	        list.add("August");
	        list.add("September");
	        list.add("October");
	        list.add("November");
	        list.add("December");

	        driver.get("https://demo.automationtesting.in/Register.html");
	        WebElement ddl = driver.findElement(By.xpath("//select[@placeholder='Month']"));
	        Select sc = new Select(ddl);
	        List<WebElement> options = sc.getOptions();

	        for (int i = 1; i < options.size(); i++) 
	        {
	            String alloptions = options.get(i).getText().trim();
	            String dropdownlist = list.get(i-1).trim();
	            
	            if (dropdownlist.equalsIgnoreCase(alloptions))
	            {
	                System.out.println("Text case pass: " + alloptions);
	            } 
	            else 
	            {
	                System.out.println("Text case fail: " + alloptions + " = " + dropdownlist);
	            }
	        }
	             
	              driver.quit();
	 
		
	}

	private static void Compare_two_arraylist() {
		
		 ArrayList<String> list1 = new ArrayList<>();
	        list1.add("Autonation");
	        list1.add("Imran");
	        list1.add("Mustaq");
	        list1.add("Aman");
	        list1.add("Zakriya");
	        
	        ArrayList<String> list2 = new ArrayList<>();
	        list2.add("Automation");
	        list2.add("Apple");
	        list2.add("Carrot");
	        list2.add("Aman");
	        list2.add("Mustaq");
	        
		   
			  if(list1.contains(list2))
			  {
				  System.out.println("Yes");
			  }
			
			  else
			  {
				  System.out.println("No");
			  }
		

		
	}
}

           
