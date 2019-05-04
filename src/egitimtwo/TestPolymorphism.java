package egitimtwo;
import java.util.Objects;
import egitimtwo.Good.UnitOfMeasureType;
public class TestPolymorphism {
	 public static void main(String[] args) {
		 //Polymorphism p=new SubPolymorphism(); olur fakat SubPolymorphism p=new Polymorphism(); olmaz
	 MyDate date1 = new MyDate(1, 20, 2008);
	 Solid s1 = new Solid("Acme Anvil", 1668, 0.3, UnitOfMeasureType.CUBIC_METER, 500, 0.3);
	 Polymorphism anvil = new Polymorphism(date1, 2000.00, "Wile E Coyote", s1,10);
	 MyDate date2 = new MyDate(4, 10, 2008);
	 Solid s2 = new Solid("Acme Balloon", 1401, 15, UnitOfMeasureType.CUBIC_FEET, 10, 5);
	 Polymorphism balloons = new Polymorphism(date2, 1000.00, "Bugs Bunny", s2,125);
	 balloons.setQuantity(-200);
	 System.out.println(anvil);
	 System.out.println(balloons);
	 System.out.println("The tax Rate is currently: " +
	Order.taxRate);
	 Order.computeTaxOn(3000.00);
	 anvil.computeTax();
	 balloons.computeTax();
	 Order.setTaxRate(0.06);
	 System.out.println("The tax Rate is currently: " +
	Order.taxRate);
	 Order.computeTaxOn(3000.00);
	 anvil.computeTax();
	 balloons.computeTax();
	 System.out.println("The total bill for: " + anvil + " is "  + anvil.computeTotal());
	 System.out.println("The total bill for: " + balloons + " is"  + balloons.computeTotal());
	 
	 MyDate party=new MyDate(4,15,2000);
	  MyDate taxDue=new MyDate(4,15,2000);
	  System.out.println(party.toString());
	  System.out.println(party==taxDue);
	  System.out.println(party.equals(taxDue));//metod yazdým
	 
	
	 }
	 }
