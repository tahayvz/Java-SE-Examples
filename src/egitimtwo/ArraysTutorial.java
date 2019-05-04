package egitimtwo;
import java.util.Arrays;
public class ArraysTutorial {

	public void myMethodTakesLotsOfInts(int... myInts) {
		for(int ix: myInts) {
			System.out.print(ix);
		}
	}
public static void main(String [] args) {
	
		int intArrayone[]= {0,1,2,3,4,5,6,7,8,9};
		int[] intarrayTwo=new int[3];
		char charArrayOne[], charArraytwo[];
		char charArrayThree[], charone;
		
		intarrayTwo[0]=1;
		System.out.println(intArrayone.length);
		
		for(int i=0 ;i<intarrayTwo.length; i++) {
			intarrayTwo[i]=i;
			System.out.println(intarrayTwo[i]);
			}
		
		int[] temp=intArrayone;
		System.arraycopy(temp, 0, intArrayone, 0, temp.length);
		temp=null;
		for(int i=0 ;i<intArrayone.length; i++) {
			intArrayone[i]=i;
			System.out.println(intArrayone[i]);
			}
		
		MyDate[] dates= new MyDate[3];
		dates[0]=new MyDate(10,2,1996);
		dates[1]=new MyDate(10,3,1996);
		dates[2]=new MyDate(10,4,1996);
		MyDate[] moreDates= {new MyDate(1,1,2222),new MyDate(1,2,2233)};
		String[] names= {"steve", "andrew"};
		for(int i=0 ;i<dates.length; i++) {
			System.out.println(dates[i]);
			}
		for(int i=0 ;i<moreDates.length; i++) {
			System.out.println(moreDates[i]);
			}
		for(int i=0 ;i<names.length; i++) {
			System.out.println(names[i]);
			}
		
		
		Person[] staff=new Person[2];
		staff[0]=new Person();
		staff[0].name="taha";
		staff[1]=new Employee();
		staff[1].name="yavuz";
		((Employee)staff[1]).setAge(21);
		System.out.println("staff[0] name "+staff[0].name);
		System.out.println("staff[0] name "+staff[1].name);
		System.out.println("employee age is "+((Employee)staff[1]).getAge());
		
		
		String[][] array=new String[2][2];
		String[][][][] moreDimension=new String[1][1][1][1];
		array[0][0]="a";
		array[0][1]="b";
		array[1][0]="c";
		array[1][1]="d";
		String array2[][]= {{"x","y"} , {"z","t"} };
		System.out.println(array2.length);
		
		int[][][] moreStuff = new int[3][3][];
		moreStuff[0][2] = new int[2]; // Line A
		moreStuff[0][2][0] = 0;
		moreStuff[0][2][1] = 1;
		//moreStuff[0][1][0] = 0; //nullpointerexception ILLEGAL! Only [0][2] has a third dimension.

		char[] letters={'a','b','y'};
		Arrays.sort(letters);
		for(int i=0 ;i<letters.length; i++) {
			System.out.println(letters[i]);}
		int aLocation;
		aLocation=Arrays.binarySearch(letters,'a');
			System.out.println(aLocation);
		Arrays.fill(letters, 'z');
		for(int i=0 ;i<letters.length; i++) {
			System.out.println(letters[i]);}

		//int x=letters.length(); //won't compile
			
	ArraysTutorial a=new ArraysTutorial();
	a.myMethodTakesLotsOfInts(0,1,2,3,4,5,6,7,8,9);
		
} 
}
