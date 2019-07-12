package Week2;

public class Savings2 {
	
	private String name;
	private double balance;
	private static double allBal;
	
	public Savings2() {
        
		this("Bob", 50);
		System.out.println("No args constructor");
		/**name = "Bob";
		balance += 50;
		allBal = balance; **/
	}
	
	public Savings2(String name, double amt) {
		balance = amt;
		this.name = name;
		allBal += balance;
		System.out.println("String & Double constructor");
	}
	public Savings2(String name, int x) {
		balance = x;
		this.name = name;
		allBal += balance;
	}
	public void displayBal() {
		System.out.println("balance for " + this.name + " is " + this.balance);
		System.out.println("Total in the bank is " + allBal);
	}
	public static void main(String args[]) {
	}
}
