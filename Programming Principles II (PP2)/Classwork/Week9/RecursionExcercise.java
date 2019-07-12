package Week9;

public class RecursionExcercise {

	public static void main(String[] args) {
		System.out.println("The gcd is " + gcd(310, 250));

	}
	
	public static int gcd(int m, int n) {
		if (m%n ==0) return n;
		
		else  return gcd(n, m%n);
		
	}

}
