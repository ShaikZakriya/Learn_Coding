package Collections_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List {

	public static void main(String[] args) {
		
		
		Array_list();
		

	}

	private static void Array_list() {
		
		ArrayList <Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(9);
		
		System.out.println(list);
		
		
		
		
		
		// To get a particular element
		System.out.println(list.get(1));
		System.out.println("--------------------");
		
		//gett all the elements 
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("--------------------");
		
		//Check if the elemetn is present or not
		if(list.contains(9))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	
	  //add in the middle of the elements
		list.add(0, 5);
	    System.out.println(list);
	    System.out.println("--------------------");
		
	   //replace a element 
	    list.set(0, 25);
	    System.out.println(list);
	    System.out.println("--------------------");
	    
	   // delete
	    list.remove(3);
	    System.out.println(list);
	    System.out.println("--------------------");
	
	    //Get size
	    int size =  list.size();
	    System.out.println(size);
	    System.out.println("--------------------");
	    
	  //sortings
	    Collections.sort(list);
	    System.out.println(list);
	
	}

}

/*
 
  The Collection Framework is a unified architecture for storing, manipulating, and retrieving groups of objects. 
  It provides a set of interfaces, classes, and algorithms that help developers manage data efficiently. 
  These collections can represent data as lists, sets, queues, or maps, and offer various operations 
  like searching, sorting, insertion, deletion, and iteration.

*/
