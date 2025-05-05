package Java;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic_operators();
		//Relational_operators();
		//Logical_operator();
		  Multiplication();
         
	}


	private static void Multiplication() {
		
		
	    int num = 2;
	    
	    for(int i=1; i<=10; i++)
	    	
	    {
	    	System.out.println(num + " x " + i + " = " + (num * i));
	    }
	
	
	}
		    
			
			
		

	
	
	private static void Logical_operator() {
	        
		//System.out.println("Logical AND");
		
		/*System.out.println((10>5) && (10>9));
		System.out.println((10>5) && (2>9));
		System.out.println((10>15) && (10>15));*/
		
        //logical operator AND (&&) operator returns true only if both conditions are true 
		//if either one or both conditions are false the result will be false
		
		 
	 /*   System.out.println("Logical OR");
		System.out.println((10>5) || (10>9));
		System.out.println((10>5) || (2<9));
		System.out.println((10>15) || (10>15));*/
		
		//The logical OR operator returns true if at least one of the conditions is ture
		
		System.out.println("Logical NOT");
		
		System.out.println(!(10>5));
		System.out.println(!(10<5));
		System.out.println(!(10<5));
		
		// The !(NOT) operator reverse the result of a condition if the condition is true it returns false, and vice versa. 
		// it's used to say not this condition
		
	}


	private static void Relational_operators() {
		
		int a,b;
		System.out.println("Enter any two numbers");
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("true/false = " + (a<b));
		System.out.println("true/false = " + (a>b));
		System.out.println("true/false = " + (a<=b));
		System.out.println("true/false = " + (a>=b));
		System.out.println("true/false = " + (a==b));
		System.out.println("true/false = " + (a!=b));
		
		
	//Relation operators are used to compare two values and return either true or false 	
		
		
		
	}

	private static void Arithmetic_operators() {
		
		int a,b;
		System.out.println("Enter any two numbers");
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Addition" + (a+b));
		System.out.println("Subtraction" + (a-b));
		System.out.println("Multiplication" + (a*b));
		System.out.println("Division" + (a/b));
		System.out.println("Remainder" + (a%b));
		
  // Arithmetic operators are used to perform basic maths operations like addition subtraction multiplication and division
		
		
	}

}
