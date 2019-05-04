package egitimtwo;

public class Polymorphism {
	 private MyDate orderDate;
	 private double orderAmount = 0.00;
	 private String customer;
	 private Good product;
	 private int quantity;
	 public MyDate getOrderDate() {
	 return orderDate;
	 }
	 public void setOrderDate(MyDate orderDate) {
	 this.orderDate = orderDate;
	 }
	 public double getOrderAmount() {
	 return orderAmount;
	 }
	 public void setOrderAmount(double orderAmount) {
	 if (orderAmount > 0) {
	 this.orderAmount = orderAmount;
	 } else {
	 System.out.println("Attempting to set the orderAmount to a value less than or equal to zero");
	 }
	 }
	 public String getCustomer() {
	 return customer;
	 }
	 public void setCustomer(String customer) {
	 this.customer = customer;
	 }
	 public Good getProduct() {
	 return product;
}
	 
	 public void setProduct(Good product) {
	 this.product = product;
	 }
	 public int getQuantity() {
	 return quantity;
	 }
	 public void setQuantity(int quantity) {
	 if (quantity > 0) {
	 this.quantity = quantity;
	 } else {
	 System.out.println("Attempting to set the quantity to a value less than or equal to zero");
	  }
	 }
	 public static double getTaxRate() {
	 return taxRate;
	 }
	 public static double taxRate = 0.05;
	 public static void setTaxRate(double newRate) {
	 taxRate = newRate;
	 }
	 public static void computeTaxOn(double anAmount) {
	 System.out.println("The tax for " + anAmount + " is: " +
	anAmount
	 * Order.taxRate);
	 }
	 public Polymorphism(MyDate d, double amt, String c, Good p, int q) {
	 orderDate = d;
	 orderAmount = amt;
	 customer = c;
	 product = p;
	 quantity = q;
	 }
	 public String toString() {
	 return quantity + " ea. " + product + " for " + customer + " "+ orderDate +" amount is"+ orderAmount;
	 }
	 public double computeTax() {
	 System.out.println("The tax for this order is: " +
			 orderAmount
			  * Order.taxRate);
			  return orderAmount * Order.taxRate;
			  }
			  public char jobSize() {
			  if (quantity <= 25) {
			  return 'S';
			  } else if (quantity <= 75) {
			  return 'M';
			  } else if (quantity <= 150) {
			  return 'L';
			  }
			  return 'X';
			  }
			  public double computeTotal() {
			  double total = orderAmount;
			  switch (jobSize()) {
			  case 'M':
			  total = total - (orderAmount * 0.01);
			  break;
			  case 'L':
			  total = total - (orderAmount * 0.02);
			  break;
			  case 'X':
			  total = total - (orderAmount * 0.03);
			  break;
			  }
			  if (orderAmount <= 1500) {
			  total = total + computeTax();
			  }
			  return total;
			  }
			  
			 }