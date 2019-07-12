package Homework3;

//name address date of birth and telephone number
public class Person {
	
private String name, address, dob, tn;

public Person() {
	name = "";
	tn = "";
	address = "";
	dob = "";
}

public Person(String name2, String dob2, String address2, String tn2) {
super();
tn = tn2;
name = name2;
dob = dob2;
address = address2;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}


public String getTn() {
	return tn;
}
public void setTn(String tn) {
	this.tn = tn;
}

	@Override
public String toString() {
	return "Person [name=" + name + ", address=" + address + ", dob=" + dob + ", tn=" + tn + ",]";
}

}
