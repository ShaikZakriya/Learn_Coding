package Frame_Building_Blocks;

public class Inheritence_Parent {

	public static void main(String[] args) {
		
		Inheritence_Parent obj = new Inheritence_Parent();
		obj.car();
		obj.home("Kurnool-Home");

	}


    public void car()
    {
    	System.out.println("Alto");
    }

    public void home(String name)
     {
    	 System.out.println(name);
    	 System.out.println("Kurnool-Home");
     }
    
     public void home()
     {
    	 System.out.println("Hyderabad");
     }
    
     public void home(int name)
     {
    	 System.out.println(name);
     }
     
 }