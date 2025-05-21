package Frame_Building_Blocks;

public class Child_class extends Parent_class{

	public static void main(String[] args) {
		
		Child_class child = new Child_class();
		child.car();

	}
   
	@Override
	public void car()
	{
		System.out.println("This is new car");
	}
	
}
