package Oops_concepts;

abstract class Abstraction {

	public static void main(String[] args) {
		
		

	}
    
	//Implemented Method
	public static void BankName() 
	{
		System.out.println("State Bank of India");
	}

    public static void BankBalance()
    {
    	System.out.println("6% of interest home loan");
    }

   //Unimplemented Method
    public static void ATMPIN()
    {
    	
    }

    public static void BalanceCheck()
    {
    	
    }
}

















/*
  Abstraction
  
  Abstraction is nothing but hiding the code. In java we can achieve abstraction by two ways
  
  1.Abstract class(0-100% Hiding of code)
  2.Interface class(100% of Hiding of code)
  
  Abstract Class
  1.We need to use keyword called abstract when creating a class 
  2.We cannot create a object for abstract class
  3.This abstract class can contains both (Implemented methods(with code) and Unimplemented methods (without any code)
  4.In order to implement the unimplemented method we extend the abstract class and implement there
  5.We can extend only one abstract class
  
 */