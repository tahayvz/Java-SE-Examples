package egitimtwo;

public class JavaSyntax {

		
	public void bitshift() {
		int i=8; //1000
		i = i >> 1; //0100
				System.out.println(i);
	}
	public boolean isSleeping(){
		return false;
	}
	public boolean isHome(){
		return true;
	}
	public static void main(String[] args) {
		int j=2;
		String str="";
	
		switch(j) {
		case 1: 
			str="one";
			break;
		case 2:
			str="two";
			break;
		case 3:
			str="three";
			break;
		case 4:
			str="four";
			break;
		default:
			str="unknown";
		}
		
		String time="a.m";
		
		switch(time) {
		case "a.m":
			System.out.println("good morning");
			break;
		case "p.m":
			System.out.println("good evening");
			break;
		default:
			System.out.println("good day");
		}
		
		final char A_GRADE = 'A';
		final char B_GRADE = 'B';
		char  studentGrade = 'A';
		switch (studentGrade) {
		    case A_GRADE:
		        System.out.println("Student received an A");
		        break;
		    case B_GRADE:
		        System.out.println("Student received a B");
		        break;
		    default:
		        System.out.println("Student received a C or lower");
		}
		
	System.out.println(str);

	JavaSyntax obje=new JavaSyntax();
	obje.bitshift();
	boolean b=obje.isSleeping() || obje.isHome();
	if(b) {
		System.out.println("awake");}
	String s= obje.isSleeping() ? "sleeping":"no sleep";
	System.out.println(s);
	
	do {
		j--; 
		System.out.println(j);
	}
	while(j>0);
	
	for(int i=0;i<6;i++) {
		if(i==1)
			continue;
		if(i==4)
			break;
		System.out.println("for loop" + i);
	}
	
	Days today =Days.FRIDAY;
	String response="";
	switch (today) {
	case MONDAY:
		response="get to work";
		break;
	case FRIDAY:
		response="time to relax";
		break;
	default:
		response="practice java"; 	
	} 
	System.out.println(response);
	String theday=Days.FRIDAY.name();
	Days theuserday= Days.valueOf("TUESDAY");
	System.out.println(theday);
	System.out.println(theuserday);
	}
}
