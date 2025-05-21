package Java_Tasks;

public class Static_keyword {

	public static void main(String[] args) {
		
		Stds s1 = new Stds(101);
		Stds s2 = new Stds(102);
		s1.display();
		s2.display();

	}

}
   class Stds 
   {
	   int rollNo;
	   static String college = "ABC College";
    
	   Stds(int r) {
	   rollNo = r;
	   
	   
	}
	   
	void display() 
	{
		System.out.println(rollNo + " " + college);
	}
	
 }
   
   /*
       In java static means something that is common for all the objects of a class.
       You dont need to create an object to use it you can use it directly with the class name
    
    */
   
   /*
     
      Non static refers to variables methods or blocks that belong to an instance of a class not the class itself
      They can only be accessed through an object of the class and each object has its own separate copy
   
    */
   
   
   
   
   