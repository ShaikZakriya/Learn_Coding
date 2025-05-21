package Java_Tasks;

public class Finally_Keyword {

	public static void main(String[] args) {
		
		finally_keyword();
		
		//finally_task2();

	}

	private static void finally_task2() {
	
		try 
		{
			int a=10, b=50; int c= a/b;
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
		
		
		
		try 
		{
		    int a =20; int b=0; int c=a/b;
			System.out.println(c);
		}
		
		catch (Exception e) 
		{
			System.out.println("Can't divide by zero");
		}
		
		/*finally 
		{
			System.out.println("Testing");
		}*/
		
		
		
		
		}
   }


     /*
      
      Definition of finally:
      The finally keyword is used in exception handling to create a block of code that always runs, 
      no matter what happens (whether an error occurs or not).

      Purpose of finally:
      We use finally to write important code that must be executed, like closing a file, releasing memory, 
      or closing a database connection — even if an error happens.

      Simple idea:
      Try-catch block may or may not run fully, but finally block always runs.
      
      */









