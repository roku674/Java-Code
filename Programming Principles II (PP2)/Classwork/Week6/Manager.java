package Week6;

public class Manager extends Employee {

private double mthlySal;
	
public Manager(String name, int empid) {
super(name, empid);

}

	public double getMthlySal() {
	return mthlySal;
}
public void setMthlySal(double mthlySal) {
	this.mthlySal = mthlySal;
}

public double computePay() {
	  return mthlySal;
	  
}
}
