package egitimtwo;

public class ScopeTutorial 
{//Begin ScopeTutorial scope
	
	/*scope ne demektir?
	 * ne zaman eriþilebilir
	 * kim eriþebilir
	 * ne döndürülecek bunlar scope'dur
	 * farklý seviyelerde scope'lar var ve bunlara eriþmenin de farklý yollarý var
	 * instance variable //class variable'larý
	 * local variable  ->süslü parantez içinde olandýr. Sadece metod deðil if{} for{} bunlarda da local'dir
	 * static variable
	 * "most local" veya "local most" metod içinde this.color=color; yapýlmasýna denir*/
	
	String color="red"; //instance variable in ScopeTutorial scope
	ScopeTutorial(String c)
	{ //Begin constructor scope
		color=c; //c is a local variable.
		//local variable'lar sadece metodlarý çalýþtýðýnda çalýþýr. çaðrýlmadýklarýnda ölüdürler. 
	} //end contructor scope
	public String Printed()
	{ //begin Printed() scope
		String cikti= ""+color ; //local variable
		return cikti;
	} //end Printed() scope
}//end ScopeTutorial scope

	/* bir obje oluþturulduðu zaman stack bunu tutar sonra
	 * obje ile metod çaðrýldýðý zaman stack bunu da tutar sonra
	 * objeyle iþi bittiðinde pop-up stack yani stack'den atýlýr 
	 * heap objeyi tutar. onunda iþi bittimi siler bunu garbage collector yapar. memory'i rahatlatmak için
	 * JRE(java runtime environment) kulanýlmayan objeleri siler buna garbage collector denir
	 * System.gc(); garbage collector metodudur fakat çalýþtýrmak için doðru zaman deðilse çalýþmaz.
	 * Mesela c.Customer("x"); sonra c.Customer("y"); dersem x olaný garbage collector siler
	 * c=null; objeyi null yaparsam ScopeTutorial c=new ScopeTutorial(); satýrý ve c garbage collector ile silinir
	 * veya ScopeTutorial c=new ScopeTutorial(); yazýlýp c kullanýlmazsa yine garbage collector ile silinir */
