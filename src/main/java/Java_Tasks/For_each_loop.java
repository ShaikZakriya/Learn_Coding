package Java_Tasks;

public class For_each_loop {

	public static void main(String[] args) {
		
		/*A for-each loop is used to iterate through each element of a collection
		(like an array or list) one by one without using an index.
		
		 for(datatype variable : arrayOrCollection) 
		  
		   {
		       Statement to be executed
		   }
		   
		   
		 */

		Numbers1to5();
		
		
	}

	private static void Numbers1to5() {
		
		
		int[] numbers = {1, 2, 3, 4,  5};
		
		for(int num : numbers) 
		{
			System.out.println(num);
		}
		
	}

}
