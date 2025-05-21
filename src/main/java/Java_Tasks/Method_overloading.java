package Java_Tasks;

public class Method_overloading {
       
    	 public static void main(String[] args) {
		
    	
        Method_overloading obj = new Method_overloading();
    	obj.addition(45, 50);
        obj.addition("Shaik", "Zakriya");
    	obj.addtion(75, "Coding");	
        obj.additon(99);
        obj.addition(99, "Automation", 'Z');
        
    		 
	}


     
     public static void addition(int a, int b) {
 	
 		int sum =a+b;
 		System.out.println(sum);
 	}
     
 	public static void addition(String FirstName,String LastName) {
 		
 		System.out.println(FirstName+" "+LastName);
 		
 	}
 	
 	public static void addtion(int age, String Name) {
 		
 		System.out.println(age+" " + Name);
 	}
     
 	public static void additon(int a) {
 	
 		int sum = a;
 		System.out.println(sum);
 	}
      
 	public static void addition(int age, String Name, char gender) {
 		
 		System.out.println(age +" "+ Name+" "+ gender);
 		
 		
 	}
 }

     /*
       Definition:
       Method overloading in java means creating more than one method with the same name in the same class
       but with different parameters like different types, number, or order of inputs.
       
       Purpose:
       The main reason for method overloading is to make the code easier to read and understand.
       it helps us use the same method name for different kinds of input.
     */
     
     
     