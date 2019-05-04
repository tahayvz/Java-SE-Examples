package egitimtwo;

public class Employee extends Person{
		 int salary;
		 String title="engineer";
		 private Integer id;
		 private Integer age;
		 private String gender;
		 private String firstName;
		 private String lastName;
		 {
			    System.out.println("Employee: First Instance Initialization Block");
			  }
			  static {
			    System.out.println("Employee: First Static Block");
			  }
			  {
			    System.out.println("Employee: Second Instance Initialization Block");
			  }
			  static {
			    System.out.println("Employee: Second Static Block");
			  }
			  public Employee() {
			    System.out.println("Employee()");
			  }
			  public void setSalary(int salary) {
				  this.salary=salary;
			  }

 public String getDescription() {
	 System.out.println("in employee");
	 return super.getDescription()+" " +title ;
 }
 
 public Employee(Integer id, Integer age, String gender, String fName, String lName){
     this.id = id;
     this.age = age;
     this.gender = gender;
     this.firstName = fName;
     this.lastName = lName;
 }
   
 public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}



 //Please generate Getter and Setters

 //To change body of generated methods, choose Tools | Templates.
  @Override
  public String toString() {
      return this.id.toString()+" - "+this.age.toString();
  }

}

