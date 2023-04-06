package studio8;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean holiday;
public Date(int month, int day, int year, boolean holiday) {
	this.month = month;
	this.day = day;
	this.year = year;
	this.holiday = holiday;
}
public String toString() {
	if (holiday == true) {
		return month+"/"+day+"/"+year + " is a holiday!";
	}
	else {
		return month+"/"+day+"/"+year + " is not a holiday!";
	}
}
    public static void main(String[] args) {
    	Date a = new Date (4,6,2023,true);
    	System.out.print(a);
    }
}
