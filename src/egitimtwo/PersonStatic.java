package egitimtwo;
public class PersonStatic {
   
	String firstName;
    
	static void setFirstName(String newValue) {
       // firstName = newValue; //need object for call
    }
	
    {
        personCount = 10;
    }
    static {
        personCount = 20;
    }
    
    private static int personCount = 1000;
    
    {
        personCount = 30;
    }
    static {
        personCount = 40;
    }
      
    public static void main(String[] args) {
        System.out.println(PersonStatic.personCount); 
        //called static methods. 20 then 1000 then 40. Static metods run with one time when class compiled
    	PersonStatic p = new PersonStatic(); //10 then 30 
        System.out.println(PersonStatic.personCount); // last 30. Static metods don't run again
        PersonStatic.personCount = 100; //
        p = new PersonStatic(); //it was 100 then created object then it will be 10 then 30
        System.out.println(PersonStatic.personCount); //30 
        
     /* p.setFirstName("Jason"); //static method not be called with object
        System.out.println( "firstName: " + p.firstName );*/
        
        PersonStatic.setFirstName("Jason");
        System.out.println( "firstName: " + p.firstName);//static value called with obje 
     
        
        
    }
    
    
}