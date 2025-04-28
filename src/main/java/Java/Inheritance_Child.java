package Java;

public class Inheritance_Child extends Inheritance_Parent{

	public static void main(String[] args) {
		
		Inheritance_Child obj = new  Inheritance_Child();
		
		obj.home();
		obj.car();
		obj.home2();
		obj.tatanexon();
		int sum = obj.amount;
        System.out.println(sum);
		
		
		
		

	}
 
    public static void home2() {
	
	System.out.println("Home inside a City");


  }

     public static void tatanexon() {
	 
	 System.out.println("Tata Safari");
   }

}