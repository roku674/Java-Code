package Week3;
import java.util.Scanner;

public class MyEmployees {
	
	private Employee[]emps;
	public MyEmployees(){
		emps = new Employee[6];
	}
	public void createSup(){
		Scanner Scan = new Scanner(System.in);
		System.out.print("Enter name of Sueprvisor");
		String name = Scan.next();
      	//Employee sup = new Employee(0, 0, name, name, sup);
		//sup.setname(name);
		
	}
	
	public static void main(String[] args) {
	}
	
}
