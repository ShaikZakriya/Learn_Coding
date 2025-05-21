package Java_Tasks;

import java.util.LinkedList;

public class Collections_linked_list {

	public static void main(String[] args) {
		
		LinkedList<String> Name = new LinkedList<String>();
		
		Name.add("Asif");
		Name.add("Ismail");
		Name.add("Shoaib");
		
		System.out.println(Name);
		
		Name.addFirst("Mustaq");
		System.out.println(Name);
		
		/*Name.addLast("Aman");
		System.out.println(Name);
		
		//if you add a normal name then it will add in the last
		Name.add("Zakriya");
		System.out.println(Name);*/
		
		Name.add(3, "Rohit");
		System.out.println(Name);
		
		//if you enter Name.remove it will remove from the begining 
		Name.remove();
		System.out.println(Name);
		
		Name.remove(1);
		System.out.println(Name);
		

	}

}
