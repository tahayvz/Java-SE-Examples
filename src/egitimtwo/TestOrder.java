package egitimtwo;

import java.time.LocalDate;
import egitimtwo.Good.UnitOfMeasureType;

public class TestOrder {
	
public static void main(String[] args) {
MyDate date1 = new MyDate(1, 20, 2008);
Solid s1 = new Solid("Solid1 ", 1, 0.3,UnitOfMeasureType.CUBIC_METER, 500, 0.25);
Order customer1 = new Order(date1, 2000.00, "Customer1", s1,10);
MyDate date2 = new MyDate(4, 10, 2008);
Solid s2 = new Solid("Solid2 ", 2, 15,UnitOfMeasureType.CUBIC_FEET, 10, 5);
Order Customer2 = new Order(date2, 1000.00, "Customer2", s2,125);
MyDate date4 = new MyDate( 5, 17, 2016 );
Solid solid4 = new Solid( "Solid customer2 type", 3, 0.3,UnitOfMeasureType.CUBIC_METER, 100, 0.25);
Order Customer4 = new Order( date4, 10.00, "Customer4",solid4, 10 );
MyDate date3 = new MyDate(1,1,2012);

Service s3 = new Service("Customer1 service", 14,false);
Order Customer3 = new Order(date3, 20000, "Customer3", s3,1);

Customer2.setQuantity(-200);
System.out.println(customer1);
System.out.println(Customer2);
System.out.println("The tax Rate is currently: " + Order.taxRate);
Order.computeTaxOn(3000.00);
customer1.computeTax();
Customer2.computeTax();
Order.setTaxRate(0.06);
System.out.println("The tax Rate is currently: " +Order.taxRate);
Order.computeTaxOn(3000.00);
customer1.computeTax();
Customer2.computeTax();
System.out.println("The total bill for: " + customer1 + " is "+ customer1.computeTotal());
System.out.println("The total bill for: " + Customer2 + " is "+ Customer2.computeTotal());

System.out.println("The total bill for: " + Customer3+ " is " + Customer3.computeTotal());
//Change this date to one that is within
//the last 15 days of today.

Order.setRushable( (orderDate, orderAmount) -> {
//Create a LocalDate object for now.
LocalDate now = LocalDate.now();
//Create a LocalDate object for the order date.
LocalDate orderDatePlus30 =LocalDate.of(orderDate.getYear(),orderDate.getMonth(), orderDate.getDay());
//Add one month to the order date.
orderDatePlus30 = orderDatePlus30.plusMonths(1);
//If the current date is after the order date + one month,
//it's rushable.
return now.isAfter(orderDatePlus30);
} );

System.out.println("Customer1 isPriorityOrder: " +customer1.isPriorityOrder()); // True
System.out.println("Customer4 isPriorityOrder: " +Customer4.isPriorityOrder()); // true
Order.setRushable((orderDate, orderAmount) -> orderAmount >1500 );
System.out.println("Customer1 isPriorityOrder: " +customer1.isPriorityOrder());
System.out.println("Customer2 isPriorityOrder: " +Customer2.isPriorityOrder());//false
Customer2.setQuantity(-200);
System.out.println(customer1);
System.out.println(Customer2);
System.out.println("The tax Rate is currently: " +Order.taxRate);
Order.computeTaxOn(3000.00);
customer1.computeTax();
Customer2.computeTax();
Order.setTaxRate(0.06);
System.out.println("The tax Rate is currently: " +Order.taxRate);
Order.computeTaxOn(3000.00);
customer1.computeTax();
Customer2.computeTax();
System.out.println("The total bill for: " + customer1 + " is "+ customer1.computeTotal());
System.out.println("The total bill for: " + Customer2 + " is"+ Customer2.computeTotal());
System.out.println("The total bill for: " + Customer3+ " is " + Customer3.computeTotal());
}
}