package Java;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Collections_hashset {

	public static void main(String[] args) {
		
		Hashset();

	}

	private static void Hashset() {
		
		HashSet<String>  set = new HashSet<String>();
		
		//insert an element
		set.add("Banana");
		set.add("Apple");
		set.add("Carrot");
		set.add("Apple");
		System.out.println(set);
		
	/*	//Remove Element
		set.remove("Apple");
		System.out.println(set);
		
		//Check if the element is exists
		
		if(set.contains("Carrot"))
		{
			System.out.println(set.contains("Carrot"));
		}
		
		//Size of Hashset
		set.size();
		System.out.println(set.size());*/
		
		//iterate through Elements
		
		for(String fruit :set) 
		{
			System.out.println(fruit);
		}
		
		
		//Clear the set
		set.clear();
		System.out.println(set);
		
	}
}

   /*Definition:
   A Set in Java is a collection that cannot contain duplicate elements. 
   It is used to store unique values only.
   HashSet will not print orderwise, it is unpredictable 

   Purpose:
   The main purpose of using a Set is to make sure that no duplicate values are stored 
   and to quickly check if an element is present or not.*/






