package Java;

public class Oops_Method_Overriding_Child extends Oops_Method_Overriding_Parent {

	public static void main(String[] args) {
		
		Oops_Method_Overriding_Parent obj = new Oops_Method_Overriding_Parent();
		
		obj.addition(10, 40);
		

	}



   public static void addition (int a, int b) {
	System.out.println("I am in Child Class");
	int sum = a+b;
	System.out.println(sum);
	
    }

}