package egitimtwo;

import java.util.Calendar;
import java.util.Locale;
import com.acme.utils.MyDate;


public class Strings {

	 public static void passObject(MyDate d) {
		 d.year = 2009;
		 }
		 public static void passPrimitive(int i) {
		 i = 2010;
		 }
		 public static void passString(String s) {
		 int yearSlash = s.lastIndexOf('/');
		 s = s.substring(0, yearSlash + 1);
		 s += "2012";
		 System.out.println("New date string: " + s);
		 }
		 
	public static void main(String[] args) {
		String str="hello    world";
		String sub=str.substring(3,6);
		System.out.println(sub);
		String trimmed = str.trim();
		System.out.println(trimmed);
		String uppercase= str.toUpperCase();
		System.out.println(uppercase);
		char c=str.charAt(2);
		System.out.println(c);
		String concatenated=str + " Turkey";
		System.out.println(concatenated);

		String today=Calendar.getInstance().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
		System.out.println(today);
		
		StringBuilder sb=new StringBuilder();
		sb.append("hello, ");
		System.out.println(sb);
		sb.append(". Today is");
		System.out.println(sb);
		sb.append(Calendar.getInstance().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US));
		System.out.println(sb);
		sb.append(".");
		System.out.println(sb);
		
		int employeeId = 2812;
		int deptId = 98;
		System.out.println(employeeId + deptId); // Prints 2910
		System.out.println(employeeId + ":" + deptId); // Prints 2812:98
		System.out.println(employeeId + deptId + ":" + employeeId + deptId); 
		
		String greeting = "Welcome to Learn Java with Intertech!";
		greeting.toUpperCase();
		System.out.println(greeting);
		System.out.println(greeting.toUpperCase());
		
		 MyDate date = new MyDate(1, 20, 2008);
		 System.out.println("Before passing an object " + date);
		 passObject(date);
		 System.out.println("After passing an object " + date);
		 System.out.println("Before passing a primitive " +
		date.year);
		 passPrimitive(date.year);
		 System.out.println("After passing a primitive " +
		date.year);
		 String x = date.toString();
		 System.out.println("Before passing a String " + x);
		 passString(x);
		 System.out.println("After passing a String " + x);
		 }
		
		
		
}
