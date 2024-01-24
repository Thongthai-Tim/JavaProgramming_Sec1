

public class Date {
	private int dMonth,dDay,dYear;
	
	Date(){
		dMonth =1;
		dDay = 0;
		dYear = 1900;
	}
	
	Date(int month, int day, int year){
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	public void setDate(int year,int month, int day) {
		dYear = year;
		dMonth = month;
		dDay = day;
	}
	
	public int getMonth() {
		return dMonth;
	}
	
	public int getDay() {
		return dDay;
	}
	public int getYear() {
		return dYear;
	}
	public String toSting()	{
		return dMonth+"-"+dDay+"-"+dYear;
	}
}
