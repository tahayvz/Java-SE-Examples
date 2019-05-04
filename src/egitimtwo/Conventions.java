package egitimtwo; //lowercase

import java.math.BigDecimal;
import java.math.BigInteger;

/**  In project tab "generate javadoc" then if "configure" null select "javadoc.exe" in jdk bin folder
 *  then finish. At left under package showed doc folder.open index.html in web *
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
		/* ClassName "C and N big" it is camelcase
		 int myDog; lower camel case. variables and methods
		 
		 select lines and "ctrl + 7" then all lines be comment. Source show shortcuts
		 '\n' new line, '\t' tab 
		 short 16 bit, ,nt 32 bit, long 64bit
		 2 can become int and long. If 2 is long writed as 2L or 2l 
		 2.2 double or float. For float  2.2F or 2.2f float*/
		int myBin=0b0101;
		int myInt=0X7E;
		int myIntt=070; //hexa
		int a=1_234_567;//1234567 
		System.out.println(myBin+" "+myInt+" "+myIntt);
		char c='\u0061'; //hex a
		System.out.println(c);
		int x2=400; //byte <=127 so 7bit 
		byte b2=(byte) x2;//need cast becauseof size different
		System.out.println(b2);
		//short value not declare int without cast. it is illegal
		BigInteger myBigInt=new BigInteger("9999999999847488728264824"); //big numbers
		BigDecimal myBigDec=new BigDecimal("1.0E-309"); //big numbers
		System.out.println(myBigInt+"  "+ myBigDec);
		/**this is javadoc comment.
		 * 
		 */
		
		
		
	}

}
