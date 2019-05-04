package egitimtwo;

public class HelloWorld {

	static String color="green";
	String type;
	static int carCount=0; //static values belong to class
	int serialNumber=carCount;
	
	HelloWorld() {
	color="blue";	
	}
	
	static { 
		color="yellow"; //static olursa içindeki variable'da static color olmalý
		//if not write static this block run when created each object. For static this will run one time when compiled
		ResetCarCount();
		//PrintDescription(); //not static method don't be called in static method
	}
	
	public HelloWorld(String c, String t) {
		color=c;
		type=t;
		carCount++;
		
	}
	static void ResetCarCount() {
		carCount=0;	
		//static method access class variables without objec
		//static help use for function.Such as java.lang.Math functions
	}
	
	void PrintDescription() { //instance method.  Variables in method are instance.
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
		HelloWorld testtwo=new HelloWorld("red", "volvo");//if delete one of parameter program not work.
		System.out.println(HelloWorld.carCount); //call static
		HelloWorld testthree=new HelloWorld();
		System.out.println(testthree.color);
		//create color as many as you want last called contructor

		
		System.out.println(HelloWorld.carCount); //call static 
		test.ResetCarCount();//inappropriate because it is not concern an object that concerns the class
		HelloWorld.ResetCarCount();//appropriate
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
		/*object variables names; instance variable, attribute, properties, fields, member variables, state*/
	}

	
	
		
}
