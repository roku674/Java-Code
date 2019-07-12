package Week6;

import java.util.ArrayList;

public abstract class TestEmployee {

	public static void main(String[] args) {
		
		WklyWorker a = new WklyWorker("Alex" , 1234);
		WklyWorker b = new WklyWorker("Xander" , 4321);
		
		ArrayList<Employee>staff = new ArrayList<Employee>();
		//Manager m = new Manager("Bugs", 1234);
		staff.add(a);
		for (int i = 0; i < staff.size(); i++){
			System.out.println("" + staff.get(i).getName() +  " Pay is " + staff.get(i).computePay());
		}
		// TODO Auto-generated method stub

	}

}
