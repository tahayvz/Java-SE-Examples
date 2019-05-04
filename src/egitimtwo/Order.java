package egitimtwo;
import egitimtwo.MyDate;
public class Order {
	private MyDate orderDate;
	private double orderAmount = 0.00;
	private String customer;
	private Product product;
	private int quantity;
	private static Rushable rushable;
	
	public Order(MyDate d, double amount, String c, Product p, int q)
	{
		orderDate = d;
		orderAmount = amount;
		customer = c;
		product = p;
		quantity = q;
	}
	
public static Rushable getRushable() {
	return rushable;
	}
public static void setRushable(Rushable rushable) {
	Order.rushable = rushable;
	}

public boolean isPriorityOrder()
	{
	boolean priorityOrder = false;
	if( rushable != null ) {
		priorityOrder = rushable.isRushable(orderDate,orderAmount);
	}
	return priorityOrder;
	}

public MyDate getOrderDate() {
	return orderDate;
	}
public void setOrderDate(MyDate orderDate) {
	if (isHoliday(orderDate)) {
		System.out.println("Order date, " + orderDate + ", cannot be set to a holiday!");
	} else {
		this.orderDate = orderDate;
	}
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

public Product getProduct() {
	return product;	
	}
public void setProduct(Product product) {
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
		System.out.println("The tax for " + anAmount + " is: " + anAmount * Order.taxRate);
	}
	

	public String toString() {
		//product Solid class'ýna gider 
	return quantity + " pierce " + product + " for " + customer + " order amount: "+ orderAmount + " is rushable: "+ rushable;	
	}
	
	public double computeTax() {
		System.out.println("The tax for this order is: " +	orderAmount * Order.taxRate);
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
	private boolean isHoliday(MyDate proposedDate) {
		boolean result = false;
		for (MyDateArray holiday : MyDateArray.getHolidays()) {
			if( holiday.equals(proposedDate) ) {
				result = true;
			}
		}
		return result;
	}
}
