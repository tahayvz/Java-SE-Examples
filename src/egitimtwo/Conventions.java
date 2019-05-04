package egitimtwo; //lowercase

import java.math.BigDecimal;
import java.math.BigInteger;

/**  project i�inde generate javadoc var ona bast�ktan sonra configure k�sm� bo�sa jdk bin dosyas�ndan 
 * javadoc.exe se�ilir. sonra finish denir. solda package alt�nda doc dosyas� g�r�n�r. index.html'i web'de 
 * a�arsak yapt�klar�m�z g�r�n�r.
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
		/* ClassName "C ve N b�y�k" diye yaz�lmas�na camel case denir
		 int myDog; diye yaz�lmas�na lower camel case denir. variables and methods
		 
		 "ctrl + 7" sat�rlar� se�ip bu tu�lara basarsam comment olurlar. Source'de bu k�sayollar yazar
		 '\n' new line, '\t' tab yapar
		 short 16 bit, ,nt 32 bittir, long 64bittir
		 mesela 2 int ve long olabilir long ise 2L veya 2l diye yaz�l�r
		 2.2 double veya float olabilir 2.2F veya 2.2f floatt�r*/
		int myBin=0b0101;
		int myInt=0X7E;
		int myIntt=070; //hexa
		int a=1_234_567;//1234567 ile ayn�d�r. alt tireyi okumaz fakat sonda yaz�lmas� illegaldir. 
		//boolean'da noktadan �ncede alt tire yaz�l�rsa illegal olur 
		System.out.println(myBin+" "+myInt+" "+myIntt);
		char c='\u0061'; //a'n�n hexa de�eridir
		System.out.println(c);
		int x2=400; //byte 127 den b�y�k olmaz yani 8bit yazarsam b2 de�eri bozuk ��kar
		byte b2=(byte) x2;//cast yap�l�r ��nk� boyutlar� farkl�
		System.out.println(b2);
		//mesela short de�eri cast yapmadan int'e atamay�z illegaldir.
		BigInteger myBigInt=new BigInteger("9999999999847488728264824"); //b�y�k say�lar bu �ekilde yaz�l�r
		BigDecimal myBigDec=new BigDecimal("1.0E-309"); //b�y�k say�lar bu �ekilde yaz�l�r
		System.out.println(myBigInt+"  "+ myBigDec);
		/**bu javadoc commend'dir.
		 * 
		 */
		
		
		
	}

}
