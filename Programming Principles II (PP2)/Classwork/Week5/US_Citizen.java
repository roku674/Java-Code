package Week5;

public class US_Citizen extends Person {
	
	private int ssn;
	private String state;
	
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public US_Citizen(String fname, String lname, int dob) {
		super(fname,lname,dob);
		// TODO Auto-generated constructor stub
	}
    public String getFname() {
    	return "Cowboy " + super.getFname();
    }
    public String getLname() {
    	return "Swag " + super.getLname();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		return "US_Citizen [ssn=" + ssn + ", state=" + state + "]";
	}

}
