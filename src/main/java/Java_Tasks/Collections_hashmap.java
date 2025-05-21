package Java_Tasks;

import java.util.HashMap;

public class Collections_hashmap {

	public static void main(String[] args) {
		
		Hashmap();

	}

	private static void Hashmap() {
		
		//Country (key)       Population(Value)
		//Key should be unique    & Hashmap or unorder wise  
		/*HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		
		//Insertion
		map.put("India", 120);
		map.put("USA", 30);
		map.put("China", 150);
		
		//Iteration
		for (String name : map.keySet())
		{
			System.out.println(map.get(name));
		}
		
		
		map.put("NewZealand",300);
		System.out.println(map);
		
		
		
		//Get the value
	  //  map.get("India");
      //  System.out.println(map.get("India"));
		
		
		
		
	/*	//Search
		if(map.containsKey("China"))
		{
			System.out.println("Key is present in the map");
		}
		else 
		{
			System.out.println("Key is not present in the map");
		}
	
	   //if we want to only key
		System.out.println(map.get("China"));
		System.out.println(map.get("Indonesia"));
		
		/*
		 
		 Definition:
         A HashMap in Java is a collection that stores data in key-value pairs. 
         Each key is unique, and each key maps to exactly one value.
         And it will print the values unorder wise 

         Purpose:
         The main purpose of using a HashMap is to quickly find, update, 
         or remove a value based on its key. It helps in fast data retrieval.
		 
		 
		 
		 */
		}

}
