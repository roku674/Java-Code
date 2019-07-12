package Week6;

public class WklyWorker extends Employee {

private int numOfWks;
private double wklyRate;

	public WklyWorker(String name, int empid) {
	super(name, empid);

}

	public int getNumOfWks() {
		return numOfWks;
	}

	public void setNumOfWks(int numOfWks) {
		this.numOfWks = numOfWks;
	}

	public double getWklyRate() {
		return wklyRate;
	}

	public void setWklyRate(double wklyRate) {
		this.wklyRate = wklyRate;
	}

	  public double computePay() {
		  return numOfWks*wklyRate;
		  
	  }
}
