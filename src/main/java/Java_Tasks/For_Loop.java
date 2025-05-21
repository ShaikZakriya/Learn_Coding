package Java_Tasks;

public class For_Loop {

	public static void main(String[] args) {
		
		//For_loop();
		 //reverse_loop();
		//Even_numbers();
		 //odd_numbers();
		 // Arrays();
		

		
	/*
	  "Whenever we want to repeat a certain piece of code a specific number of times, 
	   then we use a for loop, as we already know how many times the code needs to be executed."	
	*/
		
		
		
		
	}

	private static void Arrays() {
		
		int[] numbers = {2, 4, 6, 8, 10,};
		
		for(int i=0; i<=numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		
	}

	private static void odd_numbers() {
		
		for(int i = 1; i <=20; i+= 2)
		{
			System.out.println(i);
		}
		
	}

	private static void Even_numbers() {
		
		for(int i = 2; i <=20; i+= 2)
		{
			System.out.println(i);
		}
		
	}

	private static void reverse_loop() {
		
		for (int i=5; i<=1; i--)
		{
			System.out.println(i);
		}
		
	}

	private static void For_loop() {
		
		for (int i=1; i<=5; i++)
		{
			System.out.println(i);
		}
		
	}

}
