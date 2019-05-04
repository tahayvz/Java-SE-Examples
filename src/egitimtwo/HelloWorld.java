package egitimtwo;
/*static metod mesaj� kendi class'a g�ndermek i�indir. obje kullanmaz demektir
 * main metodu Main olarak yazarsam JVM main metod olarak okumaz ��nk� b�y�k harfe duyarl�d�r
 * (String[] args)  (String [] args)  (String args[]) (String[] x)* bunlar�n hepsi legal'dir. args argumant 
 * k�salt�lm���d�r herkes �yle yazd��� i�in al���lm��t�r
 */
 
public class HelloWorld {

	static String color="green";
	String type;
	static int carCount=0; //static de�erler class'a aittir. Objeyle alakas� yoktur.
	int serialNumber=carCount;
	
	HelloWorld() {
	color="blue";	
	}
	
	static { 
		color="yellow"; //static olursa i�indeki variable'da static color olmal�
//static yaz�lmazsa her obje olu�turuldu�unda bu blok �al��acak. static yaz�l�rsa class'la birlikte 1 defa �al���r	
		ResetCarCount();
		//PrintDescription(); //static olmayan metod static metodda objesiz �a�r�lamaz
	}
	
	public HelloWorld(String c, String t) {
		color=c;
		type=t;
		carCount++;
		
	}
	static void ResetCarCount() {
		carCount=0;	
		//static metodlardan class'daki variable'lara obje gerekmeden ula��labilir
		//fonksiyon kullan�lmas�n� sa�lar �rne�in java.lang.Math fonksiyonlar�
	}
	
	void PrintDescription() { //instance method'dur ve i�indeki variable'lar instance'dir.
		System.out.println(" a");
	}
	public static void main(String[] args) {
		// String ss = null;
		 //   System.out.println(ss = ss.toUpperCase()); //NullPointerExeption
		 Math m = null; //not throw a NullPointerException.
		    double result = m.floor(28.15); 
		    System.out.println(result);
		HelloWorld test=new HelloWorld("silver", "bmw"); 
		System.out.println(HelloWorld.carCount); //call static
		System.out.println(test.carCount); //call static
		HelloWorld testtwo=new HelloWorld("red", "volvo");//parametrelerin birini silersem program �al��maz
		System.out.println(HelloWorld.carCount); //call static
		HelloWorld testthree=new HelloWorld();
		System.out.println(testthree.color);
		//color istenildi�i kadar tan�mlans�n en son constructor i�indeki �a�r�l�r

		
		System.out.println(HelloWorld.carCount); //call static 
		test.ResetCarCount();//uygun de�il ��nk� objeyi de�il class'� ilgilendiren bir durumdur
		HelloWorld.ResetCarCount();//bu �ekilde uygundur
		test.carCount=4; //change static value
		
		System.out.println(HelloWorld.carCount); //call static and static keep value
		

		String s =new String(	"Hello World"	);
		String sub=s.substring(4, 10);
		String trimmed=s.trim();
		String upper=s.toUpperCase();
		char c=s.charAt(1);
		System.out.println(sub);
		System.out.println(trimmed);
		System.out.println(upper);
		System.out.println(c);
/*object variable'lara verilen isimler; instance variable, attribute, properties, fields, 
 * member variables, state*/
	}

	
	
	/* 8 primitive data type var. byte, short, int, long float(32bit), double(64 bit), boolean, char
	 * primitive'ler sadece state'dirler. object'ler ise hem state hem de behaviour olurlar
	 * behaviour metodlar oluyor. �rne�in banka class�nda int id; id state olur
	 * open(); close(); metodlar� da behaviour'dur
	 * Test x=new Test(); 
	 * Test= reference type
	 * x=reference variable
	 * new=keyword
	 * Test()=object type*/
	
	/*STACK AND HEAP
	 * JVM arka plan�nda haf�za; obje referanslar� objelerin onlara atanmas� stack ve heap taraf�ndan yap�l�r
	 * heap is large portion of memory where all the objects are going to live
	 * stack is more short term piece of memory where we have reference variable
	 * mesela objeyle bir metod �a�r�l�r stack objeyi g�r�r metodu heap i�ine point eder.*/
	
	/*any java object default null, boolean default false, byte short int long default 0, 
	 * float double default 0.0, char default '\0000' */
	
	/*mesela void HelloWorld(String x) constructor  tan�mlan�rsa parametre ald��� i�in bu metod �al��maz
	 * fakat program hata vermez ��nk� legal g�r�n�yor*/
	/*mesela metodda int=x; dedik ve x de�erini yazmadan output almaya �al�rsak program �al��maz*/
		
}
