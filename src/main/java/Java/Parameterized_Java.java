package Java;

public class Parameterized_Java {

	public static void main(String[] args) {
		
		Parameterized();

	}

	private static void Parameterized() {
		
	     Student s1 = new Student("Coding", 25);
	     s1.display();
	}
	
}



       class Student 
     {
	   
       String name;
	   int age;
	
     //parameterized constructor
     Student (String n, int a)
     {
	   name = n;
	   age = a;
     }

     void display() 
    {
	  System.out.println("Name: " + name);
	  System.out.println("Age: " + age);
    }

     
 }

