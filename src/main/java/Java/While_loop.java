package Java;

public class While_loop {

	public static void main(String[] args) {
		
		//While_loop();
		//Even_numbers();
		//odd_numbers();
		//Multiplication();
		//division();

	
	
	
	/*
	  "We use a while loop when we want to repeat a piece of code, 
	  but we don't know in advance how many times it will run. 
	  The code keeps executing as long as the given condition is true."
	*/
	
	
	}

	private static void  division() {
		
		int num1 = 20;
		int num2 = 4;
		int result = num1 / num2;
		System.out.println(num1 + " divided by " + num2 + " is: " + result);
		
	}

	private static void Multiplication() {
		
		int num1 =5;
		int num2 =10;
		
		int result = num1 * num2;
		
		System.out.println(num1 + " multiplied by " + num2 + " is: " + result);
		
	}

	private static void odd_numbers() {
		
		int i =1;
		while(i<=20)
		{
			System.out.println(i);
			i+=2;
		}
		
		
	}

	private static void Even_numbers() {
		
		int i =2;
		while(i<=20)
		{
			System.out.println(i);
			i+=2;
		}
		
	}

	private static void While_loop() {
		
	 /*     systax
		
		 *while(condition) 
		  {
		      //code
		  }
	 */
		
		
		
		int i =1;
		while(i<=5) 
		{
			System.err.println(i);
			i++;
		}
		
	}

}
