package Java_Tasks;

public class Oops_Method_Overriding_Child extends Oops_Method_Overriding_Parent {

	public static void main(String[] args) {
		
		Oops_Method_Overriding_Parent obj = new Oops_Method_Overriding_Parent();
		obj.addition("Automation");
		obj.addition(600, 900);
		
		

	}

    public static void addition (int a, int b) {
	System.out.println("This is Child Class");
	int sum = a+b;
	System.out.println(sum);
   
   }	
	 
 }