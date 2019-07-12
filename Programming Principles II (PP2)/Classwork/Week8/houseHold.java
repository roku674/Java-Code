package Week8;

import java.util.Scanner;

public class houseHold {
	private String state,city, street;
	int num_of_Adults, num_of_children, zip;
	
	public houseHold (String record) {
		Scanner scan = new Scanner(record);
		this.state = scan.next();
		this.zip = scan.nextInt();
		this.city = scan.next();
		String temp = scan.next();
		while(!scan.hasNextInt()){
			temp = temp + " " + scan.next();
		}
		this.street = temp;
		this.num_of_Adults = scan.nextInt();
		this.num_of_children = scan.nextInt();
		
	}
	
	
	public String toString() {
		return this.street + " " +this.city+ " " + this.zip + " " + this.state;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}


	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}


	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}


	public int getNum_of_Adults() {
		return num_of_Adults;
	}
	public void setNum_of_Adults(int num_of_Adults) {
		this.num_of_Adults = num_of_Adults;
	}



	public int getNum_of_children() {
		return num_of_children;
	}
	public void setNum_of_children(int num_of_children) {
		this.num_of_children = num_of_children;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
