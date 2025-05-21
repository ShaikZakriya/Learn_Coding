package Frame_Building_Blocks;

public class Coding {

	

	public static void main(String[] args) {
		
		Coding obj = new Coding(); // This is non parameterized Constructor
		Coding obj1 = new Coding("Zakriya");
		obj.Java();
		obj.Selenium();
		Coding obj2 = new Coding(30);
        Coding obj6 = new Coding("Automation", 90); 
         
         
	}
	
     public void Java()
     {
    	 System.out.println("Bike is inside the method");
     }
     public void Selenium()
     {
    	 System.out.println("Thar is inside the method");
     }
     
     public Coding(int y)
     {
    	 System.out.println(y);
     }
     
      public void Cucumber()
     {
    	 System.out.println("Coding");
     }
     
     public void BDDFramework()
     {
    	 System.out.println("Masters");
     }
     
     public Coding()
     {
    	 System.out.println("Coding");
     }
     
     public Coding(String x)
     {
    	 System.out.println(x);
     }
    
     public Coding(String x, int i)
     {
    	 System.out.println(x + " " + i);
     }
     
}