package Homework3;
// number, email, the amount of the customer��s purchases, tax rate

import java.util.Scanner;

public class Customer extends Person {
	
private String cn, email;
private double purch;
private double taxr;
private boolean mailist;

public Customer() {
	super();
	cn = "";
	purch = 0;
	taxr = 0.0;
	email = "";
	if (mailist==true)
		mailist = true;
	else 
		mailist = false;
}

public Customer(String cn2, double purch2, double taxr2, String email2, boolean mailist2) {
super();
cn = cn2;
purch = purch2;
taxr = taxr2;
email = email2;
mailist = mailist2;
}


	public String getCn() {
	return cn;
}

public void setCn(String cn) {
	this.cn = cn;
}


public double getPurch() {
	purch = 3000;
	purch = (purch*getTaxr())+purch;
	return purch;
}

public void setPurch(double purch) {
	this.purch = purch;
}

public double getTaxr() {
	taxr = 0.06;
	return taxr;
}

public void setTaxr(double taxr) {
	taxr = 0.06;
	this.taxr = taxr;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public boolean isMailist() {
	return mailist;
}

public void setMailist(boolean mailist) {
	this.mailist = mailist;
}

}
