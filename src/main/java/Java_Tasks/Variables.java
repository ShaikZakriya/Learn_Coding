package Java_Tasks;


public class Variables {
	
	String name;
	int age;
	String language;
	
	static String fullName ="Shaik Zakriya";
	

	public static void main(String[] args) {
		
		testMethod();
		Variables alp = new Variables("Coding", 34);
		Variables obj = new Variables("Mustaq", 26,"Automation");
		alp.printer();
		obj.printer();
		System.out.println(alp.age);
		System.out.println(obj.age);
		System.out.println(alp.language);
		System.out.println(obj.language);
       
	}
	


	 public Variables(String x, int y)
	 {
		 name = x;
	     age =  y;
	 
	}
	 
	 public Variables(String x,int y, String z)
	 {
		 name = x;
	     age = y;
	     language=z;
	 
	}

	public void printer()
	{
		System.out.println("Name is : " + name);
		System.out.println("Age is : " + age);
		System.out.println("Langauge is : " + language);
	}

	private static void testMethod()
	{
		int z=1;
		System.out.println(z);
	  }

	
}
	

	


