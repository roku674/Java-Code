package Week8;

import java.util.Scanner;

public class Quotient {
	public int divide (int divident, int divisor) {
		return divident/divisor;
	}
	public static void main(String[] args) {
		Quotient q = new Quotient();
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter two integers ");
		
		try {
			
		int x = scan.nextInt();
		int y = scan.nextInt();

		System.out.println("x divide by y is " + q.divide(x,y));
		
		int[]arr = new int[1];
		arr [0] = x;
		arr [1] = y;
		} catch (ArithmeticException ae) {
			System.out.println("Expression is Undefined");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index out of Bounds");
		} catch(Exception ae) {
			System.out.println("Must be an integer");
		}
	} 
}
