package egitimtwo;
public class PersonStatic {
   
	String firstName;
    
	static void setFirstName(String newValue) {
       // firstName = newValue; //obje ile çaðrýlmalý
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
        //static motodlar çaðrýlmýþ. 20 sonra 1000 sonra 40 olur. Static metodlar class ile 1 kere çalýþýr
    	PersonStatic p = new PersonStatic(); //10 sonra 30 olur
        System.out.println(PersonStatic.personCount); // en son 30 kaldý. Static metodlar  tekrardan çalýþmaz
        PersonStatic.personCount = 100; //
        p = new PersonStatic(); //100 olmuþtu obje oluþturulunca  sonra 10 sonra 30 olur
        System.out.println(PersonStatic.personCount); //30 kaldý
        
     /* p.setFirstName("Jason"); //obje ile static method çaðrýlmaz
        System.out.println( "firstName: " + p.firstName );*/
        
        PersonStatic.setFirstName("Jason");
        System.out.println( "firstName: " + p.firstName);//static deðiþken obje ile çaðrýlýr
     
        
        
    }
    
    
}