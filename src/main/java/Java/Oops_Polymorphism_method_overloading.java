package Java;

public class Oops_Polymorphism_method_overloading {
       
    	 public static void main(String[] args) {
		
    	
     Oops_Polymorphism_method_overloading obj = new Oops_Polymorphism_method_overloading();
    	obj.addition(25, 50);
        obj.addition("Shaik", "Zakriya");
    	obj.addtion(75, "Coding");	
        obj.additon(99);
        obj.addition(99, "Automation", 'Z');
        //obj.addition(99, "Automation", 'Z');
    		    
    		 
	}


     
     public static void addition(int a, int b) {
 		System.out.println("First Method");
 		int sum =a+b;
 		System.out.println(sum);
 	}
     
 	public static void addition(String FirstName,String LastName) {
 		System.out.println("Second Method");
 		System.out.println(FirstName);
 		System.out.println(LastName);
 	}
 	
 	public static void addtion(int age, String Name) {
 		System.out.println("Third Method");
 		System.out.println(Name);
 		System.out.println(age);
 		
 	}
     
 	public static void additon(int a) {
 		System.out.println("Fourth Method");
 		int sum = a;
 		System.out.println(sum);
 	}
      
 	public static void addition(int age, String Name, char gender) {
 		System.out.println("Fifth Method");
 		System.out.println(age);
 		System.out.println(Name);
 		System.out.println(gender);
 		
 		
 	}
 }

     /*
       Definition:
       Method overloading in Java means creating multiple methods in the same class 
       with the same name but with different parameters (different type, number, or order of parameters).

      Purpose:
      The purpose of method overloading is to increase the readability of the program. 
      It allows us to perform similar tasks with the same method name but with different inputs.
     
     */
     
     
     