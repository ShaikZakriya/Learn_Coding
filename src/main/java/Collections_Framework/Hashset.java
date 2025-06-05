package Collections_Framework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		
		//Hashset();
		  Hashmap();

	}

	private static void Hashmap() {
		
		HashMap <String, Integer> map = new HashMap<String, Integer>();
		
		//insertion
		map.put("India", 140);
		map.put("China", 80);
		map.put("US", 90);
		System.out.println(map);
		
		//ReInsert
		
		map.put("China", 125);
		System.out.println(map);
		
		//search
		if(map.containsKey("China"))
		
		{
			System.out.println("Present in the map");
		}
		else
		{
			System.out.println("Not Present in the map");
		}
		System.out.println(map.get("India"));
		System.out.println(map.get("UAE"));
		
		//enchance for loop
		  String arr[] = {"Zakriya", "Aman", "Mustaq"};
		  for(String val : arr) 
		  {
			  System.out.println(val);
		  }
		  
		
		
	}

	private static void Hashset() {
		
		//Hashset contains only unique values & print in unorder wise
		HashSet<Integer> set = new HashSet<Integer>();
		
	  //insetion the data
		set.add(20);
		set.add(10);
		set.add(5);
		set.add(20);
		System.out.println(set);
		
		if(set.contains(20))
		{
			System.out.println("Set contains 20");
		}
		
		set.remove(20);
		System.out.println(set);
		
		set.add(1);
		System.out.println(set);
		
	    int a = set.size();
	    System.out.println(a);
	    
	    set.clear();
	    System.out.println(set);
	    
	    
	    System.out.println(set.isEmpty());
	    
	    
		
		
	}

}
