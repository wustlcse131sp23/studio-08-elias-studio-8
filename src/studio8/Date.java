package studio8;

import java.util.Objects;

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
@Override
public int hashCode() {
	return Objects.hash(day, month, year);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Date other = (Date) obj;
	return day == other.day && month == other.month && year == other.year;
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
    	System.out.println(a);
    	Date b = new Date(4,6,2023,false);
    	System.out.println(a.equals(b));
    }
}
