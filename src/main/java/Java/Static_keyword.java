package Java;

public class Static_keyword {

	public static void main(String[] args) {
		
		Static_keyword();

	}
	

	class car 
	{
		static int Wheels = 4;
		
		static void displaywheels()
		{
			System.out.println("wheels: " + Wheels);
		}
	}
	
	
	
	private static void Static_keyword() {
		
		car.displaywheels();
		
	}

}

/* 
 
      Definition:
      The static keyword means that a variable or method belongs to the class itself, not to any specific object.

      Purpose:
      We use static to share a variable or method across all objects and to access it without creating an object.
	
*/
	
