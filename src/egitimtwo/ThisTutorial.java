package egitimtwo;

public class ThisTutorial {
	String color;
	String type;
	
		ThisTutorial(){
			this("green", "bmw");  //ThisTutorial("blue", "bmw");
			//parametreler i�in kullan�l�r normal metodlarda bu �ekilde parametre �a�r�lmaz
			
		}
	
		ThisTutorial(String color, String type){
			//this();//ThisTutorial(); demektir. yaz�m� bu �ekilde yap�lmald�r. parametlerde b�yle
			this.color=color;
			//this.color instance variable'd�r. sa�daki color local variable'd�r. Renklerden anla��l�r
			this.type=type;
		}
		
	
		
}
