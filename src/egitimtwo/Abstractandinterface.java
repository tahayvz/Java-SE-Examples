package egitimtwo;

public abstract class Abstractandinterface implements Interface{
/*abstract classda en az 1 abstract metod olur
interface t�m metodlar� abstract�r
abstract metod g�vdesi yok ba�ka s�n�ftan override edilir
abstract class da obje olu�turulamaz
obje instance demektir
abstract metod class.metod(); diye �a�r�l�r
abstract metod neyin yap�lca��n� g�sterir fakat nas�l yap�laca��n� g�stermez*/
public Abstractandinterface() {
	System.out.println("Abstractandinterface is created");
}
	   abstract void run();  
	   abstract void draw();
		public void c(){
			System.out.println("I am c");
			}  
}  
		
	