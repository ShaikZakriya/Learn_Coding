package Java;

import java.util.Scanner;

public class Do_While_loop {

	public static void main(String[] args) {
		
		//Even_Numbers();
		//Division_of_two_numbers();
		//Multiplication();
          Subtraction();
          
          
          /* A do-while loop is used when we want to execute a piece of code at least once,
		   and then keep repeating it as long as a certain condition remains true."
		
		 do {
		       //Statements to be executed
		       
		     } while(condition);
		 */
          
          
          
    }

	private static void Subtraction() {
		
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter first number: ");
	        int num1 = sc.nextInt();
	        
	        System.out.print("Enter second number: ");
	        int num2 = sc.nextInt();
	        
	        int result = num1 - num2;
	        System.out.println("Result of subtraction is: " + result);
	        
	        sc.close();
		
	}

	private static void Multiplication() {
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        int result = num1 * num2;
        System.out.println("Result of multiplication is: " + result);
        
        sc.close();
		
	}

	private static void Division_of_two_numbers() {
		
		  Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter first number: ");
	        int num1 = sc.nextInt();
	        
	        System.out.print("Enter second number: ");
	        int num2 = sc.nextInt();
	        
	        if (num2 != 0) {
	            int result = num1 / num2;
	            System.out.println("Result of division is: " + result);
	        } else {
	            System.out.println("Cannot divide by zero.");
	        }
	        
	        sc.close();
	    }
	


	private static void Even_Numbers() {
	
	
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("Enter a number: ");
	      
	      int num = sc.nextInt();
	      
	      if(num % 2 ==0)
	      {
	    	  System.out.println(num + " is Even.");
	      }
	
	      else 
	      {
	    	  System.out.println(num + " is Odd. ");
	      }
	
 	             sc.close();
	
	
	}

}
