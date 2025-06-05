package Java_Tasks;

public class Practise_task {

	public static void main(String[] args) {
		
		Practise_task.Bikename("Coding", 25);
		Practise_task obj = new Practise_task();
		obj.Pulsur("Pulsur 150");
		obj.character('A');
		obj.addition(50, 160);
		obj.multiplication(50, 5);
		obj.substraction(50, 25);

	}

	public void Pulsur(String x)
	{
		System.out.println(x);
	}
    
	public static void Bikename(String v, int i)
	{
		System.out.println(v + " " + i);
		
	}

    public void character(char chr)
    {
    	System.out.println(chr);
    }

    public void addition(int a, int b) {
     	
 		int sum =a+b;
 		System.out.println(sum);
 	}
  
    public void multiplication(int a, int b)
    {
    	int mul = a*b;
    	System.out.println(mul);
    }

     public void substraction(int i, int n)
     {
    	 int sub=i-n;
    	 System.out.println(sub);
    	 
     }

}
