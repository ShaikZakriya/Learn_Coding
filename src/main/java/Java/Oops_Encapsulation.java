package Java;


  public class Oops_Encapsulation {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("Automation");
		System.out.println(p.getName());
        
	}

}
   
  class Person {
      private String name; // Now i hide the data

    // Method to set name
    public void setName(String newName) {
        name = newName;
    }

    // Method to get name
    public String getName() {
        return name;
    }
}
  
  
  
  
  
  
  /*Defination
   
   Encapsulation means hiding the data and allowing access to it only through methods
   
   Purpose
   
   To protect the data (so no one can change it directly).
   To control how the data is accessed or changed (only through methods).
   To make the program more secure and organized.
   To make maintenance easier (so we can easily update the code later)
    
   */
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   /*
    
    1. Person class:

    class Person {
    private String name;

   Yahan name variable private hai, matlab sirf Person class ke andar hi use directly access kiya ja sakta hai.

   Bahar se seedha name ko access nahi kar sakte.

   2. setName method:

   public void setName(String newName) {
    name = newName;
   }

   Ye method public hai, matlab koi bhi bahar se ise call karke name set kar sakta hai.

   Jab user setName call karega aur koi naam dega, to wo name variable mein save ho jayega.


   3. getName method:

   public String getName() {
    return name;
   }

   Ye method name ko return karta hai.

   Matlab, agar aapko name dekhna hai to directly name variable nahi, getName() method se dekh sakte hain.

   4. Oops_Encapsulation class (Main Class):

   public class Oops_Encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Zakriya");
        System.out.println(p.getName());
    }
}

    Yahan Person ka ek object p banaya gaya.

    p.setName("Zakriya"); ke through name ko "Zakriya" set kiya gaya.

    System.out.println(p.getName()); ke through us name ko print kiya gaya.


    Output kya ayega?
    Zakriya
     
    */
