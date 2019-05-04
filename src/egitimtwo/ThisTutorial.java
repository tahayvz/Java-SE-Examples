package egitimtwo;

public class ThisTutorial {
	String color;
	String type;
	
		ThisTutorial(){
			this("green", "bmw");  //ThisTutorial("blue", "bmw");
			//used for contructors. another methods don't call like this.
			
		}
	
		ThisTutorial(String color, String type){
			//this(); mean ThisTutorial(); 
			this.color=color;
			//this.color is instance variable. color at right is local variable. understanded from colors
			this.type=type;
		}
		
	
		
}
