package Oops_concepts;

public class Interface_child implements Interface, Interface_child2{

	public static void main(String[] args) {
		
		Interface_child obj = new Interface_child();
		obj.Name();
		obj.PinNumber();
		obj.Balance();
		obj.AccountNumber();
		obj.PhoneNumber();
          
	}

	@Override
	public void Name() {
		
		System.out.println("Automation");
		
	}

	@Override
	public void PinNumber() {
		
		System.out.println("9969");
		
	}

	@Override
	public void Balance() {
		
		System.out.println("999999");
		
	}

	@Override
	public void PhoneNumber() {
		
		System.out.println("9581928986");
		
	}

	@Override
	public void AccountNumber() {
		
		System.out.println("088889966554412");
		
	}

	

}


