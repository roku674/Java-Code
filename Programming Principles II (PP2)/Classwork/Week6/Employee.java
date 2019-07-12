package Week6;

public class Employee {

private String name;
private int dob;
private int empid;


	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}



public int getDob() {
	return dob;
}
public void setDob(int dob) {
	this.dob = dob;
}



public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}


	public Employee(String n, int id){
		name = n ;
		empid = id;
	
}
  public double computePay() {
	
	  return 0.0;
	  
  }

}
