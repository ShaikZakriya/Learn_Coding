package Java_Tasks;

import java.util.HashMap;
import java.util.Scanner;

public class Swap_two_numbers {

	public static void main(String[] args) {
		
		    
		       Count_character();
		     //Swap_two_String();
		     //Percentage_check();
		       
	
	}

	public static void Percentage_check() {
		
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter percentage number: ");
		double percentage = sc.nextDouble();
		
		if(percentage >=80.0)
		{
			System.out.println("TRUE " + percentage +  "% is Passed");
		}
		else
		{
			System.out.print("False " + percentage + "% is Failed");
		}
	
	     sc.close();
	}

	private static void Swap_two_String() {
	
		String x = "Manual";
		String y = "Automation";
		
		System.out.println("Before Swap");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		x = x + y;
		y = x.substring(0, x.length() - y.length());
		
		y.length();
		x = x.substring(y.length());
		
		System.out.println("After Swap");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}

	private static void Count_character() {
		
		String str = "aaabbcccdd";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i =0; i <str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if (map.containsKey(ch)) 
			{
				map.put(ch, map.get(ch) + 1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
	        for (Character key : map.keySet()) 
	        {
	    	 System.out.println(key + ":" + map.get(key) + " ");
	        }
		
	}

}
