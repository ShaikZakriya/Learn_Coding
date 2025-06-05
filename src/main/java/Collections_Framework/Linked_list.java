package Collections_Framework;

import java.util.Collections;
import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		
		Linked_list();

	}

	private static void Linked_list() {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<String> list2 = new LinkedList<String>();
		
		list.add(50);
		list.add(30);
		list.add(40);
		System.out.println(list);
		
		list2.add("Automation");
		System.out.println(list2.get(0));
		
		list.add(2, 60);
		System.out.println(list);
		
		if(list.contains(40))
		{
			System.out.println(list.get(3));
		}
		else
		{
			System.out.println("fail");
		}
		
		
		/*list.set(0, 100);
		System.out.println(list);
		
		int size = list.size();
		System.out.println(size);
		
		Collections.sort(list);
		System.out.println(list);
		
		list.addFirst(60);
		System.out.println(list);
		
		list.addLast(5);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);*/
		
		
		
		
		
		
	}

}
