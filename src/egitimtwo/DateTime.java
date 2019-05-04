package egitimtwo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class DateTime {
	
	public static void p(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
//		LocalDate now=LocalDate.now();
//		p(now);
//		LocalDate aWeekFromNow=now.plusWeeks(1);
//		p(aWeekFromNow);
//		LocalDate aMonthAgo=now.minusMonths(1);
//		p(aMonthAgo);
//		LocalDate hireDate=LocalDate.of(2008, Month.APRIL,21);
//		p(hireDate);
//		System.out.println(hireDate.isBefore(now));

//		LocalTime now2=LocalTime.now();
//		p(now2);
//		LocalTime hiredTime=LocalTime.of(12,0,0);//12:00
//		p(hiredTime);
//		LocalTime anHourFromNow=now2.plusHours(1);
//		p(anHourFromNow);
//		LocalTime minusHours=now2.minusHours(1);
//		p(minusHours);
//		System.out.println(hiredTime.isAfter(now2));
		
//		LocalDateTime now3=LocalDateTime.now();
//		LocalDateTime timeHired=LocalDateTime.of(2008,Month.DECEMBER,21,13,0,0);
//		p(timeHired);
//		System.out.println(now3.isBefore(timeHired));
//		Period period = Period.of(1,1,1);
//		System.out.println(now3);
//		now3=now3.minus(period);
//		System.out.println(now3);
//		now3=now3.plus(period);
//		System.out.println(now3);
//		LocalDate now4=LocalDate.now();
//		p(now4);
//		LocalDate hireDate2=LocalDate.of(2018, Month.APRIL,21);
//		p(hireDate2);
//		Period period2=Period.between(hireDate2,now4);
//		p(period2);//Period#Year#Month#day 
		
		LocalDate now5=LocalDate.now();
		p(now5);
		DateTimeFormatter dtf=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		//ofLocalizedTime() yazarsam hata verir çünkü now LocalDate olarak tanýmlanmýþ
		p(now5.format(dtf));
		DateTimeFormatter patternFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter patternFormatter2=DateTimeFormatter.ofPattern("dd/MM 'in the year' yyyy");
		p(now5.format(patternFormatter));
		p(now5.format(patternFormatter2));
		
//		LocalTime time=LocalTime.now();
//		p(time.format(patternFormatter)); //çalýþmaz
				
				
	}
	}
