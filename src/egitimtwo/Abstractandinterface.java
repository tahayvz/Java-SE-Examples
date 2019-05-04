package egitimtwo;

public abstract class Abstractandinterface implements Interface{
/*abstract classda en az 1 abstract metod olur
interface tüm metodlarý abstractýr
abstract metod gövdesi yok baþka sýnýftan override edilir
abstract class da obje oluþturulamaz
obje instance demektir
abstract metod class.metod(); diye çaðrýlýr
abstract metod neyin yapýlcaðýný gösterir fakat nasýl yapýlacaðýný göstermez*/
public Abstractandinterface() {
	System.out.println("Abstractandinterface is created");
}
	   abstract void run();  
	   abstract void draw();
		public void c(){
			System.out.println("I am c");
			}  
}  
		
	