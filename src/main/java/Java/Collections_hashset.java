package Java;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Collections_hashset {

	public static void main(String[] args) {
		
		Hashset();

	}

	private static void Hashset() {
		
		HashSet<Integer>  set = new HashSet<Integer>();
		
		//Insert
		set.add(1);
		set.add(2);
		set.add(3);
	    set.add(1);
	    
	    //Print all elements
      // System.out.println(set);
       
       //Search
	    
	 /*   if(set.contains(1))
	    {
	    	System.out.println("set contains 1");
	    }
	    
       if(!set.contains(6))
       {
    	   System.out.println("does not contains");
       }
	
	
	//Delete
       set.remove(1);
       {
    	   if(!set.contains(1))
    	   {
    		   System.out.println("Does not contain 1 - we delete");
    	   }
       }*/
	
	//size
       
       System.out.println("size of set is : " + set.size());
	
       
	}
}

   /*Definition:
   A Set in Java is a collection that cannot contain duplicate elements. 
   It is used to store unique values only.

   Purpose:
   The main purpose of using a Set is to make sure that no duplicate values are stored 
   and to quickly check if an element is present or not.*/






