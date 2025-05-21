package Java_Tasks;

public class Final_Keyword {

	public static void main(String[] args) {
	
		
		Final_keyword();

	}

	private static void Final_keyword() {
		
		TestClass obj = new TestClass();  
        obj.Car();                      
        obj.Bike();                      
	
	}
}		
     class TestClass {

     final int a = 10; 
     int b;             

    public void Car() {
        System.out.println("Car inside the method");
    }

    public void Bike() {
        System.out.println("Bike inside the method");
    }
}

   /*
    
    Definition of final:
    The final keyword means that once we assign a value, we cannot change it later

    Purpose of final:
    We use final keyword to make a variable constant, prevent a method from being overridden, or stop a class from being inherited.

    Easy examples to imagine:
    Final variable: Once you give it a value, you can't change it. (Like your birthdate — it never changes.)
    Final method: No one can modify its behavior in child classes.
    Final class: No one can make a subclass (child class) from it.
    
    
    */







