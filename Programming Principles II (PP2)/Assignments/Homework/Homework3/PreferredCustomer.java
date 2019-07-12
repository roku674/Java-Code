package Homework3;

public class PreferredCustomer extends Customer {
	
	private String name;
	private double discount, discountPrice, addPurchase;
	
  public PreferredCustomer() {
	  this.name = getName();
	  this.discount = getDiscount(addPurchase);
	  this.discount = getDiscountPrice(discountPrice, addPurchase);
  }
  
  public PreferredCustomer(String name2 , double discount2, double discountPrice2, double addPurchase2){
	// TODO Auto-generated constructor stub
	  super();
	  name = name2;
	  discount = discount2;
	  discountPrice = discountPrice2;
	  addPurchase = addPurchase2;
  }

public String getName() {
	  return name;
  }
  public double getpurch() {
	  return getpurch();
  }
  
  public double getDiscount(double newDiscount) {
      if ((getPurch() >= 700) & (getPurch() <= 1499))
    	  newDiscount = .07;
      else if ((getPurch() >= 1500) & (getPurch() <=2499))
    	  newDiscount = .1;
      else if ((getPurch() >= 2500) & (getPurch() <=2999))
    	  newDiscount = .15;
      else if (getPurch() >= 3000)
         newDiscount = .2;
      else
    	  newDiscount = 0.0;
      discount = newDiscount;
		return discount;
	    }
  public double setDiscount(double newDiscount) {
	  return this.discount;
  }
  
  
  public double getDiscountPrice(double amount, double newDiscount) {
	  amount = (getPurch()-(getDiscount(newDiscount)*getPurch()));
      discountPrice = amount;
	  return discountPrice;
  }
  public void setDiscountPrice(double discountPrice) {
	  this.discountPrice = discountPrice;
  }
  
  public double addPurchase(double discountPrice) {
	  double addPurchase = addPurchase(discountPrice) + discountPrice;
	  return addPurchase(discountPrice);
  }
  
}
