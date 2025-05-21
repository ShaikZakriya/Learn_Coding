package Java_Tasks;

public class Oops_Method_Overriding_Parent {

	public static void main(String[] args) {
		
		Oops_Method_Overriding_Parent obj = new Oops_Method_Overriding_Parent();
		obj.addition("Automation");
		obj.addition(50, 200);
	}	
		
	        public static void addition(int a, int b) {
	    	 System.out.println("This is Parent Class");
	    	 int sum = a+b;
	    	 System.out.println(sum);
	    	 
	 }

	        public static void addition(String x)
	        
	        {
	    	   System.out.println(x);
	        }
    
            

}


    



















/*
      
      Method Overriding means writing the same method again in the child class which already exists in the parent class,
      using the same name and same parameters.it is used to change the behavior of the parent class method
      
   */