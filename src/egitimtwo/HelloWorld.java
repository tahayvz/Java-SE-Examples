package egitimtwo;
/*static metod mesajý kendi class'a göndermek içindir. obje kullanmaz demektir
 * main metodu Main olarak yazarsam JVM main metod olarak okumaz çünkü büyük harfe duyarlýdýr
 * (String[] args)  (String [] args)  (String args[]) (String[] x)* bunlarýn hepsi legal'dir. args argumant 
 * kýsaltýlmýþýdýr herkes öyle yazdýðý için alýþýlmýþtýr
 */
 
public class HelloWorld {

	static String color="green";
	String type;
	static int carCount=0; //static deðerler class'a aittir. Objeyle alakasý yoktur.
	int serialNumber=carCount;
	
	HelloWorld() {
	color="blue";	
	}
	
	static { 
		color="yellow"; //static olursa içindeki variable'da static color olmalý
//static yazýlmazsa her obje oluþturulduðunda bu blok çalýþacak. static yazýlýrsa class'la birlikte 1 defa çalýþýr	
		ResetCarCount();
		//PrintDescription(); //static olmayan metod static metodda objesiz çaðrýlamaz
	}
	
	public HelloWorld(String c, String t) {
		color=c;
		type=t;
		carCount++;
		
	}
	static void ResetCarCount() {
		carCount=0;	
		//static metodlardan class'daki variable'lara obje gerekmeden ulaþýlabilir
		//fonksiyon kullanýlmasýný saðlar örneðin java.lang.Math fonksiyonlarý
	}
	
	void PrintDescription() { //instance method'dur ve içindeki variable'lar instance'dir.
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
		HelloWorld testtwo=new HelloWorld("red", "volvo");//parametrelerin birini silersem program çalýþmaz
		System.out.println(HelloWorld.carCount); //call static
		HelloWorld testthree=new HelloWorld();
		System.out.println(testthree.color);
		//color istenildiði kadar tanýmlansýn en son constructor içindeki çaðrýlýr

		
		System.out.println(HelloWorld.carCount); //call static 
		test.ResetCarCount();//uygun deðil çünkü objeyi deðil class'ý ilgilendiren bir durumdur
		HelloWorld.ResetCarCount();//bu þekilde uygundur
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
	 * behaviour metodlar oluyor. örneðin banka classýnda int id; id state olur
	 * open(); close(); metodlarý da behaviour'dur
	 * Test x=new Test(); 
	 * Test= reference type
	 * x=reference variable
	 * new=keyword
	 * Test()=object type*/
	
	/*STACK AND HEAP
	 * JVM arka planýnda hafýza; obje referanslarý objelerin onlara atanmasý stack ve heap tarafýndan yapýlýr
	 * heap is large portion of memory where all the objects are going to live
	 * stack is more short term piece of memory where we have reference variable
	 * mesela objeyle bir metod çaðrýlýr stack objeyi görür metodu heap içine point eder.*/
	
	/*any java object default null, boolean default false, byte short int long default 0, 
	 * float double default 0.0, char default '\0000' */
	
	/*mesela void HelloWorld(String x) constructor  tanýmlanýrsa parametre aldýðý için bu metod çalýþmaz
	 * fakat program hata vermez çünkü legal görünüyor*/
	/*mesela metodda int=x; dedik ve x deðerini yazmadan output almaya çalýrsak program çalýþmaz*/
		
}
