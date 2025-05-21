package Java_Tasks;

public class All_Strings {

	public static void main(String[] args) {
		
		Reverse_string();

	}

	private static void Reverse_string() {
		
		String name = "Automation";
		String reverse = "";
		for(int i=name.length()-1; i>=0; i--)
		{
	        reverse +=name.charAt(i);
	        
		}
		
		System.out.println("Reversed String: " + reverse);
	}

}
