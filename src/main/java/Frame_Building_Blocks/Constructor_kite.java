package Frame_Building_Blocks;

public class Constructor_kite {

	public static void main(String[] args) {
		
		Constructor_kite.Aeroplane();
		Constructor_kite obj = new Constructor_kite();
        Constructor_kite.Ship();
		Constructor_kite.Apple();
		
	}


      
     public static void Apple()
     {
    	 System.out.println("Apple");
     }
     
     public static void Ship()
     {
    	 System.out.println("Ship");
     }
     
     public static void Aeroplane()
     {
    	 System.out.println("Aeroplane");
     }
     
     public Constructor_kite()
     {
    	 System.out.println("Constructor_kite");
     }
     
  }