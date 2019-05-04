package egitimtwo;

public class Encapsulation {

	private int day=1;
	private int month=1;
	private int year=2019;
	private boolean leapyear;
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public boolean isleapyear() {
		return leapyear;
	}
	public void setDay(int day) {
		if(valid(day,this.month,this.year))
			this.day=day;
	}
	public void setMonth(int month) {
		if(valid(this.day,month,this.year))
			this.month=month;
	}
	public void setYear(int year) {
		if(valid(this.day,this.month,year))
			this.year=year;
	}
	public void setLeapYear(boolean leapyear) {
		if(valid(day,this.month,this.year))
			this.leapyear=leapyear;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Encapsulation obje=new Encapsulation();
		obje.setDay(1);
		obje.setMonth(1);
		obje.setYear(2019);
		obje.setLeapYear(obje.leapyear);
		System.out.println(obje.getDay()+ "."+ obje.getMonth()+"."+obje.getYear() +" is leap year " +obje.isleapyear());
	}
	
	public boolean valid(int day, int month, int year) {
		boolean isValid=true;
		if (day>31||day<1||month>12||month<1) {
			isValid =false;
		}
	 else {
		switch(month) {
		case 4: case 6:case 9: case 11:
			isValid=(day<=30);
			break;
		case 2:
			isValid=(day<=28||(day==29&&year%4==0));
		}
	}
	return isValid;

}
}
