package egitimtwo;

public class Lambda {
	private int operate(int a, int b, MathOperation mathoperation) {
		return mathoperation.operation(a,b);
	}
public static void main(String[] args) {
	//interface object=parameter -> statement
	Lambda tester=new Lambda();
	MathOperation addition=(int a,int b) -> a + b;
	MathOperation subtraction=(a, b) -> a - b;
	MathOperation multiplication=(int a,int b) -> {return a*b;};
	MathOperation division=(int a,int b) -> a / b;

	System.out.println("10+5="+tester.operate(10,5,addition));
	System.out.println("10-5="+tester.operate(10,5,subtraction));
	System.out.println("10*5="+tester.operate(10,5,multiplication));
	System.out.println("10/5="+tester.operate(10,5,division));
	
	GreetingService greetservice1=message -> System.out.println("hello" + message);
	GreetingService greetservice2=message -> System.out.println("hello" + message);
	
	greetservice1.sayMessage("message1");
	greetservice2.sayMessage("message2");
		
	
}
}

