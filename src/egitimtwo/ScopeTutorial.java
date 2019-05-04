package egitimtwo;

public class ScopeTutorial 
{//Begin ScopeTutorial scope
	
	/*scope ne demektir?
	 * ne zaman eri�ilebilir
	 * kim eri�ebilir
	 * ne d�nd�r�lecek bunlar scope'dur
	 * farkl� seviyelerde scope'lar var ve bunlara eri�menin de farkl� yollar� var
	 * instance variable //class variable'lar�
	 * local variable  ->s�sl� parantez i�inde oland�r. Sadece metod de�il if{} for{} bunlarda da local'dir
	 * static variable
	 * "most local" veya "local most" metod i�inde this.color=color; yap�lmas�na denir*/
	
	String color="red"; //instance variable in ScopeTutorial scope
	ScopeTutorial(String c)
	{ //Begin constructor scope
		color=c; //c is a local variable.
		//local variable'lar sadece metodlar� �al��t���nda �al���r. �a�r�lmad�klar�nda �l�d�rler. 
	} //end contructor scope
	public String Printed()
	{ //begin Printed() scope
		String cikti= ""+color ; //local variable
		return cikti;
	} //end Printed() scope
}//end ScopeTutorial scope

	/* bir obje olu�turuldu�u zaman stack bunu tutar sonra
	 * obje ile metod �a�r�ld��� zaman stack bunu da tutar sonra
	 * objeyle i�i bitti�inde pop-up stack yani stack'den at�l�r 
	 * heap objeyi tutar. onunda i�i bittimi siler bunu garbage collector yapar. memory'i rahatlatmak i�in
	 * JRE(java runtime environment) kulan�lmayan objeleri siler buna garbage collector denir
	 * System.gc(); garbage collector metodudur fakat �al��t�rmak i�in do�ru zaman de�ilse �al��maz.
	 * Mesela c.Customer("x"); sonra c.Customer("y"); dersem x olan� garbage collector siler
	 * c=null; objeyi null yaparsam ScopeTutorial c=new ScopeTutorial(); sat�r� ve c garbage collector ile silinir
	 * veya ScopeTutorial c=new ScopeTutorial(); yaz�l�p c kullan�lmazsa yine garbage collector ile silinir */
