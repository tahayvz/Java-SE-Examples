package egitimtwo;

public class TestMyDateArray {
	public static void main(String[] args) {
		MyDateArray date1 = new MyDateArray(11, 11, 1918);
		MyDateArray date2 = new MyDateArray();
			date2.setDay(11);
			date2.setMonth(11);
			date2.setYear(1918);
		MyDateArray date3 = new MyDateArray();
			date3.setDate(13, 40, -1);
		
		String str1 = date1.toString();
		String str2 = date2.toString();
		String str3 = date3.toString();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		MyDateArray.leapYears();
		MyDateArray newYear = new MyDateArray(1, 1, 2016);
		MyDateArray fiscalStart = new MyDateArray(1, 1, 2016);
		if (newYear.equals(fiscalStart))
			System.out.println("These two dates are equal");
		else
			System.out.println("These two dates are not equal");
		MyDateArray endOfYear = new MyDateArray(12,31,2016);
		if (newYear.equals(endOfYear))
			System.out.println("These two dates are equal");
		else
			System.out.println("These two dates are not equal");
		MyDateArray.listHolidays();
		}
		}