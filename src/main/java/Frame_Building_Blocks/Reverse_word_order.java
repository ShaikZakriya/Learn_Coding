package Frame_Building_Blocks;

public class Reverse_word_order {

	static String input = "This is blue pen";
	public static void main(String[] args) {
		
		    Reverse_word_order();
		  //Reverse_entire_string();

	}

	private static void Reverse_entire_string() {
		
		StringBuilder str = new StringBuilder(input);
		System.out.println(str.reverse().toString());
		
	}

	private static void Reverse_word_order() {
		
		String[] words = input.split(" ");
		StringBuilder reverse = new StringBuilder();
		
		for (int i = words.length-1; i>=0; i--)
		{
			reverse.append(words[i]).append(" ");
		}
		
		System.out.println(reverse.toString().toLowerCase());
	}

}
