package egitimtwo;
public class PersonStatic {
   
	String firstName;
    
	static void setFirstName(String newValue) {
       // firstName = newValue; //obje ile �a�r�lmal�
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
        //static motodlar �a�r�lm��. 20 sonra 1000 sonra 40 olur. Static metodlar class ile 1 kere �al���r
    	PersonStatic p = new PersonStatic(); //10 sonra 30 olur
        System.out.println(PersonStatic.personCount); // en son 30 kald�. Static metodlar  tekrardan �al��maz
        PersonStatic.personCount = 100; //
        p = new PersonStatic(); //100 olmu�tu obje olu�turulunca  sonra 10 sonra 30 olur
        System.out.println(PersonStatic.personCount); //30 kald�
        
     /* p.setFirstName("Jason"); //obje ile static method �a�r�lmaz
        System.out.println( "firstName: " + p.firstName );*/
        
        PersonStatic.setFirstName("Jason");
        System.out.println( "firstName: " + p.firstName);//static de�i�ken obje ile �a�r�l�r
     
        
        
    }
    
    
}