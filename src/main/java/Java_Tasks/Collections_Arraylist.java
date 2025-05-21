package Java_Tasks;

import java.util.ArrayList;

public class Collections_Arraylist {

	public static void main(String[] args) {
		
		Arraylist();

	}

	private static void Arraylist() {
		
		ArrayList<String> Name = new ArrayList<String>();
		
		Name.add("Mustaq");
		Name.add("Zakriya");
		Name.add("Aman");
		
		System.out.println(Name);
		
		Name.add("Imran");
		System.out.println(Name);
		
		Name.add(1, "Ismail");
		System.out.println(Name);
		
		Name.add(0, "Asif");
		System.out.println(Name);
		
		Name.remove(0);
		System.out.println(Name);
		
	    //if you want to replace the name 
		Name.set(2, "Mateen");
		System.out.println(Name);
		
		//if i want to print only one value 
		System.out.println(Name.get(1));
		
		//if you want to delete entire elements 
		Name.clear();
		System.out.println(Name);
		
		
		//System.out.println(Name.get(0) + "\n" + Name.get(1) + "\n" + Name.get(2));
		
	}

}

    /*Definition:
    An ArrayList is a special type of list in Java that can grow or shrink automatically as you add or remove items. 
    It is like an array, but more flexible.

    Purpose:
    The purpose of an ArrayList is to store a collection of elements (like numbers or names) and allow easy addition, removal, 
    and searching of those elements without worrying about size limits.*/






