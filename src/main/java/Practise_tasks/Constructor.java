package Practise_tasks;

import Java_Interview.Sort_Array_SortMethod;

public class Constructor {

	public static void main(String[] args) {
		
		Constructor obj = new Constructor();
		obj.Bike();
		Constructor obj1 = new Constructor("Automation", 'C');
		
	}

    public Constructor()
    
    {
    	System.out.println("Constructor");
    }
    public void Bike()
    {
    	System.out.println("Bike");
    }
    
    public Constructor(String n, char c)
    {
    	System.out.println(n + " " + c);
    }
}
