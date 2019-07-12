package Week8;

public class Student {
	
	private String fname, lname;
	private int eID, a1 , a2 , a3 ;
	
	
	String getFname() {
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
	public int geteID() {
		return eID;
	}
	public void seteID(int eID) {
		this.eID = eID;
	}
	public int getA1() {
		return a1;
	}
	void setA1(int a1) {
		this.a1 = a1;
	}
	public int getA2() {
		return a2;
	}
	void setA2(int a2) {
		this.a2 = a2;
	}
	public int getA3() {
		return a3;
	}
	void setA3(int a3) {
		this.a3 = a3;
	}
	
	public String toString(){
		return this.eID + " " + this.fname + " " + this.lname;
		}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eID;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (eID != other.eID)
			return false;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (lname == null) {
			if (other.lname != null)
				return false;
		} else if (!lname.equals(other.lname))
			return false;
		return true;
	}
}
