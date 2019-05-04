package egitimtwo; //lowercase

import java.math.BigDecimal;
import java.math.BigInteger;

/**  project içinde generate javadoc var ona bastýktan sonra configure kýsmý boþsa jdk bin dosyasýndan 
 * javadoc.exe seçilir. sonra finish denir. solda package altýnda doc dosyasý görünür. index.html'i web'de 
 * açarsak yaptýklarýmýz görünür.
 * 
 * @author tahay
 *
 */
public class Conventions { //camel case

	int numberCar;
	String model;
	/**
	 * car number and models created
	 */
	public Conventions(int x, String y) {
		numberCar=x;
		model=y;
		/**
		 * constructer created
		 */
	}
	public static void main(String[] args) { //lower camel case
		
		Conventions objem= new Conventions(2,"bmw");
			/**
			 * oject created
			 */
		/* ClassName "C ve N büyük" diye yazýlmasýna camel case denir
		 int myDog; diye yazýlmasýna lower camel case denir. variables and methods
		 
		 "ctrl + 7" satýrlarý seçip bu tuþlara basarsam comment olurlar. Source'de bu kýsayollar yazar
		 '\n' new line, '\t' tab yapar
		 short 16 bit, ,nt 32 bittir, long 64bittir
		 mesela 2 int ve long olabilir long ise 2L veya 2l diye yazýlýr
		 2.2 double veya float olabilir 2.2F veya 2.2f floattýr*/
		int myBin=0b0101;
		int myInt=0X7E;
		int myIntt=070; //hexa
		int a=1_234_567;//1234567 ile aynýdýr. alt tireyi okumaz fakat sonda yazýlmasý illegaldir. 
		//boolean'da noktadan öncede alt tire yazýlýrsa illegal olur 
		System.out.println(myBin+" "+myInt+" "+myIntt);
		char c='\u0061'; //a'nýn hexa deðeridir
		System.out.println(c);
		int x2=400; //byte 127 den büyük olmaz yani 8bit yazarsam b2 deðeri bozuk çýkar
		byte b2=(byte) x2;//cast yapýlýr çünkü boyutlarý farklý
		System.out.println(b2);
		//mesela short deðeri cast yapmadan int'e atamayýz illegaldir.
		BigInteger myBigInt=new BigInteger("9999999999847488728264824"); //büyük sayýlar bu þekilde yazýlýr
		BigDecimal myBigDec=new BigDecimal("1.0E-309"); //büyük sayýlar bu þekilde yazýlýr
		System.out.println(myBigInt+"  "+ myBigDec);
		/**bu javadoc commend'dir.
		 * 
		 */
		
		
		
	}

}
