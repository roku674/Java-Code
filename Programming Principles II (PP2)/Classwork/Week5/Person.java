package Week5;

public class Person {
	
private String fname;
private String lname;
private int dob;

public Person(String fname, String lname, int dob) {
	this.fname = fname;
	this.lname = lname;
	this.dob = dob;
	
	// TODO Auto-generated constructor stub
}

public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}

public int getDob() {
	return dob;
}
public void setDob(int dob) {
	this.dob = dob;
}

	@Override
public String toString() {
	return "Person [fname=" + fname + ", lname=" + lname + ", dob=" + dob + "]";
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
