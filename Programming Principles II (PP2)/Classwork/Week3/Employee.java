package Week3;

public class Employee {
	
	private int emplID;
	private int ssn;
	private String name;
	private String dept;
	private Employee Sup;
	
	Employee(int emplID, int ssn, String name, String dept, Employee Sup){
		this.emplID = 0;
		this.ssn = 0;
		this.name = null;
		this.dept = null;
		this.Sup = null;
		
	}
	
	public int getemplID() {
		return emplID;
	}
	public void setlength(int newemplID) {
		emplID = newemplID;
	}
	
	public int getssn() {
		return ssn;
	}
	public void setssn(int newssn) {
		ssn = newssn;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String newname) {
		name = newname;
	}
	
	public String getdept() {
		return dept;
	}
	public void setdept(String newdept) {
		dept = newdept;
	}
	
	public Employee getSup() {
		return Sup;
	}
	public void setSup(Employee newSup) {
	     Sup = newSup;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
