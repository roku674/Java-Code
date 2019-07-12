package Week5;

import java.util.ArrayList;

public class Inheritance {

	public static void main(String[] args) {
		Person p = new Person("Daffy", "Duck",1234);
		US_Citizen c = new US_Citizen("Bugs", "Bunny", 4321);
		
		System.out.print(p.getFname() + " ");
		System.out.println(p.getLname());
		System.out.println(c.getFname());
		System.out.println(c.getLname());
		
		ArrayList<Person>peeps = new ArrayList<Person>();
		peeps.add(c);
		peeps.add(p);
		System.out.println(peeps.get(0));
		System.out.println(peeps.get(1));

		// TODO Auto-generated method stub

	}

}
