package egitimtwo;

public class ThisTutorial {
	String color;
	String type;
	
		ThisTutorial(){
			this("green", "bmw");  //ThisTutorial("blue", "bmw");
			//parametreler için kullanýlýr normal metodlarda bu þekilde parametre çaðrýlmaz
			
		}
	
		ThisTutorial(String color, String type){
			//this();//ThisTutorial(); demektir. yazýmý bu þekilde yapýlmaldýr. parametlerde böyle
			this.color=color;
			//this.color instance variable'dýr. saðdaki color local variable'dýr. Renklerden anlaþýlýr
			this.type=type;
		}
		
	
		
}
