package Java_Tasks;

public class Overloading_constractor {

	public static void main(String[] args) {
		
		Overloading_constractor obj = new Overloading_constractor();
		Overloading_constractor obj1 = new Overloading_constractor(50);
		Overloading_constractor obj2 = new Overloading_constractor('Z',620080L);
		Overloading_constractor obj3 = new Overloading_constractor("Learning", true);
		
	    
          
	}
    //This is default constactor
	public Overloading_constractor()
	{
		System.out.println("This is a non-parametarized constractor");
	}
	
	public Overloading_constractor(int a)
	{
		System.out.println(a);
	}
	public Overloading_constractor(String x, boolean b)
	{
		System.out.println(x+" "+b);
	}
	public Overloading_constractor(char c, long L)
	{
		System.out.println(c+" "+L);
	}
    
     
}