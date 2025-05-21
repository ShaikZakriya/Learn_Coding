package Frame_Building_Blocks;

public class Apple {

	int a =50;
	int b =100;
	public static void main(String[] args) {
		
		Apple ac = new Apple();
		System.out.println(ac.a);
		Apple a = new Apple("Zakriya");
		System.out.println(ac.b);
		ac.car(29, 'Z');
		ac.coding("Automation", 'A', 35, true);

	}

	
	public Apple()
	{
		System.out.println("Apple");
	}
	
	public Apple(String s)
	{
		System.out.println(s);
	}

     public void car(int a, char c)
     {
    	 System.out.println(a + " " + c);
     }

     public void coding(String s, char c, int n, boolean b)
     {
    	 System.out.println(s + " " + c + " " + n + " " + b + " ");
     }

     



}
   