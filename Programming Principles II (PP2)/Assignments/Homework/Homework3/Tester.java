package Homework3;
import java.util.Scanner;



public class Tester {
	//static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
    String name, address, dob, tn, email;
    double purch, taxr, discount, discountPrice = 0, amount = 0;
    boolean mailist;
		
    Customer customer = new Customer("Customer 1", 3000.0 , 0, "af03848@georgiasouthern.edu" , true);
    Person person = new Person("Alexander","04/05/1995", "GSU Campus", "555-123-4567" );
    PreferredCustomer preferredcustomer = new PreferredCustomer("Preferred Customer : Alexander " , 0.0 , 0.0, 0.0);
    
   /** System.out.print("What is your ?");
    name = input.toString();
   **/
    //preferredcustomer.getDiscount()
    
    System.out.println(
    "Name: " + 
    person.getName() + '\n'
    	+ "Customer Telephone Number: "
    + person.getTn() + '\n'
    //+ person.toString() + " , "
    	+ "Date of Birth: "
    + person.getDob() +  '\n'  
    	+ "Adress: " 
    + person.getAddress() + '\n'
    	+ "Email: "
    + customer.getEmail() + '\n'
   		+ "Customer Number: "
    + customer.getCn() + '\n'
    	+ "Is on mail list?: "
    + customer.isMailist() + '\n'
    	+ "Tax Rate: "
    + customer.getTaxr() + '\n'
    	+ "Purchase After Tax: "
    + customer.getPurch() + '\n' 
    	+ "Discounted Price: "
    + preferredcustomer.getDiscountPrice(amount, amount) + '\n'
    //+ preferredcustomer.addPurchase(discountPrice) + '\n'
    	+ "discount Rate: "
    + preferredcustomer.getDiscount(amount)*100
    	+ " % ");

	
	}

}
