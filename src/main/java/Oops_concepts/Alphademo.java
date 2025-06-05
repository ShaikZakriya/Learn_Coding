package Oops_concepts;

interface Alphademo {

	public static void main(String[] args) {
		
		test(20, 50);
		Alphademo.additon(50, 50);
		

	}

	public static void test (int x, int y)
	{
		System.out.println(x+y);
	}

    public static void additon (int x, int y) {
	
    	System.out.println(x * y);
    }
    
    public void multiplication(int x, int y);

}
