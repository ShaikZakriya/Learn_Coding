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

/*  in java programming when we specify the static keyword before variables and methods these particular variables and methods
	can be accessed outside the class without the need of creating an object if the static keyword is specified before these 
	variables and methods then if you have to access the static variables and methods outside the class there is no need of 
	creating an object that is a main purpose or actual purpose of why people use static keyword in real programming 
	
	Most of the people will use static keyword to access this variable and methods outside the class without the need for 
	creating an object that is without creating an object for the class in which these variable and methods are available 
	you can directly access with the help of the class name.
	example classname.variable name like that
	example classname.method etc
	
	if there is non static then you have to create an object for the class inside which these variables and methods are available
	and using the object reference of the class.   
	
*/
	
