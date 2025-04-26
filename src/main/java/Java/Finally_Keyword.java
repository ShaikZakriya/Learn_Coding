package Java;

public class Finally_Keyword {

	public static void main(String[] args) {
		
		//finally_keyword();
		
		finally_task2();

	}

	private static void finally_task2() {
	
		try 
		{
			int a=10, b=0; int c= a/b;
			System.out.println("Result: " + c);
			
		}
		
		catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		
		finally
		{
			System.out.println("Finally block clean up done");
		}

	
	
	}

	private static void finally_keyword() {
		
		/* try block is a block that contains only risky code 
		   
		   catch block it is used to handle the exception 
		   
		   finally block is a realtime block and the main purpose of finally block to handle the resources.
		 */
	
		
		try 
		{
			System.out.println("Learn coding");
			int a =20; int b=2; int c=a/b;
			System.out.println(c);
			
			System.out.println("Coding"); 
				
		}
		
		catch (Exception e) 
		{
			System.out.println("Can't divide by zero");
		}
		
		finally 
		{
			System.out.println("Testing");
		}
		
		
		
		
		}
}



