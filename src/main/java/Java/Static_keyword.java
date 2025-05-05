package Java;

public class Static_keyword {

	public static void main(String[] args) {
		
		Static_keyword();

	}

     private static void Static_keyword() {
		
		student s1 = new student("Shaik");
		student s2 = new student("Zakriya");
               
		    s1.display();
		    s2.display();
      }
	}


     class student  {
     
    	 static String college = "Masters";
     	
     	String name;
     	
     	student(String name) {
     		
     		
     		this.name=name;
     		
     	}
   
     void display() {
    	 
    	 System.out.println(name + " " + college);
     }
     

   }


       


        //we dont need to create any object for static we can directly access the entire code by class itself

  /* 
 
     Definition:
     The static keyword in Java is used to define members (variables, methods, or inner classes) 
     that belong to the class rather than any specific object.


      Purpose:
      It allows us to access methods or variables without creating an object of the class. 
      It's memory efficient and useful when the behavior or data is shared across all instances.
	
   */


     



	
