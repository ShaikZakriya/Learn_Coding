package Frame_Building_Blocks;

public class Inheritence_child {

	public static void main(String[] args) {
		
		Inheritence_child obj = new Inheritence_child();
		obj.car();
		obj.home(5);
		obj.home();
		

	}


   public void car()
   {
	   System.out.println("Harrier");
   }
   
   public void home()
   {
	   System.out.println("Bangalore");
   }
   
   public void home(int name)
   {
	   System.out.println(name);
   }
   
}