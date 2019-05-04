package egitimtwo;

public class Person {
	String name;
//1.static all class 2. from super to sub instance initialization blocks then costructors
  {
    System.out.println("Person: First Instance Initialization Block");
  }
  static {
    System.out.println("Person: First Static Block");
  }
  {
    System.out.println("Person: Second Instance Initialization Block");
  }
  static {
    System.out.println("Person: Second Static Block");
  }
  public Person() {
    System.out.println("Person()");
  }
  public void sayHello() {
    System.out.println("Person: Hello!");
  }
  
  String firstname="tah";
  String lastname="yav";
  
  public String getDescription() {
	  System.out.println("in person");
	  return firstname+" "+lastname;
  }
  
  public void setFirstName(String s) {
	  firstname=s;	  
  }
  
  public static void main(String[] args) {
	  Instructor i=new Instructor();
	  i.sayHello();
	  System.out.println(Instructor.str1);
	  Person p =new Employee(); //p object just called person class not employee. 
	  System.out.println(p.getDescription()); //called method in employee class not person. used super method for call person. Persondaki metod Employee'de varsa ilk Employee çalýþýr
	  p.setFirstName("Jane"); // Legal since setFirstName is available to Person
  //  p.setSalary(80_000);  // Illegal since salary is available to an Employee, not a Person.
	  Employee e= (Employee) p; //compile but fail at runtime
	  e.title="instructor of e"; //legal
   // p.title="instructor"; //ilegal
	  ((Employee)p ).title="instrucor of p";
	  System.out.println(e.title); //((Employee)p ).title   is same
	  if(p instanceof Employee)
		  ((Employee)p).title="Director of Employee";
	  System.out.println(e.title);
	  if(p instanceof Person)
		  ((Employee)p).title="Director of person";
	  System.out.println(e.title); 
  }
}
/*object created which most subclass:
 * 1.super class static
 * 2.subclass static
 * 3.subclass of subclass static
 * 4.super class instance
 * 5.super class constructor
 * 6.subclass instance
 * 7.subclass constructor
 * 8.subclass of subclass instance
 * 9.subclass of subclass constructor
 * */

/*called variable which most subclass
 * 1.call all static blocks from super to sub
 * 2.call variable which called
 * */
