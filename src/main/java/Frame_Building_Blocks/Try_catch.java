package Frame_Building_Blocks;

public class Try_catch {

	public static void main(String[] args) {

		Try_catch_block();

	}

	private static void Try_catch_block() {

		try
		{
			System.out.println("Learn Coding");
			int a=20, b=2, c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't divided by zero");
		}
		finally
		{
			System.out.println("Finished");
		}
	    System.out.println("Main method ended");
		
	}

}
