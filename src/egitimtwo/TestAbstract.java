package egitimtwo;

public class TestAbstract {
	
	 public static void main(String[] args) {
			Abstractandinterface obj = new SubAbstract();  
			obj.run();
			obj.draw();
			
			Interface x=new SubAbstract();  //SubAbstract x=new SubAbstract();  
			x.a();  
			x.b();  
			x.c();  //Abstractandinterface class
			x.d();  
			
			
	 }
}
